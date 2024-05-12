package X;

import java.util.Iterator;

/* renamed from: X.OQv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61893OQv<T, K> implements InterfaceC1039145z<T> {
    public final InterfaceC1039145z<T> LIZ;
    public final InterfaceC88472Yns<T, K> LIZIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<T> iterator() {
        return new C61892OQu(this.LIZ.iterator(), this.LIZIZ);
    }

    public C61893OQv(C115534g9 c115534g9, UXF uxf) {
        this.LIZ = c115534g9;
        this.LIZIZ = uxf;
    }
}
