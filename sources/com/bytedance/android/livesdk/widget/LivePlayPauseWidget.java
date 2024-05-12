package com.bytedance.android.livesdk.widget;

import X.B8S;
import X.C221108m2;
import X.C2A4;
import X.C47061t0;
import X.C62822Ol8;
import X.C87277YNd;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioPauseWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePlayPauseWidget extends LiveRecyclableWidget {
    public final List<String> LJLIL;
    public final List<String> LJLILLLLZI;
    public B8S LJLJJLL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 278));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 277));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 276));
    public int LJLJL = -1;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpb;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final C2A4 LJLZ() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-livePauseAnimView>(...)");
        return (C2A4) value;
    }

    public final C47061t0 LJZ() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-livePauseBgView>(...)");
        return (C47061t0) value;
    }

    public final LinearLayout LJZI() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-livePauseView>(...)");
        return (LinearLayout) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        show();
        B8S b8s = this.LJLJJLL;
        if (b8s != null) {
            LLF(b8s, this.LJLJL);
        }
        int i = this.LJLJLJ;
        if (i != 0) {
            LL(this.LJLJL, i, this.LJLJLLL);
        }
        LJZL(this.LJLIL, this.LJLILLLLZI);
    }

    public LivePlayPauseWidget(List<String> list, List<String> list2) {
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r4 == com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        if (r4 == com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL(java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9) {
        /*
            r7 = this;
            android.widget.LinearLayout r0 = r7.LJZI()
            r3 = 0
            r0.setVisibility(r3)
            X.1t0 r0 = r7.LJZ()
            r0.setVisibility(r3)
            com.bytedance.android.livesdk.livesetting.watchlive.LiveServerGiveGaussianBackground r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveServerGiveGaussianBackground.INSTANCE
            int r0 = r0.getValue()
            r2 = 1
            if (r0 <= 0) goto Lbd
            boolean r0 = X.C32151Nz.LJJIIZI(r8)
            if (r0 == 0) goto Lbd
            if (r8 == 0) goto L27
            X.1t0 r0 = r7.LJZ()
            X.BL8.LIZJ(r0, r8)
        L27:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioPauseWidget r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveGameLiveStudioPauseWidget.INSTANCE
            boolean r0 = r0.isExperimentGroup()
            r4 = 0
            if (r0 == 0) goto L9e
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.dataChannel
            if (r1 == 0) goto L3a
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r4 = r1.kv0(r0)
        L3a:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r4 != r0) goto L3f
        L3e:
            r3 = 1
        L3f:
            X.0jG r4 = new X.0jG
            r4.<init>()
            java.lang.String r6 = "tiktok_live_watch_resource"
            if (r3 == 0) goto L89
            android.content.Context r1 = r7.getContext()
            r0 = 1124073472(0x43000000, float:128.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r5 = (int) r0
            android.content.Context r1 = r7.getContext()
            r0 = 1117257728(0x42980000, float:76.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r3 = (int) r0
            X.2A4 r0 = r7.LJLZ()
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r1.width = r5
            r1.height = r3
            X.2A4 r0 = r7.LJLZ()
            r0.setLayoutParams(r1)
            X.2A4 r0 = r7.LJLZ()
            r4.LIZ = r0
            java.lang.String r0 = "tiktok_live_watch_resource_demand_1"
            java.lang.String r0 = X.CFX.LIZ(r6, r0)
            r4.LIZIZ = r0
            java.lang.String r0 = "ttlive_pause_live_anim_game.png"
            r4.LIZJ = r0
            r4.LJFF = r2
        L85:
            X.C15490jB.LJI(r4)
            return
        L89:
            X.2A4 r0 = r7.LJLZ()
            r4.LIZ = r0
            java.lang.String r0 = "tiktok_live_watch_resource_normal_1"
            java.lang.String r0 = X.CFX.LIZ(r6, r0)
            r4.LIZIZ = r0
            java.lang.String r0 = "ttlive_pause_live_anim.webp"
            r4.LIZJ = r0
            r4.LJFF = r2
            goto L85
        L9e:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.dataChannel
            if (r1 == 0) goto Lbb
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r1 = r1.kv0(r0)
        La8:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            if (r1 == r0) goto L3e
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r7.dataChannel
            if (r1 == 0) goto Lb6
            java.lang.Class<X.BCX> r0 = X.BCX.class
            java.lang.Object r4 = r1.kv0(r0)
        Lb6:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            if (r4 != r0) goto L3f
            goto L3e
        Lbb:
            r1 = r4
            goto La8
        Lbd:
            X.1t0 r1 = r7.LJZ()
            android.content.Context r0 = r7.getContext()
            X.BL8.LIZIZ(r1, r9, r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LivePlayPauseWidget.LJZL(java.util.List, java.util.List):void");
    }

    public final void LLF(B8S params, int i) {
        o.LJIIIZ(params, "params");
        ViewGroup.LayoutParams layoutParams = LJZI().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = LJZ().getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (i == 1) {
            if (params.LJLJJL) {
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                layoutParams2.topMargin = params.LJLJJI;
                layoutParams2.setMarginStart(params.LJLJI);
                layoutParams4.width = -1;
                layoutParams4.height = -1;
                layoutParams4.topMargin = params.LJLJJI;
                layoutParams4.setMarginStart(params.LJLJI);
                LJZI().setGravity(17);
                LJZI().setPadding(0, 0, 0, 0);
            } else {
                layoutParams2.width = params.LJLIL;
                layoutParams2.height = params.LJLILLLLZI;
                layoutParams2.topMargin = params.LJLJJI;
                layoutParams2.setMarginStart(params.LJLJI);
                LJZI().setGravity(49);
                LJZI().setPadding(0, 3, 0, 0);
                layoutParams4.width = params.LJLIL;
                layoutParams4.height = params.LJLILLLLZI;
                layoutParams4.topMargin = params.LJLJJI;
                layoutParams4.setMarginStart(params.LJLJI);
            }
            LJZI().setLayoutParams(layoutParams2);
            LJZ().setLayoutParams(layoutParams2);
        }
    }

    public final void LL(int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams;
        if (!LiveGameLiveStudioPauseWidget.INSTANCE.isExperimentGroup() && i2 == 0) {
            ViewGroup.LayoutParams layoutParams2 = LJZI().getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.topMargin = 0;
                LJZI().setGravity(1);
                LJZI().setPadding(0, C87277YNd.LJIIJJI(150), 0, 0);
                LJZI().setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = LJZI().getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (i == 1) {
            layoutParams4.width = i2;
            layoutParams4.height = i3;
            layoutParams4.topMargin = LivePlayFragment.z;
        } else {
            layoutParams4.width = -1;
            layoutParams4.height = -1;
            layoutParams4.topMargin = 0;
        }
        LJZI().setGravity(17);
        LJZI().setPadding(0, 0, 0, 0);
        LJZI().setLayoutParams(layoutParams4);
    }
}
