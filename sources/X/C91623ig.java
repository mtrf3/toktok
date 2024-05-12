package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91623ig extends AbstractC73672Svk<AbstractC89473fD> {
    public final InterfaceC99713vj LJLIL;

    public C91623ig(InterfaceC99713vj source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = source;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super AbstractC89473fD> observer) {
        o.LJIIIZ(observer, "observer");
        C91553iZ c91553iZ = new C91553iZ(this.LJLIL, observer);
        observer.onSubscribe(c91553iZ);
        this.LJLIL.LIZ(c91553iZ);
    }
}
