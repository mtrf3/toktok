package X;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;

/* renamed from: X.QnJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68053QnJ {
    public static String LIZ(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.dnr);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
