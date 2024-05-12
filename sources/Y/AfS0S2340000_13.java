package Y;

import X.C1EW;
import X.C76800UCe;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.U4R;
import X.U66;
import X.U7U;
import X.UB9;
import X.X1D;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RTCClientData;

/* loaded from: classes14.dex */
public class AfS0S2340000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public boolean z5;
    public boolean z6;
    public boolean z7;
    public boolean z8;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S2340000_13 afS0S2340000_13, Object obj) {
        U7U u7u = (U7U) afS0S2340000_13.l2;
        U66 u66 = (U66) afS0S2340000_13.l3;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS0S2340000_13.l4;
        u7u.LJIJI(u66, afS0S2340000_13.s0, afS0S2340000_13.s1, interfaceC88472Yns, afS0S2340000_13.z5, afS0S2340000_13.z6, afS0S2340000_13.z7, afS0S2340000_13.z8);
    }

    public static final void accept$1(AfS0S2340000_13 afS0S2340000_13, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getRtcAbInfo error ");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "RtcManager");
        U7U u7u = (U7U) afS0S2340000_13.l2;
        U66 u66 = (U66) afS0S2340000_13.l3;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS0S2340000_13.l4;
        u7u.LJIJI(u66, afS0S2340000_13.s0, afS0S2340000_13.s1, interfaceC88472Yns, afS0S2340000_13.z5, afS0S2340000_13.z6, afS0S2340000_13.z7, afS0S2340000_13.z8);
    }

    public static final void accept$2(AfS0S2340000_13 afS0S2340000_13, Object obj) {
        U66 u66;
        RTCClientData rTCClientData = (RTCClientData) obj;
        U7U u7u = (U7U) afS0S2340000_13.l2;
        U66 u662 = (U66) afS0S2340000_13.l3;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS0S2340000_13.l4;
        String str = afS0S2340000_13.s0;
        boolean z = afS0S2340000_13.z5;
        String str2 = afS0S2340000_13.s1;
        boolean z2 = afS0S2340000_13.z6;
        boolean z3 = afS0S2340000_13.z7;
        boolean z4 = afS0S2340000_13.z8;
        u7u.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initRtc get rtc engine on: ");
        UB9 ub9 = null;
        if (rTCClientData != null) {
            ub9 = rTCClientData.getClient();
        }
        LIZ.append(ub9);
        LIZ.append(", isRtcLocked=");
        LIZ.append(U7U.LJJJJ);
        U4R.LIZLLL("RtcManager", X1D.LIZIZ(LIZ));
        int LIZIZ = u662.LIZIZ();
        if (u7u.LIZIZ || LIZIZ == 3 || LIZIZ == 4 || LIZIZ == 5) {
            U4R.LIZLLL("RtcManager", "initRtc mIsInitialized || curState == LinkMicState.JOINING_CHANNEL || curState == LinkMicState.JOINED_CHANNEL ||\n                        curState == LinkMicState.FRAME_LINKED");
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (rTCClientData == null || rTCClientData.getClient() == null) {
            U4R.LIZLLL("RtcManager", "initRtc rtcClient == null");
            u7u.LJJJIL(LinkCoreError.Companion.getRTC_TURN_ON_ERROR());
            if (interfaceC88472Yns == null) {
                return;
            }
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        if (U7U.LJJJJ) {
            U4R.LIZLLL("RtcManager", "initRtc isRtcLocked == true");
            u7u.LJJJIL(LinkCoreError.Companion.getRTC_INITIALIZED_BY_ONE_CHANNEL());
            if (interfaceC88472Yns == null) {
                return;
            }
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        u7u.LJIJ(u662, str, rTCClientData, z, str2);
        if (z2 || (u66 = u7u.LJIIIZ) == null || u66.LLZILL()) {
            u7u.LJJIJ(str2);
        }
        if (z3) {
            u7u.LJJIL("business_init_rtc", true);
        }
        if (!z4) {
            return;
        }
        u7u.LJJIJL("business_init_rtc", true);
        u7u.LJJIJLIJ("business_init_rtc", true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS0S2340000_13(U7U u7u, U7U u7u2, U66 u66, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, String str, boolean z, String str2, boolean z2, boolean z3, boolean z4) {
        this.$t = z4 ? 1 : 0;
        this.l2 = u7u;
        this.l3 = u7u2;
        this.l4 = u66;
        this.s0 = interfaceC88472Yns;
        this.z5 = str;
        this.s1 = z;
        this.z6 = str2;
        this.z7 = z2;
        this.z8 = z3;
    }
}
