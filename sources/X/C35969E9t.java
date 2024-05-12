package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.follow.widget.api.IFollowWidgetApi;

/* renamed from: X.E9t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35969E9t extends AbstractC65781Prl implements InterfaceC65784Pro<IFollowWidgetApi> {
    public static final C35969E9t LJLIL = new C35969E9t();

    public C35969E9t() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.follow.widget.api.IFollowWidgetApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IFollowWidgetApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IFollowWidgetApi.class);
    }
}
