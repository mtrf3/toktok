package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.CompletedExceptionally;

/* renamed from: X.XKd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84651XKd<T> extends C84662XKo<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater LJLJJI = AtomicIntegerFieldUpdater.newUpdater(C84651XKd.class, "_decision");
    public volatile /* synthetic */ int _decision;

    public final Object LJJZZIII() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    Object LIZ = C84667XKt.LIZ(LJJJLIIL());
                    if (!(LIZ instanceof CompletedExceptionally)) {
                        return LIZ;
                    }
                    throw ((CompletedExceptionally) LIZ).cause;
                }
                "Already suspended".toString();
                throw new IllegalStateException("Already suspended");
            }
        } while (!LJLJJI.compareAndSet(this, 0, 1));
        return EnumC58928NAu.COROUTINE_SUSPENDED;
    }

    @Override // X.C84662XKo, kotlinx.coroutines.JobSupport
    public final void LJJII(Object obj) {
        LJJLL(obj);
    }

    @Override // X.C84662XKo, X.XKZ
    public final void LJJLL(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    XKV.LIZ(C56509MFt.LJIILIIL(obj), C78555UsJ.LJJII(this.LJLJI), null);
                    return;
                } else {
                    "Already resumed".toString();
                    throw new IllegalStateException("Already resumed");
                }
            }
        } while (!LJLJJI.compareAndSet(this, 0, 2));
    }

    public C84651XKd(InterfaceC67352kd interfaceC67352kd, MBA mba) {
        super(interfaceC67352kd, mba);
    }
}
