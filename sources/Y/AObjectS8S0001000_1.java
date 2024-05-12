package Y;

import X.C2068389v;
import X.C56662Kg;
import X.C58620MzY;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvUser;
import com.ss.android.ugc.aweme.account.login.trusted.TrustedUsersResponse;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class AObjectS8S0001000_1 implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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

    public AObjectS8S0001000_1(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS8S0001000_1 aObjectS8S0001000_1, Object obj) {
        switch (aObjectS8S0001000_1.i0) {
            case 0:
                return BaseListFragmentPanel.lambda$updateAwesomeInfo$15((C58620MzY) obj);
            default:
                return SettingNewVersionFragment.lambda$initUnits$6((C2068389v) obj);
        }
    }

    public static final Object invoke$1(AObjectS8S0001000_1 aObjectS8S0001000_1, Object obj) {
        TrustedUsersResponse.Data data;
        List<TrustedEnvUser> list;
        switch (aObjectS8S0001000_1.i0) {
            case 0:
                TrustedUsersResponse trustedUsersResponse = (TrustedUsersResponse) obj;
                if (trustedUsersResponse != null && (data = trustedUsersResponse.data) != null && (list = data.records) != null) {
                    Iterator<TrustedEnvUser> it = list.iterator();
                    while (it.hasNext()) {
                        Long l = it.next().lastLoginTimeInSeconds;
                        if (l != null && l.longValue() > 0) {
                            C56662Kg.LIZ().LIZLLL(1L, "new_user_return_flag");
                            return null;
                        }
                    }
                    return null;
                }
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
