package X;

import java.util.Collection;

/* renamed from: X.Zh8, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90602Zh8 implements InterfaceC90093ZXl {
    public final /* synthetic */ C90605ZhB LIZ;

    public C90602Zh8(C90605ZhB c90605ZhB) {
        this.LIZ = c90605ZhB;
    }

    @Override // X.InterfaceC90093ZXl
    public final void LIZ(AbstractC90599Zh5 abstractC90599Zh5, C90089ZXh c90089ZXh, Collection<C90092ZXk> collection) {
        C90605ZhB c90605ZhB = this.LIZ;
        if (abstractC90599Zh5 == c90605ZhB.LJIJI && c90089ZXh != null) {
            ZY2 zy2 = c90605ZhB.LJIJ.LIZ;
            String LIZLLL = c90089ZXh.LIZLLL();
            ZY4 zy4 = new ZY4(zy2, LIZLLL, this.LIZ.LIZIZ(zy2, LIZLLL));
            zy4.LJIIIIZZ(c90089ZXh);
            C90605ZhB c90605ZhB2 = this.LIZ;
            if (c90605ZhB2.LJIILLIIL == zy4) {
                return;
            }
            c90605ZhB2.LJII(c90605ZhB2, zy4, c90605ZhB2.LJIJI, 3, c90605ZhB2.LJIJ, collection);
            C90605ZhB c90605ZhB3 = this.LIZ;
            c90605ZhB3.LJIJ = null;
            c90605ZhB3.LJIJI = null;
            return;
        }
        if (abstractC90599Zh5 == c90605ZhB.LJIIZILJ) {
            if (c90089ZXh != null) {
                c90605ZhB.LJIILIIL(c90605ZhB.LJIILLIIL, c90089ZXh);
            }
            this.LIZ.LJIILLIIL.LJIILIIL(collection);
        }
    }
}
