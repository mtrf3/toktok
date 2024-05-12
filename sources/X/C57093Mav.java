package X;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.router.ECInfluencerRouterInterceptor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mav, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57093Mav extends AbstractC65781Prl implements InterfaceC65784Pro<List<IInterceptor>> {
    public static final C57093Mav LJLIL = new C57093Mav();

    public C57093Mav() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<IInterceptor> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ECInfluencerRouterInterceptor());
        return arrayList;
    }
}
