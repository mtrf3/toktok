package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.business.privateaccount.publishconfirm.PolicyApi;

/* renamed from: X.On9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62947On9 extends AbstractC65781Prl implements InterfaceC65784Pro<PolicyApi.PolicyService> {
    public static final C62947On9 LJLIL = new C62947On9();

    public C62947On9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.compliance.business.privateaccount.publishconfirm.PolicyApi$PolicyService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PolicyApi.PolicyService invoke() {
        return RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(PolicyApi.PolicyService.class);
    }
}
