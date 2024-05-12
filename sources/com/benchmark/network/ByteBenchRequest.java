package com.benchmark.network;

import java.util.HashMap;

/* loaded from: classes.dex */
public class ByteBenchRequest {
    public HashMap<String, String> mHeaders;
    public String mUrl = "";
    public int mHttpMethod = 0;
    public String mRequestBody = "";
    public String mContentType = "application/json";
    public boolean mUseCommonParams = true;
}
