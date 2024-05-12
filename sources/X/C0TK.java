package X;

import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.0TK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TK {
    public static String LIZ(String str, String selfRiskJsUUID) {
        o.LJIIIZ(selfRiskJsUUID, "selfRiskJsUUID");
        if (str == null) {
            return "";
        }
        return a1.LJ("<script type=\"text/javascript\" src=\"", UPJ.LIZIZ(str, "/pipo_fe/risk/fingerprint?sessionId=", selfRiskJsUUID, "&merchantId=", "bytedance"), "\"></script>");
    }
}
