package X;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.router.ECSearchRouterInterceptor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class KBY extends AbstractC65781Prl implements InterfaceC65784Pro<List<IInterceptor>> {
    public static final KBY LJLIL = new KBY();

    public KBY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<IInterceptor> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ECSearchRouterInterceptor());
        return arrayList;
    }
}
