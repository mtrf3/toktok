package X;

/* loaded from: classes11.dex */
public class NPH extends AbstractC73391SrD<Boolean> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
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
