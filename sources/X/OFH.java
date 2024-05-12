package X;

import Y.ARunnableS15S1000000_10;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class OFH {
    public static final OFH LIZLLL = new OFH();
    public static final OFI LIZ = OFI.LIZIZ;
    public static final java.util.Map<String, OFM> LIZIZ = new LinkedHashMap();
    public static final Handler LIZJ = new Handler(C16880lQ.LLJJJJ());

    public static String LJ() {
        String monitorId = C1XY.LJIILJJIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("generateIDForContainer [monitorId:");
        LIZ2.append(monitorId);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        o.LJFF(monitorId, "monitorId");
        return monitorId;
    }

    public static void LIZLLL(C79604VMa c79604VMa) {
        String str = c79604VMa.LJIIIIZZ;
        if (str == null || o.LJ(s.LJZI(str).toString(), "")) {
            HybridMultiMonitor.getInstance().customReport(c79604VMa);
            return;
        }
        String str2 = c79604VMa.LJIIIIZZ;
        o.LJFF(str2, "customInfo.containerId");
        OFI.LJIIJJI(str2, new OFL(c79604VMa));
    }

    public static OFM LJFF(COL col) {
        if (col == null) {
            return null;
        }
        String str = (String) col.LIZ;
        int hashCode = str.hashCode();
        if (hashCode != 117588) {
            if (hashCode != 3337239 || !str.equals("lynx")) {
                return null;
            }
        } else if (!str.equals("web")) {
            return null;
        }
        return (OFM) ((LinkedHashMap) LIZIZ).get(col.LIZ);
    }

    public static void LJII(String monitorId) {
        o.LJIIJ(monitorId, "monitorId");
        LIZJ.post(new ARunnableS15S1000000_10(monitorId, 1));
    }

    public static void LIZ(String monitorId, COL col) {
        o.LJIIJ(monitorId, "monitorId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("attach [");
        LIZ2.append(monitorId);
        LIZ2.append("] containerType:");
        LIZ2.append((String) col.LIZ);
        X1D.LIZIZ(LIZ2);
        LIZ.getClass();
        try {
            OFJ<Object, OFG> ofj = OFI.LIZ;
            OFG ofg = (OFG) OFJ.LIZ(ofj, monitorId);
            String LJII = OFI.LJII(col.LIZ());
            ofg.LIZ((OFG) OFJ.LIZ(ofj, LJII));
            ofg.LIZIZ(monitorId, col);
            ofj.put(LJII, ofg);
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
        LIZ.getClass();
        OFI.LJIIJ(monitorId, monitorId, "container_id");
        OFI.LJIIJ(monitorId, col.LIZ, "container_type");
    }

    public static void LIZIZ(long j, String monitorId, String str) {
        o.LJIIJ(monitorId, "monitorId");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("collectLong [monitorId:");
        LIZ2.append(monitorId);
        LIZ2.append("][field:");
        LIZ2.append(str);
        LIZ2.append("][value:");
        LIZ2.append(j);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        LJI(monitorId, Long.valueOf(j), str);
    }

    public static void LIZJ(String monitorId, String str, String value) {
        o.LJIIJ(monitorId, "monitorId");
        o.LJIIJ(value, "value");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("collectString [monitorId:");
        LIZ2.append(monitorId);
        LIZ2.append("][field:");
        LIZ2.append(str);
        LIZ2.append("][value:");
        LIZ2.append(value);
        LIZ2.append(']');
        X1D.LIZIZ(LIZ2);
        LJI(monitorId, value, str);
    }

    public static void LJI(String str, Object obj, String str2) {
        OFK ofk = new OFK(str2, obj, str);
        if (!o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            LIZJ.post(ofk);
        } else {
            ofk.run();
        }
    }
}
