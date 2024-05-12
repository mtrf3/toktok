package X;

import android.content.SharedPreferences;
import android.os.StrictMode;
import android.preference.PreferenceManager;

/* loaded from: classes7.dex */
public class FIY {
    public static final SharedPreferences LIZ;

    static {
        C38645FEr c38645FEr = new C38645FEr(StrictMode.allowThreadDiskWrites(), null);
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(O6T.LIZ);
            c38645FEr.close();
            LIZ = defaultSharedPreferences;
        } catch (Throwable th) {
            try {
                c38645FEr.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
