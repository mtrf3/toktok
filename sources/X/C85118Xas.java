package X;

import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS146S0200000_15;
import ujb.o;

/* renamed from: X.Xas, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85118Xas<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ EnumC85151XbP LIZLLL;

    public C85118Xas(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, String str, String str2, EnumC85151XbP enumC85151XbP) {
        this.LIZ = twoStepVerificationActivityViewModel;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = enumC85151XbP;
    }

    @Override // X.C10I
    public final Object then(C10K<AddVerificationResponse> c10k) {
        Integer num;
        String str;
        C85136XbA c85136XbA;
        if (!C82544WaS.LJ(c10k)) {
            TwoStepVerificationActivityViewModel.hv0(this.LIZ, null, null, 7);
            return null;
        }
        AddVerificationResponse LJIIJJI = c10k.LJIIJJI();
        if (!o.LJJJJIZL("success", LJIIJJI.getMessage(), true) || LJIIJJI.getData() == null) {
            AddVerificationResponse.Data data = LJIIJJI.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AddVerificationResponse.Data data2 = LJIIJJI.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            if (num == null || num.intValue() != 1356) {
                TwoStepVerificationActivityViewModel.hv0(this.LIZ, num, str, 4);
            } else {
                this.LIZ.Hv0("", new AqS146S0200000_15(this.LIZ, this.LIZLLL, 15));
            }
            return null;
        }
        if (kotlin.jvm.internal.o.LJ(this.LIZIZ, "totp_verify")) {
            java.util.Map<EnumC85151XbP, C85136XbA> map = this.LIZ.LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.TOTP;
            C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
            if (c85136XbA2 != null) {
                c85136XbA = C85136XbA.LIZ(c85136XbA2, false, false, null, false, false, 62);
            } else {
                c85136XbA = new C85136XbA(false, false, enumC85151XbP, null, false, false, 58);
            }
            map.put(enumC85151XbP, c85136XbA);
        }
        C85144XbI.LJIILIIL("remove", this.LIZ.getEnterFrom(), this.LIZJ, kotlin.jvm.internal.o.LJ(this.LIZIZ, "mobile_sms_verify"), kotlin.jvm.internal.o.LJ(this.LIZIZ, "email_verify"), kotlin.jvm.internal.o.LJ(this.LIZIZ, "pwd_verify"), kotlin.jvm.internal.o.LJ(this.LIZIZ, "totp_verify"));
        this.LIZ.zv0(LJIIJJI);
        return C76800UCe.LIZ;
    }
}
