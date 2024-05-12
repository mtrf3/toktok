package com.bytedance.android.live.liveinteract.multiguestv3.main.guest;

import X.B7K;
import X.C03880Dg;
import X.C15380j0;
import X.C16880lQ;
import X.C2A7;
import X.C65300Pk0;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class MultiGuestV3BottomConfirmDialog extends LiveBaseSheetDialog {
    public int LL;
    public C2A7 LLD;
    public ImageView LLF;

    public abstract int LJJIFFI();

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, X.DialogC47081t2, android.app.Dialog
    public void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/LiveBaseSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "8799492546352472747")).LIZ) {
            super.show();
        }
        ((ArrayList) B7K.LIZ).add(this);
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        ((ArrayList) B7K.LIZ).remove(this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LJJIFFI());
        TextView textView = (TextView) findViewById(R.id.lqs);
        ImageView imageView = null;
        if (textView != null) {
            int i = this.LL;
            if (i != 0) {
                textView.setText(C15380j0.LJIILJJIL(i));
                throw null;
            }
            throw null;
        }
        if (findViewById(R.id.lqr) == null) {
            if (findViewById(R.id.lqq) == null) {
                C2A7 c2a7 = (C2A7) findViewById(R.id.lqo);
                if (c2a7 != null) {
                    C16880lQ.LJJIII(c2a7, new ACListenerS25S0100000_5(this, 22));
                } else {
                    c2a7 = null;
                }
                this.LLD = c2a7;
                ImageView imageView2 = (ImageView) findViewById(R.id.lqp);
                if (imageView2 != null) {
                    C16880lQ.LJIILLIIL(imageView2, new ACListenerS25S0100000_5(this, 23));
                    imageView = imageView2;
                }
                this.LLF = imageView;
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, X.C18Z, android.app.Dialog
    public final void setTitle(int i) {
        this.LL = i;
    }
}
