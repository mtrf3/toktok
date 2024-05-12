package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.api.IAppWidgetApi;

/* renamed from: X.E8a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35924E8a extends AbstractC65781Prl implements InterfaceC65784Pro<IAppWidgetApi> {
    public static final C35924E8a LJLIL = new C35924E8a();

    public C35924E8a() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.api.IAppWidgetApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IAppWidgetApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IAppWidgetApi.class);
    }
}
