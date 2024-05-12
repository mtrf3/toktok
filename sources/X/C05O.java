package X;

import android.os.Parcel;
import kotlin.jvm.internal.o;

/* renamed from: X.05O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05O {
    public Parcel LIZ;

    public C05O() {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        this.LIZ = obtain;
    }

    public final void LIZ(byte b) {
        this.LIZ.writeByte(b);
    }

    public final void LIZIZ(float f) {
        this.LIZ.writeFloat(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(long r7) {
        /*
            r6 = this;
            long r4 = X.C23520w8.LIZIZ(r7)
            r2 = 0
            boolean r0 = X.C23540wA.LIZ(r4, r2)
            if (r0 == 0) goto L22
        Lc:
            r0 = 0
        Ld:
            r6.LIZ(r0)
            long r0 = X.C23520w8.LIZIZ(r7)
            boolean r0 = X.C23540wA.LIZ(r0, r2)
            if (r0 != 0) goto L21
            float r0 = X.C23520w8.LIZJ(r7)
            r6.LIZIZ(r0)
        L21:
            return
        L22:
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = X.C23540wA.LIZ(r4, r0)
            if (r0 == 0) goto L2f
            r0 = 1
            goto Ld
        L2f:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = X.C23540wA.LIZ(r4, r0)
            if (r0 == 0) goto Lc
            r0 = 2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05O.LIZJ(long):void");
    }
}
