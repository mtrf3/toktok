package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.4k6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117984k6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, C117994k7 params) {
        Object obj;
        Object obj2;
        String str;
        o.LJIIIZ(params, "params");
        boolean z2 = params.LJI;
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            C85323Wm LIZ2 = C772831o.LIZ();
            OSZ[] oszArr = new OSZ[4];
            if (z) {
                str2 = "1";
            }
            oszArr[0] = new OSZ("result", str2);
            oszArr[1] = new OSZ("media_type", params.LJ.getType());
            EnumC117794jn enumC117794jn = params.LIZLLL;
            if (enumC117794jn == null || (str = enumC117794jn.getStrategy()) == null) {
                str = "";
            }
            oszArr[2] = new OSZ("strategy", str);
            oszArr[3] = new OSZ("time_cost", String.valueOf(System.currentTimeMillis() - params.LIZ));
            LIZ2.LIZIZ("dm_camera_resend", C113554cx.LJJL(oszArr));
            return;
        }
        C85323Wm LIZ3 = C772831o.LIZ();
        OSZ[] oszArr2 = new OSZ[6];
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr2[0] = new OSZ("result", obj);
        oszArr2[1] = new OSZ("media_type", params.LJ.getType());
        if (params.LIZIZ) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr2[2] = new OSZ("is_fast_send", obj2);
        if (params.LIZJ) {
            str2 = "1";
        }
        oszArr2[3] = new OSZ("from_record", str2);
        oszArr2[4] = new OSZ("total_time_cost", String.valueOf(System.currentTimeMillis() - params.LIZ));
        oszArr2[5] = new OSZ("select_count", String.valueOf(params.LJFF));
        LIZ3.LIZIZ("dm_camera_send", C113554cx.LJJL(oszArr2));
    }
}
