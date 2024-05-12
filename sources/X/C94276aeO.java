package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.o;

/* renamed from: X.aeO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94276aeO implements Observer<Boolean> {
    public final /* synthetic */ C93844aXQ LJLIL;
    public final /* synthetic */ InterfaceC65784Pro LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            this.LJLILLLLZI.invoke();
            this.LJLIL.LIZ.removeObserver(this);
            this.LJLIL.LIZIZ.remove(this.LJLILLLLZI);
        }
    }

    public C94276aeO(C93844aXQ c93844aXQ, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = c93844aXQ;
        this.LJLILLLLZI = interfaceC65784Pro;
    }
}
