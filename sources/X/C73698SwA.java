package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SwA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73698SwA<T> implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final C73700SwC[] LJLJJL = new C73700SwC[0];
    public static final C73700SwC[] LJLJJLL = new C73700SwC[0];
    public final AtomicReference<C73698SwA<T>> LJLIL;
    public final AtomicReference<InterfaceC92693kP> LJLJJI = new AtomicReference<>();
    public final AtomicReference<C73700SwC<T>[]> LJLILLLLZI = new AtomicReference<>(LJLJJL);
    public final AtomicBoolean LJLJI = new AtomicBoolean();

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        AtomicReference<C73700SwC<T>[]> atomicReference = this.LJLILLLLZI;
        C73700SwC<T>[] c73700SwCArr = LJLJJLL;
        if (atomicReference.getAndSet(c73700SwCArr) != c73700SwCArr) {
            AtomicReference<C73698SwA<T>> atomicReference2 = this.LJLIL;
            while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
            }
            EnumC73418Sre.dispose(this.LJLJJI);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        if (this.LJLILLLLZI.get() == LJLJJLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        AtomicReference<C73698SwA<T>> atomicReference = this.LJLIL;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
        for (C73700SwC<T> c73700SwC : this.LJLILLLLZI.getAndSet(LJLJJLL)) {
            c73700SwC.LJLIL.onComplete();
        }
    }

    public C73698SwA(AtomicReference<C73698SwA<T>> atomicReference) {
        this.LJLIL = atomicReference;
    }

    public final void LIZ(C73700SwC<T> c73700SwC) {
        C73700SwC<T>[] c73700SwCArr;
        while (true) {
            C73700SwC<T>[] c73700SwCArr2 = this.LJLILLLLZI.get();
            int length = c73700SwCArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (!c73700SwCArr2[i].equals(c73700SwC)) {
                i++;
                if (i >= length) {
                    return;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c73700SwCArr = LJLJJL;
            } else {
                c73700SwCArr = new C73700SwC[length - 1];
                System.arraycopy(c73700SwCArr2, 0, c73700SwCArr, 0, i);
                System.arraycopy(c73700SwCArr2, i + 1, c73700SwCArr, i, (length - i) - 1);
            }
            AtomicReference<C73700SwC<T>[]> atomicReference = this.LJLILLLLZI;
            while (!atomicReference.compareAndSet(c73700SwCArr2, c73700SwCArr)) {
                if (atomicReference.get() != c73700SwCArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        AtomicReference<C73698SwA<T>> atomicReference = this.LJLIL;
        while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
        }
        C73700SwC<T>[] andSet = this.LJLILLLLZI.getAndSet(LJLJJLL);
        if (andSet.length != 0) {
            for (C73700SwC<T> c73700SwC : andSet) {
                c73700SwC.LJLIL.onError(th);
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        for (C73700SwC<T> c73700SwC : this.LJLILLLLZI.get()) {
            c73700SwC.LJLIL.onNext(t);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLJJI, interfaceC92693kP);
    }
}
