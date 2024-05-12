package X;

import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OFI {
    public static final OFI LIZIZ = new OFI();
    public static final OFJ<Object, OFG> LIZ = new OFJ<>(32, OFO.LJLIL);

    public static void LIZ(String containerId) {
        View view;
        o.LJIIJ(containerId, "containerId");
        try {
            OFJ<Object, OFG> ofj = LIZ;
            OFG ofg = (OFG) OFJ.LIZ(ofj, containerId);
            ofg.LIZJ();
            COL col = ofg.LIZLLL;
            if (col != null) {
                view = col.LIZ();
            } else {
                view = null;
            }
            ofj.remove(LJII(view));
            ofj.remove(containerId);
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public static java.util.Map LIZIZ(String containerId) {
        o.LJIIJ(containerId, "containerId");
        return (java.util.Map) ((OFG) OFJ.LIZ(LIZ, containerId)).LIZIZ.getValue();
    }

    public static java.util.Map LIZJ(String containerId) {
        o.LJIIJ(containerId, "containerId");
        return ((OFG) OFJ.LIZ(LIZ, containerId)).LIZJ;
    }

    public static List LIZLLL(View view) {
        View LIZ2;
        o.LJIIJ(view, "view");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Object, OFG> entry : LIZ.entrySet()) {
            COL col = entry.getValue().LIZLLL;
            if (col != null && (LIZ2 = col.LIZ()) != null && LIZ2.equals(view)) {
                linkedHashSet.add(entry.getValue().LJ);
            }
        }
        return ORZ.LLJI(linkedHashSet);
    }

    public static COL LJ(String containerId) {
        o.LJIIJ(containerId, "containerId");
        return ((OFG) OFJ.LIZ(LIZ, containerId)).LIZLLL;
    }

    public static C35894E6w LJFF(View view) {
        o.LJIIJ(view, "view");
        ArrayList arrayList = new ArrayList();
        for (String containerId : LIZLLL(view)) {
            o.LJIIJ(containerId, "containerId");
            arrayList.add(LIZIZ(containerId));
        }
        return new C35894E6w(arrayList);
    }

    public static C35893E6v LJI(View view) {
        o.LJIIJ(view, "view");
        ArrayList arrayList = new ArrayList();
        for (String containerId : LIZLLL(view)) {
            o.LJIIJ(containerId, "containerId");
            arrayList.add(LIZJ(containerId));
        }
        return new C35893E6v(arrayList);
    }

    public static String LJII(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return String.valueOf(obj.hashCode());
    }

    public static JSONObject LJIIIZ(Object obj, String tracerName) {
        o.LJIIJ(tracerName, "tracerName");
        OFG ofg = (OFG) OFJ.LIZ(LIZ, LJII(obj));
        ofg.getClass();
        return (JSONObject) OFJ.LIZ(ofg.LJFF, tracerName);
    }

    public static void LJIIJJI(Object obj, OFN ofn) {
        OFG ofg = (OFG) OFJ.LIZ(LIZ, LJII(obj));
        if (ofg.LJI) {
            String str = ofg.LJ;
            COL col = ofg.LIZLLL;
            if (col != null) {
                ofn.LIZIZ(str, col);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        ((LinkedList) ofg.LJII).add(ofn);
    }

    public static String LJIIIIZZ(View view, String containerId, String str) {
        boolean z;
        if (containerId == null || containerId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (!z) {
            o.LJIIJ(containerId, "containerId");
            Object obj2 = ((ConcurrentHashMap) LIZJ(containerId)).get(str);
            if (obj2 instanceof String) {
                obj = obj2;
            }
            return (String) obj;
        }
        if (view == null) {
            return null;
        }
        Object obj3 = ((LinkedHashMap) LJI(view).LLLLZ()).get(str);
        if (obj3 instanceof String) {
            obj = obj3;
        }
        return (String) obj;
    }

    public static void LJIIJ(String containerId, Object value, String field) {
        o.LJIIJ(containerId, "containerId");
        o.LJIIJ(field, "field");
        o.LJIIJ(value, "value");
        LIZIZ(containerId).put(field, value);
    }
}
