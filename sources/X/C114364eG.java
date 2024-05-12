package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.now.net.INowWidgetApi;

/* renamed from: X.4eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114364eG extends AbstractC65781Prl implements InterfaceC65784Pro<INowWidgetApi> {
    public static final C114364eG LJLIL = new C114364eG();

    public C114364eG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.now.net.INowWidgetApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final INowWidgetApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZLLL;
        return C770830u.LIZJ(str, "API_URL_WIDGET_PREFIX_API", LIZLLL, str).LIZ.LIZ(INowWidgetApi.class);
    }
}
