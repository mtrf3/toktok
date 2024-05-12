package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a7n, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92255a7n implements AnonymousClass101 {
    public final long LIZ;
    public final InterfaceC07760Se LIZIZ;

    public C92255a7n(long j, C31631Lz c31631Lz) {
        this.LIZ = j;
        this.LIZIZ = c31631Lz;
    }

    @Override // X.AnonymousClass101
    public final long LIZ(C23470w3 c23470w3, long j, EnumC23500w6 layoutDirection, long j2) {
        int i;
        int LIZJ;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        long LIZ = C78939UyV.LIZ(0, 0);
        long q = this.LIZIZ.q(0L, C78996UzQ.LIZIZ(c23470w3.LIZJ - c23470w3.LIZ, c23470w3.LIZLLL - c23470w3.LIZIZ), layoutDirection);
        long q2 = this.LIZIZ.q(0L, C78996UzQ.LIZIZ((int) (j2 >> 32), C23490w5.LIZIZ(j2)), layoutDirection);
        long LIZ2 = C78939UyV.LIZ(c23470w3.LIZ, c23470w3.LIZIZ);
        long LIZ3 = C78939UyV.LIZ(((int) (LIZ >> 32)) + ((int) (LIZ2 >> 32)), C23450w1.LIZJ(LIZ) + C23450w1.LIZJ(LIZ2));
        long LIZ4 = C78939UyV.LIZ(((int) (LIZ3 >> 32)) + ((int) (q >> 32)), C23450w1.LIZJ(LIZ3) + C23450w1.LIZJ(q));
        long LIZ5 = C78939UyV.LIZ((int) (q2 >> 32), C23450w1.LIZJ(q2));
        long LIZ6 = C78939UyV.LIZ(((int) (LIZ4 >> 32)) - ((int) (LIZ5 >> 32)), C23450w1.LIZJ(LIZ4) - C23450w1.LIZJ(LIZ5));
        long j3 = this.LIZ;
        int i2 = (int) (j3 >> 32);
        if (layoutDirection == EnumC23500w6.Ltr) {
            i = 1;
        } else {
            i = -1;
        }
        long LIZ7 = C78939UyV.LIZ(i2 * i, C23450w1.LIZJ(j3));
        long LIZ8 = C78939UyV.LIZ(((int) (LIZ6 >> 32)) + ((int) (LIZ7 >> 32)), C23450w1.LIZJ(LIZ6) + C23450w1.LIZJ(LIZ7));
        if (C23450w1.LIZJ(LIZ8) >= C23490w5.LIZIZ(j) - C23490w5.LIZIZ(j2)) {
            LIZJ = C23490w5.LIZIZ(j) - C23490w5.LIZIZ(j2);
        } else {
            LIZJ = C23450w1.LIZJ(LIZ8);
        }
        return C78939UyV.LIZ((int) (LIZ8 >> 32), LIZJ);
    }
}
