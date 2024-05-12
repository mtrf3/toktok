package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8T extends C08Z {
    public final /* synthetic */ X8Y LIZ;

    public X8T(X8Y x8y) {
        this.LIZ = x8y;
    }

    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment stubOwner) {
        Bundle arguments;
        String LIZIZ;
        java.util.Set<X8F> LIZIZ2;
        o.LJIIJ(fm, "fm");
        o.LJIIJ(stubOwner, "stubOwner");
        X8X LJ = this.LIZ.LIZ.LJ(stubOwner.getClass().getName());
        if (LJ != null && LJ.LJLILLLLZI && (arguments = stubOwner.getArguments()) != null && (LIZIZ = C44206HWo.LIZIZ(arguments)) != null && (LIZIZ2 = this.LIZ.LIZ.LIZIZ(LJ)) != null) {
            for (X8F x8f : LIZIZ2) {
                X8P<?> x8p = x8f.LJLIL;
                if (x8p != null && x8f.L(null, LIZIZ)) {
                    x8p.onDetach();
                }
            }
        }
    }

    @Override // X.C08Z
    public final void onFragmentPreCreated(FragmentManager fm, Fragment stubOwner, Bundle bundle) {
        Bundle arguments;
        String LIZIZ;
        o.LJIIJ(fm, "fm");
        o.LJIIJ(stubOwner, "stubOwner");
        X8X LJ = this.LIZ.LIZ.LJ(stubOwner.getClass().getName());
        if (LJ != null && LJ.LJLIL && (arguments = stubOwner.getArguments()) != null && (LIZIZ = C44206HWo.LIZIZ(arguments)) != null) {
            LJ.LJLILLLLZI = true;
            java.util.Set<X8F> LIZIZ2 = this.LIZ.LIZ.LIZIZ(LJ);
            if (LIZIZ2 != null) {
                for (X8F x8f : LIZIZ2) {
                    X8P<?> x8p = x8f.LJLIL;
                    if (x8p != null && x8f.L(null, LIZIZ)) {
                        ActivityC45651qj mo49getActivity = stubOwner.mo49getActivity();
                        C36411bp c36411bp = x8p.LJLIL;
                        InterfaceC74236TBo[] interfaceC74236TBoArr = X8P.LJLJL;
                        InterfaceC74236TBo property = interfaceC74236TBoArr[0];
                        c36411bp.getClass();
                        o.LJIIJ(property, "property");
                        c36411bp.LJLIL = new WeakReference(mo49getActivity);
                        C36411bp c36411bp2 = x8p.LJLILLLLZI;
                        InterfaceC74236TBo property2 = interfaceC74236TBoArr[1];
                        c36411bp2.getClass();
                        o.LJIIJ(property2, "property");
                        c36411bp2.LJLIL = new WeakReference(stubOwner);
                        x8p.LIZ(bundle);
                    }
                }
            }
        }
    }
}
