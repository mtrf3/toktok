package X;

import com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.Omf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62917Omf extends AbstractC65781Prl implements InterfaceC65784Pro<ComplianceApi> {
    public static final C62917Omf LJLIL = new C62917Omf();

    public C62917Omf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi] */
    @Override // X.InterfaceC65784Pro
    public final ComplianceApi invoke() {
        ComplianceApi.LIZ.getClass();
        ?? create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(ComplianceApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…omplianceApi::class.java)");
        return create;
    }
}
