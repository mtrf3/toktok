package X;

import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [ITEM] */
/* renamed from: X.X8y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84360X8y<ITEM> extends AbstractC65781Prl implements InterfaceC88471Ynr<C8HZ<ITEM>, Throwable, C8HZ<ITEM>> {
    public static final C84360X8y LJLIL = new C84360X8y();

    public C84360X8y() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Throwable th) {
        C8HZ state = (C8HZ) obj;
        Throwable exception = th;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(exception, "exception");
        return C8HZ.LIZIZ(state, new C3C1(exception), null, null, null, 14);
    }
}
