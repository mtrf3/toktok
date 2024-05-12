package X;

/* renamed from: X.StX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73535StX<T> extends AbstractC73635Sv9<T> implements I97<T> {
    public final T LJLIL;

    @Override // X.I97, java.util.concurrent.Callable
    public final T call() {
        return this.LJLIL;
    }

    public C73535StX(T t) {
        this.LJLIL = t;
    }

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        interfaceC73509St7.onSubscribe(EnumC73538Sta.INSTANCE);
        interfaceC73509St7.onSuccess(this.LJLIL);
    }
}
