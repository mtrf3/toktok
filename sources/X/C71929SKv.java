package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi;

/* renamed from: X.SKv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71929SKv extends AbstractC65781Prl implements InterfaceC65784Pro<UserSetSettingApi> {
    public static final C71929SKv LJLIL = new C71929SKv();

    public C71929SKv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final UserSetSettingApi invoke() {
        return RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(UserSetSettingApi.class);
    }
}
