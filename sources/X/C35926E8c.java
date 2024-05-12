package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.story.api.IStoryWidgetApi;

/* renamed from: X.E8c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35926E8c extends AbstractC65781Prl implements InterfaceC65784Pro<IStoryWidgetApi> {
    public static final C35926E8c LJLIL = new C35926E8c();

    public C35926E8c() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.story.api.IStoryWidgetApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IStoryWidgetApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(IStoryWidgetApi.class);
    }
}
