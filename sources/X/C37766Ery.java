package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ery, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37766Ery<T> implements InterfaceC37408EmC {
    public final /* synthetic */ InterfaceC37774Es6 LIZ;

    public C37766Ery(InterfaceC37774Es6 interfaceC37774Es6) {
        this.LIZ = interfaceC37774Es6;
    }

    @Override // X.InterfaceC37408EmC
    public final Object create() {
        InterfaceC37774Es6 method = this.LIZ;
        o.LJIIIIZZ(method, "method");
        return new C37765Erx(method);
    }

    @Override // X.InterfaceC37408EmC
    public final Object LIZ(Object obj) {
        return create();
    }
}
