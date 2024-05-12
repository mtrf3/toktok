package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M0H {
    public final M0L LIZ;
    public final java.util.Map<EnumC56110M0k, java.util.Set<JSONObject>> LIZIZ;
    public final C62822Ol8 LIZJ;
    public final int LIZLLL;

    public M0H(M0L mallGlobalData) {
        o.LJIIIZ(mallGlobalData, "mallGlobalData");
        this.LIZ = mallGlobalData;
        java.util.Map<EnumC56110M0k, java.util.Set<JSONObject>> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        o.LJIIIIZZ(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.LIZIZ = synchronizedMap;
        this.LIZJ = C221108m2.LIZIZ(M1H.LJLIL);
        this.LIZLLL = 58;
    }

    public final void LIZ(JSONObject data, EnumC56110M0k enumC56110M0k) {
        o.LJIIIZ(data, "data");
        if (enumC56110M0k == null) {
            enumC56110M0k = EnumC56110M0k.LYNX_ON_PAGE_START;
        }
        if (this.LIZ.LJLJLLL.contains(enumC56110M0k)) {
            FCH.LIZIZ.getClass();
            FCG.LIZ("ec_mall_data_for_lynx", data);
            return;
        }
        java.util.Set<JSONObject> set = this.LIZIZ.get(enumC56110M0k);
        if (set == null || set.isEmpty()) {
            this.LIZIZ.put(enumC56110M0k, C77275UUl.LJ(data));
        } else {
            set.add(data);
        }
    }
}
