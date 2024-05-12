package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfigExtra;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Hfr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44659Hfr {
    public static final HashMap<Integer, Boolean> LIZ = new HashMap<>();
    public static final HashMap<Integer, FilterConfig> LIZIZ = new HashMap<>();
    public static Gson LIZJ = new Gson();

    public static final FilterConfig LIZ(FilterBean extractFilterConfig) {
        boolean z;
        FilterConfigExtra filterConfigExtra;
        String filterconfig;
        o.LJIIIZ(extractFilterConfig, "$this$extractFilterConfig");
        HashMap<Integer, FilterConfig> hashMap = LIZIZ;
        FilterConfig filterConfig = hashMap.get(Integer.valueOf(extractFilterConfig.getId()));
        if (filterConfig != null) {
            return filterConfig;
        }
        String extra = extractFilterConfig.getExtra();
        if (extra == null || ujb.o.LJJJJJL(extra)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            if (LIZJ == null) {
                LIZJ = new Gson();
            }
            Gson gson = LIZJ;
            if (gson != null && (filterConfigExtra = (FilterConfigExtra) gson.LJI(extra, FilterConfigExtra.class)) != null && (filterconfig = filterConfigExtra.getFilterconfig()) != null) {
                FilterConfig filterConfig2 = (FilterConfig) gson.LJI(filterconfig, FilterConfig.class);
                Integer valueOf = Integer.valueOf(extractFilterConfig.getId());
                o.LJIIIIZZ(filterConfig2, "filterConfig");
                hashMap.put(valueOf, filterConfig2);
                return filterConfig2;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final String LIZJ(FilterBean getComposerTag) {
        List<FilterConfig.FilterConfigItem> items;
        o.LJIIIZ(getComposerTag, "$this$getComposerTag");
        FilterConfig LIZ2 = LIZ(getComposerTag);
        if (LIZ2 != null && (items = LIZ2.getItems()) != null && (!items.isEmpty())) {
            return ((FilterConfig.FilterConfigItem) ListProtector.get(items, 0)).getTag();
        }
        return "Filter_intensity";
    }

    public static final float LIZLLL(FilterBean getDefaultIntensity) {
        List<FilterConfig.FilterConfigItem> items;
        FilterConfig.FilterConfigItem filterConfigItem;
        int max;
        o.LJIIIZ(getDefaultIntensity, "$this$getDefaultIntensity");
        FilterConfig LIZ2 = LIZ(getDefaultIntensity);
        if (LIZ2 == null || (items = LIZ2.getItems()) == null || (filterConfigItem = (FilterConfig.FilterConfigItem) ORZ.LJLLLL(items)) == null || (max = filterConfigItem.getMax() - filterConfigItem.getMin()) == 0) {
            return 0.0f;
        }
        return filterConfigItem.getValue() / max;
    }

    public static final boolean LJ(FilterBean isComposer) {
        o.LJIIIZ(isComposer, "$this$isComposer");
        HashMap<Integer, Boolean> hashMap = LIZ;
        Boolean bool = hashMap.get(Integer.valueOf(isComposer.getId()));
        if (bool != null) {
            return bool.booleanValue();
        }
        String filterFolder = isComposer.getFilterFolder();
        if (filterFolder != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(filterFolder, "config.json"));
                try {
                    boolean has = new JSONObject(C44687HgJ.LJIIJ(fileInputStream)).has("effect");
                    hashMap.put(Integer.valueOf(isComposer.getId()), Boolean.valueOf(has));
                    AnonymousClass636.LJFF(fileInputStream, null);
                    return has;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static final String LIZIZ(FilterBean generateNodePathWithIntensity, float f) {
        o.LJIIIZ(generateNodePathWithIntensity, "$this$generateNodePathWithIntensity");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(generateNodePathWithIntensity.getFilterFolder());
        LIZ2.append(':');
        LIZ2.append(LIZJ(generateNodePathWithIntensity));
        LIZ2.append(':');
        LIZ2.append(f);
        return X1D.LIZIZ(LIZ2);
    }
}
