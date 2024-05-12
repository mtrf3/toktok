package X;

import android.os.PowerManager;

/* renamed from: X.Ipi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47818Ipi implements PowerManager.OnThermalStatusChangedListener {
    public final /* synthetic */ C47769Iov LIZ;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @Override // android.os.PowerManager.OnThermalStatusChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onThermalStatusChanged(int r11) {
        /*
            r10 = this;
            X.Iov r0 = r10.LIZ
            X.Ipf r0 = r0.LJI
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "onThermalStatusChanged "
            java.lang.String r0 = "PlayerMetrics"
            X.C05L.LJFF(r1, r11, r0)
            X.Iov r0 = r10.LIZ
            X.Ipf r9 = r0.LJI
            r4 = 0
            if (r9 == 0) goto L5e
            r0 = 4
            if (r11 != r0) goto L46
            long r0 = java.lang.System.currentTimeMillis()
            r9.LJ = r0
        L1f:
            X.Iov r0 = r10.LIZ
            X.Ipf r3 = r0.LJI
            long r1 = r3.LJI
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L43
            long r8 = r3.LJII
            long r6 = java.lang.System.currentTimeMillis()
            X.Iov r0 = r10.LIZ
            X.Ipf r2 = r0.LJI
            long r0 = r2.LJI
            long r6 = r6 - r0
            long r6 = r6 + r8
            r3.LJII = r6
            r2.LJI = r4
        L3b:
            X.Iov r0 = r10.LIZ
            X.Ipf r0 = r0.LJI
            r0.getClass()
            return
        L43:
            r3.LJI = r4
            goto L3b
        L46:
            long r1 = r9.LJ
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6c
            long r6 = r9.LJFF
            long r2 = java.lang.System.currentTimeMillis()
            X.Iov r0 = r10.LIZ
            X.Ipf r8 = r0.LJI
            long r0 = r8.LJ
            long r2 = r2 - r0
            long r2 = r2 + r6
            r9.LJFF = r2
            r8.LJ = r4
        L5e:
            r0 = 5
            if (r11 != r0) goto L1f
            X.Iov r0 = r10.LIZ
            X.Ipf r2 = r0.LJI
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJI = r0
            goto L3b
        L6c:
            r9.LJ = r4
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47818Ipi.onThermalStatusChanged(int):void");
    }

    public C47818Ipi(C47769Iov c47769Iov, PowerManager powerManager) {
        this.LIZ = c47769Iov;
    }
}
