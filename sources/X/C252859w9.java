package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.account.login.v2.network.GetShowEmailConsentApi;
import com.ss.android.ugc.aweme.account.login.v2.network.UploadEmailConsentRejectApi;

/* renamed from: X.9w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252859w9 {
    public static final GetShowEmailConsentApi LIZ;
    public static final UploadEmailConsentRejectApi LIZIZ;

    public static C73454SsE LIZ() {
        return LIZ.shouldShowEmailConsentAgreement().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    public static void LIZIZ() {
        LIZIZ.uploadEmailConsentRejectApi().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9wA
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.9wB
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZ = (GetShowEmailConsentApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, GetShowEmailConsentApi.class);
        LIZIZ = (UploadEmailConsentRejectApi) RetrofitFactory.LIZLLL().create(str).create(UploadEmailConsentRejectApi.class);
    }
}
