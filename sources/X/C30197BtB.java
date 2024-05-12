package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.BtB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30197BtB implements InterfaceC10980bu {
    public final Room LIZ;
    public InterfaceC10990bv LIZIZ;
    public boolean LIZJ;

    public C30197BtB(Room room) {
        this.LIZ = room;
    }

    @Override // X.InterfaceC10980bu
    public final void LIZ(C30195Bt9 c30195Bt9) {
        this.LIZIZ = c30195Bt9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r21 == 1) goto L22;
     */
    @Override // X.InterfaceC10980bu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r19, int r20, int r21, long r22, long r24) {
        /*
            r18 = this;
            r0 = 4
            r13 = 0
            r9 = r19
            r5 = r18
            if (r9 != r0) goto La
            r5.LIZIZ = r13
        La:
            r4 = 1
            r1 = 2
            r2 = r21
            if (r2 != r1) goto L68
            if (r9 != r1) goto L68
            java.lang.String r13 = "app_resume"
        L14:
            X.BP4 r1 = X.C28718BOw.LIZ()
            r1.getClass()
            java.lang.Class<com.bytedance.android.livesdk.api.StatusApi> r0 = com.bytedance.android.livesdk.api.StatusApi.class
            java.lang.Object r6 = r1.LIZIZ(r0)
            com.bytedance.android.livesdk.api.StatusApi r6 = (com.bytedance.android.livesdk.api.StatusApi) r6
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LIZ
            long r7 = r0.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r5.LIZ
            long r10 = r0.getStreamId()
            r12 = r20
            r16 = r24
            r14 = r22
            X.Svk r3 = r6.sendStatus(r7, r9, r10, r12, r13, r14, r16)
            X.UYK r2 = new X.UYK
            r0 = 500(0x1f4, double:2.47E-321)
            r2.<init>(r4, r0)
            X.SzH r1 = r3.LJJJJL(r2)
            X.T0k r0 = X.T16.LIZ()
            X.Sro r1 = r1.LJJL(r0)
            X.T0k r0 = X.C73969T1h.LIZIZ()
            X.SsE r3 = r1.LJJJ(r0)
            Y.AfS36S0101000_5 r2 = new Y.AfS36S0101000_5
            r1 = 0
            r0 = 48
            r2.<init>(r1, r5, r0)
            Y.AfS36S0101000_5 r1 = new Y.AfS36S0101000_5
            r0 = 32
            r1.<init>(r4, r5, r0)
            r3.LJJJLIIL(r2, r1)
            return
        L68:
            r0 = 3
            if (r2 != r0) goto L70
            if (r9 != r1) goto L14
            java.lang.String r13 = "continue_resume"
            goto L14
        L70:
            if (r2 != r1) goto L77
            if (r9 != r0) goto L14
            java.lang.String r13 = "app_pause"
            goto L14
        L77:
            if (r2 != r4) goto L7e
            if (r9 != r1) goto L80
            java.lang.String r13 = "anchor_resume"
            goto L14
        L7e:
            if (r2 != r4) goto L14
        L80:
            if (r9 != r0) goto L14
            java.lang.String r13 = "anchor_pause"
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30197BtB.LIZIZ(int, int, int, long, long):void");
    }
}
