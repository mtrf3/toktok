package X;

import java.util.Iterator;

/* renamed from: X.EfA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36972EfA<T> implements InterfaceC1039145z<T> {
    public final InterfaceC1039145z<T> LIZ;
    public final InterfaceC88472Yns<T, Boolean> LIZIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<T> iterator() {
        return new C36971Ef9(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36972EfA(InterfaceC1039145z<? extends T> interfaceC1039145z, InterfaceC88472Yns<? super T, Boolean> interfaceC88472Yns) {
        this.LIZ = interfaceC1039145z;
        this.LIZIZ = interfaceC88472Yns;
    }
}
