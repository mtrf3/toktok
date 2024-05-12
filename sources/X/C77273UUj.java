package X;

import android.view.View;
import kotlin.jvm.internal.AqS66S1100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.UUj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77273UUj {
    public static final String LIZJ(String passportName) {
        o.LJIIIZ(passportName, "passportName");
        if (o.LJ(passportName, "facebook")) {
            return "Facebook";
        }
        if (o.LJ(passportName, "google")) {
            return "Google";
        }
        return "";
    }

    public static final C25860ACy LIZ(String title, View.OnClickListener onClickListener) {
        o.LJIIIZ(title, "title");
        return new C25860ACy(new C25859ACx(title, null, onClickListener, null, false, null, null, null, false, false, null, null, false, false, null, null, null, 8388602));
    }

    public static final C25860ACy LIZIZ(String title, String str, View.OnClickListener onClickListener) {
        o.LJIIIZ(title, "title");
        return new C25860ACy(new C25859ACx(title, null, onClickListener, null, false, null, null, null, false, false, null, str, false, false, null, null, null, 8384506));
    }

    public static final void LIZLLL(C25860ACy c25860ACy, View view, String str) {
        o.LJIIIZ(c25860ACy, "<this>");
        o.LJIIIZ(view, "view");
        c25860ACy.LJIIJ(new AqS66S1100000_13(view, str, 4));
    }
}
