package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.api.FeedEcCardApi;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.repository.bean.RecImpressRequest;
import java.util.List;

/* renamed from: X.ECs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36046ECs implements InterfaceC88763e4 {
    public static final Object LJJJIL(String str, String str2, List<RecImpressRequest.RecImpressItem> list, RecImpressRequest.RecSessionInfo recSessionInfo, InterfaceC67352kd<? super C64797Pbt<Response<Object>>> interfaceC67352kd) {
        FeedEcCardApi.LIZ.getClass();
        return ((FeedEcCardApi) C36050ECw.LIZIZ.getValue()).reportRecProductImpress(new RecImpressRequest(str, str2, list, recSessionInfo), interfaceC67352kd);
    }
}
