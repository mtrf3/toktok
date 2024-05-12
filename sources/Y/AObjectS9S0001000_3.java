package Y;

import X.C2068389v;
import X.C50420Jqa;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;

/* loaded from: classes4.dex */
public class AObjectS9S0001000_3 implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public AObjectS9S0001000_3(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS9S0001000_3 aObjectS9S0001000_3, Object obj) {
        switch (aObjectS9S0001000_3.i0) {
            case 0:
                return ((Comment) obj).getUser();
            default:
                return SettingNewVersionFragment.lambda$initUnits$77((C2068389v) obj);
        }
    }

    public static final Object invoke$1(AObjectS9S0001000_3 aObjectS9S0001000_3, Object obj) {
        switch (aObjectS9S0001000_3.i0) {
            case 0:
                C50420Jqa c50420Jqa = (C50420Jqa) obj;
                c50420Jqa.LJLLL = "click_repost_button";
                return c50420Jqa;
            default:
                return SettingNewVersionFragment.lambda$initUnits$56((C2068389v) obj);
        }
    }

    public static final Object invoke$2(AObjectS9S0001000_3 aObjectS9S0001000_3, Object obj) {
        switch (aObjectS9S0001000_3.i0) {
            case 0:
                FMX.onEventV3("comment_batch_management_report_cancel_ck");
                return C76800UCe.LIZ;
            default:
                return SettingNewVersionFragment.lambda$initUnits$26((C2068389v) obj);
        }
    }

    public static final Object invoke$3(AObjectS9S0001000_3 aObjectS9S0001000_3, Object obj) {
        switch (aObjectS9S0001000_3.i0) {
            case 0:
                FMX.onEventV3("comment_batch_management_block_cancel_ck");
                return C76800UCe.LIZ;
            default:
                return SettingNewVersionFragment.lambda$initUnits$30((C2068389v) obj);
        }
    }
}
