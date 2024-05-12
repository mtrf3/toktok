package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188617aj {
    public static String LIZ(Context context, Integer num) {
        if (num != null) {
            if (num.intValue() == 3) {
                String string = context.getString(R.string.ptj);
                o.LJIIIIZZ(string, "context.getString(R.string.reason_follows)");
                return string;
            }
            if (num.intValue() == 2) {
                String string2 = context.getString(R.string.pti);
                o.LJIIIIZZ(string2, "context.getString(R.string.reason_followed_by)");
                return string2;
            }
            if (num.intValue() == 1) {
                String string3 = context.getString(R.string.ptk);
                o.LJIIIIZZ(string3, "context.getString(R.string.reason_friends_with)");
                return string3;
            }
        }
        return "";
    }
}
