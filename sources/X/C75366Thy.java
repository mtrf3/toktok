package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.Thy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75366Thy implements InterfaceC75158Tec {
    public final /* synthetic */ C75358Thq LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    public C75366Thy(C75358Thq c75358Thq) {
        this.LJLIL = c75358Thq;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        String str2;
        this.LJLIL.LJLJJI = false;
        String LJI = C75358Thq.LJI(203);
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = null;
        }
        C32014ChO.LIZJ(LJI, "load avatar image failed for,", str2);
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        this.LJLIL.LJLJJI = !C107244Iu.LIZIZ(str);
    }
}
