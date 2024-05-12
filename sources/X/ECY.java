package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;

/* loaded from: classes7.dex */
public final class ECY {
    public static final /* synthetic */ ECY LIZ = new ECY();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(ECZ.LJLIL);

    public static QnaApiV2 LIZIZ() {
        return (QnaApiV2) LIZIZ.getValue();
    }

    public static QnaApiV2 LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (QnaApiV2) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(QnaApiV2.class);
    }
}
