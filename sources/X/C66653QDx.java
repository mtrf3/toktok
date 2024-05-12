package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QDx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66653QDx {
    public static volatile C66653QDx LIZIZ;
    public Object LIZ;

    public static C66653QDx LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C66653QDx.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66653QDx();
                }
            }
        }
        return LIZIZ;
    }

    public final String LIZ(String str) {
        try {
            Object obj = this.LIZ;
            if (obj == null) {
                return "";
            }
            return (String) new C36598EXy(obj).LIZIZ(str).LIZ;
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void LIZLLL(AbstractC64719Pad abstractC64719Pad) {
        if (abstractC64719Pad != null) {
            try {
                List LJ = C1RF.LJ(abstractC64719Pad.getClass());
                if (LJ != null) {
                    ArrayList arrayList = (ArrayList) LJ;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if ("com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider".equals(((Class) it.next()).getName())) {
                                if (QE0.LIZ().loggerDebug()) {
                                    QE0.LIZ().loggerD("CronetAppProviderManager", "inject CronetAppProviderManager success");
                                }
                                this.LIZ = abstractC64719Pad;
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void LIZJ(String str, String str2) {
        if (QE0.LIZ().loggerDebug()) {
            QE0.LIZ().loggerD("CronetAppProviderManager", C0ON.LIZJ("Send monitor json = ", str, ", log type =", str2));
        }
        try {
            Object obj = this.LIZ;
            if (obj == null) {
                return;
            }
            new C36598EXy(obj).LIZJ("sendAppMonitorEvent", new Class[]{String.class, String.class}, str, str2);
        } catch (Throwable unused) {
        }
    }
}
