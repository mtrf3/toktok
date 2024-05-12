package X;

/* renamed from: X.Svq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73678Svq<T, U> implements InterfaceC48038ItG<T, U> {
    public final Class<U> LJLIL;

    public C73678Svq(Class<U> cls) {
        this.LJLIL = cls;
    }

    @Override // X.InterfaceC48038ItG
    public final U apply(T t) {
        return this.LJLIL.cast(t);
    }
}
