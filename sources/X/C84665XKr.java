package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.XKr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84665XKr extends XLA {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LJLJJLL = AtomicIntegerFieldUpdater.newUpdater(C84665XKr.class, "_invoked");
    public final InterfaceC88472Yns<Throwable, C76800UCe> LJLJJL;
    public volatile /* synthetic */ int _invoked;

    /* JADX WARN: Multi-variable type inference failed */
    public C84665XKr(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.XL0
    public final void LJJII(Throwable th) {
        if (LJLJJLL.compareAndSet(this, 0, 1)) {
            this.LJLJJL.invoke(th);
        }
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(Throwable th) {
        LJJII(th);
        return C76800UCe.LIZ;
    }
}
