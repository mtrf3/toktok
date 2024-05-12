package X;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.6lD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C169636lD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
        C5L7.LIZIZ();
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String str = EF7.LJIILIIL;
        o.LJIIIIZZ(str, "getAPI().applicationService.channel");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (!TextUtils.equals(lowerCase, "local_test") || "zxz".length() == 0 || msg.length() == 0 || msg.length() <= 3052) {
            return;
        }
        while (msg.length() > 3052) {
            String substring = msg.substring(0, 3052);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            msg = ujb.o.LJJJJZ(msg, substring, "", false);
        }
    }
}
