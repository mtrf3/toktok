package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class ET3 {
    public static final Keva LIZ = Keva.getRepo("dynamic_sticker_icon_repo");
    public static final HashMap<Integer, String> LIZIZ = new HashMap<>();
    public static final List<String> LIZJ = new ArrayList();

    public static String LIZ(Effect effect, String extraKey) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(extraKey, "extraKey");
        String LJII = V3N.LJII(effect.getExtra(), extraKey);
        if (LJII != null && LJII.length() != 0) {
            String effectId = effect.getId();
            o.LJIIIZ(effectId, "effectId");
            if (!LIZ.getBoolean(effectId, false) && !effect.getFileUrl().getUrlList().isEmpty()) {
                String LJLLLLLL = s.LJLLLLLL('/', (String) ListProtector.get(effect.getFileUrl().getUrlList(), 0), "");
                if (LJLLLLLL.length() == 0) {
                    return "";
                }
                return C00F.LIZIZ(LJLLLLLL, '/', LJII);
            }
        }
        return null;
    }

    public static boolean LIZIZ(int i, int i2, String effectId) {
        o.LJIIIZ(effectId, "effectId");
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return ((ArrayList) LIZJ).contains(effectId);
        }
        return LIZIZ.containsKey(Integer.valueOf(i2));
    }

    public static void LIZJ(int i, int i2, String effectId) {
        o.LJIIIZ(effectId, "effectId");
        LIZ.storeBoolean(effectId, true);
        if (i == 1) {
            LIZIZ.remove(Integer.valueOf(i2));
        } else {
            if (i != 2) {
                return;
            }
            ((ArrayList) LIZJ).remove(effectId);
        }
    }

    public static void LIZLLL(int i, int i2, String effectId) {
        o.LJIIIZ(effectId, "effectId");
        if (i == 1) {
            LIZIZ.put(Integer.valueOf(i2), effectId);
        } else {
            if (i != 2) {
                return;
            }
            ((ArrayList) LIZJ).add(effectId);
        }
    }
}
