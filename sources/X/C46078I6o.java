package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.I6o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46078I6o extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C46072I6i LJLIL;
    public final /* synthetic */ AVMusic LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46078I6o(C46072I6i c46072I6i, AVMusic aVMusic, boolean z, int i, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = c46072I6i;
        this.LJLILLLLZI = aVMusic;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = z2;
        this.LJLJJLL = z3;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C46072I6i c46072I6i = this.LJLIL;
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(c46072I6i, 105);
        c46072I6i.getClass();
        C46072I6i.LJIIIIZZ(aqS173S0100000_7);
        C46072I6i c46072I6i2 = this.LJLIL;
        if (!c46072I6i2.LJ) {
            AbstractC46064I6a.LLIILZL.getClass();
            C136195Wd.LIZ("initBingoAlgorithm when force apply music sync");
            c46072I6i2.LJ = true;
            InterfaceC153045zY interfaceC153045zY = c46072I6i2.LJIIIZ().LIZ;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.initBingoAlgorithm();
            }
        }
        C45771Hxn.LJII(this.LJLILLLLZI);
        if (this.LJLJI) {
            AbstractC46064I6a.LLIILZL.getClass();
            C136195Wd.LIZ("updateAlgorithmFromNormal");
            this.LJLIL.LJIIIZ().LIZLLL(new C46086I6w(this.LJLIL, this.LJLJL, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL), false);
        } else {
            C46072I6i c46072I6i3 = this.LJLIL;
            c46072I6i3.LJIIL = 1.0f;
            c46072I6i3.LJII(this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        }
        return C76800UCe.LIZ;
    }
}
