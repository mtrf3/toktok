package X;

import android.content.Context;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Ent, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37513Ent {
    public static final String LIZ;

    static {
        String str;
        Context context = C37509Enp.LIZ;
        String str2 = null;
        if (context != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                str = C37270Ejy.LIZ(context.getResources().openRawResource(R.raw.pia_worker_polyfill), "");
            } catch (Throwable th) {
                C37238EjS.LIZLLL(4, "[Worker] load worker polyfill error:", th);
                str = null;
            }
            C37238EjS.LJFF("[Worker] load worker polyfill success, cost: " + (System.currentTimeMillis() - currentTimeMillis));
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
        }
        LIZ = str2;
    }
}
