package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73587SuN<T, R> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP {
    public static final C73588SuO<Object, Object> LJLLI;
    public static final long serialVersionUID = -3491074160481096299L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public volatile boolean LJLJJLL;
    public volatile boolean LJLJL;
    public InterfaceC92693kP LJLJLJ;
    public volatile long LJLL;
    public final AtomicReference<C73588SuO<T, R>> LJLJLLL = new AtomicReference<>();
    public final C73568Su4 LJLJJL = new C73568Su4();

    static {
        C73588SuO<Object, Object> c73588SuO = new C73588SuO<>(null, -1L, 1);
        LJLLI = c73588SuO;
        EnumC73418Sre.dispose(c73588SuO);
    }

    public final void LIZ() {
        AtomicReference atomicReference;
        C73588SuO<T, R> c73588SuO = this.LJLJLLL.get();
        C73588SuO<Object, Object> c73588SuO2 = LJLLI;
        if (c73588SuO != c73588SuO2 && (atomicReference = (AtomicReference) this.LJLJLLL.getAndSet(c73588SuO2)) != c73588SuO2 && atomicReference != null) {
            EnumC73418Sre.dispose(atomicReference);
        }
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (!this.LJLJL) {
            this.LJLJL = true;
            this.LJLJLJ.dispose();
            LIZ();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            LIZIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x000f, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73587SuN.LIZIZ():void");
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (!this.LJLJJLL && this.LJLJJL.addThrowable(th)) {
            if (!this.LJLJJI) {
                LIZ();
            }
            this.LJLJJLL = true;
            LIZIZ();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        long j = this.LJLL + 1;
        this.LJLL = j;
        C73588SuO<T, R> c73588SuO = this.LJLJLLL.get();
        if (c73588SuO != null) {
            EnumC73418Sre.dispose(c73588SuO);
        }
        try {
            InterfaceC115714gR<? extends R> apply = this.LJLILLLLZI.apply(t);
            C73320Sq4.LIZ(apply, "The ObservableSource returned is null");
            InterfaceC115714gR<? extends R> interfaceC115714gR = apply;
            C73588SuO<T, R> c73588SuO2 = new C73588SuO<>(this, j, this.LJLJI);
            while (true) {
                C73588SuO<T, R> c73588SuO3 = this.LJLJLLL.get();
                if (c73588SuO3 == LJLLI) {
                    return;
                }
                AtomicReference<C73588SuO<T, R>> atomicReference = this.LJLJLLL;
                while (!atomicReference.compareAndSet(c73588SuO3, c73588SuO2)) {
                    if (atomicReference.get() != c73588SuO3) {
                        break;
                    }
                }
                interfaceC115714gR.LIZ(c73588SuO2);
                return;
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            this.LJLJLJ.dispose();
            onError(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJLJ, interfaceC92693kP)) {
            this.LJLJLJ = interfaceC92693kP;
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73587SuN(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG, int i, boolean z) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = i;
        this.LJLJJI = z;
    }
}
