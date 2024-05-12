package X;

import Y.AfS20S1300000_1;
import Y.AfS41S0300000_1;
import Y.AfS50S0200000_1;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.donation.token.DonationSessionResponse;
import com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi;
import com.ss.android.ugc.aweme.donation.token.DonationTokenResponse;
import com.ss.android.ugc.aweme.donation.token.SessionCreationReq;

/* renamed from: X.3AP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AP {
    public static final IAccountService LIZ = AccountService.LJIJ();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(final Context context, final String str, final int i, final String str2, final String str3, final String str4, final DialogC111054Xl dialogC111054Xl, final InterfaceC88472Yns interfaceC88472Yns) {
        if (!LIZ.LJFF().isLogin()) {
            if (context instanceof Activity) {
                J9P.LIZIZ((Activity) context, "", "", null, new JJ4() { // from class: X.3AR
                    @Override // X.JJ4
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.JJ4
                    public final void LIZ() {
                        C3AP.LIZIZ(context, str, i, str2, str3, str4, dialogC111054Xl, interfaceC88472Yns);
                    }
                });
                return;
            } else {
                if (!(context instanceof Fragment)) {
                    return;
                }
                J9P.LIZJ((Fragment) context, "", "", null, new JJ4() { // from class: X.3AS
                    @Override // X.JJ4
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.JJ4
                    public final void LIZ() {
                        C3AP.LIZIZ(context, str, i, str2, str3, str4, dialogC111054Xl, interfaceC88472Yns);
                    }
                });
                return;
            }
        }
        LIZIZ(context, str, i, str2, str3, str4, dialogC111054Xl, interfaceC88472Yns);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.4Xl] */
    public static void LIZIZ(Context context, String str, int i, String str2, String str3, String str4, DialogC111054Xl dialogC111054Xl, InterfaceC88472Yns interfaceC88472Yns) {
        Long l;
        AbstractC73672Svk<DonationTokenResponse> abstractC73672Svk;
        Long l2;
        AbstractC73672Svk<DonationSessionResponse> createSession;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = dialogC111054Xl;
        if (context instanceof Activity) {
            if (dialogC111054Xl == 0) {
                c68322mC.element = new DialogC111054Xl(context);
            }
            V1B.LJLJJL((Dialog) c68322mC.element);
        }
        if (TextUtils.equals(str3, "PERCENT")) {
            if (i == 3) {
                DonationTokenCreateApi.LIZ.getClass();
                createSession = C3AQ.LIZIZ().createSession(new SessionCreationReq(str2, Integer.valueOf(i), 0L, str, str4));
            } else {
                DonationTokenCreateApi.LIZ.getClass();
                DonationTokenCreateApi LIZIZ = C3AQ.LIZIZ();
                Integer valueOf = Integer.valueOf(i);
                if (str != null) {
                    l2 = Long.valueOf(CastLongProtector.parseLong(str));
                } else {
                    l2 = null;
                }
                createSession = LIZIZ.createSession(new SessionCreationReq(str2, valueOf, l2, null, str4));
            }
            createSession.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS41S0300000_1(c68322mC, interfaceC88472Yns, context, 1), new AfS50S0200000_1(context, c68322mC, 8));
            return;
        }
        if (i == 3) {
            DonationTokenCreateApi.LIZ.getClass();
            abstractC73672Svk = C3AQ.LIZ().tokenCreate(i, 0L, str, str4);
        } else {
            DonationTokenCreateApi.LIZ.getClass();
            DonationTokenCreateApi LIZ2 = C3AQ.LIZ();
            if (str != null) {
                l = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                l = null;
            }
            abstractC73672Svk = LIZ2.tokenCreate(i, l, null, str4);
        }
        abstractC73672Svk.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS20S1300000_1(c68322mC, interfaceC88472Yns, context, str2, 1), new AfS50S0200000_1(context, c68322mC, 9));
    }
}
