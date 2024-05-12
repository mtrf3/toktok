package X;

import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiVideoListSharedViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7eD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190777eD implements IDetailPageShareVMService {
    public static final C190777eD LIZ = new C190777eD();

    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, C7U3> LIZ() {
        HashMap<String, C7U3> hashMap = new HashMap<>();
        hashMap.put("POI_VIDEO_LIST_ENTRANCE", new C7U3() { // from class: X.7eC
            @Override // X.C7U3
            public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
                o.LJIIIZ(param, "param");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("poi_video_list:id=");
                LIZ2.append(param.getPagePoiId());
                LIZ2.append(":fragmentid=");
                LIZ2.append(param.getExtra().get("fragment_id"));
                return new OSZ<>(X1D.LIZIZ(LIZ2), PoiVideoListSharedViewModel.class);
            }
        });
        return hashMap;
    }
}
