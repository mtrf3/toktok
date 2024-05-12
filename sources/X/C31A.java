package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.31A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C31A {
    public static final C31A LIZ = new C31A();
    public static final HashSet<String> LIZIZ = new HashSet<>();

    public static void LIZ(boolean z, int i, int i2, boolean z2, int i3) {
        boolean z3;
        C85323Wm onEventV3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        if ((i3 & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        if ((i3 & 32) != 0) {
            onEventV3 = C772831o.LIZ();
        } else {
            onEventV3 = null;
        }
        o.LJIIIZ(onEventV3, "onEventV3");
        if (!((Boolean) LBS.LIZJ.getValue()).booleanValue()) {
            return;
        }
        OSZ[] oszArr = new OSZ[8];
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[0] = new OSZ("is_expired", obj);
        if (z3) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ("is_expiry_time_valid", obj2);
        if (z2) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("hit_times_limit", obj3);
        oszArr[3] = new OSZ("ntp_ts", String.valueOf(i2));
        oszArr[4] = new OSZ("local_ts", String.valueOf(i));
        long j = i2;
        if (1672502400 <= j && j < 10000000000L) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[5] = new OSZ("ntp_invalid", obj4);
        long j2 = i;
        if (1672502400 > j2 || j2 >= 10000000000L) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[6] = new OSZ("local_invalid", str);
        oszArr[7] = new OSZ("npt_local_diff", String.valueOf(Math.abs(i - i2)));
        onEventV3.LIZIZ("im_avatar_expiry", C113554cx.LJJL(oszArr));
    }

    public static void LIZIZ(C31A c31a, boolean z, String str, String str2, int i, boolean z2, boolean z3, boolean z4) {
        C85323Wm LIZ2 = C772831o.LIZ();
        c31a.getClass();
        if (!((Boolean) LBS.LIZJ.getValue()).booleanValue()) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C75542xq(str, str2, LIZ2, i, z2, z, z3, z4, null), 3);
    }
}
