package X;

import Y.IDfS292S0100000;
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.0TM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TM {
    public final Fragment LIZ;
    public final C12C LIZIZ;
    public final Context LIZJ;
    public DialogC30679C2h LIZLLL;
    public boolean LJ;
    public C73411SrX LJFF;
    public C73411SrX LJI;
    public final C62822Ol8 LJII;

    public final InterfaceC74834TYo LIZ() {
        return this.LIZIZ.LIZIZ();
    }

    public C0TM(Fragment fragment, C12C gameUi) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(gameUi, "gameUi");
        this.LIZ = fragment;
        this.LIZIZ = gameUi;
        Context requireContext = fragment.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        this.LIZJ = requireContext;
        this.LJII = C221108m2.LIZIZ(C49471wt.LJLIL);
        this.LJFF = (C73411SrX) C73943T0h.LIZ().LJ(C1MI.class).LJJJJZI(new IDfS292S0100000(this, 18));
        this.LJI = (C73411SrX) C73943T0h.LIZ().LJ(C1MJ.class).LJJJJZI(new IDfS292S0100000(this, 19));
    }
}
