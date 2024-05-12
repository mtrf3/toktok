package X;

/* renamed from: X.Pst, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65851Pst<T> implements InterfaceC67352kd<T>, XLE {
    public final InterfaceC67352kd<T> LJLIL;
    public final MBA LJLILLLLZI;

    @Override // X.XLE
    public final XLE getCallerFrame() {
        InterfaceC67352kd<T> interfaceC67352kd = this.LJLIL;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    @Override // X.InterfaceC67352kd
    public final MBA getContext() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        this.LJLIL.resumeWith(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65851Pst(InterfaceC67352kd<? super T> interfaceC67352kd, MBA mba) {
        this.LJLIL = interfaceC67352kd;
        this.LJLILLLLZI = mba;
    }
}
