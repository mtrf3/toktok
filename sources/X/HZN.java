package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.services.IAVFilterService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZN implements IAVFilterService {
    @Override // com.ss.android.ugc.aweme.services.IAVFilterService
    public final String getFilterFolder(FilterBean filterBean) {
        o.LJIIIZ(filterBean, "filterBean");
        String filterFolder = filterBean.getFilterFolder();
        o.LJIIIIZZ(filterFolder, "filterBean.filterFolder");
        return filterFolder;
    }

    @Override // com.ss.android.ugc.aweme.services.IAVFilterService
    public final void setFilterFolder(FilterBean filterBean, String string) {
        o.LJIIIZ(filterBean, "filterBean");
        o.LJIIIZ(string, "string");
        filterBean.setFilterFolder(string);
    }
}
