package X;

import androidx.lifecycle.Lifecycle;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.1hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40031hf implements InterfaceC36571c5 {
    public InterfaceC36571c5 LJLIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if (interfaceC36571c5 != null) {
            o.LJI(interfaceC36571c5);
            Lifecycle lifecycle = interfaceC36571c5.getLifecycle();
            o.LJIIIIZZ(lifecycle, "originOwner!!.getLifecycle()");
            return lifecycle;
        }
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // X.InterfaceC36571c5
    public final AnonymousClass107 getSavedStateRegistry() {
        InterfaceC36571c5 interfaceC36571c5 = this.LJLIL;
        if (interfaceC36571c5 != null) {
            o.LJI(interfaceC36571c5);
            return interfaceC36571c5.getSavedStateRegistry();
        }
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "Not yet implemented"));
    }
}
