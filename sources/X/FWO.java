package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class FWO {
    public static volatile FWP LIZ = FWP.NOT_LOAD;
    public static final C38925FPl LIZIZ;

    public static void LIZIZ() {
        try {
            Class.forName("com.ss.android.ttve.nativePort.TENativeLibsLoader").getDeclaredMethod("loadAllLibs", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            if (LIZ == FWP.LOADED) {
                return;
            }
            List<String> LIZ2 = LIZ();
            ArrayList arrayList = (ArrayList) LIZ2;
            arrayList.size();
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((String) ListProtector.get(LIZ2, i)).contentEquals("c++_shared") && !((String) ListProtector.get(LIZ2, i)).contentEquals("ttboringssl") && !((String) ListProtector.get(LIZ2, i)).contentEquals("ttcrypto")) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("lib");
                    JBR.LJFF(LIZ3, (String) ListProtector.get(LIZ2, i), ".so", LIZ3);
                }
            }
            LIZ = FWP.LOADING;
            if (!C38925FPl.LIZ(LIZ2)) {
                LIZ = FWP.NOT_LOAD;
            } else {
                LIZ = FWP.LOADED;
            }
        }
    }

    static {
        C16880lQ.LJLLJ(FWO.class);
        LIZIZ = new C38925FPl();
        new ArrayList();
    }

    public static List<String> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("bytevc0");
        arrayList.add("ByteVC1_dec");
        arrayList.add("bvcparser");
        arrayList.add("fdk-aac");
        arrayList.add("sscronet");
        arrayList.addAll(FFmpegLibLoaderWrapper.LIZIZ());
        arrayList.add("yuv");
        arrayList.add("ttvesdk");
        arrayList.add("bytebench");
        return arrayList;
    }

    public static synchronized void LIZJ() {
        synchronized (FWO.class) {
            LIZIZ();
        }
    }
}
