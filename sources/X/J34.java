package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J34 {
    public static volatile boolean LIZ;

    public static final void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        if (LIZ) {
            return;
        }
        LIZ = true;
        C40507Fv5.LIZ = false;
        J3H j3h = J3H.LIZ;
        J3I.LIZ = true;
        J3I.LIZIZ = j3h;
        String absolutePath = new File(C16880lQ.LLIIJLIL(context), "client_ai").getAbsolutePath();
        J37 j37 = new J37();
        j37.LIZ = absolutePath;
        j37.LIZIZ = C47515Ikp.LIZ;
        j37.LIZJ = new J38();
        j37.LIZLLL = J3C.LIZ;
        j37.LJ = J3T.LIZ;
        j37.LJFF = new J3B();
        J33 j33 = new J33(j37);
        if (C40507Fv5.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Inference init hasInit:");
            LIZ2.append(C40508Fv6.LIZIZ);
            X1D.LIZIZ(LIZ2);
            new Throwable("not crash, only for debug!!");
        }
        C40508Fv6 LIZ3 = C40508Fv6.LIZ();
        if (!C40508Fv6.LIZIZ) {
            C40508Fv6.LIZIZ = true;
            LIZ3.LIZ = j33;
        }
        C44384HbQ.LJLJLJ = J3G.LIZ;
    }
}
