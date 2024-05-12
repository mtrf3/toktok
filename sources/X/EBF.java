package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiReTagEntranceOptExperiment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EBF {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EBG.LJLIL);

    public static Keva LIZIZ() {
        Object value = LIZ.getValue();
        o.LJIIIIZZ(value, "<get-INSTANCE>(...)");
        return (Keva) value;
    }

    public static void LIZ() {
        if (!PoiReTagEntranceOptExperiment.LIZIZ()) {
            return;
        }
        LIZIZ().storeInt(LJ("key_poi_re_tag_entrance_not_click_time"), LIZIZ().getInt(LJ("key_poi_re_tag_entrance_not_click_time"), 0) + 1);
    }

    public static int LIZJ() {
        java.util.Map LIZLLL = LIZLLL();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        Object obj = ((LinkedHashMap) LIZLLL).get(curUserId);
        if (obj == null) {
            obj = 0;
        }
        return ((Number) obj).intValue();
    }

    public static java.util.Map LIZLLL() {
        String string = LIZIZ().getString("key_poi_re_tag_show_entrance_count", "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String it = keys.next();
                    o.LJIIIIZZ(it, "it");
                    linkedHashMap.put(it, jSONObject.opt(it));
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return linkedHashMap;
    }

    public static String LJ(String str) {
        StringBuilder LJFF = C72972SkS.LJFF(str, '_');
        return UPJ.LJ((RBX) HG3.LJIILL(), LJFF, LJFF);
    }
}
