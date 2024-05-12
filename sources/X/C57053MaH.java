package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.AqS14S1101000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS33S0001000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MaH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57053MaH {
    public static volatile C57051MaF LIZ;

    public static void LIZ(int i) {
        AqS33S0001000_9 aqS33S0001000_9 = new AqS33S0001000_9(i, 8);
        C57051MaF c57051MaF = LIZ;
        if (c57051MaF != null) {
            aqS33S0001000_9.invoke(c57051MaF);
        }
    }

    public static void LIZJ(BaseResponse baseResponse) {
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(baseResponse, 588);
        C57051MaF c57051MaF = LIZ;
        if (c57051MaF != null) {
            aqS175S0100000_9.invoke(c57051MaF);
        }
    }

    public static void LIZIZ(MXP detailType, int i, String str) {
        o.LJIIIZ(detailType, "detailType");
        if (LIZ != null) {
            LIZ = null;
            return;
        }
        LIZ = new C57051MaF(0);
        AqS14S1101000_9 aqS14S1101000_9 = new AqS14S1101000_9(detailType, i, str, 1);
        C57051MaF c57051MaF = LIZ;
        if (c57051MaF != null) {
            aqS14S1101000_9.invoke(c57051MaF);
        }
    }
}
