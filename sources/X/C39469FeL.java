package X;

import android.view.View;
import com.bytedance.ies.ugc.statisticlogger.btm.BTMTrackerServiceImpl;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.ab.ECommerceArchServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FeL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39469FeL extends AbstractC39470FeM {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        View view;
        String str;
        String str2 = "";
        InterfaceC39471FeN interfaceC39471FeN = (InterfaceC39471FeN) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            java.util.Map<String, Object> params = interfaceC39471FeN.getParams();
            if (!ECommerceArchServiceImpl.LIZIZ().LIZ()) {
                C31626Cb8.LIZ(c37356ElM, 0, "btm ability does not enable", 4);
                return;
            }
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            String str3 = null;
            if (interfaceC38263Ezz != null) {
                view = interfaceC38263Ezz.getView();
            } else {
                view = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                Object value = entry.getValue();
                if ((value instanceof String) && (str = (String) value) != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            if (C78685UuP.LJJJZ((String) linkedHashMap.get("search_id"))) {
                SearchServiceImpl.LLLZI().LLIIIJ((String) linkedHashMap.get("search_id"));
            }
            if (view != null) {
                C39468FeK.LJIIJJI(linkedHashMap, view);
                InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
                if (interfaceC38263Ezz2 != null) {
                    str3 = interfaceC38263Ezz2.LIZIZ();
                }
                XBaseModel LIZJ = ED5.LIZJ(InterfaceC39472FeO.class, str3);
                ((InterfaceC39472FeO) LIZJ).setPageData(BTMTrackerServiceImpl.LJFF().LIZLLL(view));
                c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
                return;
            }
            C31626Cb8.LIZ(c37356ElM, 0, "can not find attached view", 4);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            C31626Cb8.LIZ(c37356ElM, 0, str2, 4);
        }
    }
}
