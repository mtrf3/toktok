package X;

/* renamed from: X.Bfb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29355Bfb<T> implements InterfaceC116954iR<T>, InterfaceC73463SsN<T> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public void onNext(T t) {
    }

    @Override // X.InterfaceC116954iR
    public void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(T t) {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        C0NB.LJI("LiveEmptyObserver", th);
    }
}
