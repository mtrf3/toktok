package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.79T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C79T {
    public final ViewGroup LIZ;
    public final Fragment LIZIZ;
    public String LIZJ;
    public Integer LIZLLL;
    public InterfaceC55235Lm3 LJ;
    public int LJFF;

    public final C79S LIZ() {
        C79S c79s = new C79S();
        Fragment fragment = this.LIZIZ;
        o.LJIIIZ(fragment, "<set-?>");
        c79s.LIZIZ = fragment;
        ViewGroup viewGroup = this.LIZ;
        o.LJIIIZ(viewGroup, "<set-?>");
        c79s.LIZ = viewGroup;
        c79s.LIZJ = this.LIZJ;
        c79s.LIZLLL = this.LIZLLL;
        c79s.LJ = this.LJ;
        c79s.LJFF = this.LJFF;
        return c79s;
    }

    public C79T(ViewGroup barrageContainer, Fragment fragment) {
        o.LJIIIZ(barrageContainer, "barrageContainer");
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = barrageContainer;
        this.LIZIZ = fragment;
    }
}
