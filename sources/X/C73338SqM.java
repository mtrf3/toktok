package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SqM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73338SqM<T> extends AbstractC73672Svk<T> {
    public final AbstractC73169Snd<? extends T> LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC64592gB<? super InterfaceC92693kP> LJLJI;
    public final AtomicInteger LJLJJI;

    public C73338SqM(AbstractC73169Snd abstractC73169Snd) {
        C42222Ghe c42222Ghe = C73674Svm.LIZLLL;
        this.LJLIL = abstractC73169Snd;
        this.LJLILLLLZI = 1;
        this.LJLJI = c42222Ghe;
        this.LJLJJI = new AtomicInteger();
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        this.LJLIL.LIZ(interfaceC116954iR);
        if (this.LJLJJI.incrementAndGet() == this.LJLILLLLZI) {
            this.LJLIL.LJJZ(this.LJLJI);
        }
    }
}
