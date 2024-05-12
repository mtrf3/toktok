package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.4BS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4BS {
    public final InterfaceC105124Aq LIZ;
    public final ViewGroup LIZIZ;
    public final LifecycleOwner LIZJ;
    public View LIZLLL;
    public final C105394Br LJ;

    public final C4BU LIZ() {
        View view = this.LIZLLL;
        if (view != null) {
            return new C4BU(this.LIZ, this.LJ, this.LIZJ, this.LIZIZ, view);
        }
        return new C4BU(this.LIZ, this.LJ, this.LIZJ, this.LIZIZ);
    }

    public C4BS(InterfaceC105124Aq mInputView, C4BT c4bt, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(mInputView, "mInputView");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = mInputView;
        this.LIZIZ = c4bt;
        this.LIZJ = lifecycleOwner;
        this.LIZLLL = null;
        this.LJ = new C105394Br();
    }
}
