package X;

import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M8M implements C7U3 {
    @Override // X.C7U3
    public final OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ(M89 param) {
        o.LJIIIZ(param, "param");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("search_separate_tab_vm");
        LIZ.append(param.getActivityId());
        return new OSZ<>(X1D.LIZIZ(LIZ), SearchSeparateTabHorizontalVM.class);
    }
}
