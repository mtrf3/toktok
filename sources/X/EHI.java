package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EHI {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Effect effect) {
        Integer valueOf;
        DuetLayoutBean LIZIZ = LIZIZ(effect);
        if (LIZIZ != null && (valueOf = Integer.valueOf(LIZIZ.changeDirectionMode)) != null) {
            if (valueOf.intValue() == 1) {
                return 1;
            }
            if (valueOf.intValue() == 2) {
                return 2;
            }
        }
        return 0;
    }

    public static DuetLayoutBean LIZIZ(Effect effect) {
        o.LJIIIZ(effect, "<this>");
        try {
            return (DuetLayoutBean) new Gson().LJI(JSONObjectProtectorUtils.getString(new JSONObject(effect.getExtra()), "duet_layout_mode"), DuetLayoutBean.class);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static String LIZJ(Effect effect) {
        String str;
        o.LJIIIZ(effect, "<this>");
        DuetLayoutBean LIZIZ = LIZIZ(effect);
        if (LIZIZ == null || (str = LIZIZ.name) == null) {
            return "";
        }
        return str;
    }
}
