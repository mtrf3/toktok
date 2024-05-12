package com.ss.videoarch.live.ttquic;

import X.C16880lQ;
import X.X1D;
import android.os.Environment;
import java.io.File;

/* loaded from: classes15.dex */
public class TTEngineParam {
    public static final String DEFAULT_CACHE_PATH;
    public String agentName = "ttplayer-live";
    public int cacheMaxSize;
    public String cachePath;
    public String flvCachePath;
    public int logLevel;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLLLLLLLLL().getAbsolutePath());
        LIZ.append(File.separator);
        LIZ.append(Environment.DIRECTORY_DOWNLOADS);
        DEFAULT_CACHE_PATH = X1D.LIZIZ(LIZ);
    }

    public TTEngineParam() {
        String str = DEFAULT_CACHE_PATH;
        this.cachePath = str;
        this.flvCachePath = str;
        this.cacheMaxSize = 209715200;
        this.logLevel = 2;
    }
}
