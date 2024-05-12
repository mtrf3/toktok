package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C60903NvH;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.detail.api.ReactDuetSettingsResponse;

/* loaded from: classes8.dex */
public class AgS46S0000000_7 implements C10I {
    public final int $t;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public AgS46S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object then$0(AgS46S0000000_7 agS46S0000000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            C16880lQ.LLLLIIL(c10k.LJIIJ());
            return null;
        }
        return null;
    }

    public static final Object then$1(AgS46S0000000_7 agS46S0000000_7, C10K c10k) {
        if (!c10k.LJIILJJIL()) {
            ReactDuetSettingsResponse reactDuetSettingsResponse = (ReactDuetSettingsResponse) c10k.LJIIJJI();
            if (reactDuetSettingsResponse.item_duet == 0 || reactDuetSettingsResponse.item_react == 0) {
                C60903NvH.LJIIJJI().LJJIL().setReactDuetSettingCurrent(1);
                C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("publish_setting", "default duet switch: on, reason: server");
                return null;
            }
            C60903NvH.LJIIJJI().LJJIL().setReactDuetSettingCurrent(0);
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("publish_setting", "default duet switch: off, reason: server");
            return null;
        }
        return null;
    }

    public static final Object then$2(AgS46S0000000_7 agS46S0000000_7, C10K c10k) {
        if (c10k.LJIILJJIL()) {
            return null;
        }
        ReactDuetSettingsResponse reactDuetSettingsResponse = (ReactDuetSettingsResponse) c10k.LJIIJJI();
        if (reactDuetSettingsResponse.item_duet == 0 || reactDuetSettingsResponse.item_react == 0) {
            Keva.getRepo("DUET_SETTING_REPO").storeInt("DUET_SETTING_KEY", 1);
            return null;
        }
        Keva.getRepo("DUET_SETTING_REPO").storeInt("DUET_SETTING_KEY", 0);
        return null;
    }
}
