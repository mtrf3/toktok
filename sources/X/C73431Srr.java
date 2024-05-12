package X;

import java.util.concurrent.Callable;

/* renamed from: X.Srr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73431Srr<T> extends AbstractC73672Svk<T> {
    public final Callable<? extends Throwable> LJLIL;

    public C73431Srr(Callable<? extends Throwable> callable) {
        this.LJLIL = callable;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        try {
            Throwable call = this.LJLIL.call();
            C73320Sq4.LIZ(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = call;
        } catch (Throwable th) {
            th = th;
            V0N.LJJIL(th);
        }
        EnumC73538Sta.error(th, interfaceC116954iR);
    }
}
