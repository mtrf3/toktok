package com.ss.android.ugc.playerkit.exp.model;

import X.EnumC46736IVw;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public class CustomProtectCacheDirExp {
    public List<String> customCacheConfig = Arrays.asList(EnumC46736IVw.OfflineMode.getCacheDir());

    public List<String> getConfig() {
        return this.customCacheConfig;
    }
}
