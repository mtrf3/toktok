package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;

/* renamed from: X.KyU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53458KyU extends AbstractC53588L1k<EnumC53523KzX, C53464Kya> {
    public final C53464Kya LIZJ;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C53488Kyy.LJLIL);

    @Override // X.AbstractC53588L1k
    public final /* bridge */ /* synthetic */ C53464Kya LJFF() {
        return this.LIZJ;
    }

    public C53458KyU(C53464Kya c53464Kya) {
        this.LIZJ = c53464Kya;
    }

    public static float LJI(C53447KyJ c53447KyJ) {
        int i = c53447KyJ.LJLIL;
        if (i <= C53439KyB.LJFF) {
            return C32151Nz.LJIIZILJ(72);
        }
        if (i <= C53439KyB.LJ) {
            return C32151Nz.LJIIZILJ(76);
        }
        if (i <= C53439KyB.LIZLLL) {
            return C32151Nz.LJIIZILJ(82);
        }
        if (i <= C53439KyB.LIZJ) {
            return C32151Nz.LJIIZILJ(93);
        }
        if (i <= C53439KyB.LIZIZ) {
            return C32151Nz.LJIIZILJ(107);
        }
        if (i <= C53439KyB.LIZ) {
            return C32151Nz.LJIIZILJ(134);
        }
        return C32151Nz.LJIIZILJ(107);
    }

    public static int LJII(C53447KyJ c53447KyJ) {
        int i = c53447KyJ.LJLIL;
        if (i <= C53439KyB.LJFF) {
            return C7MY.LIZIZ(4);
        }
        if (i <= C53439KyB.LIZIZ) {
            return C7MY.LIZIZ(5);
        }
        return C7MY.LIZIZ(5);
    }

    @Override // X.AbstractC53588L1k
    public final C53469Kyf LIZ(EnumC53523KzX enumC53523KzX) {
        C53464Kya c53464Kya;
        if (enumC53523KzX == EnumC53523KzX.LIVE && (c53464Kya = this.LIZJ) != null) {
            int i = c53464Kya.LIZ;
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return new C53469Kyf(new C53461KyX(new C53513KzN(new C53456KyS(0), new C53455KyR(C2W9.LJLIL, C2WA.LJLIL), null, false, C234009Gi.LJLIL, C53529Kzd.LJLIL, null, true, true, C58012Pl.LJLIL, null, 3148)));
                }
            } else {
                return new C53469Kyf(new C53461KyX(new C53514KzO(Integer.valueOf(R.string.mgl), new AqS175S0100000_9(this, 549), Integer.valueOf(R.attr.dj), new AqS175S0100000_9(this, 550), new AqS175S0100000_9(this, 551), new C53470Kyg(81, C53457KyT.LJLIL, 4), new C53455KyR(C2WC.LJLIL, new AqS175S0100000_9(this, 548)))));
            }
        }
        return null;
    }

    @Override // X.AbstractC53588L1k
    public final C53468Kye LJ(EnumC53523KzX enumC53523KzX) {
        C53464Kya c53464Kya;
        if (enumC53523KzX != EnumC53523KzX.LIVE || (c53464Kya = this.LIZJ) == null) {
            return null;
        }
        int i = c53464Kya.LIZ;
        if (i != 1 && i != 2) {
            if (i != 4) {
                return null;
            }
            return new C53468Kye(new C53461KyX(new C53478Kyo(null, null, new AqS175S0100000_9(this, 555), null, null, null, false, 251)));
        }
        return new C53468Kye(new C53461KyX(new C53513KzN(new C53470Kyg(17, null, 6), new C53455KyR(new AqS175S0100000_9(this, 552), new AqS175S0100000_9(this, 553)), null, true, C53495Kz5.LJLIL, new AqS175S0100000_9(this, 554), null, true, false, null, null, 3908)));
    }
}
