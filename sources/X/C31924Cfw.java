package X;

/* renamed from: X.Cfw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31924Cfw<T> implements InterfaceC31927Cfz<T> {
    public T LIZ;

    @Override // X.InterfaceC31927Cfz
    public final void release() {
        this.LIZ = null;
    }

    @Override // X.InterfaceC31927Cfz
    public final T LIZIZ() {
        return this.LIZ;
    }

    public C31924Cfw(T t) {
        this.LIZ = t;
    }
}
