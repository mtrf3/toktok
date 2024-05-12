package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import X.C0NB;
import X.C199097rd;
import X.C29053Baj;
import X.C29180Bcm;
import X.C72818Shy;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.X1D;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.AccessLiveStudioSucceedChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewLiveStudioPageWidgetV2 extends AbstractPreviewLiveStudioPage implements InterfaceC72822Si2 {
    public boolean LJLJJI;
    public View LJLJJL;
    public final C29180Bcm LJLJJLL = (C29180Bcm) DataChannelGlobal.LJLJJI.mv0(C29053Baj.class);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dq2;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.hasLiveStudioLogin == true) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.AbstractPreviewLiveStudioPage, com.bytedance.android.live.broadcast.preview.PreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZL() {
        /*
            r9 = this;
            super.LJZL()
            X.Bcm r0 = r9.LJLJJLL
            if (r0 == 0) goto Ld6
            boolean r0 = r0.LJLJJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        Ld:
            boolean r0 = X.C29306Beo.LJJIFFI(r0)
            r9.LJLJJI = r0
            r0 = 2131369490(0x7f0a1e12, float:1.835896E38)
            android.view.View r8 = r9.findViewById(r0)
            r0 = 2131378495(0x7f0a413f, float:1.8377224E38)
            android.view.View r0 = r9.findViewById(r0)
            r9.LJLJJL = r0
            r0 = 2131379270(0x7f0a4446, float:1.8378796E38)
            android.view.View r7 = r9.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6 = 0
            if (r7 != 0) goto L7d
        L2f:
            android.view.View r2 = r9.LJLJJL
            if (r2 == 0) goto L3d
            Y.ACListenerS25S0100000_5 r1 = new Y.ACListenerS25S0100000_5
            r0 = 102(0x66, float:1.43E-43)
            r1.<init>(r9, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        L3d:
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGameService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGameService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGameService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGameService) r0
            if (r0 == 0) goto L7b
            webcast.api.game.CreateInfoResponse$ResponseData r0 = r0.DX()
            if (r0 == 0) goto L7b
            boolean r0 = r0.hasLiveStudioLogin
            r1 = 1
            if (r0 != r1) goto L7b
        L52:
            boolean r0 = r9.LJLJJI
            if (r0 == 0) goto L6e
            if (r1 == 0) goto L6e
            r0 = 2131379269(0x7f0a4445, float:1.8378794E38)
            android.view.View r2 = r9.findViewById(r0)
            if (r2 == 0) goto L6e
            r2.setVisibility(r6)
            Y.ACListenerS40S0200000_5 r1 = new Y.ACListenerS40S0200000_5
            r0 = 56
            r1.<init>(r2, r9, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        L6e:
            java.lang.String r0 = "live_studio_permission_apply_success"
            X.C72818Shy.LIZLLL(r0, r9)
            java.lang.String r1 = "tiktok_live_game_demand_1"
            java.lang.String r0 = "ttlive_broadcast_live_studio_preview_page_detail_new.png"
            X.C15490jB.LJ(r8, r1, r0)
            return
        L7b:
            r1 = 0
            goto L52
        L7d:
            r0 = 2131839261(0x7f11491d, float:1.9311769E38)
            java.lang.String r3 = X.C15380j0.LJIILJJIL(r0)
            java.lang.String r2 = "sourceString"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r2)
            java.lang.String r0 = "["
            r1 = 6
            int r5 = ujb.s.LJJLIIIJL(r3, r0, r6, r6, r1)
            java.lang.String r0 = "]"
            int r0 = ujb.s.LJJLIIIJL(r3, r0, r6, r6, r1)
            int r4 = r0 + (-1)
            java.lang.String r1 = "[\\[\\]]"
            java.lang.String r0 = ""
            java.lang.String r3 = X.QZP.LIZIZ(r1, r3, r0)
            if (r5 < 0) goto La4
            if (r5 <= r4) goto Lab
        La4:
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r2)
        La7:
            r7.setText(r3)
            goto L2f
        Lab:
            android.content.Context r1 = r9.context
            if (r1 == 0) goto Ld2
            r0 = 2130971722(0x7f040c4a, float:1.755219E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r1)
            if (r0 == 0) goto Ld2
            int r1 = r0.intValue()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r3)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r1 = 18
            r2.setSpan(r0, r5, r4, r1)
            r0 = 600(0x258, float:8.41E-43)
            X.C23010vJ.LJFF(r2, r5, r4, r1, r0)
            r3 = r2
            goto La7
        Ld2:
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r2)
            goto La7
        Ld6:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.livestudio.PreviewLiveStudioPageWidgetV2.LJZL():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("live_studio_permission_apply_success", this);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceiveJsEvent ");
        LIZ.append(c199097rd);
        C0NB.LIZIZ("PreviewLiveStudioPageWidget", X1D.LIZIZ(LIZ));
        if (o.LJ(c199097rd.LJLIL, "live_studio_permission_apply_success") && (interfaceC78280Uns = c199097rd.LJLILLLLZI) != null && interfaceC78280Uns.getInt("status") == 1) {
            this.LJLJJI = true;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(AccessLiveStudioSucceedChannel.class, Boolean.TRUE);
            }
        }
    }
}
