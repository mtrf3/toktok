package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* renamed from: X.MnG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57858MnG {
    public final ActivityC45651qj LIZ;
    public final Fragment LIZIZ;
    public final C57846Mn4 LIZJ;
    public final C57867MnP LIZLLL;
    public final C57819Mmd LJ;
    public final C57866MnO LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C57858MnG() {
        this(null, 0 == true ? 1 : 0, 3);
    }

    public final void LIZ(InterfaceC88472Yns<? super C57866MnO, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        init.invoke(this.LJFF);
    }

    public final void LIZIZ(InterfaceC88472Yns<? super C57867MnP, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        init.invoke(this.LIZLLL);
    }

    public final void LIZJ(InterfaceC88472Yns<? super C57819Mmd, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        init.invoke(this.LJ);
    }

    public final void LIZLLL(InterfaceC88472Yns<? super C57846Mn4, C76800UCe> init) {
        o.LJIIIZ(init, "init");
        init.invoke(this.LIZJ);
    }

    public C57858MnG(ActivityC45651qj activityC45651qj, Fragment fragment) {
        this.LIZ = activityC45651qj;
        this.LIZIZ = fragment;
        this.LIZJ = new C57846Mn4(0);
        this.LIZLLL = new C57867MnP(0);
        this.LJ = new C57819Mmd(null, null, null, null, false, null, 8191);
        this.LJFF = new C57866MnO(null, 131071);
    }

    public /* synthetic */ C57858MnG(ActivityC45651qj activityC45651qj, Fragment fragment, int i) {
        this((i & 1) != 0 ? null : activityC45651qj, (i & 2) != 0 ? null : fragment);
    }
}
