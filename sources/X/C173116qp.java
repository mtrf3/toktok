package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;

/* renamed from: X.6qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173116qp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, String str, String str2, boolean z) {
        String str3;
        String str4;
        StringBuilder LJ = AnonymousClass028.LJ("keyname:", str, ", code:", i, ", cost time:");
        LJ.append(i2);
        LJ.append(", msg:");
        LJ.append(str2);
        H78.LIZJ(X1D.LIZIZ(LJ));
        int i3 = !z ? 1 : 0;
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("error_code", Integer.valueOf(i));
        c6bk.LIZ.put("cost_time", String.valueOf(i2));
        CutsameDataItem LIZIZ = C173046qi.LIZIZ();
        String str5 = null;
        if (LIZIZ != null) {
            str3 = LIZIZ.templateId;
        } else {
            str3 = null;
        }
        c6bk.LIZ.put("template_id", String.valueOf(str3));
        CutsameDataItem LIZIZ2 = C173046qi.LIZIZ();
        if (LIZIZ2 == null || (str4 = LIZIZ2.templateUrl) == null) {
            str4 = "";
        }
        c6bk.LIZ.put("template_url", str4);
        CutsameDataItem LIZIZ3 = C173046qi.LIZIZ();
        if (LIZIZ3 != null) {
            str5 = LIZIZ3.md5;
        }
        c6bk.LIZ.put("template_md5", str5);
        if (str2 == null) {
            str2 = "";
        }
        c6bk.LIZ.put("error_msg", str2);
        C09900aA.LJIIJJI(str, i3, c6bk.LJ());
    }
}
