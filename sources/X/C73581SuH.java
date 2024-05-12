package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: X.SuH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73581SuH<R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC73463SsN<R>, InterfaceC92693kP {
    public static final long serialVersionUID = -502562646270949838L;
    public final /* synthetic */ C73580SuG LJLIL;

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73581SuH(C73580SuG c73580SuG) {
        this.LJLIL = c73580SuG;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable th) {
        C73580SuG c73580SuG = this.LJLIL;
        c73580SuG.LJLJI.LIZJ(this);
        if (c73580SuG.LJLJJL.addThrowable(th)) {
            if (!c73580SuG.LJLILLLLZI) {
                c73580SuG.LJLJLJ.dispose();
                c73580SuG.LJLJI.dispose();
            }
            c73580SuG.LJLJJI.decrementAndGet();
            if (c73580SuG.getAndIncrement() == 0) {
                c73580SuG.LIZ();
                return;
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(R r) {
        C73912Szc<R> c73912Szc;
        C73580SuG c73580SuG = this.LJLIL;
        c73580SuG.LJLJI.LIZJ(this);
        boolean z = false;
        if (c73580SuG.get() == 0 && c73580SuG.compareAndSet(0, 1)) {
            c73580SuG.LJLIL.onNext(r);
            if (c73580SuG.LJLJJI.decrementAndGet() == 0) {
                z = true;
            }
            C73912Szc<R> c73912Szc2 = c73580SuG.LJLJL.get();
            if (z && (c73912Szc2 == null || c73912Szc2.isEmpty())) {
                Throwable terminate = c73580SuG.LJLJJL.terminate();
                if (terminate != null) {
                    c73580SuG.LJLIL.onError(terminate);
                    return;
                } else {
                    c73580SuG.LJLIL.onComplete();
                    return;
                }
            }
            if (c73580SuG.decrementAndGet() == 0) {
                return;
            }
        } else {
            loop0: while (true) {
                c73912Szc = c73580SuG.LJLJL.get();
                if (c73912Szc == null) {
                    c73912Szc = new C73912Szc<>(AbstractC73745Swv.LJLIL);
                    AtomicReference<C73912Szc<R>> atomicReference = c73580SuG.LJLJL;
                    while (!atomicReference.compareAndSet(null, c73912Szc)) {
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
            synchronized (c73912Szc) {
                c73912Szc.offer(r);
            }
            c73580SuG.LJLJJI.decrementAndGet();
            if (c73580SuG.getAndIncrement() != 0) {
                return;
            }
        }
        c73580SuG.LIZ();
    }
}
