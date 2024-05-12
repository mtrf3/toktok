package com.ss.android.ugc.aweme.property.bytebench;

import X.InterfaceC09230Xv;
import X.InterfaceC09240Xw;
import X.InterfaceC44798Hi6;

/* loaded from: classes8.dex */
public interface NowVQByteBenchStrategy extends InterfaceC44798Hi6, InterfaceC09230Xv {
    String compileExternalSetting();

    int compileVideoSizeIndex();

    boolean enableSplitConfig();

    String getNowTakePictureSize();

    int recordVideoEncodeSizeIndex();

    @Override // X.InterfaceC09230Xv
    /* synthetic */ void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw);

    int shotScreenEncodeSizeIndex();

    float sourceBitrateFactor();

    String sourcePreviewSize();

    int sourceVideoSizeIndex();

    /* synthetic */ void updateValue();
}
