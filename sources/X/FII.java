package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final /* synthetic */ class FII {
    public static List LIZ() {
        return Collections.synchronizedList(new ArrayList());
    }

    public static void LIZJ(Throwable th, String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(th);
        LIZ.append(str);
        LIZ.append(str2);
        PEH.LIZIZ(X1D.LIZIZ(LIZ));
    }

    public static void LIZIZ(int i, int i2, LaneParams laneParams, String str) {
        laneParams.plusAssign(str, Integer.valueOf(i + i2));
    }
}
