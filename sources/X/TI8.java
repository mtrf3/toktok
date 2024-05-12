package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TI8 implements InterfaceC74429TIz {
    public final java.util.Map<String, TI9> LIZ;
    public final java.util.Map<String, TI9> LIZIZ;

    @Override // X.InterfaceC74429TIz
    public final void LIZ() {
        Iterator<TI9> it = this.LIZ.values().iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.InterfaceC74429TIz
    public final java.util.Map<String, TI9> LIZLLL() {
        return this.LIZIZ;
    }

    public TI8(C74385THh configure) {
        o.LJIIIZ(configure, "configure");
        java.util.Map<String, TI9> _customCategories = Collections.synchronizedMap(new LinkedHashMap());
        this.LIZ = _customCategories;
        o.LJIIIIZZ(_customCategories, "_customCategories");
        this.LIZIZ = _customCategories;
    }

    @Override // X.InterfaceC74429TIz
    public final void LIZIZ(TI9 ti9) {
        java.util.Map<String, TI9> _customCategories = this.LIZ;
        o.LJIIIIZZ(_customCategories, "_customCategories");
        _customCategories.put(ti9.LIZIZ().getKey(), ti9);
    }

    @Override // X.InterfaceC74429TIz
    public void LIZJ(List<EffectCategoryModel> origin) {
        o.LJIIIZ(origin, "origin");
        Iterator<Map.Entry<String, TI9>> it = this.LIZIZ.entrySet().iterator();
        while (it.hasNext()) {
            TI9 value = it.next().getValue();
            value.LIZLLL();
            value.LIZLLL();
            if (origin.size() > 0) {
                value.LIZLLL();
                ListProtector.add(origin, 0, value.LIZIZ());
            } else {
                origin.add(value.LIZIZ());
            }
        }
    }
}
