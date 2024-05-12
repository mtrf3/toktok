package X;

import android.content.res.Resources;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9qA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249149qA {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(long j, Resources resources) {
        StringBuilder sb = new StringBuilder();
        if (j < 60) {
            sb.append(resources.getString(R.string.qn_, String.valueOf(j)));
        } else {
            long j2 = 60;
            long j3 = j % j2;
            long j4 = j / j2;
            if (j3 >= 30) {
                j4++;
            }
            long j5 = j4 * j2;
            if (j5 < 3600) {
                sb.append(resources.getString(R.string.qn6, String.valueOf(j5 / j2)));
            } else {
                long j6 = 3600;
                long j7 = j5 / j6;
                long j8 = (j5 % j6) / j2;
                if (j8 == 0) {
                    sb.append(resources.getString(R.string.qn5, String.valueOf(j7)));
                } else {
                    sb.append(resources.getString(R.string.qn4, String.valueOf(j7), String.valueOf(j8)));
                }
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "durationStringBuilder.toString()");
        return sb2;
    }
}
