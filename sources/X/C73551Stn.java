package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Stn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73551Stn extends AtomicReference<InterfaceC92693kP> implements InterfaceC73442Ss2, InterfaceC92693kP {
    public static final long serialVersionUID = 8606673141535671828L;
    public final /* synthetic */ C73552Sto LJLIL;

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        C73552Sto c73552Sto = this.LJLIL;
        c73552Sto.LJLJJL.LIZJ(this);
        c73552Sto.onComplete();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return EnumC73418Sre.isDisposed(get());
    }

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        EnumC73418Sre.dispose(this);
    }

    public C73551Stn(C73552Sto c73552Sto) {
        this.LJLIL = c73552Sto;
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        C73552Sto c73552Sto = this.LJLIL;
        c73552Sto.LJLJJL.LIZJ(this);
        c73552Sto.onError(th);
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        EnumC73418Sre.setOnce(this, interfaceC92693kP);
    }
}
