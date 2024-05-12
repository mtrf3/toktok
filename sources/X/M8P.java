package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightMediaListViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8P implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        return new OSZ<>("inbox_skylight_media_list_vm", SkylightMediaListViewModel.class);
    }
}
