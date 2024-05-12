package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;
import kotlin.jvm.internal.o;

/* renamed from: X.ARq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26242ARq implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offline_mode_video_list_vm_key");
        LIZ.append(OfflineModeListVM.LJLJI);
        return new OSZ<>(X1D.LIZIZ(LIZ), OfflineModeListVM.class);
    }
}
