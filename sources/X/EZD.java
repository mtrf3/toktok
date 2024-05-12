package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EZD implements IHostNetworkDepend {
    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final java.util.Map<String, Object> getAPIParams() {
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, true);
        return hashMap;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final XIRetrofit createRetrofit(String baseUrl, boolean z) {
        InterfaceC789838c create;
        o.LJIIIZ(baseUrl, "baseUrl");
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        if (LIZLLL != null && (create = LIZLLL.create(baseUrl)) != null) {
            return new EZE(create);
        }
        return null;
    }
}
