package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U29 implements InterfaceC75158Tec {
    public final /* synthetic */ U28 LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    public U29(U28 u28) {
        this.LJLIL = u28;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        String LJJIJLIJ = C17N.LJJIJLIJ(106);
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        C32014ChO.LIZJ(LJJIJLIJ, "load banner failed,", str2);
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        Object value = this.LJLIL.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-bannerCloseIcon>(...)");
        C29306Beo.LJJLIIIJJI((View) value, true);
    }
}
