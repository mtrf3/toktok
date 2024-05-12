package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WPi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82238WPi {
    public static final C82237WPh LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final EffectCategoryResponse LIZJ;

    static {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        LIZ = new C82237WPh(c61878OQg, c61878OQg);
        LIZIZ = C221108m2.LIZIZ(C82233WPd.LJLIL);
        LIZJ = C84499XEh.LIZLLL;
    }

    public static final <K, V> java.util.Map<K, List<V>> LIZ(List<? extends OSZ<? extends K, ? extends List<? extends V>>> list) {
        if (list != null) {
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (OSZ<? extends K, ? extends List<? extends V>> osz : list) {
                linkedHashMap.put(osz.getFirst(), osz.getSecond());
            }
            return linkedHashMap;
        }
        return C113554cx.LJJJLIIL();
    }

    public static final String LIZIZ(FilterBean filterBean) {
        String filterFolder;
        if (filterBean != null && (filterFolder = filterBean.getFilterFolder()) != null) {
            return filterFolder;
        }
        return "";
    }

    public static final <K, V> List<K> LIZJ(List<? extends OSZ<? extends K, ? extends List<? extends V>>> keys) {
        o.LJIIIZ(keys, "$this$keys");
        ArrayList arrayList = new ArrayList(C32I.LJJL(keys, 10));
        Iterator<? extends OSZ<? extends K, ? extends List<? extends V>>> it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFirst());
        }
        return arrayList;
    }
}
