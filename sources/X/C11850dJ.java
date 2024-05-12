package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.0dJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11850dJ {
    public static final long LIZIZ = C78897Uxp.LJFF(4278190080L);
    public static final long LIZJ;
    public static final long LIZLLL;
    public static final long LJ;
    public static final long LJFF;
    public static final long LJI;
    public static final /* synthetic */ int LJII = 0;
    public final long LIZ;

    public static final boolean LIZJ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C61876OQe.LIZJ(this.LIZ);
    }

    public final String toString() {
        return LJIIIIZZ(this.LIZ);
    }

    static {
        C78897Uxp.LJFF(4282664004L);
        C78897Uxp.LJFF(4287137928L);
        C78897Uxp.LJFF(4291611852L);
        LIZJ = C78897Uxp.LJFF(4294967295L);
        LIZLLL = C78897Uxp.LJFF(4294901760L);
        C78897Uxp.LJFF(4278255360L);
        LJ = C78897Uxp.LJFF(4278190335L);
        C78897Uxp.LJFF(4294967040L);
        C78897Uxp.LJFF(4278255615L);
        C78897Uxp.LJFF(4294902015L);
        LJFF = C78897Uxp.LIZLLL(0);
        LJI = C78897Uxp.LIZJ(0.0f, 0.0f, 0.0f, 0.0f, C13240fY.LJIJ);
    }

    public /* synthetic */ C11850dJ(long j) {
        this.LIZ = j;
    }

    public static final float LIZLLL(long j) {
        float LJII2;
        float f;
        if ((63 & j) == 0) {
            LJII2 = (float) C1RF.LJII((j >>> 56) & 255);
            f = 255.0f;
        } else {
            LJII2 = (float) C1RF.LJII((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return LJII2 / f;
    }

    public static final float LJ(long j) {
        if ((63 & j) == 0) {
            return ((float) C1RF.LJII((j >>> 32) & 255)) / 255.0f;
        }
        return C11970dV.LIZLLL((short) ((j >>> 16) & 65535));
    }

    public static final AbstractC13230fX LJFF(long j) {
        return C13240fY.LJIJJ[(int) (j & 63)];
    }

    public static final float LJI(long j) {
        if ((63 & j) == 0) {
            return ((float) C1RF.LJII((j >>> 40) & 255)) / 255.0f;
        }
        return C11970dV.LIZLLL((short) ((j >>> 32) & 65535));
    }

    public static final float LJII(long j) {
        if ((63 & j) == 0) {
            return ((float) C1RF.LJII((j >>> 48) & 255)) / 255.0f;
        }
        return C11970dV.LIZLLL((short) ((j >>> 48) & 65535));
    }

    public static String LJIIIIZZ(long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Color(");
        LIZ.append(LJII(j));
        LIZ.append(", ");
        LIZ.append(LJI(j));
        LIZ.append(", ");
        LIZ.append(LJ(j));
        LIZ.append(", ");
        LIZ.append(LIZLLL(j));
        LIZ.append(", ");
        return q.LIZIZ(LIZ, LJFF(j).LIZ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C11850dJ) || j != ((C11850dJ) obj).LIZ) {
            return false;
        }
        return true;
    }

    public static final long LIZ(long j, AbstractC13230fX colorSpace) {
        o.LJIIIZ(colorSpace, "colorSpace");
        if (o.LJ(colorSpace, LJFF(j))) {
            return j;
        }
        C13260fa LJJIFFI = C79146V4k.LJJIFFI(LJFF(j), colorSpace, 2);
        float[] LJIIZILJ = C78897Uxp.LJIIZILJ(j);
        LJJIFFI.LIZ(LJIIZILJ);
        return C78897Uxp.LIZJ(LJIIZILJ[0], LJIIZILJ[1], LJIIZILJ[2], LJIIZILJ[3], colorSpace);
    }

    public static long LIZIZ(long j, float f) {
        return C78897Uxp.LIZJ(LJII(j), LJI(j), LJ(j), f, LJFF(j));
    }
}
