package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi;

/* renamed from: X.3AQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AQ {
    public static final /* synthetic */ C3AQ LIZ = new C3AQ();

    public static DonationTokenCreateApi LIZ() {
        String str;
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        if (C85990Xow.LJIIIZ()) {
            str = "https://webcast.tiktokv.com";
        } else {
            str = "https://webcast-va.tiktokv.com";
        }
        return (DonationTokenCreateApi) LIZLLL.LIZ(str).LJFF().LIZ.LIZ(DonationTokenCreateApi.class);
    }

    public static DonationTokenCreateApi LIZIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (DonationTokenCreateApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(DonationTokenCreateApi.class);
    }
}
