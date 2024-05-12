package com.bytedance.android.livesdk.dialog;

import X.ActivityC45651qj;
import X.B7K;
import X.C03880Dg;
import X.C15380j0;
import X.C16880lQ;
import X.C2A7;
import X.C65300Pk0;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CommonBottomConfirmDialog extends LiveBaseSheetDialog {
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public InterfaceC88472Yns<? super LiveBottomSheetDialog, C76800UCe> LLFFF;
    public int LLFII;
    public InterfaceC88472Yns<? super LiveBottomSheetDialog, C76800UCe> LLFZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, X.DialogC47081t2, android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/LiveBaseSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-4329541987854661986")).LIZ) {
            super.show();
        }
        ((ArrayList) B7K.LIZ).add(this);
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        ((ArrayList) B7K.LIZ).remove(this);
    }

    public CommonBottomConfirmDialog(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        this.LLF = R.layout.cuv;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        setContentView(this.LLF);
        TextView textView = (TextView) findViewById(R.id.lna);
        if (textView != null && (i2 = this.LL) != 0) {
            textView.setText(C15380j0.LJIILJJIL(i2));
        }
        TextView textView2 = (TextView) findViewById(R.id.ln_);
        if (textView2 != null && (i = this.LLD) != 0) {
            textView2.setText(C15380j0.LJIILJJIL(i));
        }
        C2A7 c2a7 = (C2A7) findViewById(R.id.ln9);
        if (c2a7 != null) {
            int i3 = this.LLFF;
            if (i3 != 0) {
                c2a7.setText(C15380j0.LJIILJJIL(i3));
            }
            C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 275));
        }
        C2A7 c2a72 = (C2A7) findViewById(R.id.ln8);
        if (c2a72 != null) {
            int i4 = this.LLFII;
            if (i4 != 0) {
                c2a72.setText(C15380j0.LJIILJJIL(i4));
            }
            C16880lQ.LJJIII(c2a72, new ACListenerS25S0100000_5(this, 276));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C18Z, android.app.Dialog
    public final void setTitle(int i) {
        this.LL = i;
    }
}
