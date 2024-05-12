package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185107Og {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i) {
        LinkedHashMap extra;
        String str7 = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if ((i & 64) != 0) {
            num = null;
        }
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            extra = new LinkedHashMap();
        } else {
            extra = null;
        }
        o.LJIIIZ(extra, "extra");
        OSZ[] oszArr = new OSZ[8];
        oszArr[0] = new OSZ("enter_from", "topic_detail");
        oszArr[1] = new OSZ("enter_method", str);
        oszArr[2] = new OSZ("previous_page", str2);
        oszArr[3] = new OSZ("category", str3);
        oszArr[4] = new OSZ("topic_id", str4);
        oszArr[5] = new OSZ("topic_title", str5);
        if (num != null) {
            str7 = num.toString();
        }
        oszArr[6] = new OSZ("topic_rate", str7);
        oszArr[7] = new OSZ("status", str6);
        FMX.LJIIL("post_topic_review", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(oszArr), extra));
    }
}
