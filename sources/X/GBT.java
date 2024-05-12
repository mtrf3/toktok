package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GBT extends AbstractC65781Prl implements InterfaceC88472Yns<GBS, C76800UCe> {
    public static final GBT LJLIL = new GBT();

    public GBT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GBS gbs) {
        GBS saaConfig = gbs;
        o.LJIIIZ(saaConfig, "$this$saaConfig");
        GBW gbw = GBW.SINGLE_TASK;
        o.LJIIIZ(gbw, "<set-?>");
        saaConfig.LIZ = gbw;
        saaConfig.LIZJ = R.style.av;
        saaConfig.LIZLLL = false;
        return C76800UCe.LIZ;
    }
}
