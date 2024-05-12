package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.result.common.core.repo.EcSearchApi;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchApi;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KHG extends AbstractC65781Prl implements InterfaceC65784Pro<PhotoSearchApi> {
    public static final KHG LJLIL = new KHG();

    public KHG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.vision.repo.PhotoSearchApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PhotoSearchApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EcSearchApi.LIZ;
        o.LJIIIIZZ(str, "EcSearchApi.SEARCH_HOST");
        C65087PgZ LIZ = LIZLLL.LIZ(str);
        LIZ.LIZ(new C65150Pha());
        return LIZ.LJFF().LIZ.LIZ(PhotoSearchApi.class);
    }
}
