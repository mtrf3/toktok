package Y;

import X.C162476Zf;
import X.C31012CFc;
import X.C31556Ca0;
import X.C38393F4z;
import X.C76738U9u;
import X.C76740U9w;
import X.C77640UdY;
import X.C77731Uf1;
import X.C77739Uf9;
import X.C77744UfE;
import X.C78609UtB;
import X.CH1;
import X.EnumC76739U9v;
import X.EnumC77742UfC;
import X.InterfaceC64592gB;
import X.InterfaceC77737Uf7;
import X.J7I;
import X.OSZ;
import X.U7F;
import X.U7W;
import X.UA9;
import X.UC0;
import android.os.SystemClock;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS4S1200100_13 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

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

    public static final void accept$0(AfS4S1200100_13 afS4S1200100_13, Object obj) {
        CheckSubOrderResultStruct checkSubOrderResultStruct = (CheckSubOrderResultStruct) obj;
        ((HashMap) afS4S1200100_13.l1).put("duration", Long.valueOf(SystemClock.uptimeMillis() - afS4S1200100_13.j3));
        ((HashMap) afS4S1200100_13.l1).put("is_subscription", Boolean.TRUE);
        C78609UtB.LJJJJZI("ttlive_check_subscription", (HashMap) afS4S1200100_13.l1);
        HashMap logMap = (HashMap) afS4S1200100_13.l1;
        o.LJIIIZ(logMap, "logMap");
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_check_order_success", C38393F4z.LIZLLL(logMap), 56);
        long uptimeMillis = SystemClock.uptimeMillis() - afS4S1200100_13.j3;
        if (C77640UdY.LIZ) {
            C77640UdY.LJIIIIZZ = uptimeMillis;
        }
        checkSubOrderResultStruct.orderID = afS4S1200100_13.s0;
        C77731Uf1.LJIIL((InterfaceC77737Uf7) afS4S1200100_13.l2, 6, new C31556Ca0(6, null, null, null, null, null, checkSubOrderResultStruct, null, 190));
    }

    public static final void accept$1(AfS4S1200100_13 afS4S1200100_13, Object obj) {
        String str;
        String str2;
        String str3;
        BaseResponse baseResponse = (BaseResponse) obj;
        U7F u7f = (U7F) afS4S1200100_13.l1;
        String str4 = afS4S1200100_13.s0;
        String str5 = "";
        OSZ osz = new OSZ(0L, "");
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        } else {
            str = null;
        }
        EnumC76739U9v enumC76739U9v = (EnumC76739U9v) afS4S1200100_13.l2;
        int[] iArr = C76738U9u.LIZ;
        int i = iArr[enumC76739U9v.ordinal()];
        String str6 = "kickout_rtc_stream_close";
        if (i == 1) {
            str2 = "kickout_rtc_stream_timeout";
        } else if (i == 2) {
            str2 = "kickout_none";
        } else if (i == 3) {
            str2 = "kickout_rtc_stream_close";
        } else {
            throw new C162476Zf();
        }
        UA9.LJJIFFI(afS4S1200100_13.j3, C31012CFc.LIZIZ(), u7f, str4, str, str2, osz, true);
        U7F u7f2 = (U7F) afS4S1200100_13.l1;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS4S1200100_13.j3;
        if (baseResponse != null && (str3 = baseResponse.LIZIZ) != null) {
            str5 = str3;
        }
        int i2 = iArr[((EnumC76739U9v) afS4S1200100_13.l2).ordinal()];
        if (i2 == 1) {
            str6 = "kickout_rtc_stream_timeout";
        } else if (i2 == 2) {
            str6 = "kickout_none";
        } else if (i2 != 3) {
            throw new C162476Zf();
        }
        J7I.LJIIIZ(u7w, u7f2, "kick_out", LIZIZ, str5, 0, new OSZ("kickout_reason", str6), false, null, 192);
    }

    public static final void accept$2(AfS4S1200100_13 afS4S1200100_13, Object obj) {
        String str;
        String str2;
        Throwable th = (Throwable) obj;
        U7F u7f = (U7F) afS4S1200100_13.l1;
        String str3 = afS4S1200100_13.s0;
        OSZ LJIILL = UC0.LJIILL(th);
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = null;
        }
        EnumC76739U9v enumC76739U9v = (EnumC76739U9v) afS4S1200100_13.l2;
        int[] iArr = C76740U9w.LIZ;
        int i = iArr[enumC76739U9v.ordinal()];
        String str4 = "kickout_rtc_stream_close";
        if (i == 1) {
            str2 = "kickout_rtc_stream_timeout";
        } else if (i == 2) {
            str2 = "kickout_none";
        } else if (i == 3) {
            str2 = "kickout_rtc_stream_close";
        } else {
            throw new C162476Zf();
        }
        UA9.LJJIFFI(afS4S1200100_13.j3, C31012CFc.LIZIZ(), u7f, str3, str, str2, LJIILL, false);
        U7F u7f2 = (U7F) afS4S1200100_13.l1;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - afS4S1200100_13.j3;
        String LJIJ = UC0.LJIJ(th);
        if (LJIJ == null) {
            LJIJ = "";
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        int i2 = iArr[((EnumC76739U9v) afS4S1200100_13.l2).ordinal()];
        if (i2 == 1) {
            str4 = "kickout_rtc_stream_timeout";
        } else if (i2 == 2) {
            str4 = "kickout_none";
        } else if (i2 != 3) {
            throw new C162476Zf();
        }
        J7I.LJIIIZ(u7w, u7f2, "kick_out", LIZIZ, LJIJ, LJIILJJIL, new OSZ("kickout_reason", str4), false, null, 192);
    }

    public AfS4S1200100_13(Object obj, long j, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.j3 = j;
        this.s0 = str;
        this.l2 = obj2;
    }
}
