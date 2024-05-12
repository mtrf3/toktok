package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi;

/* renamed from: X.A6g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25686A6g extends AbstractC65781Prl implements InterfaceC65784Pro<CreatorPlusApi.InterfaceC0026CreatorPlusApi> {
    public static final C25686A6g LJLIL = new C25686A6g();

    public C25686A6g() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorPlusApi$CreatorPlusApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final CreatorPlusApi.InterfaceC0026CreatorPlusApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, CreatorPlusApi.InterfaceC0026CreatorPlusApi.class);
    }
}
