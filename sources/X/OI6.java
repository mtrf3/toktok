package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OI6 {
    public static final String LIZ = C38943FQd.LIZ();

    public static void LIZIZ(OI8 oi8) {
        C61520OCm LJIILIIL = O3U.LJIILIIL();
        HashMap hashMap = new HashMap();
        String str = LIZ;
        List asList = Arrays.asList(new CheckRequestBodyModel.TargetChannel("ug_resource"));
        o.LJIIIIZZ(asList, "asList(\n            Chec…e\n            )\n        )");
        hashMap.put(str, asList);
        LJIILIIL.LIZIZ("high_priority", null, hashMap, new OIA(new OI7(oi8)));
    }

    public static String LIZ(String str, String str2) {
        String LIZJ;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || (LIZJ = O3U.LIZJ(LIZ, "ug_resource")) == null) {
            return "";
        }
        if (str2.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZJ);
            return JBR.LJFF(LIZ2, File.separator, str, LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LIZJ);
        String str3 = File.separator;
        YE1.LIZLLL(LIZ3, str3, str2, str3, str);
        return X1D.LIZIZ(LIZ3);
    }
}
