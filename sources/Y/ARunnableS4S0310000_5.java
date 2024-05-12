package Y;

import X.BLH;
import X.BZI;
import X.C28787BRn;
import X.C31319CQx;
import X.CR6;
import X.CRD;
import X.CS2;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;

/* loaded from: classes6.dex */
public class ARunnableS4S0310000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
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
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS4S0310000_5 aRunnableS4S0310000_5) {
        C31319CQx c31319CQx = (C31319CQx) aRunnableS4S0310000_5.l0;
        boolean z = aRunnableS4S0310000_5.z3;
        CRD crd = (CRD) aRunnableS4S0310000_5.l1;
        CS2 cs2 = (CS2) aRunnableS4S0310000_5.l2;
        long LJLJI = c31319CQx.LJLJI(z, crd, true);
        if (cs2 != null) {
            c31319CQx.LLJJJ.LIZJ(new ARunnableS13S0100100_5(LJLJI, cs2, 5));
        }
    }

    public static final void run$1(ARunnableS4S0310000_5 aRunnableS4S0310000_5) {
        C31319CQx c31319CQx = (C31319CQx) aRunnableS4S0310000_5.l0;
        CR6 cr6 = (CR6) aRunnableS4S0310000_5.l1;
        boolean z = aRunnableS4S0310000_5.z3;
        CS2 cs2 = (CS2) aRunnableS4S0310000_5.l2;
        long LJJLIIIJL = c31319CQx.LJJLIIIJL(cr6, z);
        if (cs2 != null) {
            c31319CQx.LLJJJ.LIZJ(new ARunnableS13S0100100_5(LJJLIIIJL, cs2, 6));
        }
    }

    public static final void run$2(ARunnableS4S0310000_5 aRunnableS4S0310000_5) {
        String str;
        BLH blh = (BLH) aRunnableS4S0310000_5.l0;
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aRunnableS4S0310000_5.l1;
        EnterRoomConfig enterRoomConfig2 = (EnterRoomConfig) aRunnableS4S0310000_5.l2;
        boolean z = aRunnableS4S0310000_5.z3;
        blh.getClass();
        if (enterRoomConfig.drawParams.openLiveFromDrawer && !TextUtils.isEmpty(enterRoomConfig.mRoomsData.openLiveFromDrawerTab) && enterRoomConfig.mRoomsData.drawerTabInnerFeedSuggest != enterRoomConfig2.mRoomsData.drawerTabInnerFeedSuggest) {
            BZI LIZ = C28787BRn.LIZ("livesdk_explore_draw_to_recommend_success");
            LIZ.LJIJJ(enterRoomConfig.mRoomsData.openLiveFromDrawerTab, "from_drawer_tab");
            LIZ.LJIJJ(enterRoomConfig.mRoomsData.enterFromMerge, "enter_from_merge");
            LIZ.LJIJJ(enterRoomConfig.mRoomsData.enterMethod, "enter_method");
            if (z) {
                str = "down";
            } else {
                str = "up";
            }
            LIZ.LJIJJ(str, "draw_action");
            LIZ.LJJIIJZLJL();
        }
    }

    public ARunnableS4S0310000_5(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.l2 = obj3;
    }
}
