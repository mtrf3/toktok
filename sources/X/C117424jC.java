package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.HashMap;

/* renamed from: X.4jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117424jC {
    public static volatile C117424jC LIZIZ;
    public final java.util.Map<String, Integer> LIZ = new HashMap();

    public final android.net.Uri LIZ(Context context, String str) {
        int i;
        if (str == null || str.isEmpty()) {
            i = 0;
        } else {
            String replace = str.toLowerCase().replace("-", "_");
            try {
                i = CastIntegerProtector.parseInt(replace);
            } catch (NumberFormatException unused) {
                synchronized (this) {
                    if (((HashMap) this.LIZ).containsKey(replace)) {
                        i = ((Integer) ((HashMap) this.LIZ).get(replace)).intValue();
                    } else {
                        i = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                        ((HashMap) this.LIZ).put(replace, Integer.valueOf(i));
                    }
                }
            }
        }
        if (i > 0) {
            return C0F1.LIZ("res").path(String.valueOf(i)).build();
        }
        return android.net.Uri.EMPTY;
    }
}
