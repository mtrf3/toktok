package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.jvm.internal.o;

/* renamed from: X.EpB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37593EpB extends AbstractC37552EoW {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Integer num;
        o.LJIIIZ(type, "type");
        java.util.Map<String, Object> loadMoreParams = ((InterfaceC37554EoY) xBaseParamModel).getLoadMoreParams();
        Object obj = loadMoreParams.get("cursor");
        View view = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            view = interfaceC38263Ezz.getView();
        }
        IEcomSearchService LJJIJL = C63081OpJ.LJJIJL();
        if (view != null) {
            C78565UsT.LJJIJLIJ(view, new C38344F3c(loadMoreParams, num, LJJIJL, view, this, c37356ElM, null));
        }
    }
}
