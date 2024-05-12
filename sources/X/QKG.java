package X;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class QKG {
    public static volatile long LIZ;
    public static boolean LIZIZ;

    public static void LIZ(StringBuilder sb, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(str);
        sb.append("=");
        if (z) {
            str2 = android.net.Uri.encode(str2);
        }
        sb.append(str2);
    }

    public static void LIZIZ(Context context, String[] strArr, boolean z, boolean z2) {
        if (z2 && LIZIZ) {
            return;
        }
        new QKC(context, strArr, z, !LIZIZ, new QKX()).start();
    }
}
