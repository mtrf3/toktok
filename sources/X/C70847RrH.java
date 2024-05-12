package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.rss.api.RssApi;

/* renamed from: X.RrH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70847RrH extends AbstractC65781Prl implements InterfaceC65784Pro<RssApi> {
    public static final C70847RrH LJLIL = new C70847RrH();

    public C70847RrH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.rss.api.RssApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RssApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RssApi.class);
    }
}
