package Y;

import X.C164796dP;
import X.C164906da;
import X.C1AR;
import X.EnumC61598OFm;
import X.HPI;
import X.HR7;
import X.HRD;
import X.InterfaceC61107NyZ;
import X.OSZ;
import android.content.Intent;
import com.bytedance.ies.xbridge.base.activity.GetPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.TTEPVideoSaveActivity;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDeS403S0100000_7 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;

    public static final void LIZ$0(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$1(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$2(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$3(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$4(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$5(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$6(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    public static final void LIZ$7(IDeS403S0100000_7 iDeS403S0100000_7) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            case 2:
                LIZ$2(this);
                return;
            case 3:
                LIZ$3(this);
                return;
            case 4:
                LIZ$4(this);
                return;
            case 5:
                LIZ$5(this);
                return;
            case 6:
                LIZ$6(this);
                return;
            case 7:
                LIZ$7(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            case 2:
                LIZIZ$2(this, c164906daArr);
                return;
            case 3:
                LIZIZ$3(this, c164906daArr);
                return;
            case 4:
                LIZIZ$4(this, c164906daArr);
                return;
            case 5:
                LIZIZ$5(this, c164906daArr);
                return;
            case 6:
                LIZIZ$6(this, c164906daArr);
                return;
            case 7:
                LIZIZ$7(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public IDeS403S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... results) {
        o.LJIIJ(results, "results");
        if (results.length == 0 || results[0].LIZIZ != EnumC61598OFm.GRANTED) {
            if (results.length == 0 || C1AR.LJI((GetPermissionActivity) iDeS403S0100000_7.l0, results[0].LIZ)) {
                ((GetPermissionActivity) iDeS403S0100000_7.l0).sendBroadcast(new Intent("GetPermissionActivity.permission_denied"));
            } else {
                ((GetPermissionActivity) iDeS403S0100000_7.l0).sendBroadcast(new Intent("GetPermissionActivity.permission_rejected"));
            }
        } else {
            ((GetPermissionActivity) iDeS403S0100000_7.l0).sendBroadcast(new Intent("GetPermissionActivity.permission_granted"));
        }
        ((GetPermissionActivity) iDeS403S0100000_7.l0).finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ$1(Y.IDeS403S0100000_7 r8, X.C164906da... r9) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDeS403S0100000_7.LIZIZ$1(Y.IDeS403S0100000_7, X.6da[]):void");
    }

    public static final void LIZIZ$2(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... c164906daArr) {
        OSZ<String[], int[]> LIZ = C164796dP.LIZ(c164906daArr);
        ((HPI) iDeS403S0100000_7.l0).LIZ(LIZ.getSecond(), LIZ.getFirst());
    }

    public static final void LIZIZ$3(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0) {
            ((TTEPVideoSaveActivity) iDeS403S0100000_7.l0).LLFII().gv0(false);
        } else if (results[0].LIZIZ == EnumC61598OFm.GRANTED) {
            ((TTEPVideoSaveActivity) iDeS403S0100000_7.l0).LLFII().gv0(true);
        } else {
            ((TTEPVideoSaveActivity) iDeS403S0100000_7.l0).LLFII().gv0(false);
        }
    }

    public static final void LIZIZ$4(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        OSZ<String[], int[]> LIZ = C164796dP.LIZ((C164906da[]) Arrays.copyOf(results, results.length));
        String[] first = LIZ.getFirst();
        ((HR7) iDeS403S0100000_7.l0).LIZ(LIZ.getSecond(), first);
    }

    public static final void LIZIZ$5(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        OSZ<String[], int[]> LIZ = C164796dP.LIZ((C164906da[]) Arrays.copyOf(results, results.length));
        String[] first = LIZ.getFirst();
        ((HRD) iDeS403S0100000_7.l0).LIZ(LIZ.getSecond(), first);
    }

    public static final void LIZIZ$6(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... c164906daArr) {
        OSZ<String[], int[]> LIZ = C164796dP.LIZ(c164906daArr);
        ((HPI) iDeS403S0100000_7.l0).LIZ(LIZ.getSecond(), LIZ.getFirst());
    }

    public static final void LIZIZ$7(IDeS403S0100000_7 iDeS403S0100000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        OSZ<String[], int[]> LIZ = C164796dP.LIZ((C164906da[]) Arrays.copyOf(results, results.length));
        String[] first = LIZ.getFirst();
        ((HPI) iDeS403S0100000_7.l0).LIZ(LIZ.getSecond(), first);
    }
}
