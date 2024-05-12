package X;

import Y.ARunnableS13S0400000_9;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LUK extends LP1 {
    public final E6D LJ;
    public final WeakReference<Context> LJFF;

    @Override // X.InterfaceC54194LOs
    public final void LIZJ() {
        LJFF("2001");
    }

    @Override // X.InterfaceC54194LOs
    public final boolean LIZLLL() {
        C45989I3d c45989I3d = new C45989I3d();
        if (!C45991I3f.LIZJ() || c45989I3d.LIZ() || !c45989I3d.LIZIZ()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54194LOs
    public final void LIZ(InterfaceC65784Pro<C76800UCe> shown) {
        View view;
        Context context;
        o.LJIIIZ(shown, "shown");
        WeakReference<View> weakReference = this.LJ.LIZ;
        if (weakReference == null || (view = weakReference.get()) == null || (context = this.LJFF.get()) == null) {
            return;
        }
        view.post(new ARunnableS13S0400000_9(this, context, view, shown, 5));
    }

    public LUK(E6D e6d, WeakReference<Context> weakReference) {
        super(e6d, weakReference);
        this.LJ = e6d;
        this.LJFF = weakReference;
    }
}
