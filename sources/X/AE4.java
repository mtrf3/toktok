package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.creatortools.InboxCreatorApi;

/* loaded from: classes5.dex */
public final class AE4 {
    public static final /* synthetic */ AE4 LIZ = new AE4();
    public static final InboxCreatorApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (InboxCreatorApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, InboxCreatorApi.class);
    }
}
