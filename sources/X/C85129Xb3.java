package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;

/* renamed from: X.Xb3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85129Xb3 implements R47 {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LIZ;
    public final /* synthetic */ EnumC85151XbP LIZIZ;
    public final /* synthetic */ User LIZJ;

    public C85129Xb3(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, EnumC85151XbP enumC85151XbP, User user) {
        this.LIZ = twoStepVerificationActivityViewModel;
        this.LIZIZ = enumC85151XbP;
        this.LIZJ = user;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        C85136XbA c85136XbA;
        int i3;
        if (i2 == 1) {
            java.util.Map<EnumC85151XbP, C85136XbA> map = this.LIZ.LJLJJL;
            EnumC85151XbP enumC85151XbP = this.LIZIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C85136XbA c85136XbA2 = (C85136XbA) linkedHashMap.get(enumC85151XbP);
            if (c85136XbA2 != null) {
                i3 = 0;
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, this.LIZJ.getBindPhone(), false, false, 54);
            } else {
                i3 = 0;
                c85136XbA = new C85136XbA(true, false, this.LIZIZ, this.LIZJ.getBindPhone(), false, false, 50);
            }
            linkedHashMap.put(enumC85151XbP, c85136XbA);
            TwoStepVerificationActivityViewModel.hv0(this.LIZ, Integer.valueOf(i3), null, 6);
        }
    }
}
