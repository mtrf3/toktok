package X;

import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H7I {
    public static final float LIZ;

    static {
        float f;
        if (e1.LIZ(31744, "now_make_selfie_taking_easier_selfie_window_golden_ratio", true, false)) {
            f = 0.382f;
        } else {
            f = 0.32f;
        }
        LIZ = f;
    }

    public static final int LIZ(NowsShootModel nowsShootModel) {
        o.LJIIIZ(nowsShootModel, "<this>");
        if (nowsShootModel.type == 3) {
            return 4;
        }
        NowsExtra nowsExtra = nowsShootModel.nowsExtra;
        if (nowsExtra.isDualCamera) {
            return 2;
        }
        if (o.LJ(nowsExtra.shootOrder, "back_first")) {
            return 4;
        }
        return 3;
    }
}
