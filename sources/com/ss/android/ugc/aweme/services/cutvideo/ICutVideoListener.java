package com.ss.android.ugc.aweme.services.cutvideo;

/* loaded from: classes2.dex */
public interface ICutVideoListener {
    void onCompileDone();

    void onCompileError(int i, int i2, float f, String str);

    void onCompileProgress(float f);

    void onStart();
}
