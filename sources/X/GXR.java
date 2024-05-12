package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class GXR {
    public static final List<GXQ> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        LIZ = arrayList;
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        arrayList.add(new C41661GWr());
        arrayList.add(new C41655GWl());
        arrayList.add(new GXT());
        if (((Boolean) GXU.LIZ.getValue()).booleanValue()) {
            arrayList.add(new GXS());
        }
    }

    public static void LIZ(String eventName, java.util.Map map) {
        o.LJIIIZ(eventName, "eventName");
        List<GXQ> list = LIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((GXQ) it.next()).LIZ(eventName, map)) {
                    return;
                }
            }
        }
        try {
            C60903NvH.LJIIJJI().LJJIIZI().LIZIZ(eventName, map);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZIZ(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        List<GXQ> list = LIZ;
        if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((GXQ) it.next()).LIZIZ(eventName, jSONObject)) {
                    return;
                }
            }
        }
        try {
            C60903NvH.LJIIJJI().LJJIIZI().LJIILJJIL(eventName, jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
