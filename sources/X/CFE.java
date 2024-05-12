package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CFE implements InterfaceC75158Tec {
    public final /* synthetic */ CF8 LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    public CFE(CF8 cf8) {
        this.LJLIL = cf8;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        StringBuilder LIZIZ = C25620zW.LIZIZ("barrageBottomRibbon imageurl: ", str, ", msg: ");
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        C1EW.LIZLLL(LIZIZ, str2, LIZIZ, "BarrageAnimation");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        CF8 cf8 = this.LJLIL;
        cf8.LJJIIJ = i;
        CF8.LJJII(cf8.LJII(), i2 / 2);
        CF8.LJJIII(this.LJLIL.LJI(), i, i2);
    }
}
