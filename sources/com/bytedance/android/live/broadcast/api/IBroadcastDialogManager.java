package com.bytedance.android.live.broadcast.api;

import X.InterfaceC06390Mx;
import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;

/* loaded from: classes.dex */
public interface IBroadcastDialogManager extends InterfaceC06390Mx {
    void addDialogToManager(Dialog dialog);

    void addToShow(int i, LifecycleOwner lifecycleOwner, Observer<Integer> observer);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void promoteTasks();
}
