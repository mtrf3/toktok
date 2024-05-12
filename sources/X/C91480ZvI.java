package X;

import Y.IDfS125S0200000_29;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import kotlin.jvm.internal.IDqS29S0300000_29;

/* renamed from: X.ZvI, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91480ZvI implements InterfaceC91457Zuv {
    public final C91334Zsw LJLIL;
    public final C91330Zss LJLILLLLZI;
    public final C91333Zsv LJLJI;

    public C91480ZvI() {
        C91334Zsw c91334Zsw = new C91334Zsw();
        C91330Zss c91330Zss = new C91330Zss(c91334Zsw);
        C91333Zsv c91333Zsv = new C91333Zsv();
        this.LJLIL = c91334Zsw;
        this.LJLILLLLZI = c91330Zss;
        this.LJLJI = c91333Zsv;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        this.LJLIL.getClass();
        this.LJLJI.getClass();
        this.LJLILLLLZI.onAttach();
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        this.LJLIL.onDetach();
        this.LJLJI.onDetach();
        this.LJLILLLLZI.onDetach();
    }

    @Override // X.InterfaceC91457Zuv
    public final void LJIJ(C91299ZsN c91299ZsN, int i) {
        InterfaceC91298ZsM interfaceC91298ZsM;
        C91333Zsv c91333Zsv = this.LJLJI;
        InterfaceC91296ZsK interfaceC91296ZsK = this.LJLILLLLZI.LJLJJI;
        c91333Zsv.getClass();
        C34K c34k = new C34K();
        c91333Zsv.LJLIL.LIZIZ(new IDqS29S0300000_29(c34k, c91299ZsN, interfaceC91296ZsK, 0));
        YBK.LIZ.getClass();
        if (YBK.LIZJ().fixCrosstalkBug) {
            if (c34k.element && interfaceC91296ZsK != null) {
                C91249ZrZ.LIZIZ = 0L;
            }
        } else if (c34k.element) {
            C91249ZrZ.LIZIZ = 0L;
        }
        if (c34k.element) {
            return;
        }
        C91330Zss c91330Zss = this.LJLILLLLZI;
        if (c91330Zss.LJII()) {
            boolean z = c91330Zss.LJLJJLL;
            if (!c91330Zss.LJLJJLL) {
                c91330Zss.LJLJJLL = true;
                c91330Zss.LJLIL.onPlaybackStateChanged(EnumC91310ZsY.PLAYBACK_STATE_START);
            }
            if (i > 0) {
                c91330Zss.LJIIL().LJFF(i);
            }
            InterfaceC91296ZsK interfaceC91296ZsK2 = c91330Zss.LJLJJI;
            if (interfaceC91296ZsK2 != null) {
                interfaceC91298ZsM = interfaceC91296ZsK2.LIZ();
            } else {
                interfaceC91298ZsM = null;
            }
            if (!z && interfaceC91296ZsK2 != null && (interfaceC91298ZsM instanceof C91469Zv7)) {
                if (((C91469Zv7) interfaceC91298ZsM).LIZ.isExpire()) {
                    C78999UzT.LJFF(C91074Zok.LIZ(interfaceC91296ZsK2).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS125S0200000_29(interfaceC91296ZsK2, c91330Zss, 0), C91331Zst.LJLIL), c91330Zss.LJLJI);
                } else {
                    c91330Zss.LJIIL().LIZJ();
                }
            } else {
                c91330Zss.LJIIL().LIZJ();
            }
        }
        IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
        if (LJII.LIZIZ()) {
            LJII.LJ("music", false);
        }
    }
}
