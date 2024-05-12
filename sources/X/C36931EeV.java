package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateApi;

/* renamed from: X.EeV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36931EeV extends AbstractC65781Prl implements InterfaceC65784Pro<LiveStateApi> {
    public static final C36931EeV LJLIL = new C36931EeV();

    public C36931EeV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.live.feedpage.LiveStateApi] */
    @Override // X.InterfaceC65784Pro
    public final LiveStateApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(Live.getLiveDomain());
        return LIZLLL.create(X1D.LIZIZ(LIZ)).create(LiveStateApi.class);
    }
}
