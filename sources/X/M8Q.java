package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8Q implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        return new OSZ<>("inbox_skylight_list_vm", SkylightListViewModel.class);
    }
}
