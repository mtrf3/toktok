package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS1S2211000_15 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
    public boolean z4;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S2211000_15 aqS1S2211000_15, Object obj) {
        String str = (String) obj;
        if (str == null || TextUtils.isEmpty(str)) {
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS1S2211000_15.l2;
            boolean z = aqS1S2211000_15.z4;
            twoStepVerificationActivityViewModel.gv0((List) aqS1S2211000_15.l3, aqS1S2211000_15.s0, aqS1S2211000_15.s1, aqS1S2211000_15.i5, z);
        } else {
            ((TwoStepVerificationActivityViewModel) aqS1S2211000_15.l2).gv0((List) aqS1S2211000_15.l3, "totp_verify", str, aqS1S2211000_15.i5, aqS1S2211000_15.z4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S2211000_15 aqS1S2211000_15, Object obj) {
        String str = (String) obj;
        if (str == null || TextUtils.isEmpty(str)) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) aqS1S2211000_15.l2;
            boolean z = aqS1S2211000_15.z4;
            twoStepVerificationManageActivity.LLFZ((List) aqS1S2211000_15.l3, aqS1S2211000_15.s0, aqS1S2211000_15.s1, aqS1S2211000_15.i5, z);
        } else {
            ((TwoStepVerificationManageActivity) aqS1S2211000_15.l2).LLFZ((List) aqS1S2211000_15.l3, "totp_verify", str, aqS1S2211000_15.i5, aqS1S2211000_15.z4);
        }
        ((TwoStepVerificationManageActivity) aqS1S2211000_15.l2).LLIIJLIL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS1S2211000_15 aqS1S2211000_15, Object obj) {
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) aqS1S2211000_15.l2;
            boolean z = aqS1S2211000_15.z4;
            twoStepVerificationManageActivity.LLFZ((List) aqS1S2211000_15.l3, aqS1S2211000_15.s0, aqS1S2211000_15.s1, aqS1S2211000_15.i5, z);
        } else {
            ((TwoStepVerificationManageActivity) aqS1S2211000_15.l2).LLFZ((List) aqS1S2211000_15.l3, "totp_verify", str, aqS1S2211000_15.i5, aqS1S2211000_15.z4);
        }
        ((TwoStepVerificationManageActivity) aqS1S2211000_15.l2).LLIIJLIL();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2211000_15(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, List list, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = twoStepVerificationManageActivity;
        this.z4 = z;
        this.s0 = "trusted_environment";
        this.s1 = str;
        this.l3 = list;
        this.i5 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2211000_15(int i, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, String str, String str2, List list, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = twoStepVerificationActivityViewModel;
        this.z4 = z;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = list;
        this.i5 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S2211000_15(int i, TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2, List list, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l2 = twoStepVerificationManageActivity;
        this.z4 = z;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = list;
        this.i5 = i;
    }
}
