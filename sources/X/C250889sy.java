package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9sy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C250889sy {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Context context, Integer num) {
        if (context != null && num != null) {
            if (num.intValue() == 1) {
                return C29822Bn8.LIZ(context, R.string.gkd, "context.resources.getString(R.string.followed)");
            }
            if (num.intValue() == 2) {
                return C29822Bn8.LIZ(context, R.string.exk, "context.resources.getStr…g(R.string.double_follow)");
            }
        }
        return "";
    }

    public static String LIZIZ(Context context, String str) {
        if (context != null && str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -600094315) {
                if (hashCode != 301801488) {
                    String string = context.getString(R.string.gkd);
                    o.LJIIIIZZ(string, "context.getString(R.string.followed)");
                    return string;
                }
                String string2 = context.getString(R.string.gkd);
                o.LJIIIIZZ(string2, "context.getString(R.string.followed)");
                return string2;
            }
            if (str.equals("friends")) {
                String string3 = context.getString(R.string.exk);
                o.LJIIIIZZ(string3, "context.getString(R.string.double_follow)");
                return string3;
            }
        }
        return "";
    }
}
