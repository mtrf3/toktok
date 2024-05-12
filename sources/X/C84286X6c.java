package X;

import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.X6c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84286X6c {
    public static final java.util.Map<String, List<Effect>> LIZ = new ConcurrentHashMap();
    public static final java.util.Map<String, List<EffectCategoryModel>> LIZIZ = new ConcurrentHashMap();

    public static Effect LIZ(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (concurrentHashMap.isEmpty()) {
            return null;
        }
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            for (Effect effect : (List) it.next()) {
                if (o.LJ(effect.getEffect_id(), str)) {
                    return effect;
                }
            }
        }
        return null;
    }

    public static boolean LIZIZ(String panel) {
        Collection collection;
        o.LJIIIZ(panel, "panel");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
        if (!concurrentHashMap.containsKey(panel) || (collection = (Collection) concurrentHashMap.get(panel)) == null || collection.isEmpty()) {
            return false;
        }
        return true;
    }
}
