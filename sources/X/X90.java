package X;

import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [ITEM] */
/* loaded from: classes16.dex */
public final class X90<ITEM> extends AbstractC65781Prl implements InterfaceC88471Ynr<C8HZ<ITEM>, Throwable, C8HZ<ITEM>> {
    public static final X90 LJLIL = new X90();

    public X90() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Throwable th) {
        C8HZ state = (C8HZ) obj;
        Throwable exception = th;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(exception, "exception");
        return C8HZ.LIZIZ(state, null, new C3C1(exception), null, null, 13);
    }
}
