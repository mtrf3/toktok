package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYG implements InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe> {
    public final /* synthetic */ WYF LJLIL;

    public WYG(WYF wyf) {
        this.LJLIL = wyf;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, VERecorder p4) {
        int intValue = num.intValue();
        num2.intValue();
        o.LJIIIZ(p4, "p4");
        if (intValue == 1050) {
            WYF wyf = this.LJLIL;
            if (!wyf.LJLZ) {
                wyf.getCameraApi().e8().L9(this);
                WYF wyf2 = this.LJLIL;
                wyf2.LJLZ = true;
                Effect effect = wyf2.LJLLLLLL;
                if (effect != null) {
                    C6QQ.LIZ(new AqS161S0200000_14(wyf2, effect, 27));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
