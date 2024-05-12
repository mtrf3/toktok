package X;

import android.os.SystemClock;
import android.view.Surface;

/* renamed from: X.IbX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46939IbX extends C46742IWc {
    public boolean LJLJI;
    public boolean LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public InterfaceC46942Iba LJLJLLL;

    @Override // X.C46742IWc, X.IZT
    public final void LJIIIZ() {
        this.LJLJI = true;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIILLIIL() {
        this.LJLJI = false;
        this.LJLJJI = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIJJLI() {
        if (this.LJLJJI && this.LJLJJLL == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJL;
            this.LJLJJLL = elapsedRealtime;
            InterfaceC46942Iba interfaceC46942Iba = this.LJLJLLL;
            if (interfaceC46942Iba != null) {
                interfaceC46942Iba.LJLILLLLZI(elapsedRealtime);
            }
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJII() {
        if (this.LJLJJI) {
            this.LJLJLJ = SystemClock.elapsedRealtime() - this.LJLJJL;
            InterfaceC46942Iba interfaceC46942Iba = this.LJLJLLL;
            if (interfaceC46942Iba != null) {
                interfaceC46942Iba.LJLIIL(this.LJLJL);
                this.LJLJLLL.LJJLJLI(this.LJLJLJ);
                this.LJLJLLL.LJJLJ();
            }
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new C46940IbY(this));
    }

    public C46939IbX(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIJJI(Surface surface) {
        if (this.LJLJJI) {
            this.LJLJL = SystemClock.elapsedRealtime() - this.LJLJJL;
            InterfaceC46942Iba interfaceC46942Iba = this.LJLJLLL;
            if (interfaceC46942Iba != null) {
                interfaceC46942Iba.LJLI();
            }
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        if (this.LJLJI) {
            this.LJLJJI = true;
            this.LJLJJL = SystemClock.elapsedRealtime();
        }
        this.LJLJI = false;
    }
}
