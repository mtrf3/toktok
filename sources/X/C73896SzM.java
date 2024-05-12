package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SzM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73896SzM<T, R> extends AtomicInteger implements InterfaceC92693kP {
    public static final long serialVersionUID = -5556924161382950569L;
    public final InterfaceC73463SsN<? super R> LJLIL;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLILLLLZI;
    public final C73895SzL<T>[] LJLJI;
    public final Object[] LJLJJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (C73895SzL<T> c73895SzL : this.LJLJI) {
                c73895SzL.getClass();
                EnumC73418Sre.dispose(c73895SzL);
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (get() <= 0) {
            return true;
        }
        return false;
    }

    public final void LIZ(int i, Throwable th) {
        if (getAndSet(0) > 0) {
            C73895SzL<T>[] c73895SzLArr = this.LJLJI;
            int length = c73895SzLArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                C73895SzL<T> c73895SzL = c73895SzLArr[i2];
                c73895SzL.getClass();
                EnumC73418Sre.dispose(c73895SzL);
            }
            while (true) {
                i++;
                if (i < length) {
                    C73895SzL<T> c73895SzL2 = c73895SzLArr[i];
                    c73895SzL2.getClass();
                    EnumC73418Sre.dispose(c73895SzL2);
                } else {
                    this.LJLIL.onError(th);
                    return;
                }
            }
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    public C73896SzM(InterfaceC73463SsN<? super R> interfaceC73463SsN, int i, InterfaceC48038ItG<? super Object[], ? extends R> interfaceC48038ItG) {
        super(i);
        this.LJLIL = interfaceC73463SsN;
        this.LJLILLLLZI = interfaceC48038ItG;
        C73895SzL<T>[] c73895SzLArr = new C73895SzL[i];
        for (int i2 = 0; i2 < i; i2++) {
            c73895SzLArr[i2] = new C73895SzL<>(this, i2);
        }
        this.LJLJI = c73895SzLArr;
        this.LJLJJI = new Object[i];
    }
}
