package X;

import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.poi.detail.discovery.video.PoiDetailDiscoveryCategoryAwemeListSharedViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8TJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TJ implements IDetailPageShareVMService {
    public static final C8TJ LIZ = new C8TJ();

    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("poi_detail_discovery", new C7U3() { // from class: X.8TK
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("aweme - shareVMMAP generate - poiId: ");
                LIZ2.append(param.getPagePoiId());
                LIZ2.append(", tabCode: ");
                LIZ2.append(param.getExtra().get("tab_code"));
                LIZ2.append(", key: poi_detail_discovery:id=");
                LIZ2.append(param.getPagePoiId());
                LIZ2.append("&tab_code=");
                LIZ2.append(param.getExtra().get("tab_code"));
                C188447aS.LIZ(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("poi_detail_discovery:id=");
                LIZ3.append(param.getPagePoiId());
                LIZ3.append("&tab_code=");
                LIZ3.append(param.getExtra().get("tab_code"));
                return new OSZ<>(X1D.LIZIZ(LIZ3), PoiDetailDiscoveryCategoryAwemeListSharedViewModel.class);
            }
        });
        return hashMap;
    }
}
