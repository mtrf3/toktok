package X;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.ECommerceHybridServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.router.ECMallRouterInterceptor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class LIS extends AbstractC65781Prl implements InterfaceC65784Pro<List<IInterceptor>> {
    public static final LIS LJLIL = new LIS();

    public LIS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<IInterceptor> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ECMallRouterInterceptor());
        arrayList.addAll(ECommerceHybridServiceImpl.LJIIIIZZ().LJ());
        return arrayList;
    }
}
