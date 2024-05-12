package X;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;

/* loaded from: classes16.dex */
public final class XSJ {
    public static final XSI LIZ;
    public static TeenageModeSetting LIZIZ;

    static {
        TeenageModeSetting teenageModeSetting;
        Object LIZ2 = C54370LVm.LIZ(EF7.LIZIZ(), XSI.class);
        if (LIZ2 != null) {
            XSI xsi = (XSI) LIZ2;
            LIZ = xsi;
            String LIZIZ2 = xsi.LIZIZ();
            if (!TextUtils.isEmpty(LIZIZ2)) {
                try {
                    teenageModeSetting = (TeenageModeSetting) new Gson().LJI(LIZIZ2, TeenageModeSetting.class);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                LIZIZ = teenageModeSetting;
                return;
            }
            teenageModeSetting = null;
            LIZIZ = teenageModeSetting;
            return;
        }
        "Follow previous logic".toString();
        throw new IllegalArgumentException("Follow previous logic");
    }
}
