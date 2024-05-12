package com.ss.android.ugc.aweme.services.uikit;

import android.app.Dialog;

/* loaded from: classes7.dex */
public interface CreativeLoadingDialog {
    void delayShow(long j);

    void dismiss();

    boolean isShowing();

    Dialog originalDialog();

    void show();

    void updateProgress(int i);

    void updateProgressContent(String str);
}
