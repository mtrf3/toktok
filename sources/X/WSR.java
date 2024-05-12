package X;

import com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSR implements InterfaceC88474Ynu<Integer, Integer, String, VERecorder, C76800UCe> {
    public final /* synthetic */ TTEPPreviewEffectLogicComponent LJLIL;

    public WSR(TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent) {
        this.LJLIL = tTEPPreviewEffectLogicComponent;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, VERecorder p4) {
        int intValue = num.intValue();
        num2.intValue();
        o.LJIIIZ(p4, "p4");
        if (intValue == 1050) {
            this.LJLIL.getCameraApi().e8().L9(this);
            C6QQ.LIZ(new AqS164S0100000_14(this.LJLIL, 191));
        }
        return C76800UCe.LIZ;
    }
}
