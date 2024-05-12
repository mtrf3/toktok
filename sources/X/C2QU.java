package X;

import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2QU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2QU {
    public static final List<Message> LIZ = new ArrayList();
    public static final java.util.Map<String, ArrayList<Runnable>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<String, Boolean> LIZJ = new LinkedHashMap();

    public static void LIZJ() {
        Iterator it = ((ArrayList) LIZ).iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            message.getTarget().sendMessageAtFrontOfQueue(message);
        }
        ((ArrayList) LIZ).clear();
    }

    public static void LIZIZ(Runnable runnable) {
        C2NG c2ng = C57022Lq.LIZ;
        if (c2ng.LJLIL.hasMessages(2022)) {
            c2ng.LJLIL.removeMessages(2022);
        }
        Message obtain = Message.obtain(c2ng.LJLIL, runnable);
        obtain.what = 2022;
        c2ng.LJLIL.sendMessageDelayed(obtain, ((Number) C2QR.LIZ.getValue()).intValue());
    }

    public static void LIZLLL(String str) {
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) LIZIZ).get(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) LIZIZ).get(str);
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        LIZJ.put(str, Boolean.TRUE);
    }

    public static void LIZ(Runnable runnable, boolean z) {
        if (!z || o.LJ(((LinkedHashMap) LIZJ).get("nuj_premain"), Boolean.TRUE)) {
            runnable.run();
            return;
        }
        java.util.Map<String, ArrayList<Runnable>> map = LIZIZ;
        if (!map.containsKey("nuj_premain")) {
            ArrayList<Runnable> arrayList = new ArrayList<>();
            arrayList.add(runnable);
            map.put("nuj_premain", arrayList);
        } else {
            ArrayList<Runnable> arrayList2 = (ArrayList) ((LinkedHashMap) map).get("nuj_premain");
            if (arrayList2 == null) {
                return;
            }
            arrayList2.add(runnable);
            map.put("nuj_premain", arrayList2);
        }
    }
}
