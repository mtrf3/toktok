package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Xaw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85122Xaw implements R47 {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LIZ;
    public final /* synthetic */ EnumC85151XbP LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ List<String> LJFF;
    public final /* synthetic */ int LJI;

    public C85122Xaw(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, EnumC85151XbP enumC85151XbP, boolean z, String str, String str2, List<String> list, int i) {
        this.LIZ = twoStepVerificationActivityViewModel;
        this.LIZIZ = enumC85151XbP;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = list;
        this.LJI = i;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        C85136XbA c85136XbA;
        BaseBundle baseBundle;
        String str = null;
        if (i2 == 1) {
            if ((obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null) {
                str = baseBundle.getString("bound_email");
            }
            java.util.Map<EnumC85151XbP, C85136XbA> map = this.LIZ.LJLJJL;
            EnumC85151XbP enumC85151XbP = this.LIZIZ;
            C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
            if (c85136XbA2 != null) {
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, str, false, false, 54);
            } else {
                c85136XbA = new C85136XbA(true, false, this.LIZIZ, str, false, false, 50);
            }
            map.put(enumC85151XbP, c85136XbA);
            this.LIZ.gv0(this.LJFF, this.LIZLLL, this.LJ, this.LJI, this.LIZJ);
            return;
        }
        TwoStepVerificationActivityViewModel.hv0(this.LIZ, 0, null, 6);
    }
}
