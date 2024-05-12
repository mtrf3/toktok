package X;

/* renamed from: X.LHd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53997LHd implements InterfaceC36202EIs {
    public static final C53997LHd LIZ = new C53997LHd();

    @Override // X.InterfaceC36202EIs
    public final void LIZ(long j, long j2, Throwable th) {
        C10K.LIZJ(new LX2(j2, j, th));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r9 == null) goto L12;
     */
    @Override // X.InterfaceC36202EIs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.friendstab.model.NewContentResponse r14, long r15, long r17) {
        /*
            r13 = this;
            r1 = 0
            if (r14 == 0) goto L7
            com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse r1 = X.C78685UuP.LJJIJ(r14)
        L7:
            X.EIw r0 = X.C36203EIt.LIZIZ
            int r2 = r0.ordinal()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r17
            if (r14 == 0) goto L3c
            int r0 = r14.status_code
            if (r0 != 0) goto L3c
            r7 = 1
        L1a:
            int r8 = r14.status_code
            java.lang.String r9 = r14.status_msg
            if (r9 != 0) goto L22
        L20:
            java.lang.String r9 = "onNext"
        L22:
            java.lang.String r10 = "1"
            if (r1 == 0) goto L39
            int r11 = r1.getRedDotCount()
            java.util.ArrayList r0 = r1.getAvatarList()
            if (r0 == 0) goto L3a
            int r12 = r0.size()
        L34:
            r3 = r15
            X.LX1.LIZIZ(r2, r3, r5, r7, r8, r9, r10, r11, r12)
            return
        L39:
            r11 = 0
        L3a:
            r12 = 0
            goto L34
        L3c:
            r7 = 0
            if (r14 == 0) goto L40
            goto L1a
        L40:
            r8 = -2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53997LHd.LIZIZ(com.ss.android.ugc.aweme.friendstab.model.NewContentResponse, long, long):void");
    }
}
