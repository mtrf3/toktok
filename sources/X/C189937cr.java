package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.PoiDetailInfoAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiHeaderContainerAssem;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryAssem;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem;
import com.ss.android.ugc.aweme.poi.detail.ymal.PoiDetailYmalAssemV2;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7cr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189937cr extends AbstractC65781Prl implements InterfaceC88472Yns<C8VL, C76800UCe> {
    public static final C189937cr LJLIL = new C189937cr();

    public C189937cr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C8VL c8vl) {
        List LJJIJIL;
        C8VL c8vl2 = c8vl;
        o.LJIIIZ(c8vl2, "$this$null");
        c8vl2.LIZ = C65352Pkq.LIZ(PoiHeaderContainerAssem.class);
        java.util.Map<String, Integer> map = PoiHeaderContainerAssem.LJLLI;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        int size = arrayList.size();
        C189957ct.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIJ(31744, 0, "poi_ymal_show", false) == 0) {
            LJJIJIL = C47261Igj.LJJIJIL(C65352Pkq.LIZ(PoiDetailInfoAssem.class));
        } else {
            LJJIJIL = C47261Igj.LJJIJIL(C65352Pkq.LIZ(PoiDetailInfoAssem.class), C65352Pkq.LIZ(PoiDetailYmalAssemV2.class));
        }
        Integer num = PoiServerConfigSettings.LIZ().regionPoiDiscovery;
        if (num != null && num.intValue() > 0) {
            LJJIJIL.add(C65352Pkq.LIZ(PoiDetailDiscoveryAssem.class));
        }
        C189947cs.LIZ.getClass();
        if (C189947cs.LIZ()) {
            LJJIJIL.add(C65352Pkq.LIZ(PoiDetailReviewsAssem.class));
        }
        int min = Math.min(size, LJJIJIL.size());
        for (int i = 0; i < min; i++) {
            c8vl2.LJI((String) ListProtector.get(arrayList, i), new AqS93S0101000_3(LJJIJIL, (List<? extends Aweme>) i, 8));
        }
        return C76800UCe.LIZ;
    }
}
