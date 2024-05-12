package Y;

import X.HG3;
import X.InterfaceC55058LjC;
import X.InterfaceC64592gB;
import X.LQO;
import X.LQS;
import X.RBX;
import X.U26;
import X.X1D;
import X.YE1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class AfS0S1020000_9 implements InterfaceC64592gB {
    public final int $t;
    public String s0;
    public boolean z1;
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

    public AfS0S1020000_9(int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.z1 = true;
                this.s0 = ((RBX) HG3.LJIILL()).getCurUserId();
                return;
            default:
                this.z1 = true;
                this.s0 = ((RBX) HG3.LJIILL()).getCurUserId();
                return;
        }
    }

    public static final void accept$0(AfS0S1020000_9 afS0S1020000_9, Object obj) {
        if (!(obj instanceof InterfaceC55058LjC)) {
            return;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMainResume, lastLoginUid=");
        YE1.LIZLLL(LIZ, afS0S1020000_9.s0, ", loginUid=", curUserId, ", isByStart=");
        LIZ.append(afS0S1020000_9.z1);
        LIZ.append(", isByLogin=");
        U26.LIZLLL(LIZ, afS0S1020000_9.z2, LIZ, "NoticeCountFetcher");
        if (afS0S1020000_9.z2) {
            LQS.LIZ(11, false);
        } else if (!afS0S1020000_9.z1 && ((RBX) HG3.LJIILL()).isLogin() && o.LJ(curUserId, afS0S1020000_9.s0)) {
            LQS.LIZ(5, true);
        }
        afS0S1020000_9.s0 = curUserId;
        afS0S1020000_9.z1 = false;
        afS0S1020000_9.z2 = false;
    }

    public static final void accept$1(AfS0S1020000_9 afS0S1020000_9, Object obj) {
        if (!(obj instanceof InterfaceC55058LjC)) {
            return;
        }
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMainResume, lastLoginUid=");
        YE1.LIZLLL(LIZ, afS0S1020000_9.s0, ", loginUid=", curUserId, ", isByStart=");
        LIZ.append(afS0S1020000_9.z1);
        LIZ.append(", isByLogin=");
        U26.LIZLLL(LIZ, afS0S1020000_9.z2, LIZ, "LiveBubbleTrigger");
        if (afS0S1020000_9.z2) {
            LQO.LIZ(3);
        } else if (!afS0S1020000_9.z1 && ((RBX) HG3.LJIILL()).isLogin()) {
            o.LJ(curUserId, afS0S1020000_9.s0);
        }
        afS0S1020000_9.s0 = curUserId;
        afS0S1020000_9.z1 = false;
        afS0S1020000_9.z2 = false;
    }
}
