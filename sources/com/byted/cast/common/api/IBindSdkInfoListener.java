package com.byted.cast.common.api;

/* loaded from: classes29.dex */
public interface IBindSdkInfoListener {
    void onByteCastFail(int i, String str, Exception exc);

    void onByteCastSuccess();

    void onLelinkFail(int i, String str, Exception exc);

    void onLelinkSuccess();
}
