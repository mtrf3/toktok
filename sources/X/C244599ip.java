package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.music.api.highlight.HighlightApi;

/* renamed from: X.9ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244599ip {
    public static HighlightApi.HighlightOperatorApi LIZ() {
        HighlightApi.HighlightOperatorApi highlightOperatorApi = HighlightApi.LIZ;
        if (highlightOperatorApi != null) {
            return highlightOperatorApi;
        }
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        HighlightApi.HighlightOperatorApi highlightOperatorApi2 = (HighlightApi.HighlightOperatorApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, HighlightApi.HighlightOperatorApi.class);
        HighlightApi.LIZ = highlightOperatorApi2;
        return highlightOperatorApi2;
    }
}
