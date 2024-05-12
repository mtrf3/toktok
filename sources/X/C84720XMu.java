package X;

import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.api.UserSettingsApi;
import kotlin.jvm.internal.o;

/* renamed from: X.XMu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84720XMu extends AbstractC65781Prl implements InterfaceC65784Pro<UserSettingsApi.Api> {
    public static final C84720XMu LJLIL = new C84720XMu();

    public C84720XMu() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final UserSettingsApi.Api invoke() {
        UserSettingsApi.Api api;
        String str = AccountApiInModule.LIZ;
        InterfaceC789838c LJI = C79061V1d.LJI(str, "BASE_URL", str);
        if (LJI != null) {
            api = LJI.create(UserSettingsApi.Api.class);
        } else {
            api = null;
        }
        o.LJI(api);
        return api;
    }
}
