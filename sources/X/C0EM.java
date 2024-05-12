package X;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashMap;

/* renamed from: X.0EM, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0EM {
    public static LinearLayout LIZ(Context context, int i) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(i);
        return linearLayout;
    }

    public static Long LIZIZ(Long l, long j) {
        return Long.valueOf(j - l.longValue());
    }

    public static void LIZJ(Integer num, HashMap hashMap, String str) {
        hashMap.put(str, String.valueOf(num.intValue()));
    }
}
