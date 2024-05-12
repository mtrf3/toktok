package X;

import android.os.SystemClock;

/* renamed from: X.IYf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46797IYf extends C46742IWc {
    public final ITI LJLJI;
    public C47824Ipo LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;

    @Override // X.C46742IWc, X.IZT
    public final void LJIJ() {
        this.LJLJLLL = 1;
        if (this.LJLILLLLZI.s7().get(51, 0) > 0) {
            this.LJLJLLL = 2;
        }
        this.LJLJLJ = SystemClock.elapsedRealtime();
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIIZ(java.util.Map<String, Object> map) {
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        this.LJLJLLL = 0;
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LJIJJLI.LIZJ(new InterfaceC46854IaA() { // from class: X.IYg
            @Override // X.InterfaceC46854IaA
            public final boolean onFetchedVideoInfo(C47164IfA c47164IfA) {
                C46797IYf.this.LJLJI.LJII = new C46914Ib8(c47164IfA);
                return false;
            }
        });
        player.LLJL(new C46796IYe(this, player));
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIJI() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        this.LJLJL = SystemClock.elapsedRealtime();
        this.LJLJJI = player.LJJIIZI();
        this.LJLJI.LJFF = player.LJJIIJZLJL(315);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJI() {
        this.LJLJJL = 0L;
        if (this.LJLJL != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.LJLJL;
            this.LJLJJL = elapsedRealtime - j;
            this.LJLJJLL = this.LJLJLJ - j;
            this.LJLJL = 0L;
            this.LJLJLJ = 0L;
        }
    }

    public C46797IYf(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
        this.LJLJI = new ITI();
        this.LJLJLLL = -1;
        this.LJLL = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        if (map.get("set_cookie_token") != null) {
            this.LJLL = ((Boolean) map.get("set_cookie_token")).booleanValue();
        } else {
            this.LJLL = false;
        }
    }
}
