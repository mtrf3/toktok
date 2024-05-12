package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.StJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73521StJ<T> extends AbstractC73638SvC<T> implements InterfaceC73463SsN<T> {
    public static final C73522StK[] LJLJJL = new C73522StK[0];
    public static final C73522StK[] LJLJJLL = new C73522StK[0];
    public T LJLJI;
    public Throwable LJLJJI;
    public final AtomicBoolean LJLILLLLZI = new AtomicBoolean();
    public final AtomicReference<C73522StK<T>[]> LJLIL = new AtomicReference<>(LJLJJL);

    @Override // X.AbstractC73638SvC
    public final void LJJIII(InterfaceC73463SsN<? super T> interfaceC73463SsN) {
        C73522StK<T> c73522StK = new C73522StK<>(interfaceC73463SsN, this);
        interfaceC73463SsN.onSubscribe(c73522StK);
        while (true) {
            C73522StK<T>[] c73522StKArr = this.LJLIL.get();
            if (c73522StKArr == LJLJJLL) {
                Throwable th = this.LJLJJI;
                if (th != null) {
                    interfaceC73463SsN.onError(th);
                    return;
                } else {
                    interfaceC73463SsN.onSuccess(this.LJLJI);
                    return;
                }
            }
            int length = c73522StKArr.length;
            C73522StK<T>[] c73522StKArr2 = new C73522StK[length + 1];
            System.arraycopy(c73522StKArr, 0, c73522StKArr2, 0, length);
            c73522StKArr2[length] = c73522StK;
            AtomicReference<C73522StK<T>[]> atomicReference = this.LJLIL;
            while (!atomicReference.compareAndSet(c73522StKArr, c73522StKArr2)) {
                if (atomicReference.get() != c73522StKArr) {
                    break;
                }
            }
            if (!c73522StK.isDisposed()) {
                return;
            }
            LJJIIZI(c73522StK);
            return;
        }
    }

    public final void LJJIIZI(C73522StK<T> c73522StK) {
        C73522StK<T>[] c73522StKArr;
        while (true) {
            C73522StK<T>[] c73522StKArr2 = this.LJLIL.get();
            int length = c73522StKArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (c73522StKArr2[i] != c73522StK) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c73522StKArr = LJLJJL;
            } else {
                c73522StKArr = new C73522StK[length - 1];
                System.arraycopy(c73522StKArr2, 0, c73522StKArr, 0, i);
                System.arraycopy(c73522StKArr2, i + 1, c73522StKArr, i, (length - i) - 1);
            }
            AtomicReference<C73522StK<T>[]> atomicReference = this.LJLIL;
            while (!atomicReference.compareAndSet(c73522StKArr2, c73522StKArr)) {
                if (atomicReference.get() != c73522StKArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        C73320Sq4.LIZ(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LJLILLLLZI.compareAndSet(false, true)) {
            this.LJLJJI = th;
            for (C73522StK<T> c73522StK : this.LJLIL.getAndSet(LJLJJLL)) {
                c73522StK.LJLIL.onError(th);
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (this.LJLIL.get() == LJLJJLL) {
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
        C73320Sq4.LIZ(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.LJLILLLLZI.compareAndSet(false, true)) {
            this.LJLJI = t;
            for (C73522StK<T> c73522StK : this.LJLIL.getAndSet(LJLJJLL)) {
                c73522StK.LJLIL.onSuccess(t);
            }
        }
    }
}
