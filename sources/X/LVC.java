package X;

import com.bytedance.keva.Keva;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LVC<V> implements Callable {
    public static final LVC<V> LJLIL = new LVC<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Keva keva = LVB.LIZLLL;
        String attrJson = keva.getString("keva_name_notice_attr", "");
        String string = keva.getString("keva_name_group_filter", "");
        try {
            if (LVB.LIZIZ.isEmpty()) {
                o.LJIIIIZZ(attrJson, "attrJson");
                LVB.LJ(attrJson);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            if (LVB.LIZJ.isEmpty()) {
                Object LJII = C75792yF.LIZIZ().LJII(string, new LVJ().getType());
                o.LJIIIIZZ(LJII, "getGson().fromJson(group…FilterGroups>>() {}.type)");
                LVB.LIZJ = (List) LJII;
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C10K.LIZIZ(new LVD(true), C10K.LJI, null);
        return C76800UCe.LIZ;
    }
}
