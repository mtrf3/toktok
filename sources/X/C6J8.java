package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6J8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6J8 extends AbstractC65781Prl implements InterfaceC88472Yns<GBS, C76800UCe> {
    public static final C6J8 LJLIL = new C6J8();

    public C6J8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GBS gbs) {
        GBS saaConfig = gbs;
        o.LJIIIZ(saaConfig, "$this$saaConfig");
        GBW gbw = GBW.SINGLE_TASK;
        o.LJIIIZ(gbw, "<set-?>");
        saaConfig.LIZ = gbw;
        saaConfig.LIZJ = R.style.au;
        saaConfig.LIZLLL = false;
        return C76800UCe.LIZ;
    }
}
