package com.ss.android.ugc.aweme.setting.api;

import X.C10K;
import X.C38452F7g;
import X.E8L;
import com.google.gson.m;

/* loaded from: classes7.dex */
public interface ABApi {
    public static final C38452F7g LIZ = C38452F7g.LIZ;

    @E8L("/aweme/v1/abtest/param/")
    C10K<m> querySettings();
}
