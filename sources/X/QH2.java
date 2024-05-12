package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class QH2 {
    public final SharedPreferences LIZ;

    public final synchronized void LIZIZ() {
        this.LIZ.edit().clear().commit();
    }

    public QH2(Context context) {
        boolean isEmpty;
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "com.google.android.gms.appid");
        this.LIZ = LIZIZ;
        File file = new File(C04270Et.LIZJ(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile()) {
                return;
            }
            synchronized (this) {
                isEmpty = LIZIZ.getAll().isEmpty();
            }
            if (isEmpty) {
                return;
            }
            LIZIZ();
        } catch (IOException unused) {
        }
    }

    public static String LIZ(String str, String str2) {
        return UPJ.LIZIZ(str, "|T|", str2, "|", "*");
    }
}
