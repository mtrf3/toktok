package com.ss.android.ugc.aweme.services.uikit;

/* loaded from: classes5.dex */
public interface CreativeToast {

    /* loaded from: classes5.dex */
    public interface OnDismissListener {
        void onDismiss(CreativeToast creativeToast);
    }

    /* loaded from: classes5.dex */
    public interface OnShowListener {
        void onShow(CreativeToast creativeToast);
    }

    void dismiss();

    Object originalToast();

    void show();
}
