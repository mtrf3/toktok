package X;

import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import kotlin.jvm.internal.o;

/* renamed from: X.XMv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84721XMv extends AbstractC65781Prl implements InterfaceC65784Pro<TwoStepAuthApi.Api> {
    public static final C84721XMv LJLIL = new C84721XMv();

    public C84721XMv() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final TwoStepAuthApi.Api invoke() {
        TwoStepAuthApi.Api api;
        String str = AccountApiInModule.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "BASE_URL", str);
        if (LJI != null) {
            api = LJI.create(TwoStepAuthApi.Api.class);
        } else {
            api = null;
        }
        o.LJI(api);
        return api;
    }
}
