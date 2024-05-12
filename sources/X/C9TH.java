package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI;

/* renamed from: X.9TH, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9TH extends AbstractC65781Prl implements InterfaceC65784Pro<ChooseReasonAPI.RealAPI> {
    public static final C9TH LJLIL = new C9TH();

    public C9TH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.share.dislike.ChooseReasonAPI$RealAPI] */
    @Override // X.InterfaceC65784Pro
    public final ChooseReasonAPI.RealAPI invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(ChooseReasonAPI.RealAPI.class);
    }
}
