package X;

import java.util.logging.Logger;

/* renamed from: X.Zjh, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90761Zjh extends C90368ZdM {
    public static final Logger LIZIZ = Logger.getLogger(AbstractC90761Zjh.class.getName());
    public static final boolean LIZJ = C90376ZdU.LIZLLL;
    public C90405Zdx LIZ;

    public AbstractC90761Zjh() {
    }

    public /* synthetic */ AbstractC90761Zjh(int i) {
    }

    public static int LIZ(int i) {
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

    public static int LIZIZ(long j) {
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

    public static int LJIJ(int i) {
        if (i >= 0) {
            return LIZ(i);
        }
        return 10;
    }

    public static int LJIJJ(int i) {
        return LIZ(i << 3);
    }

    public abstract void LIZJ(byte b);

    public abstract void LIZLLL(int i, boolean z);

    public abstract void LJ(int i, AbstractC90364ZdI abstractC90364ZdI);

    public abstract void LJFF(int i, int i2);

    public abstract void LJI(int i);

    public abstract void LJII(int i, long j);

    public abstract void LJIIIIZZ(long j);

    public abstract void LJIIIZ(int i, int i2);

    public abstract void LJIIJ(int i);

    public abstract void LJIIJJI(int i, String str);

    public abstract void LJIIL(int i, int i2);

    public abstract void LJIILIIL(int i, int i2);

    public abstract void LJIILJJIL(int i);

    public abstract void LJIILL(int i, long j);

    public abstract void LJIILLIIL(long j);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int LJIJI(String str) {
        int i;
        try {
            str = C90389Zdh.LIZJ(str);
            i = str;
        } catch (C90382Zda unused) {
            i = str.getBytes(C90359ZdD.LIZ).length;
        }
        return LIZ(i) + i;
    }

    public static int LJIIZILJ(int i, InterfaceC90712Ziu interfaceC90712Ziu, InterfaceC90399Zdr interfaceC90399Zdr) {
        int LIZ = LIZ(i << 3);
        int i2 = LIZ + LIZ;
        AbstractC90893Zlp abstractC90893Zlp = (AbstractC90893Zlp) interfaceC90712Ziu;
        int LIZ2 = abstractC90893Zlp.LIZ();
        if (LIZ2 == -1) {
            LIZ2 = interfaceC90399Zdr.LIZJ(abstractC90893Zlp);
            abstractC90893Zlp.LIZIZ(LIZ2);
        }
        return i2 + LIZ2;
    }
}
