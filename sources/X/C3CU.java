package X;

import fjb.a;

/* renamed from: X.3CU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3CU extends a {
    @Override // fjb.a, X.InterfaceC67352kd
    public MBA getContext() {
        return MBB.INSTANCE;
    }

    public C3CU(InterfaceC67352kd<Object> interfaceC67352kd) {
        super(interfaceC67352kd);
        if (interfaceC67352kd == null || interfaceC67352kd.getContext() == MBB.INSTANCE) {
            return;
        }
        "Coroutines with restricted suspension must have EmptyCoroutineContext".toString();
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
    }
}
