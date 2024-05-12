package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ARr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26243ARr implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("paid_content_detail_video_list_vm_key");
        LIZ.append(param.getExtra().get("paid_content_session_id"));
        return new OSZ<>(X1D.LIZIZ(LIZ), PaidContentDetailVideoListViewModel.class);
    }
}
