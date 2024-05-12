package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;

/* loaded from: classes14.dex */
public final class TV5 {
    public final C73318Sq2 LIZ = new C73318Sq2();

    public final void LIZJ() {
        this.LIZ.LIZLLL();
    }

    public static final String LIZIZ(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_MultiGuestGiftContributeRankPresenter_", LJ, LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ2, "_MultiGuestGiftContributeRankPresenter_", i, LIZ2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r11 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.live.base.model.user.User r14, java.lang.String r15, com.bytedance.android.livesdkapi.depend.model.live.Room r16, java.lang.Long r17, X.TV9 r18) {
        /*
            r13 = this;
            r11 = r15
            java.lang.String r1 = "dialogView"
            r0 = r18
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            r12 = 0
            if (r16 == 0) goto Ld3
            long r3 = r16.getId()
            if (r14 == 0) goto Lc7
            long r5 = r14.getId()
            com.bytedance.android.live.base.model.user.User r1 = r16.getOwner()
            if (r1 == 0) goto Lbb
            long r7 = r1.getId()
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r1 = X.C8E.LJ()
            long r9 = X.C78886Uxe.LJJJLIIL(r1)
            X.B83 r1 = X.B83.LIZ()
            X.BgP r1 = r1.LIZIZ()
            X.Bfu r1 = (X.C29374Bfu) r1
            com.bytedance.android.live.base.model.user.User r2 = r1.LJ()
            java.lang.String r1 = "getInstance().user().currentUserOpt"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            boolean r1 = X.TV3.LJFF(r2)
            if (r11 != 0) goto L85
            if (r1 == 0) goto L6a
            X.Tl5 r2 = X.C75559Tl5.LIZIZ
            java.lang.String r1 = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER"
            java.lang.Object r1 = r2.LIZIZ(r1)
            X.Ce1 r1 = (X.InterfaceC31805Ce1) r1
            if (r1 == 0) goto L5e
            X.TUl r1 = r1.LIZ()
            if (r1 == 0) goto L5e
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r1 = X.C76917UGr.LJJIIZ(r1, r5)
            if (r1 == 0) goto L5e
            java.lang.String r11 = r1.mInteractIdStr
        L5c:
            if (r11 != 0) goto L85
        L5e:
            r0 = 65
            java.lang.String r1 = LIZIZ(r0)
            java.lang.String r0 = "linkMicId is null, so return"
            X.C32014ChO.LIZJ(r1, r0, r12)
            return
        L6a:
            X.Tl5 r2 = X.C75559Tl5.LIZIZ
            java.lang.String r1 = "MULTI_GUEST_V3_GUEST_USER_MANAGER"
            java.lang.Object r1 = r2.LIZIZ(r1)
            X.TQ8 r1 = (X.TQ8) r1
            if (r1 == 0) goto L5e
            X.TUl r1 = r1.LIZ()
            if (r1 == 0) goto L5e
            com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser r1 = X.C76917UGr.LJJIL(r1, r5)
            if (r1 == 0) goto L5e
            java.lang.String r11 = r1.linkMicId
            goto L5c
        L85:
            r0.LJJI()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.LinkApi> r1 = com.bytedance.android.livesdk.chatroom.api.LinkApi.class
            java.lang.Object r2 = X.Q7L.LIZIZ(r1)
            com.bytedance.android.livesdk.chatroom.api.LinkApi r2 = (com.bytedance.android.livesdk.chatroom.api.LinkApi) r2
            if (r17 == 0) goto L96
            java.lang.String r12 = r17.toString()
        L96:
            X.SvC r1 = r2.getFanTicketRankList(r3, r5, r7, r9, r11, r12)
            X.SvC r4 = X.T28.LIZLLL(r1)
            Y.AfS65S0100000_13 r3 = new Y.AfS65S0100000_13
            r1 = 115(0x73, float:1.61E-43)
            r3.<init>(r0, r1)
            Y.AfS62S0200000_13 r2 = new Y.AfS62S0200000_13
            r1 = 15
            r2.<init>(r0, r13, r1)
            X.3kP r2 = r4.LJJII(r3, r2)
            X.Sq2 r1 = r13.LIZ
            java.lang.String r0 = "compositeDisposable"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r1.LIZ(r2)
            return
        Lbb:
            r0 = 50
            java.lang.String r1 = LIZIZ(r0)
            java.lang.String r0 = "anchorId is null, so return"
            X.C32014ChO.LIZJ(r1, r0, r12)
            return
        Lc7:
            r0 = 45
            java.lang.String r1 = LIZIZ(r0)
            java.lang.String r0 = "guestUserId is null, so return"
            X.C32014ChO.LIZJ(r1, r0, r12)
            return
        Ld3:
            r0 = 40
            java.lang.String r1 = LIZIZ(r0)
            java.lang.String r0 = "roomid is null, so return"
            X.C32014ChO.LIZJ(r1, r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TV5.LIZ(com.bytedance.android.live.base.model.user.User, java.lang.String, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.Long, X.TV9):void");
    }
}
