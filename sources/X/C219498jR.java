package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionApi;

/* renamed from: X.8jR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219498jR extends AbstractC65781Prl implements InterfaceC65784Pro<AddYoursCollectionApi> {
    public static final C219498jR LJLIL = new C219498jR();

    public C219498jR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AddYoursCollectionApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AddYoursCollectionApi.class);
    }
}
