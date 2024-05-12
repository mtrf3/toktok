package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Epv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37639Epv<T> implements InterfaceC37408EmC {
    public final /* synthetic */ InterfaceC37666EqM LIZ;

    public C37639Epv(InterfaceC37666EqM interfaceC37666EqM) {
        this.LIZ = interfaceC37666EqM;
    }

    @Override // X.InterfaceC37408EmC
    public final Object create() {
        InterfaceC37666EqM method = this.LIZ;
        o.LJIIIIZZ(method, "method");
        return new C37664EqK(method);
    }

    @Override // X.InterfaceC37408EmC
    public final Object LIZ(Object obj) {
        return create();
    }
}
