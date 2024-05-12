package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Ss8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73448Ss8 extends AtomicReference<InterfaceC92693kP> implements InterfaceC73442Ss2, Runnable, InterfaceC92693kP {
    public static final long serialVersionUID = 465972761105851022L;
    public final InterfaceC73442Ss2 LJLIL;
    public final long LJLILLLLZI;
    public final TimeUnit LJLJI;
    public final AbstractC73946T0k LJLJJI;
    public final boolean LJLJJL;
    public Throwable LJLJJLL;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        EnumC73418Sre.replace(this, this.LJLJJI.LIZJ(this, this.LJLILLLLZI, this.LJLJI));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Throwable th = this.LJLJJLL;
            this.LJLJJLL = null;
            if (th != null) {
                this.LJLIL.onError(th);
            } else {
                this.LJLIL.onComplete();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        long j;
        this.LJLJJLL = th;
        AbstractC73946T0k abstractC73946T0k = this.LJLJJI;
        if (this.LJLJJL) {
            j = this.LJLILLLLZI;
        } else {
            j = 0;
        }
        EnumC73418Sre.replace(this, abstractC73946T0k.LIZJ(this, j, this.LJLJI));
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        if (EnumC73418Sre.setOnce(this, interfaceC92693kP)) {
            this.LJLIL.onSubscribe(this);
        }
    }

    public RunnableC73448Ss8(InterfaceC73442Ss2 interfaceC73442Ss2, long j, TimeUnit timeUnit, AbstractC73946T0k abstractC73946T0k, boolean z) {
        this.LJLIL = interfaceC73442Ss2;
        this.LJLILLLLZI = j;
        this.LJLJI = timeUnit;
        this.LJLJJI = abstractC73946T0k;
        this.LJLJJL = z;
    }
}
