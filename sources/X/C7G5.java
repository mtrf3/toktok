package X;

import android.content.Context;
import defpackage.e1;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.7G5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7G5 {
    public static String LIZ(long j, Context context) {
        String postTime;
        if (Calendar.getInstance().getTimeInMillis() - j <= 0) {
            j = Calendar.getInstance().getTimeInMillis() - 1;
        }
        if (e1.LIZ(31744, "standardize_timestamp", true, false)) {
            postTime = C86036Xpg.LIZIZ(j);
        } else {
            postTime = C57105Mb7.LJFF(j, context);
        }
        C116724i4 c116724i4 = new C116724i4();
        o.LJIIIIZZ(postTime, "postTime");
        c116724i4.LIZIZ(postTime);
        String spannableStringBuilder = c116724i4.LIZ.toString();
        o.LJIIIIZZ(spannableStringBuilder, "BidiConcat().append(postTime).build().toString()");
        return spannableStringBuilder;
    }
}
