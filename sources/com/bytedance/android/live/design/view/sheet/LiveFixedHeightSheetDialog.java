package com.bytedance.android.live.design.view.sheet;

import X.C0KC;
import X.C47101t4;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public class LiveFixedHeightSheetDialog extends LiveBaseSheetDialog {
    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.DialogC47081t2, android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (this.LJLJJI == null) {
            LJIJJLI();
        }
        this.LJLJJI.setState(3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, android.app.Dialog
    public final void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJZI = false;
        C0KC c0kc = this.LJLLLLLL;
        if (c0kc != null) {
            c0kc.setVisibility(8);
        }
    }

    public LiveFixedHeightSheetDialog(Context context, C47101t4 c47101t4) {
        super(context, R.style.q6);
        c47101t4.getClass();
        this.LJLZ = null;
        this.LJZ = false;
    }

    public LiveFixedHeightSheetDialog(Context context, int i) {
        super(context, i);
    }
}
