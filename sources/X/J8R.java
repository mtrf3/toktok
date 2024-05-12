package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.kids.homepage.compliance.ComplianceApi;

/* loaded from: classes9.dex */
public final class J8R extends AbstractC65781Prl implements InterfaceC65784Pro<ComplianceApi> {
    public static final J8R LJLIL = new J8R();

    public J8R() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.kids.homepage.compliance.ComplianceApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ComplianceApi invoke() {
        ComplianceApi.LIZ.getClass();
        return RetrofitFactory.LIZLLL().LIZ(AFI.LIZ).LJFF().LIZ.LIZ(ComplianceApi.class);
    }
}
