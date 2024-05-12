package X;

/* renamed from: X.Svp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73677Svp<T, U> implements InterfaceC73592SuS<T> {
    public final Class<U> LJLIL;

    public C73677Svp(Class<U> cls) {
        this.LJLIL = cls;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(T t) {
        return this.LJLIL.isInstance(t);
    }
}
