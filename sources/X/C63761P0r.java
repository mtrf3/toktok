package X;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.P0r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63761P0r {
    public static Date LIZ(String str) {
        Date date = null;
        if (str == null) {
            return null;
        }
        try {
            date = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).parse(str);
            return date;
        } catch (Exception e) {
            System.out.print(e);
            return date;
        }
    }

    public static int LIZIZ(double d, Context context) {
        if (context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
            return (int) ((d * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }
}
