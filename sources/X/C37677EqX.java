package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.PdpPreviewServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EqX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37677EqX extends AbstractC37675EqV {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        ArrayList arrayList;
        InterfaceC37676EqW interfaceC37676EqW = (InterfaceC37676EqW) xBaseParamModel;
        o.LJIIIZ(type, "type");
        List<Number> trafficSourceList = interfaceC37676EqW.getTrafficSourceList();
        if (trafficSourceList != null) {
            arrayList = new ArrayList();
            for (Number number : trafficSourceList) {
                if (number instanceof Integer) {
                    arrayList.add(number);
                }
            }
        } else {
            arrayList = null;
        }
        PdpPreviewServiceImpl.LIZJ().LIZ(interfaceC37676EqW.getPdpTemplate(), interfaceC37676EqW.getSourcePageType(), interfaceC37676EqW.getProductIdList(), arrayList);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(EX5.class, null), "");
    }
}
