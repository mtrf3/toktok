package X;

import android.os.SystemClock;

/* renamed from: X.IWa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46740IWa extends C46742IWc {
    public static boolean LJLL = true;
    public boolean LJLJI;
    public long LJLJJI;
    public String LJLJJL;
    public java.util.Map<String, Object> LJLJJLL;
    public long LJLJL;
    public boolean LJLJLJ;
    public C46543IOl LJLJLLL;

    @Override // X.C46742IWc, X.IZT
    public final void LJIIIZ() {
        this.LJLJI = true;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIILLIIL() {
        this.LJLJI = false;
        LJLL = false;
        this.LJLJLJ = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIJ() {
        this.LJLJLJ = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new IWZ(this));
        player.LJIJJ.LIZJ(new C46741IWb(this));
    }

    public C46740IWa(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        if (this.LJLJI) {
            LJLL = false;
        }
        if (LJLL) {
            this.LJLJJI = SystemClock.elapsedRealtime();
        }
        this.LJLJI = false;
    }
}
