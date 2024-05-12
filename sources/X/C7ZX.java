package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.7ZX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7ZX {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Aweme aweme, int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        C7ZV c7zv = new C7ZV();
        c7zv.LJJIIZI(i, aweme);
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        c7zv.LIZLLL = str5;
        c7zv.LJJIIZ(context);
        c7zv.LJJLI = str3;
        if (aweme != null) {
            str6 = C54838Lfe.LJI(aweme);
        } else {
            str6 = null;
        }
        c7zv.LJJJLIIL = str6;
        c7zv.LJJJLL = C222578oP.LJI(aweme);
        C222578oP.LIZIZ(c7zv, aweme, str, str2, context);
        c7zv.LIZ(K02.LIZIZ("enter_personal_detail", aweme, str));
        c7zv.LJ("enter_position", C222578oP.LJII(context, str, str2), InterfaceC1798974f.LIZ);
        if (str4 != null) {
            c7zv.LIZLLL("previous_page_position", str4);
        }
        c7zv.LJIILIIL();
    }
}
