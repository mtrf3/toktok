package com.ss.android.ugc.aweme.web.share.model;

import java.util.Map;

/* loaded from: classes11.dex */
public final class WebShareInfo {
    public final String LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final HybridContainerInfo LJIIIZ;

    /* loaded from: classes11.dex */
    public static class HybridContainerInfo {
        public String captureViewName;
        public Map<String, String> initData;
        public float offsetX;
        public float offsetY;
        public String url;
        public String urlContent;
        public int urlContentType = 1;
        public int alignType = 1;
        public float width = 100.0f;
        public float height = 100.0f;
        public float bgAlpha = 0.7f;
    }

    public WebShareInfo(int i, String str, String str2, String str3, HybridContainerInfo hybridContainerInfo, Boolean bool) {
        this.LJIIIIZZ = i;
        this.LJ = str;
        this.LIZ = str2;
        this.LIZIZ = str3;
        this.LJIIIZ = hybridContainerInfo;
        this.LIZJ = bool;
    }

    public WebShareInfo(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LIZJ = bool;
    }

    public WebShareInfo(String str, String str2, int i, String str3, String str4, String str5, Boolean bool) {
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = i;
        this.LIZ = str3;
        this.LIZIZ = str4;
        this.LJ = str5;
        this.LIZJ = bool;
    }
}
