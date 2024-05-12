package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.AnchorLinkValidateApi;

/* renamed from: X.9V0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9V0 {
    public static final /* synthetic */ C9V0 LIZ = new C9V0();

    public static AnchorLinkValidateApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (AnchorLinkValidateApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(AnchorLinkValidateApi.class);
    }
}
