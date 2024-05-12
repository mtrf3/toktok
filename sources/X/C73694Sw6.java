package X;

import java.util.Iterator;

/* renamed from: X.Sw6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73694Sw6<T> extends AbstractC73556Sts<T> {
    public final InterfaceC116954iR<? super T> LJLIL;
    public final Iterator<? extends T> LJLILLLLZI;
    public volatile boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC73570Su6
    public final void clear() {
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLJI = true;
    }

    @Override // X.InterfaceC73570Su6
    public final T poll() {
        if (this.LJLJJL) {
            return null;
        }
        if (this.LJLJJLL) {
            if (!this.LJLILLLLZI.hasNext()) {
                this.LJLJJL = true;
                return null;
            }
        } else {
            this.LJLJJLL = true;
        }
        T next = this.LJLILLLLZI.next();
        C73320Sq4.LIZ(next, "The iterator returned a null value");
        return next;
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC73570Su6
    public final boolean isEmpty() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC73571Su7
    public final int requestFusion(int i) {
        if ((i & 1) != 0) {
            this.LJLJJI = true;
            return 1;
        }
        return 0;
    }

    public C73694Sw6(InterfaceC116954iR<? super T> interfaceC116954iR, Iterator<? extends T> it) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = it;
    }
}
