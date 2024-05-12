package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment;

/* renamed from: X.Tab, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74909Tab implements U4B {
    public final /* synthetic */ MultiGuestUserInfoFragment LJLIL;

    public C74909Tab(MultiGuestUserInfoFragment multiGuestUserInfoFragment) {
        this.LJLIL = multiGuestUserInfoFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.U4B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse.ResponseData r8) {
        /*
            r7 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.MultiGuestUserInfoFragment r4 = r7.LJLIL
            r5 = 0
            if (r8 == 0) goto L46
            r4.getClass()
            com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo r0 = r8.reserveUserInfo
            if (r0 == 0) goto L46
            long r2 = r0.reserveId
        Lf:
            java.lang.String r1 = "click"
            r0 = 1
            r4.Nl(r2, r1, r0)
            X.C75027TcV.LIZIZ(r0)
            X.C75027TcV.LIZLLL = r5
            boolean r0 = r4.Ll()
            if (r0 == 0) goto L43
            X.TXF r0 = X.TXF.SEND_RESERVATION
        L22:
            r4.LLFII = r0
            com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicApplyLayoutOptSetting.INSTANCE
            int r1 = r0.getValue()
            r0 = 2
            if (r1 != r0) goto L3b
            r4.cm()
            r4.Wl()
            int r0 = r4.LJLJJL
            int r0 = r0 + (-1)
            r4.Tl(r0)
        L3a:
            return
        L3b:
            com.bytedance.android.livesdk.LiveDialogFragment r0 = r4.LJLJJLL
            if (r0 == 0) goto L3a
            r0.dismiss()
            goto L3a
        L43:
            X.TXF r0 = X.TXF.SEND_REQUEST
            goto L22
        L46:
            r2 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74909Tab.LIZJ(com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse$ResponseData):void");
    }

    @Override // X.U4B
    public final void onFailed(Throwable th) {
        MultiGuestUserInfoFragment multiGuestUserInfoFragment = this.LJLIL;
        multiGuestUserInfoFragment.getClass();
        multiGuestUserInfoFragment.Nl(C75027TcV.LIZLLL, "click", true);
        multiGuestUserInfoFragment.cm();
        multiGuestUserInfoFragment.Wl();
    }
}
