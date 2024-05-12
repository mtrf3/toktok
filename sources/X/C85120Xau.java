package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS462S0100000_15;

/* renamed from: X.Xau, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85120Xau implements R47 {
    public final /* synthetic */ TwoStepVerificationActivityViewModel LIZ;
    public final /* synthetic */ List<String> LIZIZ;
    public final /* synthetic */ InterfaceC88475Ynv<Boolean, String, String, List<String>, Integer, C76800UCe> LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ int LJI;

    public C85120Xau(int i, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, String str, String str2, List list, IDqS462S0100000_15 iDqS462S0100000_15, boolean z) {
        this.LIZ = twoStepVerificationActivityViewModel;
        this.LIZIZ = list;
        this.LIZJ = iDqS462S0100000_15;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = i;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        RC1 rc1;
        C85136XbA c85136XbA;
        if (i2 == 1) {
            String str = null;
            if (obj instanceof RC1) {
                rc1 = (RC1) obj;
            } else {
                rc1 = null;
            }
            java.util.Map<EnumC85151XbP, C85136XbA> map = this.LIZ.LJLJJL;
            EnumC85151XbP enumC85151XbP = EnumC85151XbP.SMS;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C85136XbA c85136XbA2 = (C85136XbA) linkedHashMap.get(enumC85151XbP);
            if (c85136XbA2 != null) {
                if (rc1 != null) {
                    str = rc1.LJLIL;
                }
                c85136XbA = C85136XbA.LIZ(c85136XbA2, true, false, str, false, false, 54);
            } else {
                if (rc1 != null) {
                    str = rc1.LJLIL;
                }
                c85136XbA = new C85136XbA(true, false, enumC85151XbP, str, false, false, 50);
            }
            linkedHashMap.put(enumC85151XbP, c85136XbA);
            this.LIZIZ.add("mobile_sms_verify");
        }
        this.LIZJ.invoke(Boolean.valueOf(this.LIZLLL), this.LJ, this.LJFF, this.LIZIZ, Integer.valueOf(this.LJI));
    }
}
