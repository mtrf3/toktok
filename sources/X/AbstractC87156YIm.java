package X;

import java.util.logging.Logger;

/* renamed from: X.YIm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87156YIm extends YI7 {
    public static final Logger LIZIZ = Logger.getLogger(AbstractC87156YIm.class.getName());
    public static final boolean LIZJ = C87166YIw.LJFF;
    public YJ8 LIZ;

    public static int LJIILLIIL(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int LJIL(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public abstract void LIZIZ(int i, AbstractC87141YHx abstractC87141YHx);

    public abstract void LIZJ(int i, YIZ yiz, YIU yiu);

    public abstract void LIZLLL(int i, int i2);

    public abstract int LJII();

    public abstract void LJIIIIZZ(int i, AbstractC87141YHx abstractC87141YHx);

    public abstract void LJIIIZ(int i, YIZ yiz);

    public abstract void LJIIL(byte b);

    public abstract void LJIILIIL(int i, String str);

    public abstract void LJIILJJIL(long j);

    public abstract void LJIILL(long j);

    public abstract void LJIIZILJ(int i);

    public abstract void LJIJ(int i);

    public abstract void LJIJI(int i);

    public abstract void LJJI(int i, long j);

    public abstract void LJJIFFI(int i, long j);

    public abstract void LJJII(int i, boolean z);

    public abstract void LJJIIJZLJL(int i, int i2);

    public abstract void LJJIIZ(int i, int i2);

    public abstract void LJJIIZI(int i, int i2);

    public static int LJI(int i) {
        return LJIJJ(i) + 4;
    }

    public static int LJIJJ(int i) {
        return LJIL(i << 3);
    }

    public static int LJIJJLI(int i) {
        if (i >= 0) {
            return LJIL(i);
        }
        return 10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int LJJ(String str) {
        int i;
        try {
            str = PUZ.LIZ(str);
            i = str;
        } catch (C64346PNe unused) {
            i = str.getBytes(YI0.LIZ).length;
        }
        return LJIL(i) + i;
    }

    public static int LJJIIJ(int i) {
        return LJIJJ(i) + 8;
    }

    public static int LJ(int i, int i2) {
        return LJIL(i2) + LJIJJ(i);
    }

    public static int LJFF(int i, int i2) {
        return LJIL((i2 >> 31) ^ (i2 << 1)) + LJIJJ(i);
    }

    public static int LJIIJ(int i, AbstractC87141YHx abstractC87141YHx) {
        int LJIJJ = LJIJJ(i);
        int size = abstractC87141YHx.size();
        return LJIL(size) + size + LJIJJ;
    }

    public static int LJJIII(int i, long j) {
        return LJIILLIIL((j >> 63) ^ (j << 1)) + LJIJJ(i);
    }

    public static int LJIIJJI(int i, YIZ yiz, YIU yiu) {
        int LJIJJ = LJIJJ(i) << 1;
        YIQ yiq = (YIQ) yiz;
        int LJFF = yiq.LJFF();
        if (LJFF == -1) {
            LJFF = yiu.LJ(yiq);
            yiq.LJI(LJFF);
        }
        return LJIJJ + LJFF;
    }
}
