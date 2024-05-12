package com.bytedance.android.live.design.view.sheet;

import X.C0P2;
import X.C12830et;
import X.C47111t5;
import X.InterfaceC32911Qx;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class LiveSheetDialog extends LifecycleAwareDialog {
    public C47111t5 LJLJJI;
    public LiveSheetHostFragment LJLJJL;

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C47111t5 c47111t5 = this.LJLJJI;
        if (c47111t5 != null) {
            c47111t5.LJLIL.LJLIL.LJIIJ();
        } else {
            super.onBackPressed();
        }
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
                window.addFlags(134217728);
            }
            window.setLayout(-1, -1);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                i = R.style.af;
            } else if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                i = R.style.ah;
            } else {
                i = R.style.ag;
            }
            window.setWindowAnimations(i);
            C0P2.LIZ(window);
        }
        getContext().getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, new TypedValue(), true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        C12830et c12830et;
        super.onWindowFocusChanged(z);
        LiveSheetHostFragment liveSheetHostFragment = this.LJLJJL;
        if (liveSheetHostFragment != null && (c12830et = liveSheetHostFragment.LJLIL) != null) {
            Iterator it = ((ArrayList) c12830et.LJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC32911Qx) it.next()).onWindowFocusChanged(z);
            }
        }
    }

    public LiveSheetDialog(Context context, int i) {
        super(context, i);
    }
}
