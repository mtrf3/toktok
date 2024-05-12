package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.Ti0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75368Ti0 implements InterfaceC75158Tec {
    public final /* synthetic */ C75357Thp LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    public C75368Ti0(C75357Thp c75357Thp) {
        this.LJLIL = c75357Thp;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        this.LJLIL.LJLLI = false;
        String LJII = C75357Thp.LJII(246);
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        C32014ChO.LIZJ(LJII, "load avatar image failed for,", str2);
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        this.LJLIL.LJLLI = !C107244Iu.LIZIZ(str);
    }
}
