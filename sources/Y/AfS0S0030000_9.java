package Y;

import X.BPL;
import X.C221018lt;
import X.C25620zW;
import X.ENR;
import X.HG3;
import X.InterfaceC55058LjC;
import X.InterfaceC64592gB;
import X.LQO;
import X.LQS;
import X.RBX;
import X.X1D;
import android.app.Activity;

/* loaded from: classes10.dex */
public class AfS0S0030000_9 implements InterfaceC64592gB {
    public final int $t;
    public boolean z0;
    public boolean z1 = true;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS0S0030000_9(int i) {
        this.$t = i;
    }

    public static final void accept$0(AfS0S0030000_9 afS0S0030000_9, Object obj) {
        Activity activity;
        BPL bpl = (BPL) obj;
        if (bpl != null) {
            activity = bpl.LIZ;
        } else {
            activity = null;
        }
        if (!(activity instanceof InterfaceC55058LjC)) {
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("onMainCreate, loginUid=", ((RBX) HG3.LJIILL()).getCurUserId(), ", isCold=");
        LIZIZ.append(afS0S0030000_9.z1);
        LIZIZ.append(", isWarm=");
        LIZIZ.append(afS0S0030000_9.z0);
        LIZIZ.append(", isSwitch=");
        LIZIZ.append(afS0S0030000_9.z2);
        C221018lt.LIZ("NoticeCountFetcher", X1D.LIZIZ(LIZIZ));
        if (((RBX) HG3.LJIILL()).isLogin() && (!afS0S0030000_9.z1 || !ENR.LIZ())) {
            if (afS0S0030000_9.z0) {
                LQS.LIZ(10, false);
            } else if (afS0S0030000_9.z2) {
                LQS.LIZ(11, false);
            }
        }
        afS0S0030000_9.z1 = false;
        afS0S0030000_9.z0 = false;
        afS0S0030000_9.z2 = false;
        LQS.LIZLLL.z1 = true;
    }

    public static final void accept$1(AfS0S0030000_9 afS0S0030000_9, Object obj) {
        Activity activity;
        BPL bpl = (BPL) obj;
        if (bpl != null) {
            activity = bpl.LIZ;
        } else {
            activity = null;
        }
        if (!(activity instanceof InterfaceC55058LjC)) {
            return;
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("onMainCreate, loginUid=", ((RBX) HG3.LJIILL()).getCurUserId(), ", isCold=");
        LIZIZ.append(afS0S0030000_9.z1);
        LIZIZ.append(", isWarm=");
        LIZIZ.append(afS0S0030000_9.z0);
        LIZIZ.append(", isSwitch=");
        LIZIZ.append(afS0S0030000_9.z2);
        C221018lt.LIZ("LiveBubbleTrigger", X1D.LIZIZ(LIZIZ));
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (afS0S0030000_9.z0) {
                LQO.LIZ(2);
            } else if (afS0S0030000_9.z2) {
                LQO.LIZ(3);
            }
        }
        afS0S0030000_9.z1 = false;
        afS0S0030000_9.z0 = false;
        afS0S0030000_9.z2 = false;
        LQO.LJ.z1 = true;
    }
}
