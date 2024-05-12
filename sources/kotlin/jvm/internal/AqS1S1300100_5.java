package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.BZI;
import X.C05490Jl;
import X.C28787BRn;
import X.C32498CpC;
import X.C32509CpN;
import X.C32510CpO;
import X.C76800UCe;
import X.CN1;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.qa.QuestionMoreOptionDialog;
import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes6.dex */
public class AqS1S1300100_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S1300100_5 aqS1S1300100_5, Object obj) {
        C05490Jl it = (C05490Jl) obj;
        o.LJIIIZ(it, "it");
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ns(aqS1S1300100_5.j4, (User) aqS1S1300100_5.l1, it, (QuestionMoreOptionDialog) aqS1S1300100_5.l2);
        ((QuestionMoreOptionDialog) aqS1S1300100_5.l2).vl(true);
        BZI LIZ = C28787BRn.LIZ("livesdk_mute_set");
        LIZ.LJIILLIIL(((QuestionMoreOptionDialog) aqS1S1300100_5.l2).dataChannel);
        LIZ.LJIJJ(aqS1S1300100_5.s0, "admin_type");
        LIZ.LJIJJ(Long.valueOf(((C05490Jl) aqS1S1300100_5.l3).LIZ), "default_mute_set");
        LIZ.LJIJJ(Long.valueOf(it.LIZ), "mute_duration");
        LIZ.LJIJJ(String.valueOf(((User) aqS1S1300100_5.l1).getId()), "to_user_id");
        LIZ.LJIJJ("QnA", "entry_point");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S1300100_5 aqS1S1300100_5, Object obj) {
        SparkContext sparkContext = (SparkContext) obj;
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJI(new C32509CpN((InterfaceC88472Yns) aqS1S1300100_5.l1, aqS1S1300100_5.j4, (C32510CpO) aqS1S1300100_5.l2, aqS1S1300100_5.s0, (InterfaceC88473Ynt) aqS1S1300100_5.l3));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1300100_5(User user, long j, QuestionMoreOptionDialog questionMoreOptionDialog, String str, C05490Jl c05490Jl, int i) {
        super(1);
        this.$t = i;
        this.l1 = user;
        this.j4 = j;
        this.l2 = questionMoreOptionDialog;
        this.s0 = str;
        this.l3 = c05490Jl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1300100_5(AqS171S0100000_5 aqS171S0100000_5, long j, C32510CpO c32510CpO, String str, C32498CpC c32498CpC, int i) {
        super(1);
        this.$t = i;
        this.l1 = aqS171S0100000_5;
        this.j4 = j;
        this.l2 = c32510CpO;
        this.s0 = str;
        this.l3 = c32498CpC;
    }
}
