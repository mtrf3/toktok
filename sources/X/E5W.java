package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.legoImp.task.observer_task.CohortSubscriptionObserver;

/* loaded from: classes7.dex */
public final class E5W extends AbstractC65781Prl implements InterfaceC65784Pro<CohortSubscriptionObserver.CohortSubscriptionApi> {
    public static final E5W LJLIL = new E5W();

    public E5W() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.legoImp.task.observer_task.CohortSubscriptionObserver$CohortSubscriptionApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final CohortSubscriptionObserver.CohortSubscriptionApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, CohortSubscriptionObserver.CohortSubscriptionApi.class);
    }
}
