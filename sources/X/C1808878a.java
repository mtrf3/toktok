package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.comment.api.CommentPinAPI;

/* renamed from: X.78a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1808878a {
    public static final CommentPinAPI LIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (CommentPinAPI) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, CommentPinAPI.class);
    }
}
