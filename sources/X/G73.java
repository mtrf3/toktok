package X;

import Y.ACListenerS42S0200000_7;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G73 {
    public final C29S LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJ;
    public final C62822Ol8 LJFF;

    public G73(C29S activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 547));
        this.LIZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 545));
        this.LIZLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 544));
        this.LJFF = C221108m2.LIZIZ(new AqS157S0100000_7(this, 546));
    }

    public final void LIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        this.LJ = interfaceC65784Pro3;
        C16880lQ.LJIIJ(new ACListenerS42S0200000_7(interfaceC65784Pro, this, 32), (View) this.LIZJ.getValue());
        C16880lQ.LJIIJ(new ACListenerS42S0200000_7(interfaceC65784Pro2, this, 33), (View) this.LIZLLL.getValue());
        DialogFragment dialogFragment = (DialogFragment) this.LJFF.getValue();
        FragmentManager supportFragmentManager = this.LIZ.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        dialogFragment.show(supportFragmentManager, "Auto-generated Captions");
    }
}
