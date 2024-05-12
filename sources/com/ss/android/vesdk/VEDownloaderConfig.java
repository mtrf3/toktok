package com.ss.android.vesdk;

import java.util.HashMap;

/* loaded from: classes8.dex */
public class VEDownloaderConfig {
    public String cacheDir;
    public long externalFirstSegOffset;
    public long externalMediaSize;
    public String externalPath;
    public HashMap<String, String> headerParams;
    public boolean needSaveFile;
    public String url;
    public int maxDownloadCount = 3;
    public int maxCacheFileCount = 10;
    public int maxNetworkTimeout = 3000;

    public VEDownloaderConfig(String str, String str2) {
        this.url = str;
        this.cacheDir = str2;
    }

    public VEDownloaderConfig(String str, String str2, String str3, String str4, long j, long j2) {
        this.url = str;
        this.cacheDir = str2;
        this.externalPath = str4;
        this.externalFirstSegOffset = j;
        this.externalMediaSize = j2;
    }
}
