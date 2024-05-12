package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.BTJ;
import X.C15490jB;
import X.C15540jG;
import X.C1EW;
import X.C221108m2;
import X.C28718BOw;
import X.C29013Ba5;
import X.C29014Ba6;
import X.C29015Ba7;
import X.C29306Beo;
import X.C30444BxA;
import X.C47061t0;
import X.C48459J0d;
import X.C62822Ol8;
import X.C70657RoD;
import X.CFX;
import X.EnumC30410Bwc;
import X.InterfaceC30442Bx8;
import Y.AfS57S0100000_5;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.BroadcastSettingResponseChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.livesetting.level.FansClubLiveCenterRedIdSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveRedDotOfflineEnableSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLiveCenterWidget extends PreviewToolBaseWidget {
    public boolean LJLJJI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C29015Ba7.LJLIL);
    public final String LJLJJL = FansClubLiveCenterRedIdSettings.INSTANCE.getValue();
    public final int LJLJJLL = R.string.mqp;
    public final int LJLJL = R.drawable.cwh;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpz;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final boolean LLIIIILZ() {
        String LIZ = InterfaceC30442Bx8.p2.LIZ();
        if (LIZ == null) {
            LIZ = "";
        }
        if (!TextUtils.isEmpty(this.LJLJJL) && !TextUtils.equals(LIZ, this.LJLJJL)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C70657RoD.LJJI(0.01d, new AqS155S0100000_5(this, 325));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        if (C29306Beo.LJJIIJ(getView())) {
            C70657RoD.LJJI(0.01d, new AqS155S0100000_5(this, 325));
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        View view;
        super.LJZL();
        EnumC30410Bwc enumC30410Bwc = EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE;
        View view2 = getView();
        if (view2 != null) {
            view = view2.findViewById(R.id.niz);
        } else {
            view = null;
        }
        C30444BxA.LIZJ(enumC30410Bwc, this, view, null, 4);
        if (((Boolean) this.LJLJI.getValue()).booleanValue()) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.m;
            if (!c48459J0d.LIZJ().booleanValue()) {
                View view3 = getView();
                if (view3 != null) {
                    C15540jG c15540jG = new C15540jG();
                    c15540jG.LJIILIIL = true;
                    C47061t0 c47061t0 = (C47061t0) view3.findViewById(R.id.nix);
                    o.LJIIIIZZ(c47061t0, "it.widget_icon");
                    c15540jG.LIZ = c47061t0;
                    c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1");
                    c15540jG.LIZJ = "ttlive_live_center_preview_guide.webp";
                    c15540jG.LJFF = false;
                    c15540jG.LJIIL = true;
                    c15540jG.LJ = new C29013Ba5(this, c15540jG);
                    C15490jB.LJI(c15540jG);
                }
                this.LJLJJI = true;
                c48459J0d.LIZ(Boolean.TRUE);
            }
            this.dataChannel.ov0(this, BroadcastSettingResponseChannel.class, new AqS171S0100000_5(this, 174));
        } else if ((!LiveRedDotOfflineEnableSetting.INSTANCE.getValue() && !InterfaceC30442Bx8.f66Y.LIZJ().booleanValue()) || LLIIIILZ()) {
            C30444BxA.LIZLLL(enumC30410Bwc, this.LJLJJL);
        }
        Boolean LIZJ = InterfaceC30442Bx8.LJJJJJL.LIZJ();
        o.LJIIIIZZ(LIZJ, "SHOW_PREVIEW_LIVE_CENTER_BUBBLE.value");
        if (LIZJ.booleanValue()) {
            C1EW.LIZ(C28718BOw.LIZ().LIZ().checkLiveCenterBubble(1).LJII(BTJ.LIZIZ(this.widgetCallback.getFragment()))).LJJJLIIL(new AfS57S0100000_5(this, 48), C29014Ba6.LJLIL);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFFF() {
        return this.LJLJL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int LLFII() {
        return this.LJLJJLL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cb, code lost:
    
        if (r7 != null) goto L7;
     */
    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            X.J0d<java.lang.Boolean> r1 = X.InterfaceC30442Bx8.f66Y
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.LIZ(r0)
            X.Bwc r0 = X.EnumC30410Bwc.LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE
            X.C30444BxA.LIZ(r0)
            r0 = 2131380960(0x7f0a4ae0, float:1.8382224E38)
            android.view.View r0 = r9.findViewById(r0)
            X.C29306Beo.LJI(r0)
            com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterInLiveTakePageSchema r0 = com.bytedance.android.livesdk.livesetting.broadcast.OptLiveCenterInLiveTakePageSchema.INSTANCE
            java.lang.String r0 = r0.getValue()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "click_time"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "parse(schema)\n          …      .build().toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.Class<com.bytedance.android.live.actionhandler.IActionHandlerService> r0 = com.bytedance.android.live.actionhandler.IActionHandlerService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            com.bytedance.android.live.actionhandler.IActionHandlerService r1 = (com.bytedance.android.live.actionhandler.IActionHandlerService) r1
            android.content.Context r0 = r8.context
            r1.handle(r0, r2)
            com.bytedance.ies.sdk.datachannel.DataChannel r7 = r8.dataChannel
            boolean r0 = r8.LLFZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r5 = X.C29306Beo.LJJIFFI(r0)
            android.view.View r0 = r8.getView()
            int r0 = com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget.LL(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r6 = 0
            if (r7 == 0) goto Lca
            java.lang.Class<com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel> r0 = com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel.class
            java.lang.Object r0 = r7.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Lca
            boolean r2 = r0.booleanValue()
        L7c:
            java.lang.Class<com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel> r1 = com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.rv0(r1, r0)
        L83:
            java.lang.String r0 = "livesdk_live_center_takepage_click"
            X.BZI r3 = X.C28787BRn.LIZ(r0)
            r3.LJIILLIIL(r7)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "local_time_ms"
            r3.LJIJJ(r1, r0)
            if (r2 == 0) goto Lc7
            java.lang.String r2 = "1"
        L9d:
            java.lang.String r1 = "is_touched"
            java.lang.String r0 = "have_red_dot"
            X.C78895Uxn.LIZIZ(r3, r2, r1, r5, r0)
            java.lang.String r0 = "index"
            r3.LJIJJ(r4, r0)
            r3.LJJIIJZLJL()
            X.J0d<long[]> r0 = X.InterfaceC30442Bx8.o
            java.lang.Object r0 = r0.LIZJ()
            long[] r0 = (long[]) r0
            int r4 = r0.length
            r3 = 0
        Lb6:
            if (r3 >= r4) goto Lce
            X.J0d<long[]> r0 = X.InterfaceC30442Bx8.o
            java.lang.Object r2 = r0.LIZJ()
            long[] r2 = (long[]) r2
            r0 = 0
            r2[r3] = r0
            int r3 = r3 + 1
            goto Lb6
        Lc7:
            java.lang.String r2 = "0"
            goto L9d
        Lca:
            r2 = 0
            if (r7 == 0) goto L83
            goto L7c
        Lce:
            X.J0d<long[]> r0 = X.InterfaceC30442Bx8.o
            java.lang.Object r2 = r0.LIZJ()
            long[] r2 = (long[]) r2
            long r0 = X.C30725C4b.LIZ()
            r2[r6] = r0
            java.lang.String r0 = r8.LJLJJL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Leb
            X.Byw<java.lang.String> r1 = X.InterfaceC30442Bx8.p2
            java.lang.String r0 = r8.LJLJJL
            r1.LIZJ(r0)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.PreviewLiveCenterWidget.onClick(android.view.View):void");
    }
}
