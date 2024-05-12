package X;

import com.bytedance.android.livesdk.LiveRoomFragment;

/* renamed from: X.B7l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28265B7l implements BVZ {
    public final /* synthetic */ LiveRoomFragment LIZ;

    public C28265B7l(LiveRoomFragment liveRoomFragment) {
        this.LIZ = liveRoomFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.B7n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(final float r8) {
        /*
            r7 = this;
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.VnN r0 = r0.LLF
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L6e
            int r1 = r0.getCurrentItem()
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1d
            if (r1 != 0) goto L1d
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.B5t r0 = r0.LLFFF
            int r0 = r0.size()
            if (r0 > r5) goto L43
        L1d:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L36
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.B5t r0 = r0.LLFFF
            int r0 = r0.size()
            int r0 = r0 - r5
            if (r1 != r0) goto L36
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.B5t r0 = r0.LLFFF
            int r0 = r0.size()
            if (r0 > r5) goto L43
        L36:
            if (r1 <= 0) goto L6e
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.B5t r0 = r0.LLFFF
            int r0 = r0.size()
            int r0 = r0 - r5
            if (r1 >= r0) goto L6e
        L43:
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.B5t r0 = r0.LLFFF
            com.bytedance.android.livesdkapi.session.EnterRoomConfig r0 = r0.LIZLLL(r1)
            com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData r0 = r0.mRoomsData
            long r0 = r0.roomId
            r4 = 1
        L50:
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r2 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.0Mx r3 = X.CN1.LIZ(r2)
            com.bytedance.android.livesdk.watch.IWatchLiveService r3 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r3
            com.bytedance.android.livesdk.LiveRoomFragment r2 = r7.LIZ
            android.content.Context r2 = r2.getContext()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.B7n r0 = new X.B7n
            r0.<init>()
            boolean r0 = r3.d10(r2, r1, r0)
            if (r0 == 0) goto L72
            return r5
        L6e:
            r0 = 0
            r4 = 0
            goto L50
        L72:
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            boolean r0 = r0.Hl()
            if (r0 != 0) goto Lbf
            if (r4 == 0) goto Lbf
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            r0.getClass()
            java.lang.Class<com.bytedance.android.live.liveinteract.api.IInteractService> r0 = com.bytedance.android.live.liveinteract.api.IInteractService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = (com.bytedance.android.live.liveinteract.api.IInteractService) r0
            boolean r0 = r0.Qh(r6)
            if (r0 != 0) goto Lbf
            X.B7m r4 = new X.B7m
            r4.<init>()
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            X.BKJ r1 = r0.getCurrentFragment()
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment
            if (r0 == 0) goto Lbf
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r1 = (com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment) r1
            com.bytedance.android.livesdk.LiveRoomFragment r0 = r7.LIZ
            boolean r0 = r0.Hl()
            com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment r3 = r1.LLJIJIL
            if (r3 == 0) goto Lbf
            if (r0 == 0) goto Lbc
            r2 = 49
        Lae:
            X.B7o r1 = new X.B7o
            r0 = 48
            r1.<init>(r0, r2)
            boolean r0 = r3.interceptCloseRoom(r4, r6, r6, r1)
            if (r0 == 0) goto Lbf
            return r5
        Lbc:
            r2 = 50
            goto Lae
        Lbf:
            java.lang.Class<com.bytedance.android.livesdk.survey.ISurveyService> r0 = com.bytedance.android.livesdk.survey.ISurveyService.class
            X.0Mx r0 = X.CN1.LIZ(r0)
            com.bytedance.android.livesdk.survey.ISurveyService r0 = (com.bytedance.android.livesdk.survey.ISurveyService) r0
            boolean r0 = r0.Qj()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28265B7l.LIZ(float):boolean");
    }
}
