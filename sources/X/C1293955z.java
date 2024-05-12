package X;

import Y.AObserverS70S0100000_2;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.MutableLiveData;
import com.ss.ugc.android.editor.core.EditorProContext;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.55z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1293955z implements InterfaceC1290954v {
    public final ActivityC45651qj LIZ;
    public ViewPropertyAnimator LIZIZ;
    public ViewPropertyAnimator LIZJ;
    public ViewPropertyAnimator LIZLLL;
    public ViewPropertyAnimator LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;
    public final C78894Uxm LJIILJJIL;

    @Override // X.InterfaceC1290954v
    public final void LIZ() {
    }

    @Override // X.InterfaceC1290954v
    public final C53N LIZIZ() {
        return (C53N) this.LJI.getValue();
    }

    @Override // X.InterfaceC1290954v
    public final C58G LIZJ() {
        return (C58G) this.LJII.getValue();
    }

    public final int LJ() {
        return ((Number) this.LJIIIIZZ.getValue()).intValue();
    }

    public final int LJFF() {
        return ((Number) this.LJFF.getValue()).intValue();
    }

    public final boolean LJI() {
        return ((Boolean) this.LJIILIIL.getValue()).booleanValue();
    }

    public C1293955z(C29S activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 998));
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 993));
        this.LJII = C221108m2.LIZIZ(new AqS152S0100000_2(this, 999));
        this.LJIIIIZZ = C221108m2.LIZIZ(AnonymousClass561.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 996));
        this.LJIIJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 997));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 995));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C123594t9.LJLIL);
        this.LJIIL = LIZIZ;
        this.LJIILIIL = C221108m2.LIZIZ(AnonymousClass560.LJLIL);
        this.LJIILJJIL = new C78894Uxm();
        MutableLiveData LJII = C79057V0z.LJII((EditorProContext) LIZIZ.getValue(), "event_user_guide_intercepted");
        if (LJII != null) {
            LJII.observe(C5G5.LIZIZ(), new AObserverS70S0100000_2(this, 317));
        }
    }

    public static Integer LIZLLL(ActivityC45651qj activityC45651qj, Integer num) {
        if (num == null) {
            return null;
        }
        return C79045V0n.LJI(num.intValue(), activityC45651qj);
    }

    public final SY9 LJII(int i, int i2) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(i2);
        c2068389v.LJFF = false;
        return c2068389v.LIZ(this.LIZ);
    }
}
