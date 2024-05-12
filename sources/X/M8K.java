package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8K implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("search_edm_video_detail_vm");
        LIZ.append(param.getActivityId());
        return new OSZ<>(X1D.LIZIZ(LIZ), SearchEDMVideoDetailSharedVM.class);
    }
}
