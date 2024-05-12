package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditApi;

/* renamed from: X.XhB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85509XhB {
    public static CreatorCaptionEditApi.ICreatorCaptionEditApi LIZ() {
        CreatorCaptionEditApi.ICreatorCaptionEditApi iCreatorCaptionEditApi = CreatorCaptionEditApi.LIZIZ;
        if (iCreatorCaptionEditApi != null) {
            return iCreatorCaptionEditApi;
        }
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        CreatorCaptionEditApi.ICreatorCaptionEditApi iCreatorCaptionEditApi2 = (CreatorCaptionEditApi.ICreatorCaptionEditApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, CreatorCaptionEditApi.ICreatorCaptionEditApi.class);
        CreatorCaptionEditApi.LIZIZ = iCreatorCaptionEditApi2;
        return iCreatorCaptionEditApi2;
    }
}
