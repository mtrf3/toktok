package X;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SxL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73771SxL<T, R> extends AtomicInteger implements InterfaceC116954iR<T>, InterfaceC92693kP, InterfaceC58210Msw<R> {
    public static final long serialVersionUID = 8080567949447303262L;
    public final InterfaceC116954iR<? super R> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final EnumC73710SwM LJLJJL;
    public final C73568Su4 LJLJJLL = new C73568Su4();
    public final ArrayDeque<C73773SxN<R>> LJLJL = new ArrayDeque<>();
    public InterfaceC73570Su6<T> LJLJLJ;
    public InterfaceC92693kP LJLJLLL;
    public volatile boolean LJLL;
    public int LJLLI;
    public volatile boolean LJLLILLLL;
    public C73773SxN<R> LJLLJ;
    public int LJLLL;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        this.LJLLILLLL = true;
        if (getAndIncrement() == 0) {
            this.LJLJLJ.clear();
            LIZ();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLL = true;
        LIZIZ();
    }

    public final void LIZ() {
        C73773SxN<R> c73773SxN = this.LJLLJ;
        if (c73773SxN != null) {
            c73773SxN.dispose();
        }
        while (true) {
            C73773SxN<R> poll = this.LJLJL.poll();
            if (poll == null) {
                return;
            } else {
                poll.dispose();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d8, code lost:
    
        if (r0 == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73771SxL.LIZIZ():void");
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        if (this.LJLJJLL.addThrowable(th)) {
            this.LJLL = true;
            LIZIZ();
        } else {
            C73548Stk.LIZIZ(th);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(T t) {
        if (this.LJLLI == 0) {
            this.LJLJLJ.offer(t);
        }
        LIZIZ();
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.validate(this.LJLJLLL, interfaceC92693kP)) {
            this.LJLJLLL = interfaceC92693kP;
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
                int requestFusion = interfaceC73571Su7.requestFusion(3);
                if (requestFusion == 1) {
                    this.LJLLI = requestFusion;
                    this.LJLJLJ = interfaceC73571Su7;
                    this.LJLL = true;
                    this.LJLIL.onSubscribe(this);
                    LIZIZ();
                    return;
                }
                if (requestFusion == 2) {
                    this.LJLLI = requestFusion;
                    this.LJLJLJ = interfaceC73571Su7;
                    this.LJLIL.onSubscribe(this);
                    return;
                }
            }
            this.LJLJLJ = new C73912Szc(this.LJLJJI);
            this.LJLIL.onSubscribe(this);
        }
    }

    public C73771SxL(InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG, int i, int i2, EnumC73710SwM enumC73710SwM) {
        this.LJLIL = interfaceC116954iR;
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = enumC73710SwM;
    }
}
