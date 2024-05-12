package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BZI;
import X.C09;
import X.C0NA;
import X.C15380j0;
import X.C1YG;
import X.C1YH;
import X.C28787BRn;
import X.C29306Beo;
import X.C29494Bhq;
import X.C30355Bvj;
import X.C30417Bwj;
import X.C30418Bwk;
import X.C30419Bwl;
import X.C30770C5u;
import X.C44384HbQ;
import X.C65352Pkq;
import X.C87277YNd;
import X.InterfaceC08030Tf;
import X.InterfaceC08070Tj;
import X.InterfaceC30359Bvn;
import X.InterfaceC30442Bx8;
import Y.IDDListenerS145S0100000_5;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.dataChannel.EffectDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewBeautyWidget extends PreviewToolBaseWidget {
    public final InterfaceC08070Tj<? extends LiveEffect> LJLJI = C30355Bvj.LJIIIZ();
    public final InterfaceC08030Tf LJLJJI = C30355Bvj.LJFF();
    public final int LJLJJL = C44384HbQ.LJJJZ();
    public final int LJLJJLL = R.drawable.ctp;
    public final C30417Bwj LJLJL = new C30417Bwj(this);

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        if (LiveBeautySwitchExperimentSetting.INSTANCE.isUCAN() && C29306Beo.LJIILLIIL(InterfaceC30442Bx8.LLZZZIL.LIZJ())) {
            C1YG c1yg = new C1YG(getView());
            c1yg.LJI = 5000L;
            c1yg.LJII = true;
            c1yg.LIZLLL = 48;
            c1yg.LJIIIIZZ = C15380j0.LIZ(240.0f);
            c1yg.LJIIIZ = true;
            c1yg.LJFF = C15380j0.LIZ(4.0f);
            c1yg.LJIIL = C30419Bwl.LJLIL;
            Boolean LIZJ = InterfaceC30442Bx8.LLZLLLL.LIZJ();
            o.LJIIIIZZ(LIZJ, "HAS_USER_EVER_USE_BEAUTY.value");
            if (LIZJ.booleanValue()) {
                c1yg.LIZ(R.string.ke4);
            } else {
                c1yg.LIZ(R.string.ke2);
            }
            C30770C5u.LIZLLL(new C1YH(c1yg), C09.GUIDE_ENHANCE);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        this.LJLJI.LIZJ(this.LJLJL);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.ov0(this, EffectRedDotStatusChangeEvent.class, new AqS171S0100000_5(this, 170));
        dataChannel.lv0(this, StartLiveSuccessChannel.class, new C30418Bwk(this));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJI.LJ(this.LJLJL);
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        BZI LIZ = C28787BRn.LIZ("live_take_beauty_click");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIL("click");
        LIZ.LJJIIJZLJL();
        if (BeautyPanelMemoryOptSetting.INSTANCE.enable() && (this.context == null || this.dataChannel == null)) {
            return;
        }
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        LiveDialogFragment LIZ2 = C30355Bvj.LIZ(context, dataChannel);
        LIZ2.setOnDismissListener(new IDDListenerS145S0100000_5(this, 9));
        if (LIZ2.isAdded() || LIZ2.isShowing()) {
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) this.dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            LIZ2.show(fragmentManager, "LiveBeautyFilterDialogFragment");
        }
        InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.dataChannel);
        if (LJIILIIL != null) {
            LJIILIIL.LIZJ("beauty");
        }
        C0NA.LIZIZ(C65352Pkq.LIZ(EffectDialogShowChannel.class));
    }
}
