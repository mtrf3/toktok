package X;

import kotlin.jvm.internal.o;

/* renamed from: X.26m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C530826m<T> implements InterfaceC44011o5<T>, InterfaceC35811ar<T> {
    public final MBA LJLIL;
    public final /* synthetic */ InterfaceC35811ar<T> LJLILLLLZI;

    @Override // X.InterfaceC35811ar, X.InterfaceC24760y8
    public final T getValue() {
        return this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC35811ar
    public final void setValue(T t) {
        this.LJLILLLLZI.setValue(t);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLIL;
    }

    public C530826m(InterfaceC35811ar<T> state, MBA coroutineContext) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(coroutineContext, "coroutineContext");
        this.LJLIL = coroutineContext;
        this.LJLILLLLZI = state;
    }
}
