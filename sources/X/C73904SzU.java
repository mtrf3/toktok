package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SzU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73904SzU<T, R> extends AtomicInteger implements InterfaceC92693kP {
    public static final long serialVersionUID = 2983708048395377667L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super Object[], ? extends R> LJLILLLLZI;
    public final C73906SzW<T, R>[] LJLJI;
    public final T[] LJLJJI;
    public final boolean LJLJJL;
    public volatile boolean LJLJJLL;

    public final void LIZ() {
        for (C73906SzW<T, R> c73906SzW : this.LJLJI) {
            c73906SzW.LJLILLLLZI.clear();
        }
        for (C73906SzW<T, R> c73906SzW2 : this.LJLJI) {
            EnumC73418Sre.dispose(c73906SzW2.LJLJJL);
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            for (C73906SzW<T, R> c73906SzW : this.LJLJI) {
                EnumC73418Sre.dispose(c73906SzW.LJLJJL);
            }
            if (getAndIncrement() == 0) {
                for (C73906SzW<T, R> c73906SzW2 : this.LJLJI) {
                    c73906SzW2.LJLILLLLZI.clear();
                }
            }
        }
    }

    public final void LIZIZ() {
        Throwable th;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        C73906SzW<T, R>[] c73906SzWArr = this.LJLJI;
        InterfaceC116954iR<? super R> interfaceC116954iR = this.LJLIL;
        T[] tArr = this.LJLJJI;
        boolean z2 = this.LJLJJL;
        int i = 1;
        while (true) {
            int i2 = 0;
            int i3 = 0;
            for (C73906SzW<T, R> c73906SzW : c73906SzWArr) {
                if (tArr[i3] == null) {
                    boolean z3 = c73906SzW.LJLJI;
                    T poll = c73906SzW.LJLILLLLZI.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.LJLJJLL) {
                        LIZ();
                        return;
                    }
                    if (z3) {
                        if (z2) {
                            if (z) {
                                Throwable th2 = c73906SzW.LJLJJI;
                                LIZ();
                                if (th2 != null) {
                                    interfaceC116954iR.onError(th2);
                                    return;
                                } else {
                                    interfaceC116954iR.onComplete();
                                    return;
                                }
                            }
                        } else {
                            Throwable th3 = c73906SzW.LJLJJI;
                            if (th3 != null) {
                                LIZ();
                                interfaceC116954iR.onError(th3);
                                return;
                            } else if (z) {
                                LIZ();
                                interfaceC116954iR.onComplete();
                                return;
                            }
                        }
                    } else if (z) {
                        i2++;
                    }
                    tArr[i3] = poll;
                } else if (c73906SzW.LJLJI && !z2 && (th = c73906SzW.LJLJJI) != null) {
                    LIZ();
                    interfaceC116954iR.onError(th);
                    return;
                }
                i3++;
            }
            if (i2 != 0) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                try {
                    R apply = this.LJLILLLLZI.apply(tArr.clone());
                    C73320Sq4.LIZ(apply, "The zipper returned a null value");
                    interfaceC116954iR.onNext(apply);
                    Arrays.fill(tArr, (Object) null);
                } catch (Throwable th4) {
                    V0N.LJJIL(th4);
                    LIZ();
                    interfaceC116954iR.onError(th4);
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJJLL;
    }

    public C73904SzU(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super Object[], ? extends R> interfaceC48038ItG, int i, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = new C73906SzW[i];
        this.LJLJJI = (T[]) new Object[i];
        this.LJLJJL = z;
    }
}
