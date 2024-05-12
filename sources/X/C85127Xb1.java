package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Xb1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85127Xb1 implements R47 {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LIZ;
    public final /* synthetic */ EnumC85151XbP LIZIZ;
    public final /* synthetic */ User LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ List<String> LJI;
    public final /* synthetic */ int LJII;

    public C85127Xb1(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, EnumC85151XbP enumC85151XbP, User user, boolean z, String str, String str2, List<String> list, int i) {
        this.LIZ = twoStepVerificationActivityViewModel;
        this.LIZIZ = enumC85151XbP;
        this.LIZJ = user;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = list;
        this.LJII = i;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        C85136XbA c85136XbA;
        String str = null;
        if (i2 == 1) {
            java.util.Map<EnumC85151XbP, C85136XbA> map = this.LIZ.LJLJJL;
            EnumC85151XbP enumC85151XbP = this.LIZIZ;
            C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
            if (c85136XbA2 != null) {
                User user = this.LIZJ;
                if (user != null) {
                    str = user.getEmail();
                }
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, str, false, false, 54);
            } else {
                User user2 = this.LIZJ;
                if (user2 != null) {
                    str = user2.getEmail();
                }
                c85136XbA = new C85136XbA(true, false, this.LIZIZ, str, false, false, 50);
            }
            map.put(enumC85151XbP, c85136XbA);
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = this.LIZ;
            boolean z = this.LIZLLL;
            twoStepVerificationActivityViewModel.gv0(this.LJI, this.LJ, this.LJFF, this.LJII, z);
            return;
        }
        TwoStepVerificationActivityViewModel.hv0(this.LIZ, 0, null, 6);
    }
}
