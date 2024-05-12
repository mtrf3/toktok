package X;

/* renamed from: X.Nec, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59870Nec<T> implements InterfaceC59876Nei<T> {
    public T LIZ;

    @Override // X.InterfaceC59876Nei
    public final void release() {
        this.LIZ = null;
    }

    @Override // X.InterfaceC59876Nei
    public final T LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C59870Nec(InterfaceC61046Nxa interfaceC61046Nxa) {
        this.LIZ = interfaceC61046Nxa;
    }
}
