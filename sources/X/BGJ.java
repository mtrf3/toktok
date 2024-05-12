package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartDialog;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BGJ implements InterfaceC28903BVz {
    public View LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.kst;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    public final void LIZ() {
        LiveDialogFragment drawGuessStartDialog;
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.pv0(DismissToolbarPopEvent.class);
        }
        if (C0GA.LIZ(this.LJLILLLLZI)) {
            drawGuessStartDialog = BAO.LIZ(false, false);
        } else {
            drawGuessStartDialog = new DrawGuessStartDialog();
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) == null) {
            return;
        }
        C1XY.LJJIIJZLJL(drawGuessStartDialog, fragmentManager, "ToolbarInteractionDrawGuessBehavior");
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.atv;
        }
        return R.attr.at2;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_entrance_show");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        BAI.LIZ(LIZ);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC28903BVz
    public final void onClick(View view) {
        BEF bef;
        o.LJIIIZ(view, "view");
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null && (bef = (BEF) dataChannel.kv0(LiveBanCapabilityChannel.class)) != null && bef.LJLIL) {
            C30868C9o.LIZJ(R.string.o7u);
        } else {
            ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LJLILLLLZI, BGK.LJLIL, new AqS136S0200000_5(this, view, 0), BGI.LJLIL, C15380j0.LJIILJJIL(R.string.kst), Boolean.TRUE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    @Override // X.InterfaceC28903BVz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(android.view.View r7, com.bytedance.ies.sdk.datachannel.DataChannel r8) {
        /*
            r6 = this;
            r6.LJLIL = r7
            r6.LJLILLLLZI = r8
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baa> r0 = X.C29044Baa.class
            java.lang.Object r0 = r1.mv0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L80
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.mRoomAuthStatus
            if (r0 == 0) goto L80
            com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission r0 = r0.anchorLevelPermission
            if (r0 == 0) goto L80
            X.0eP r1 = X.EnumC12540eQ.Companion
            int r0 = r0.pictionary
            r1.getClass()
            X.0eQ r1 = X.C12530eP.LIZ(r0)
            X.0eQ r0 = X.EnumC12540eQ.OFF
            if (r1 != r0) goto L80
            r4 = 1
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C1DH.LJIILL(r8)
            if (r0 == 0) goto L4c
            int r1 = r0.cppVersion
            r0 = 2
            if (r1 != r0) goto L4c
            r0 = 2131377999(0x7f0a3f4f, float:1.8376218E38)
            android.view.View r2 = r7.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r1 = "tiktok_live_broadcast_demand_4"
            java.lang.String r0 = "ttlive_ic_cpp_lock_v3.png"
            java.lang.String r0 = X.C15510jD.LJIIIZ(r1, r0)
            X.C15490jB.LIZJ(r2, r0)
            r2.setVisibility(r5)
        L4c:
            boolean r0 = X.BFI.LIZLLL
            if (r0 == 0) goto L74
            if (r8 == 0) goto L76
        L52:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel.class
            java.lang.Object r1 = r8.kv0(r0)
            X.BEF r1 = (X.BEF) r1
        L5a:
            if (r4 == 0) goto L6d
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C1DH.LJIILL(r8)
            if (r0 == 0) goto L6d
            int r0 = r0.cppVersion
            if (r0 != r3) goto L6d
        L66:
            r0 = 1051595899(0x3eae147b, float:0.34)
            r7.setAlpha(r0)
        L6c:
            return
        L6d:
            if (r1 == 0) goto L6c
            boolean r0 = r1.LJLIL
            if (r0 != r3) goto L6c
            goto L66
        L74:
            if (r8 != 0) goto L78
        L76:
            r1 = 0
            goto L5a
        L78:
            X.BFI.LIZIZ = r8
            X.BFI.LIZLLL = r3
            X.BFI.LIZIZ()
            goto L52
        L80:
            r4 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BGJ.LIZIZ(android.view.View, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
