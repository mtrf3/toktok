package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountUserSettingsApi;

/* renamed from: X.9a7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C239199a7 extends AbstractC65781Prl implements InterfaceC65784Pro<PrivateAccountUserSettingsApi> {
    public static final C239199a7 LJLIL = new C239199a7();

    public C239199a7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountUserSettingsApi] */
    @Override // X.InterfaceC65784Pro
    public final PrivateAccountUserSettingsApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(PrivateAccountUserSettingsApi.class);
    }
}
