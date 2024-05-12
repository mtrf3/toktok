package X;

import defpackage.PasskeyFrequencySettingsModel;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SuC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73576SuC<T, R> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final long serialVersionUID = -6951100001833242599L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;
    public final int LJLJI;
    public final C73568Su4 LJLJJI = new C73568Su4();
    public final C73577SuD<R> LJLJJL;
    public final boolean LJLJJLL;
    public InterfaceC73570Su6<T> LJLJL;
    public InterfaceC92693kP LJLJLJ;
    public volatile boolean LJLJLLL;
    public volatile boolean LJLL;
    public volatile boolean LJLLI;
    public int LJLLILLLL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLLI = true;
        this.LJLJLJ.dispose();
        C73577SuD<R> c73577SuD = this.LJLJJL;
        c73577SuD.getClass();
        EnumC73418Sre.dispose(c73577SuD);
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLL = true;
        LIZ();
    }

    public final void LIZ() {
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        InterfaceC116954iR<? super R> interfaceC116954iR = this.LJLIL;
        InterfaceC73570Su6<T> interfaceC73570Su6 = this.LJLJL;
        C73568Su4 c73568Su4 = this.LJLJJI;
        while (true) {
            if (!this.LJLJLLL) {
                if (this.LJLLI) {
                    interfaceC73570Su6.clear();
                    return;
                }
                if (!this.LJLJJLL && c73568Su4.get() != null) {
                    interfaceC73570Su6.clear();
                    this.LJLLI = true;
                    interfaceC116954iR.onError(c73568Su4.terminate());
                    return;
                }
                boolean z2 = this.LJLL;
                try {
                    T poll = interfaceC73570Su6.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2) {
                        if (z) {
                            this.LJLLI = true;
                            Throwable terminate = c73568Su4.terminate();
                            if (terminate != null) {
                                interfaceC116954iR.onError(terminate);
                                return;
                            } else {
                                interfaceC116954iR.onComplete();
                                return;
                            }
                        }
                    } else if (z) {
                    }
                    try {
                        InterfaceC115714gR<? extends R> apply = this.LJLILLLLZI.apply(poll);
                        C73320Sq4.LIZ(apply, "The mapper returned a null ObservableSource");
                        InterfaceC115714gR<? extends R> interfaceC115714gR = apply;
                        if (interfaceC115714gR instanceof Callable) {
                            try {
                                PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = (Object) ((Callable) interfaceC115714gR).call();
                                if (passkeyFrequencySettingsModel != null && !this.LJLLI) {
                                    interfaceC116954iR.onNext(passkeyFrequencySettingsModel);
                                }
                            } catch (Throwable th) {
                                V0N.LJJIL(th);
                                c73568Su4.addThrowable(th);
                            }
                        } else {
                            this.LJLJLLL = true;
                            interfaceC115714gR.LIZ(this.LJLJJL);
                        }
                    } catch (Throwable th2) {
                        V0N.LJJIL(th2);
                        this.LJLLI = true;
                        this.LJLJLJ.dispose();
                        interfaceC73570Su6.clear();
                        c73568Su4.addThrowable(th2);
                        interfaceC116954iR.onError(c73568Su4.terminate());
                        return;
                    }
                } catch (Throwable th3) {
                    V0N.LJJIL(th3);
                    this.LJLLI = true;
                    this.LJLJLJ.dispose();
                    c73568Su4.addThrowable(th3);
                    interfaceC116954iR.onError(c73568Su4.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJI.addThrowable(th)) {
            this.LJLL = true;
            LIZ();
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLLILLLL == 0) {
            this.LJLJL.offer(t);
        }
        LIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJLJ, interfaceC92693kP)) {
            this.LJLJLJ = interfaceC92693kP;
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
                int requestFusion = interfaceC73571Su7.requestFusion(3);
                if (requestFusion == 1) {
                    this.LJLLILLLL = requestFusion;
                    this.LJLJL = interfaceC73571Su7;
                    this.LJLL = true;
                    this.LJLIL.onSubscribe(this);
                    LIZ();
                    return;
                }
                if (requestFusion == 2) {
                    this.LJLLILLLL = requestFusion;
                    this.LJLJL = interfaceC73571Su7;
                    this.LJLIL.onSubscribe(this);
                    return;
                }
            }
            this.LJLJL = new C73912Szc(this.LJLJI);
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73576SuC(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG, int i, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = i;
        this.LJLJJLL = z;
        this.LJLJJL = new C73577SuD<>(interfaceC116954iR, this);
    }
}
