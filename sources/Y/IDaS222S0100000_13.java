package Y;

import X.C26045AKb;
import X.C29306Beo;
import X.C2S9;
import X.C34K;
import X.C73411SrX;
import X.C75396TiS;
import X.C75918Tqs;
import X.C75919Tqt;
import X.C75951TrP;
import X.C75952TrQ;
import X.C76188TvE;
import X.C76190TvG;
import X.C76252TwG;
import X.C76684U7s;
import X.C77177UQr;
import X.C78150Ulm;
import X.InterfaceC29937Boz;
import X.U4R;
import X.U65;
import X.U7T;
import X.U86;
import X.X1D;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchMateQuitRequestContract$AbsView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import kotlin.jvm.internal.AqS163S0100000_13;

/* loaded from: classes14.dex */
public class IDaS222S0100000_13 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS222S0100000_13 iDaS222S0100000_13) {
        boolean z;
        C76252TwG c76252TwG = (C76252TwG) iDaS222S0100000_13.l0;
        MultiMatchMateQuitRequestContract$AbsView multiMatchMateQuitRequestContract$AbsView = (MultiMatchMateQuitRequestContract$AbsView) c76252TwG.LJLILLLLZI;
        if (multiMatchMateQuitRequestContract$AbsView != null) {
            z = multiMatchMateQuitRequestContract$AbsView.wl();
        } else {
            z = false;
        }
        c76252TwG.LJI(z);
    }

    public static final void run$1(IDaS222S0100000_13 iDaS222S0100000_13) {
        ((C78150Ulm) iDaS222S0100000_13.l0).LIZIZ = false;
    }

    public static final void run$10(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJ);
        ((U7T) iDaS222S0100000_13.l0).LJJJ = null;
    }

    public static final void run$11(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJLZIJ);
        ((U7T) iDaS222S0100000_13.l0).LJJJLZIJ = null;
    }

    public static final void run$12(IDaS222S0100000_13 iDaS222S0100000_13) {
        StringBuilder LIZJ = b1.LIZJ("reply invite group", " got dispose targetUserId=");
        LIZJ.append(((C75952TrQ) iDaS222S0100000_13.l0).LJLILLLLZI);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C75952TrQ) iDaS222S0100000_13.l0).LJLIL);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C75952TrQ) iDaS222S0100000_13.l0).LJLJI);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
    }

    public static final void run$13(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJJZ);
        ((U7T) iDaS222S0100000_13.l0).LJJJJZ = null;
    }

    public static final void run$14(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJJZI);
        ((U7T) iDaS222S0100000_13.l0).LJJJJZI = null;
    }

    public static final void run$15(IDaS222S0100000_13 iDaS222S0100000_13) {
        if (!((C34K) iDaS222S0100000_13.l0).element) {
            C77177UQr.LIZ.getClass();
            C77177UQr.LJIILJJIL();
        }
        C73411SrX c73411SrX = C77177UQr.LJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        C77177UQr.LJ = null;
    }

    public static final void run$16(IDaS222S0100000_13 iDaS222S0100000_13) {
        ((U86) iDaS222S0100000_13.l0).LIZ.LLLZLL("recharge_push_more", null);
    }

    public static final void run$17(IDaS222S0100000_13 iDaS222S0100000_13) {
        C26045AKb c26045AKb = new C26045AKb((C2S9) iDaS222S0100000_13.l0);
        c26045AKb.LJIIIIZZ(R.string.hsg);
        c26045AKb.LJIIJ();
    }

    public static final void run$18(IDaS222S0100000_13 iDaS222S0100000_13) {
        U65 u65 = (U65) iDaS222S0100000_13.l0;
        u65.getClass();
        C29306Beo.LJJJ(new AqS163S0100000_13(u65, 456));
    }

    public static final void run$19(IDaS222S0100000_13 iDaS222S0100000_13) {
        C76190TvG c76190TvG = (C76190TvG) iDaS222S0100000_13.l0;
        C73411SrX c73411SrX = c76190TvG.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        c76190TvG.LJLILLLLZI = null;
    }

    public static final void run$2(IDaS222S0100000_13 iDaS222S0100000_13) {
        StringBuilder LIZJ = b1.LIZJ("permit apply group", " got dispose targetUserId=");
        LIZJ.append(((C75951TrP) iDaS222S0100000_13.l0).LJLILLLLZI);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C75951TrP) iDaS222S0100000_13.l0).LJLIL);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C75951TrP) iDaS222S0100000_13.l0).LJLJI);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
    }

    public static final void run$20(IDaS222S0100000_13 iDaS222S0100000_13) {
        C76188TvE c76188TvE = (C76188TvE) iDaS222S0100000_13.l0;
        C73411SrX c73411SrX = c76188TvE.LJLILLLLZI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        c76188TvE.LJLILLLLZI = null;
    }

    public static final void run$21(IDaS222S0100000_13 iDaS222S0100000_13) {
        ((C75396TiS) iDaS222S0100000_13.l0).LIZIZ = null;
    }

    public static final void run$3(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJLL);
        ((U7T) iDaS222S0100000_13.l0).LJJJLL = null;
    }

    public static final void run$4(IDaS222S0100000_13 iDaS222S0100000_13) {
        StringBuilder LIZJ = b1.LIZJ("cancel apply group", " got dispose targetUserId=");
        LIZJ.append(((C75918Tqs) iDaS222S0100000_13.l0).LJLILLLLZI);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C75918Tqs) iDaS222S0100000_13.l0).LJLIL);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C75918Tqs) iDaS222S0100000_13.l0).LJLJI);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
    }

    public static final void run$5(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJLIIL);
        ((U7T) iDaS222S0100000_13.l0).LJJJLIIL = null;
    }

    public static final void run$6(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJJLL);
        ((U7T) iDaS222S0100000_13.l0).LJJJJLL = null;
    }

    public static final void run$7(IDaS222S0100000_13 iDaS222S0100000_13) {
        StringBuilder LIZJ = b1.LIZJ("cancel invite join group", " got dispose targetUserId=");
        LIZJ.append(((C75919Tqt) iDaS222S0100000_13.l0).LJLILLLLZI);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C75919Tqt) iDaS222S0100000_13.l0).LJLIL);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C75919Tqt) iDaS222S0100000_13.l0).LJLJI);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
    }

    public static final void run$8(IDaS222S0100000_13 iDaS222S0100000_13) {
        StringBuilder LIZJ = b1.LIZJ("leave group", " got dispose targetUserId=");
        LIZJ.append(((C76684U7s) iDaS222S0100000_13.l0).LIZIZ);
        LIZJ.append(" targetRoomId=");
        LIZJ.append(((C76684U7s) iDaS222S0100000_13.l0).LIZ);
        LIZJ.append(" targetChannelId=");
        LIZJ.append(((C76684U7s) iDaS222S0100000_13.l0).LIZJ);
        LIZJ.append('.');
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
    }

    public static final void run$9(IDaS222S0100000_13 iDaS222S0100000_13) {
        U7T.LJJIII(((U7T) iDaS222S0100000_13.l0).LJJJZ);
        ((U7T) iDaS222S0100000_13.l0).LJJJZ = null;
    }

    public IDaS222S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
