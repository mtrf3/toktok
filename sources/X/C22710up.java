package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.0up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22710up {
    public static volatile long LIZIZ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C528525p.LJLIL);
    public static final C35181Zq LIZJ = new QJ5() { // from class: X.1Zq
        @Override // X.QJ5
        public final void LIZ(String str, long j, JSONObject jSONObject) {
        }

        @Override // X.QJ5
        public final void LIZJ(String str, long j, JSONObject jSONObject) {
        }

        @Override // X.QJ5
        public final void LIZIZ(long j) {
            long j2;
            ArrayList arrayList;
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 - C22710up.LIZIZ < 30000) {
                return;
            }
            C22710up.LIZIZ = currentTimeMillis2;
            String[] stringArray = ((Keva) C22710up.LIZ.getValue()).getStringArray("session_manager_active_days", new String[0]);
            o.LJIIIIZZ(stringArray, "keva.getStringArray(SESS…N_ACTIVE_DAYS, arrayOf())");
            ArrayList arrayList2 = new ArrayList(stringArray.length);
            for (String it : stringArray) {
                o.LJIIIIZZ(it, "it");
                arrayList2.add(C38350F3i.LJJIZ(it));
            }
            List LLJILJILJ = ORZ.LLJILJILJ(ORZ.LJLL(arrayList2));
            Long l = (Long) ORZ.LLFII(LLJILJILJ);
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = 0;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j2);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(currentTimeMillis);
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            if (calendar2.getTimeInMillis() <= calendar.getTimeInMillis()) {
                return;
            }
            while (true) {
                arrayList = (ArrayList) LLJILJILJ;
                if (arrayList.size() < ((Number) C22700uo.LIZ.getValue()).intValue()) {
                    break;
                } else {
                    ORS.LJJLJ(LLJILJILJ);
                }
            }
            arrayList.add(Long.valueOf(currentTimeMillis));
            Keva keva = (Keva) C22710up.LIZ.getValue();
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(String.valueOf(((Number) it2.next()).longValue()));
            }
            keva.storeStringArray("session_manager_active_days", (String[]) arrayList3.toArray(new String[0]));
        }
    };
}
