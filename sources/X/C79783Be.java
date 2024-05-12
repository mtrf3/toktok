package X;

/* renamed from: X.3Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C79783Be<T> extends AbstractC79813Bh<T> {
    public final InterfaceC88471Ynr<C3CK<? super T>, InterfaceC67352kd<? super C76800UCe>, Object> LJLIL;

    @Override // X.AbstractC79813Bh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("block[");
        LIZ.append(this.LJLIL);
        LIZ.append("] -> ");
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC79813Bh
    public Object collectTo(C3CK<? super T> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object invoke = this.LJLIL.invoke(c3ck, interfaceC67352kd);
        if (invoke == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return invoke;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C79783Be(InterfaceC88471Ynr<? super C3CK<? super T>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, MBA mba, int i, XKI xki) {
        super(mba, i, xki);
        this.LJLIL = interfaceC88471Ynr;
    }
}
