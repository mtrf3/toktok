package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18830oZ {
    public final C0VG LIZ;
    public InterfaceC274415w LIZIZ;
    public InterfaceC274415w LIZJ;

    public C18830oZ(C0VG value) {
        o.LJIIIZ(value, "value");
        this.LIZ = value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r3 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZ(long r5) {
        /*
            r4 = this;
            X.15w r2 = r4.LIZIZ
            if (r2 == 0) goto L15
            boolean r0 = r2.LIZLLL()
            if (r0 == 0) goto L50
            X.15w r1 = r4.LIZJ
            if (r1 == 0) goto L15
            r0 = 1
            X.0ax r3 = r1.LJIIJ(r2, r0)
        L13:
            if (r3 != 0) goto L17
        L15:
            X.0ax r3 = X.C10390ax.LJ
        L17:
            float r0 = X.C10370av.LIZLLL(r5)
            float r2 = r3.LIZ
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L40
        L21:
            float r0 = X.C10370av.LJ(r5)
            float r1 = r3.LIZIZ
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L30
        L2b:
            long r0 = X.C78923UyF.LIZ(r2, r1)
            return r0
        L30:
            float r0 = X.C10370av.LJ(r5)
            float r1 = r3.LIZLLL
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3b
            goto L2b
        L3b:
            float r1 = X.C10370av.LJ(r5)
            goto L2b
        L40:
            float r0 = X.C10370av.LIZLLL(r5)
            float r2 = r3.LIZJ
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L4b
            goto L21
        L4b:
            float r2 = X.C10370av.LIZLLL(r5)
            goto L21
        L50:
            X.0ax r3 = X.C10390ax.LJ
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18830oZ.LIZ(long):long");
    }

    public final long LIZJ(long j) {
        InterfaceC274415w interfaceC274415w;
        InterfaceC274415w interfaceC274415w2 = this.LIZIZ;
        if (interfaceC274415w2 != null && (interfaceC274415w = this.LIZJ) != null) {
            if (interfaceC274415w2.LIZLLL() && interfaceC274415w.LIZLLL()) {
                j = interfaceC274415w2.LJIIL(interfaceC274415w, j);
            }
            return new C10370av(j).LIZ;
        }
        return j;
    }

    public final int LIZIZ(long j, boolean z) {
        if (z) {
            j = LIZ(j);
        }
        return this.LIZ.LJIIL(LIZJ(j));
    }
}
