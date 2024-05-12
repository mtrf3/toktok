package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.J5g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48592J5g extends AbstractC48596J5k {
    public static final /* synthetic */ int LIZJ = 0;

    @Override // X.AbstractC48600J5o
    public final void LIZIZ() {
        LJI().LIZIZ("send_message_local_label", new C48594J5i());
        LJI().LIZIZ("receive_message_local_label", new C48594J5i());
        LJI().LIZIZ("like_message_local_label", new C48594J5i());
        LJI().LIZIZ("send_message_local_time_stamp", new C48594J5i());
        LJI().LIZIZ("receive_message_local_time_stamp", new C48594J5i());
        LJI().LIZIZ("like_message_local_time_stamp", new C48594J5i());
    }

    @Override // X.AbstractC48600J5o
    public final ConcurrentHashMap<String, String> LJFF() {
        return LJI().LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082 A[RETURN] */
    @Override // X.AbstractC48600J5o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(java.lang.String r11) {
        /*
            r10 = this;
            r9 = 0
            if (r11 == 0) goto L16
            int r1 = r11.hashCode()
            r0 = -541959104(0xffffffffdfb25c40, float:-2.5704436E19)
            if (r1 == r0) goto L31
            r0 = 569317809(0x21ef19b1, float:1.620207E-18)
            if (r1 == r0) goto L26
            r0 = 585859468(0x22eb818c, float:6.383404E-18)
            if (r1 == r0) goto L1a
        L16:
            r8 = r9
        L17:
            if (r8 != 0) goto L3d
            return r9
        L1a:
            java.lang.String r0 = "receive_message_local_label"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L23
            goto L16
        L23:
            java.lang.String r8 = "receive_message_local_time_stamp"
            goto L17
        L26:
            java.lang.String r0 = "send_message_local_label"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L16
            java.lang.String r8 = "send_message_local_time_stamp"
            goto L17
        L31:
            java.lang.String r0 = "like_message_local_label"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L3a
            goto L16
        L3a:
            java.lang.String r8 = "like_message_local_time_stamp"
            goto L17
        L3d:
            X.J5m r0 = r10.LJI()     // Catch: java.lang.Exception -> L50
            java.lang.String r0 = r0.LIZJ(r8)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L50
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L50
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L50
            goto L51
        L50:
            r0 = r9
        L51:
            if (r0 == 0) goto L82
            long r1 = r0.longValue()
            long r6 = java.lang.System.currentTimeMillis()
            X.J5m r0 = r10.LJI()
            java.lang.String r5 = r0.LIZJ(r11)
            long r3 = r6 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L81
            X.J5m r1 = r10.LJI()
            java.lang.String r0 = "0"
            r1.LJ(r11, r0)
            X.J5m r1 = r10.LJI()
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r1.LJ(r8, r0)
            return r9
        L81:
            return r5
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48592J5g.LIZJ(java.lang.String):java.lang.String");
    }
}
