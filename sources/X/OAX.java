package X;

import Y.ARunnableS17S0000000_10;
import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes11.dex */
public final class OAX {
    public static String LIZ;

    public static void LIZ() {
        C61532OCy c61532OCy = EBC.LIZ;
        c61532OCy.LIZIZ();
        if (c61532OCy.LJ == null) {
            return;
        }
        c61532OCy.LIZIZ();
        Context context = c61532OCy.LJ.getContext();
        if (LIZ == null) {
            OAI oai = OAO.LIZ;
            if (oai.LIZ == null) {
                oai.LIZ = F9J.LIZIZ(context, 0, "sp_gecko");
            }
            LIZ = oai.LIZ.getString("gecko_daily_task", "2021-09-15");
        }
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        if (TextUtils.equals(format, LIZ)) {
            return;
        }
        LIZ = format;
        OAO.LIZ.LIZ(context, "gecko_daily_task", format);
        OC6.LIZ("gecko-debug-tag", "do daily task, date: ", format);
        OAR.LIZ.LIZ().execute(new ARunnableS17S0000000_10(1));
    }
}
