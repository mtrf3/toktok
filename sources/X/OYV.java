package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class OYV {
    public static String LIZ(Context context, String str) {
        String LIZIZ = C00S.LIZIZ(context, UriProtector.parse(str));
        try {
            C37246Eja c37246Eja = C37247Ejb.LIZIZ;
            if (LIZIZ == null) {
                LIZIZ = "";
            }
            c37246Eja.getClass();
            String LIZ = OXG.LIZ(C37246Eja.LJ(LIZIZ));
            if (LIZ == null) {
                return "";
            }
            return LIZ;
        } catch (IOException unused) {
            return "";
        }
    }
}
