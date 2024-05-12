package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SuO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73588SuO<T, R> extends AtomicReference<InterfaceC92693kP> implements InterfaceC116954iR<R> {
    public static final long serialVersionUID = 3837284832786408377L;
    public final C73587SuN<T, R> LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public volatile InterfaceC73570Su6<R> LJLJJI;
    public volatile boolean LJLJJL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLILLLLZI == this.LJLIL.LJLL) {
            this.LJLJJL = true;
            this.LJLIL.LIZIZ();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        C73587SuN<T, R> c73587SuN = this.LJLIL;
        c73587SuN.getClass();
        if (this.LJLILLLLZI == c73587SuN.LJLL && c73587SuN.LJLJJL.addThrowable(th)) {
            if (!c73587SuN.LJLJJI) {
                c73587SuN.LJLJLJ.dispose();
            }
            this.LJLJJL = true;
            c73587SuN.LIZIZ();
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(R r) {
        if (this.LJLILLLLZI == this.LJLIL.LJLL) {
            if (r != null) {
                this.LJLJJI.offer(r);
            }
            this.LJLIL.LIZIZ();
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            if (interfaceC92693kP instanceof InterfaceC73558Stu) {
                InterfaceC73571Su7 interfaceC73571Su7 = (InterfaceC73571Su7) interfaceC92693kP;
                int requestFusion = interfaceC73571Su7.requestFusion(7);
                if (requestFusion == 1) {
                    this.LJLJJI = interfaceC73571Su7;
                    this.LJLJJL = true;
                    this.LJLIL.LIZIZ();
                    return;
                } else if (requestFusion == 2) {
                    this.LJLJJI = interfaceC73571Su7;
                    return;
                }
            }
            this.LJLJJI = new C73912Szc(this.LJLJI);
        }
    }

    public C73588SuO(C73587SuN<T, R> c73587SuN, long j, int i) {
        this.LJLIL = c73587SuN;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }
}
