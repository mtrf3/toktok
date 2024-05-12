package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.ActivityC45651qj;
import X.BEF;
import X.C04130Ef;
import X.C06040Lo;
import X.C15380j0;
import X.C1YG;
import X.C1YH;
import X.C28509BGv;
import X.C29005BZx;
import X.C29040BaW;
import X.C29306Beo;
import X.C30326BvG;
import X.C30868C9o;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC30442Bx8;
import Y.ARunnableS41S0100000_5;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.CustomPollBubbleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewCustomPollWidget extends PreviewToolBaseWidget {
    public final int LJLJI = R.string.oij;
    public final int LJLJJI = R.drawable.cyy;
    public long LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        LiveMode liveMode;
        if (CustomPollBubbleSetting.INSTANCE.hasBubble() && C29306Beo.LJJIFFI(InterfaceC30442Bx8.LJLLLL.LIZJ())) {
            C1YG c1yg = new C1YG(getView());
            c1yg.LIZ(R.string.ke7);
            c1yg.LIZLLL = 48;
            c1yg.LJIIIIZZ = C15380j0.LIZ(266.0f);
            c1yg.LJIIIZ = true;
            c1yg.LJIIL = new C29005BZx(this);
            C30326BvG.LIZJ(new ARunnableS41S0100000_5(new C1YH(c1yg), 60), null, 1000L);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            C04130Ef.LJFF(this.dataChannel, "go_live", C28509BGv.LIZ(liveMode), false, this.LJLJJLL, true);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Boolean bool;
        LiveMode liveMode;
        if (User.sSubPermission) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
                bool = Boolean.valueOf(C28509BGv.LJ(liveMode));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                return;
            }
        }
        super.show();
        BEF bef = (BEF) DataChannelGlobal.LJLJJI.mv0(C29040BaW.class);
        if (bef != null) {
            if (bef.LJLJJI) {
                View view = getView();
                if (view == null) {
                    return;
                }
                view.setAlpha(0.34f);
                return;
            }
            View view2 = getView();
            if (view2 == null) {
                return;
            }
            view2.setAlpha(1.0f);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        DataChannel dataChannel;
        LiveMode liveMode;
        super.LJZ();
        if (C29306Beo.LJJIIJ(getView()) && (dataChannel = this.dataChannel) != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            C04130Ef.LJFF(this.dataChannel, "go_live", C28509BGv.LIZ(liveMode), false, this.LJLJJLL, true);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJI;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        LiveMode liveMode;
        o.LJIIIZ(view, "view");
        BEF bef = (BEF) DataChannelGlobal.LJLJJI.mv0(C29040BaW.class);
        if (bef != null && bef.LJLJJI) {
            C30868C9o.LIZJ(R.string.o8j);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLJJL < 500) {
            return;
        }
        this.LJLJJL = uptimeMillis;
        LLF();
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(this.context);
        if (LIZIZ != null) {
            InterfaceC06390Mx LIZ = CN1.LIZ(IRoomFunctionService.class);
            o.LJIIIIZZ(LIZ, "getService(IRoomFunctionService::class.java)");
            C06040Lo.LIZ((IRoomFunctionService) LIZ, "go_live", LIZIZ, this.dataChannel, 16);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            C04130Ef.LIZLLL(this.dataChannel, "go_live", false, false, this.LJLJJLL, true, C28509BGv.LIZ(liveMode), PreviewToolBaseWidget.LL(view));
        }
    }
}
