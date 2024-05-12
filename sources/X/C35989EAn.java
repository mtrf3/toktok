package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.following.repository.RelationSearchApi;

/* renamed from: X.EAn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35989EAn extends AbstractC65781Prl implements InterfaceC65784Pro<RelationSearchApi> {
    public static final C35989EAn LJLIL = new C35989EAn();

    public C35989EAn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.following.repository.RelationSearchApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RelationSearchApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RelationSearchApi.class);
    }
}
