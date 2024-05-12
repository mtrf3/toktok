package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BZI;
import X.C28787BRn;
import X.C30355Bvj;
import X.C31014CFe;
import X.C48459J0d;
import X.C78857UxB;
import X.C78862UxG;
import X.C87277YNd;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewReverseCameraWidget extends PreviewToolBaseWidget {
    public int LJLJI = 1;
    public final int LJLJJI = R.string.t0i;
    public final int LJLJJL = R.drawable.cu8;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIIIZ;
        Integer LIZIZ = c48459J0d.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "KEY_LIVE_CAMERA_TYPE.commonValue");
        int intValue = LIZIZ.intValue();
        this.LJLJI = intValue;
        int i = 1 - intValue;
        C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476788229, "bpea-382");
        this.LJLJI = i;
        if (i == 1) {
            C31014CFe.LJJIIJZLJL = 1;
        } else {
            C31014CFe.LJJIIJZLJL = 2;
        }
        BZI LIZ = C28787BRn.LIZ("camera_switch");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIIIZ("live");
        LIZ.LJIIL("click");
        LIZ.LJJIIJZLJL();
        c48459J0d.LJ(Integer.valueOf(this.LJLJI));
        InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.dataChannel);
        if (LJIILIIL != null) {
            LJIILIIL.LJIIL(i, LJJIIJ);
        }
        C30355Bvj.LIZJ().LJIILIIL();
    }
}
