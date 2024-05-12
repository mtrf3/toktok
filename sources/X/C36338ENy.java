package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.qnasearch.api.QnaSearchApiV2;

/* renamed from: X.ENy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36338ENy extends AbstractC65781Prl implements InterfaceC65784Pro<QnaSearchApiV2> {
    public static final C36338ENy LJLIL = new C36338ENy();

    public C36338ENy() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.qnasearch.api.QnaSearchApiV2] */
    @Override // X.InterfaceC65784Pro
    public final QnaSearchApiV2 invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZIZ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_API", LIZLLL, str).LIZ.LIZ(QnaSearchApiV2.class);
    }
}
