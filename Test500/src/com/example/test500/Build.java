package com.example.test500;

import com.example.test500.work.BookAgooApi;

/**
 * Created by Artem on 29.03.14.
 */
public class Build {

    public static final boolean RELISE = false;
    public static final boolean LOG_TEST = true;

    public static final String BUUK_AGOO_API_SERVER = RELISE ? BookAgooApi.SERVER.RELISE : BookAgooApi.SERVER.TEST;

}
