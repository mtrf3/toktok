package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NPG extends AbstractC73391SrD<Boolean> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "appEnterBackgroundEvent"));
        } else {
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), null, "appEnterForegroundEvent"));
        }
    }
}
