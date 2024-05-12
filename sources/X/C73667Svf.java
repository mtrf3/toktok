package X;

/* renamed from: X.Svf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73667Svf implements InterfaceC73442Ss2, InterfaceC92693kP {
    public final InterfaceC73442Ss2 LJLIL;
    public InterfaceC92693kP LJLILLLLZI;
    public final /* synthetic */ C73668Svg LJLJI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        try {
            this.LJLJI.LJLJL.run();
        } catch (Throwable th) {
            V0N.LJJIL(th);
            C73548Stk.LIZIZ(th);
        }
        this.LJLILLLLZI.dispose();
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI.isDisposed();
    }

    @Override // X.InterfaceC73442Ss2
    public final void onComplete() {
        if (this.LJLILLLLZI == EnumC73418Sre.DISPOSED) {
            return;
        }
        try {
            this.LJLJI.LJLJJI.run();
            this.LJLJI.LJLJJL.run();
            this.LJLIL.onComplete();
            try {
                this.LJLJI.LJLJJLL.run();
            } catch (Throwable th) {
                V0N.LJJIL(th);
                C73548Stk.LIZIZ(th);
            }
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            this.LJLIL.onError(th2);
        }
    }

    @Override // X.InterfaceC73442Ss2
    public final void onError(Throwable th) {
        if (this.LJLILLLLZI == EnumC73418Sre.DISPOSED) {
            C73548Stk.LIZIZ(th);
            return;
        }
        try {
            this.LJLJI.LJLJI.accept(th);
            this.LJLJI.LJLJJL.run();
        } catch (Throwable th2) {
            V0N.LJJIL(th2);
            th = new C63756P0m(th, th2);
        }
        this.LJLIL.onError(th);
        try {
            this.LJLJI.LJLJJLL.run();
        } catch (Throwable th3) {
            V0N.LJJIL(th3);
            C73548Stk.LIZIZ(th3);
        }
    }

    @Override // X.InterfaceC73442Ss2
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        try {
            this.LJLJI.LJLILLLLZI.accept(interfaceC92693kP);
            if (EnumC73418Sre.validate(this.LJLILLLLZI, interfaceC92693kP)) {
                this.LJLILLLLZI = interfaceC92693kP;
                this.LJLIL.onSubscribe(this);
            }
        } catch (Throwable th) {
            V0N.LJJIL(th);
            interfaceC92693kP.dispose();
            this.LJLILLLLZI = EnumC73418Sre.DISPOSED;
            EnumC73538Sta.error(th, this.LJLIL);
        }
    }

    public C73667Svf(C73668Svg c73668Svg, InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLJI = c73668Svg;
        this.LJLIL = interfaceC73442Ss2;
    }
}
