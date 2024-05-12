package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BW1 implements InterfaceC28903BVz, C1M {
    public DataChannel LJLIL;
    public View LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 15));

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.ns1;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    @Override // X.C1M
    public final void LIZ() {
        C29306Beo.LJI((View) this.LJLJJI.getValue());
        C1I.LIZIZ(this);
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.asc;
        }
        return R.attr.asw;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        CC3.LJIIIIZZ();
    }

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
        C1I.LIZIZ(this);
    }

    @Override // X.C1M
    public final void LJIILIIL(long j) {
        C29306Beo.LJJLJLI((View) this.LJLJJI.getValue());
    }

    @Override // X.InterfaceC28903BVz
    public final void onClick(View view) {
        BEF bef;
        o.LJIIIZ(view, "view");
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null && (bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class)) != null && bef.LJLJJI) {
            C30868C9o.LIZJ(R.string.o8j);
        } else {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LJLIL, BW2.LJLIL, new AqS171S0100000_5(this, 21), BW4.LJLIL, C15380j0.LJIILJJIL(R.string.ns1), Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // X.InterfaceC28903BVz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r7, com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            r6 = this;
            r6.LJLIL = r8
            r6.LJLILLLLZI = r7
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L29
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.mRoomAuthStatus
            if (r0 == 0) goto L29
            com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission r0 = r0.anchorLevelPermission
            if (r0 == 0) goto L29
            X.0eP r1 = X.EnumC12540eQ.Companion
            int r0 = r0.poll
            r1.getClass()
            X.0eQ r1 = X.C12530eP.LIZ(r0)
            X.0eQ r0 = X.EnumC12540eQ.ON
            if (r1 != r0) goto L72
        L29:
            r4 = 1
        L2a:
            if (r8 == 0) goto L70
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel.class
            java.lang.Object r1 = r8.kv0(r0)
            X.BEF r1 = (X.BEF) r1
        L34:
            if (r4 != 0) goto L63
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C1DH.LJIILL(r8)
            if (r0 == 0) goto L63
            int r0 = r0.cppVersion
            if (r0 != r3) goto L63
        L40:
            r0 = 1051595899(0x3eae147b, float:0.34)
            r7.setAlpha(r0)
        L46:
            boolean r0 = X.CC4.LIZJ()
            if (r0 != 0) goto L52
            boolean r0 = X.CC4.LIZLLL()
            if (r0 == 0) goto L5d
        L52:
            X.Ol8 r0 = r6.LJLJJI
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            X.C29306Beo.LJJLJLI(r0)
        L5d:
            java.util.HashSet<X.C1M> r0 = X.C1I.LJFF
            r0.add(r6)
            return
        L63:
            if (r1 == 0) goto L6a
            boolean r0 = r1.LJLJJI
            if (r0 != r3) goto L6a
            goto L40
        L6a:
            r0 = 1065353216(0x3f800000, float:1.0)
            r7.setAlpha(r0)
            goto L46
        L70:
            r1 = 0
            goto L34
        L72:
            r4 = 0
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C1DH.LJIILL(r8)
            if (r0 == 0) goto L2a
            int r1 = r0.cppVersion
            r0 = 2
            if (r1 != r0) goto L2a
            r0 = 2131377999(0x7f0a3f4f, float:1.8376218E38)
            android.view.View r2 = r7.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r1 = "tiktok_live_broadcast_demand_4"
            java.lang.String r0 = "ttlive_ic_cpp_lock_v3.png"
            java.lang.String r0 = X.C15510jD.LJIIIZ(r1, r0)
            X.C15490jB.LIZJ(r2, r0)
            r2.setVisibility(r5)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BW1.LIZIZ(android.view.View, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
