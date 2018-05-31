package com.atlas.drive.work;

import android.net.Uri;
import android.os.Parcelable;


public class AtlasWorkConfiguration {

    private static final String a = AtlasWorkConfiguration.class.getSimpleName();
    public static final String ENVIRONMENT_PRODUCTION = "live";
    public static final String ENVIRONMENT_SANDBOX = "sandbox";
    public static final String ENVIRONMENT_NO_NETWORK = "mock";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private String h;
    private String i;
    private boolean j;
    private String k;
    private String l;
    private Uri m;
    private Uri n;
    private boolean o;


    public final AtlasWorkConfiguration environment(String var1) {
        this.c = var1;
        return this;
    }

    public final AtlasWorkConfiguration clientId(String var1) {
        this.k = var1;
        return this;
    }
}
