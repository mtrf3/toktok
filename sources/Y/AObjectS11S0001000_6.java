package Y;

import X.C2068389v;
import X.C35019Dol;
import X.C36089EEj;
import X.C36093EEn;
import X.C39386Fd0;
import X.C39647FhD;
import X.C40007Fn1;
import X.C66457Q6j;
import X.C66460Q6m;
import X.C66466Q6s;
import X.C76800UCe;
import X.EnumC12540eQ;
import X.GGS;
import X.GGT;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import java.util.Objects;

/* loaded from: classes7.dex */
public class AObjectS11S0001000_6 implements InterfaceC88472Yns {
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

    public AObjectS11S0001000_6(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS11S0001000_6 aObjectS11S0001000_6, Object obj) {
        switch (aObjectS11S0001000_6.i0) {
            case 0:
                return EnumC12540eQ.fromInt(((AnchorLevelPermission) obj).sticker);
            case 1:
                Context context = (Context) obj;
                C40007Fn1.LIZIZ.LIZLLL(context);
                Context LIZ = C39386Fd0.LIZ(context);
                try {
                    C39647FhD.LJ(LIZ);
                } catch (Exception unused) {
                }
                return LIZ;
            default:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS47S0101000_2(2, ggt, 3));
                return null;
        }
    }

    public static final Object invoke$1(AObjectS11S0001000_6 aObjectS11S0001000_6, Object obj) {
        switch (aObjectS11S0001000_6.i0) {
            case 0:
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZIZ(new TasksHolder.AmeActivityResumeRun((Activity) obj), true);
                LJIIIZ.LIZJ();
                return C76800UCe.LIZ;
            default:
                return MainActivity.lambda$onCreate$6((BaseActivityViewModel) obj);
        }
    }

    public static final Object invoke$2(AObjectS11S0001000_6 aObjectS11S0001000_6, Object obj) {
        switch (aObjectS11S0001000_6.i0) {
            case 0:
                ((BaseViewModel) obj).config(new AObjectS22S0001000_6(1, 4));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$58((C2068389v) obj);
        }
    }

    public static final Object invoke$3(AObjectS11S0001000_6 aObjectS11S0001000_6, Object obj) {
        switch (aObjectS11S0001000_6.i0) {
            case 0:
                return EnumC12540eQ.fromInt(((AnchorLevelPermission) obj).liveIntro);
            case 1:
                if (C35019Dol.LIZIZ() || C35019Dol.LIZ()) {
                    C66466Q6s.LIZIZ(60000);
                } else {
                    C66466Q6s.LIZIZ(86400000);
                }
                C66460Q6m.LIZIZ().getClass();
                SafeModeActivity.LJLJJLL.getClass();
                C66457Q6j.LIZIZ();
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$34((C2068389v) obj);
        }
    }
}
