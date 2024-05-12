package X;

import Y.ARunnableS3S0010000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PNC implements InterfaceC116954iR<Boolean> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP disposable) {
        o.LJIIIZ(disposable, "disposable");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        PN9.LJJJ = !booleanValue;
        if (PN9.LJJJI) {
            PN9.LJJJI = false;
            return;
        }
        PN9.LJJJIL = true;
        if (!EB7.LIZ()) {
            return;
        }
        C38995FSd.LIZIZ().execute(new ARunnableS3S0010000_11(booleanValue, 1));
    }
}
