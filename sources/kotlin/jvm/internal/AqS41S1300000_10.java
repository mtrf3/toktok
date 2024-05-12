package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C58552MyS;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.M94;
import X.M95;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import com.ss.android.ugc.aweme.screenshot.ScreenShotService;
import java.util.Map;

/* loaded from: classes11.dex */
public class AqS41S1300000_10 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS41S1300000_10 aqS41S1300000_10) {
        SessionInfo LIZ = ((C58552MyS) aqS41S1300000_10.l1).LIZ.LIZ(new M94((M95) aqS41S1300000_10.l3, aqS41S1300000_10.s0, (Map) aqS41S1300000_10.l2));
        if (LIZ != null) {
            return GsonProtectorUtils.toJson(((C58552MyS) aqS41S1300000_10.l1).LIZIZ, LIZ);
        }
        return null;
    }

    public static final Object invoke$1(AqS41S1300000_10 aqS41S1300000_10) {
        ScreenShotService screenShotService = (ScreenShotService) aqS41S1300000_10.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS41S1300000_10.l2;
        ScreenShotContent screenShotContent = (ScreenShotContent) aqS41S1300000_10.l3;
        String str = aqS41S1300000_10.s0;
        screenShotService.getClass();
        ScreenShotService.LJIIJJI(activityC45651qj, screenShotContent, str);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS41S1300000_10(C58552MyS c58552MyS, C58552MyS c58552MyS2, String str, Map<String, Object> map, M95 m95) {
        super(0);
        this.$t = m95;
        this.l1 = c58552MyS;
        this.s0 = c58552MyS2;
        this.l2 = str;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS41S1300000_10(ScreenShotService screenShotService, ActivityC45651qj activityC45651qj, ScreenShotContent screenShotContent, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = screenShotService;
        this.l2 = activityC45651qj;
        this.l3 = screenShotContent;
        this.s0 = str;
    }
}
