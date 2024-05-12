package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C39579Fg7;
import X.C41825GbF;
import X.C44432HcC;
import X.C76800UCe;
import X.C78966Uyw;
import X.FMX;
import X.GVY;
import X.InterfaceC65784Pro;
import X.X1D;

/* loaded from: classes8.dex */
public class AqS45S1000000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$0();
            case 4:
                return invoke$1();
            case 5:
                return invoke$2();
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return this.s0;
            default:
                return null;
        }
    }

    public final Boolean invoke$2() {
        String awemeId = this.s0;
        o.LJIIIZ(awemeId, "awemeId");
        return Boolean.valueOf(!GVY.LIZIZ().getBoolean(GVY.LJ(GVY.LIZLLL("key_video_player_banner_banned", awemeId)), false));
    }

    public final String invoke$0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("awemeId=");
        LIZ.append(this.s0);
        return X1D.LIZIZ(LIZ);
    }

    public final Boolean invoke$1() {
        return Boolean.valueOf(o.LJ(GVY.LIZ(), this.s0));
    }

    public static final Object invoke$0(AqS45S1000000_7 aqS45S1000000_7) {
        return C78966Uyw.LJIJJLI(C44432HcC.LJIILLIIL(aqS45S1000000_7.s0));
    }

    public static final Object invoke$1(AqS45S1000000_7 aqS45S1000000_7) {
        return Boolean.valueOf(C39579Fg7.LIZIZ(aqS45S1000000_7.s0));
    }

    public static final Object invoke$2(AqS45S1000000_7 aqS45S1000000_7) {
        return Boolean.valueOf(C39579Fg7.LIZIZ(aqS45S1000000_7.s0));
    }

    public static final Object invoke$6(AqS45S1000000_7 aqS45S1000000_7) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", aqS45S1000000_7.s0);
        c188727au.LJIIIZ("shoot_way", "story");
        c188727au.LJIIIZ("type", "photo");
        FMX.LJIIL("go_to_setting_show", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS45S1000000_7 aqS45S1000000_7) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", aqS45S1000000_7.s0);
        c188727au.LJIIIZ("shoot_way", "story");
        c188727au.LJIIIZ("type", "photo");
        c188727au.LJFF(Boolean.TRUE, "status");
        FMX.LJIIL("go_to_settings_action", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS45S1000000_7 aqS45S1000000_7) {
        C41825GbF.LIZ(aqS45S1000000_7.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S1000000_7(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
