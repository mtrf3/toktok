package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TML {
    public static final java.util.Map<Integer, Float> LIZ = new LinkedHashMap();

    public static final float LIZ(FilterBean getInternalDefaultIntensity) {
        o.LJIIIZ(getInternalDefaultIntensity, "$this$getInternalDefaultIntensity");
        Object obj = ((LinkedHashMap) LIZ).get(Integer.valueOf(getInternalDefaultIntensity.getId()));
        if (obj == null) {
            obj = Float.valueOf(-1.0f);
        }
        return ((Number) obj).floatValue();
    }

    public static final float LIZIZ(FilterBean getInternalDefaultIntensity, InterfaceC122704ri getter) {
        o.LJIIIZ(getInternalDefaultIntensity, "$this$getInternalDefaultIntensity");
        o.LJIIIZ(getter, "getter");
        if (getInternalDefaultIntensity.getFilterFolder() != null) {
            java.util.Map<Integer, Float> map = LIZ;
            Integer valueOf = Integer.valueOf(getInternalDefaultIntensity.getId());
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = Float.valueOf(getter.LIZ(getInternalDefaultIntensity));
                linkedHashMap.put(valueOf, obj);
            }
            float floatValue = ((Number) obj).floatValue();
            if (floatValue < 0.0f) {
                return 0.0f;
            }
            return floatValue;
        }
        return 0.8f;
    }

    public static final float LIZJ(FilterBean getStoreIntensity, InterfaceC148845sm filterIntensityStore, InterfaceC122704ri getter) {
        o.LJIIIZ(getStoreIntensity, "$this$getStoreIntensity");
        o.LJIIIZ(filterIntensityStore, "filterIntensityStore");
        o.LJIIIZ(getter, "getter");
        return LJFF(getStoreIntensity, filterIntensityStore.LIZ(getStoreIntensity, getter), getter);
    }

    public static final int LIZLLL(FilterBean intensity2Progress, float f, InterfaceC122704ri getter) {
        int LJJIIZ;
        o.LJIIIZ(intensity2Progress, "$this$intensity2Progress");
        o.LJIIIZ(getter, "getter");
        float LIZIZ = LIZIZ(intensity2Progress, getter);
        if (LIZIZ == 1.0f) {
            return C78609UtB.LJJIIZ(O6R.LJJIIZ(f * 100), 0, 100);
        }
        if (LIZIZ <= 0.8f) {
            float f2 = f / (LIZIZ / 80);
            if (Float.isNaN(f2)) {
                LJJIIZ = 0;
            } else {
                LJJIIZ = O6R.LJJIIZ(f2);
            }
            return C78609UtB.LJJIIZ(LJJIIZ, 0, 100);
        }
        float f3 = 80;
        float f4 = LIZIZ / f3;
        float f5 = (1.0f - LIZIZ) / 20;
        if (f <= LIZIZ) {
            return C78609UtB.LJJIIZ(O6R.LJJIIZ(f / f4), 0, 100);
        }
        return C78609UtB.LJJIIZ(O6R.LJJIIZ(((f - LIZIZ) / f5) + f3), 0, 100);
    }

    public static final boolean LJ(FilterBean isSameFilterBean, int i, String category) {
        o.LJIIIZ(isSameFilterBean, "$this$isSameFilterBean");
        o.LJIIIZ(category, "category");
        if (isSameFilterBean.getId() == i && o.LJ(isSameFilterBean.getCategoryKey(), category)) {
            return true;
        }
        return false;
    }

    public static final float LJFF(FilterBean progress2Intensity, int i, InterfaceC122704ri getter) {
        double d;
        o.LJIIIZ(progress2Intensity, "$this$progress2Intensity");
        o.LJIIIZ(getter, "getter");
        float LIZIZ = LIZIZ(progress2Intensity, getter);
        if (LIZIZ == 1.0f) {
            d = i / 100.0d;
        } else if (LIZIZ <= 0.8f) {
            d = i * (LIZIZ / 80.0d);
        } else {
            double d2 = LIZIZ;
            double d3 = d2 / 80.0d;
            double d4 = (1.0d - d2) / 20.0d;
            if (i <= 80) {
                d = i * d3;
            } else {
                d = (d4 * (i - 80)) + d2;
            }
        }
        return (float) d;
    }
}
