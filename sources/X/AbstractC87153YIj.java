package X;

import java.util.logging.Logger;

/* renamed from: X.YIj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87153YIj extends C72083SQt {
    public static final Logger LJLJJL = Logger.getLogger(AbstractC87153YIj.class.getName());
    public static final boolean LJLJJLL = C87167YIx.LIZLLL;
    public C87149YIf LJLJJI;

    public AbstractC87153YIj() {
    }

    public /* synthetic */ AbstractC87153YIj(int i) {
    }

    public static int LJLJL(int i) {
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

    public static int LJLJLJ(long j) {
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

    public static int LLFFF(int i) {
        if (i >= 0) {
            return LJLJL(i);
        }
        return 10;
    }

    public static int LLFZ(int i) {
        return LJLJL(i << 3);
    }

    public abstract void LJLJLLL(byte b);

    public abstract void LJLL(int i, boolean z);

    public abstract void LJLLI(int i, AbstractC87134YHq abstractC87134YHq);

    public abstract void LJLLILLLL(int i, int i2);

    public abstract void LJLLJ(int i);

    public abstract void LJLLL(int i, long j);

    public abstract void LJLLLL(long j);

    public abstract void LJLLLLLL(int i, int i2);

    public abstract void LJLZ(int i);

    public abstract void LJZ(int i, String str);

    public abstract void LJZI(int i, int i2);

    public abstract void LJZL(int i, int i2);

    public abstract void LL(int i);

    public abstract void LLD(int i, long j);

    public abstract void LLF(long j);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int LLFII(String str) {
        int i;
        try {
            str = C64524PUa.LIZJ(str);
            i = str;
        } catch (C64347PNf unused) {
            i = str.getBytes(YIG.LIZ).length;
        }
        return LJLJL(i) + i;
    }

    public static int LLFF(int i, YIH yih, YIV yiv) {
        int LJLJL = LJLJL(i << 3);
        int i2 = LJLJL + LJLJL;
        YIP yip = (YIP) yih;
        int LJFF = yip.LJFF();
        if (LJFF == -1) {
            LJFF = yiv.LIZJ(yip);
            yip.LJII(LJFF);
        }
        return i2 + LJFF;
    }
}
