package X;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: X.StW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73534StW<R> implements InterfaceC73509St7<R> {
    public final /* synthetic */ C73532StU LJLIL;

    @Override // X.InterfaceC73509St7
    public final void onComplete() {
        this.LJLIL.LJLIL.onComplete();
    }

    public C73534StW(C73532StU c73532StU) {
        this.LJLIL = c73532StU;
    }

    @Override // X.InterfaceC73509St7
    public final void onError(Throwable th) {
        this.LJLIL.LJLIL.onError(th);
    }

    @Override // X.InterfaceC73509St7
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this.LJLIL, interfaceC92693kP);
    }

    @Override // X.InterfaceC73509St7
    public final void onSuccess(R r) {
        this.LJLIL.LJLIL.onSuccess(r);
    }
}
