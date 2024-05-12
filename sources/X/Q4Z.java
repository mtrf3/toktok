package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q4Z {
    public static android.net.Uri LIZ(Bundle bundle, String str) {
        if (o.LJ(str, "oauth")) {
            return C66373Q3d.LIZ(Q4Y.LIZIZ(), "oauth/authorize", bundle);
        }
        String LIZIZ = Q4Y.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIL());
        LIZ.append("/dialog/");
        LIZ.append(str);
        return C66373Q3d.LIZ(LIZIZ, X1D.LIZIZ(LIZ), bundle);
    }
}
