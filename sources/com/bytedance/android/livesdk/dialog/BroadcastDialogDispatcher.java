package com.bytedance.android.livesdk.dialog;

import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class BroadcastDialogDispatcher extends PriorityTaskDispatcher {
    public final ArrayList<Dialog> LJLJJLL = new ArrayList<>();

    @Override // com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator<Dialog> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().dismiss();
        }
        this.LJLJJLL.clear();
    }

    @Override // com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher, X.InterfaceC74834TYo
    public final void addDialogToManager(Dialog dialog) {
        this.LJLJJLL.add(dialog);
    }
}
