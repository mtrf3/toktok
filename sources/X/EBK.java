package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeApi;

/* loaded from: classes7.dex */
public final class EBK extends AbstractC65781Prl implements InterfaceC65784Pro<EditProfileBadgeApi.Api> {
    public static final EBK LJLIL = new EBK();

    public EBK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.badge.EditProfileBadgeApi$Api, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EditProfileBadgeApi.Api invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, EditProfileBadgeApi.Api.class);
    }
}
