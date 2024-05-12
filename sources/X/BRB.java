package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BRB implements InterfaceC28903BVz {
    public View LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.lrt;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.atm;
        }
        return R.attr.asz;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        BR4.LIZJ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC28903BVz
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        BR4.LIZIZ(this.LJLILLLLZI);
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LJLILLLLZI, BRC.LJLIL, new AqS171S0100000_5(this, 593), BRE.LJLIL, C15380j0.LJIILJJIL(R.string.lrt), Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    @Override // X.InterfaceC28903BVz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r9, com.bytedance.ies.sdk.datachannel.DataChannel r10) {
        /*
            r8 = this;
            r8.LJLILLLLZI = r10
            r8.LJLIL = r9
            if (r10 == 0) goto L7e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel> r0 = com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel.class
            java.lang.Object r0 = r10.kv0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L13
            r0.booleanValue()
        L13:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r10.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L7e
            int r0 = r0.cppVersion
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L23:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.LJLILLLLZI
            r7 = 0
            if (r1 == 0) goto L7c
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L7c
            int r3 = r0.cppVersion
        L34:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r8.LJLILLLLZI
            if (r1 == 0) goto L7a
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.kv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L7a
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.getRoomAuthStatus()
            if (r0 == 0) goto L7a
            com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission r0 = r0.anchorLevelPermission
            if (r0 == 0) goto L7a
            int r2 = r0.goodyBag
        L4e:
            android.view.View r1 = r8.LJLIL
            r5 = 2
            if (r1 == 0) goto L6f
            r0 = 2131377999(0x7f0a3f4f, float:1.8376218E38)
            android.view.View r4 = r1.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r3 != r5) goto L6f
            if (r2 != 0) goto L6f
            if (r4 == 0) goto L6f
            r4.setVisibility(r7)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            java.lang.String r2 = "ttlive_ic_cpp_lock_v3.png"
            r1 = 0
            java.lang.String r0 = "tiktok_live_broadcast_demand_4"
            X.C15490jB.LJFF(r4, r0, r2, r3, r1)
        L6f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L84
            return
        L7a:
            r2 = 1
            goto L4e
        L7c:
            r3 = 0
            goto L34
        L7e:
            r0 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            goto L23
        L84:
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.0Mx r1 = X.CN1.LIZ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r1 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r1
            r2 = 0
            X.BRD r3 = X.BRD.LJLIL
            kotlin.jvm.internal.AqS171S0100000_5 r4 = new kotlin.jvm.internal.AqS171S0100000_5
            r0 = 592(0x250, float:8.3E-43)
            r4.<init>(r9, r0)
            r5 = r2
            r6 = r2
            r7 = r2
            r1.disableFunctionAccordingLevel(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BRB.LIZIZ(android.view.View, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
