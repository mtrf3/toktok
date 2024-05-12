package X;

/* renamed from: X.SqL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73337SqL<T1, T2, R> implements InterfaceC48038ItG<Object[], R> {
    public final RTU<? super T1, ? super T2, ? extends R> LJLIL;

    public C73337SqL(RTU<? super T1, ? super T2, ? extends R> rtu) {
        this.LJLIL = rtu;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length == 2) {
            return this.LJLIL.apply(objArr2[0], objArr2[1]);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Array of size 2 expected but got ");
        LIZ.append(objArr2.length);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }
}
