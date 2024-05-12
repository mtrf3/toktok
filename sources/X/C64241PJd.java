package X;

import Y.ARunnableS18S0000000_11;
import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PJd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64241PJd {
    public static volatile C64241PJd LJFF;
    public volatile boolean LIZIZ;
    public static final C64247PJj LIZLLL = new C64247PJj();
    public static final HashMap<C64243PJf, HashMap<String, LinkedList<C64246PJi>>> LJ = new HashMap<>();
    public static final Object LJI = PJV.LIZIZ;
    public final ARunnableS47S0100000_11 LIZJ = new ARunnableS47S0100000_11(this, 89);
    public final C64284PKu LIZ = C64214PIc.LIZ();

    public static void LIZ() {
        try {
            HashMap<C64243PJf, HashMap<String, LinkedList<C64246PJi>>> hashMap = LJ;
            synchronized (hashMap) {
                Iterator<Map.Entry<C64243PJf, HashMap<String, LinkedList<C64246PJi>>>> it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    HashMap<String, LinkedList<C64246PJi>> value = it.next().getValue();
                    if (value != null) {
                        value.clear();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (!PKZ.LIZ) {
            return;
        }
        C64214PIc.LIZ().LIZIZ(new ARunnableS18S0000000_11(19));
    }

    public static C64241PJd LJ() {
        if (LJFF == null) {
            synchronized (C64241PJd.class) {
                if (LJFF == null) {
                    LJFF = new C64241PJd();
                }
            }
        }
        return LJFF;
    }

    public static void LJFF() {
        HashMap hashMap;
        HashMap<C64243PJf, HashMap<String, LinkedList<C64246PJi>>> hashMap2 = LJ;
        if (!hashMap2.isEmpty() && PKZ.LIZ) {
            if (!PJA.LJIIL() && System.currentTimeMillis() - PK0.LIZJ < 180000) {
                return;
            }
            synchronized (hashMap2) {
                hashMap = new HashMap(hashMap2);
                hashMap2.clear();
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                Iterator it = ((HashMap) entry.getValue()).entrySet().iterator();
                while (it.hasNext()) {
                    LinkedList linkedList = (LinkedList) ((Map.Entry) it.next()).getValue();
                    while (!linkedList.isEmpty()) {
                        try {
                            C64246PJi c64246PJi = (C64246PJi) linkedList.poll();
                            if (c64246PJi != null) {
                                LIZJ(c64246PJi, ((C64243PJf) entry.getKey()).LIZ);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public final void LJII() {
        JSONArray LIZJ;
        synchronized (this.LIZ) {
            if (this.LIZIZ) {
                return;
            }
            this.LIZIZ = true;
            LinkedList linkedList = new LinkedList();
            Iterator it = LIZLLL.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                List list = (List) entry.getValue();
                Object obj = ((C64243PJf) entry.getKey()).LIZ;
                int i = ((C64243PJf) entry.getKey()).LIZIZ;
                while (!list.isEmpty()) {
                    int i2 = 0;
                    while (!list.isEmpty()) {
                        try {
                            linkedList.add(ListProtector.remove(list, 0));
                            i2++;
                            if (i2 >= 30) {
                                break;
                            }
                        } catch (Throwable unused) {
                            C78685UuP.LJLIL();
                        }
                    }
                    if (linkedList.isEmpty()) {
                        break;
                    }
                    C64268PKe.LIZLLL();
                    PKN LIZJ2 = C64268PKe.LIZJ(linkedList);
                    if (LIZJ2 != null) {
                        C78685UuP.LJJJLL();
                        if (obj == LJI) {
                            LIZJ = null;
                        } else if (i != 0) {
                            LIZJ = PJV.LIZJ(obj);
                        } else {
                            LIZJ = PJV.LIZIZ(obj);
                        }
                        C64240PJc.LIZ(LIZJ2.LIZ, LIZJ, new C64244PJg(i));
                    }
                    C64250PJm.LJI().LJIIIZ();
                    linkedList.clear();
                }
            }
            this.LIZIZ = false;
        }
    }

    public static void LIZIZ(C64246PJi c64246PJi) {
        if (PKZ.LJI) {
            return;
        }
        Handler handler = C64214PIc.LIZ().LIZLLL;
        if (handler == null || handler.getLooper() != Looper.myLooper()) {
            C64214PIc.LIZ().LIZ(new ARunnableS47S0100000_11(c64246PJi, 90));
        } else {
            LIZJ(c64246PJi, LJI);
        }
    }

    public static void LIZJ(C64246PJi c64246PJi, Object obj) {
        LinkedList<C64246PJi> linkedList;
        Object obj2;
        JSONObject jSONObject;
        if (PKZ.LJI || PKZ.LJII) {
            return;
        }
        Handler handler = C64214PIc.LIZ().LIZLLL;
        if (handler == null || handler.getLooper() != Looper.myLooper()) {
            C64214PIc.LIZ().LIZ(new ARunnableS30S0200000_11(c64246PJi, obj, 32));
            return;
        }
        if (obj == null) {
            obj = LJI;
        }
        if (PKZ.LIZ && (obj != (obj2 = LJI) || PJA.LJIIL() || System.currentTimeMillis() - PK0.LIZJ >= 180000)) {
            String str = null;
            if (obj != obj2 && ((PJ9.LJFF.get(PJV.LIZ(obj)) == null || PJ7.LIZ(PJV.LIZ(obj))) && PJ7.LIZ(PJV.LIZ(obj)) && C48008Ism.LIZJ(PK0.LIZ))) {
                try {
                    String apmConfigUrl = PK0.LJIIIIZZ.getApmConfigUrl();
                    Iterator<PJU> it = PJV.LIZ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            PJU next = it.next();
                            if (next != null && next.LIZ == obj) {
                                jSONObject = next.LIZLLL();
                                break;
                            }
                        } else {
                            jSONObject = null;
                            break;
                        }
                    }
                    byte[] bArr = C63986P9i.LJ(C63986P9i.LIZIZ(apmConfigUrl, C64257PJt.LIZIZ(jSONObject, "aid", "4444", "crash", "npth", "os", "Android", "update_version_code", "000000", "channel", "unknown", "app_version", "0.0.0", "device_id", PK0.LIZLLL().LIZ())), null, "application/json; charset=utf-8", "gzip", "GET", false).LIZIZ;
                    if (bArr != null) {
                        PJA.LJIILJJIL(PJ5.LIZJ(PJV.LIZ(obj), new JSONObject(new String(bArr)).optJSONObject("ret")), true);
                        C78685UuP.LJJJLL();
                    }
                } catch (Throwable unused) {
                }
            }
            LJFF();
            String optString = c64246PJi.LIZ.optString("log_type");
            if ("service_monitor".equals(optString)) {
                String optString2 = c64246PJi.LIZ.optString("service");
                if (!TextUtils.isEmpty(optString2) && PJA.LJIIJJI(obj, optString2)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("serviceName ");
                    LIZ.append(optString2);
                    LIZ.append(" enqueue success");
                    X1D.LIZIZ(LIZ);
                    C78685UuP.LJJJLZIJ();
                    LIZLLL(c64246PJi, obj);
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("serviceName ");
                LIZ2.append(optString2);
                LIZ2.append(" not sampled");
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJJJLZIJ();
                return;
            }
            String optString3 = c64246PJi.LIZ.optString("message");
            if (!TextUtils.isEmpty(optString3)) {
                str = PL3.LIZ(optString3);
            }
            String optString4 = c64246PJi.LIZ.optString("crash_md5");
            if (!C64250PJm.LJI().LIZLLL(optString4, str)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("exception has been discard (enqueue) due to exceed limit: ");
                LIZ3.append(optString);
                X1D.LIZIZ(LIZ3);
                C78685UuP.LJLILLLLZI();
                return;
            }
            if (!TextUtils.isEmpty(optString) && PJA.LJIIIZ(obj, optString)) {
                if (!PJA.LJII(obj, optString3)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("exception has been discard (enqueue) due to message not sampled: ");
                    LIZ4.append(optString3);
                    X1D.LIZIZ(LIZ4);
                    C78685UuP.LJJJLL();
                    return;
                }
                if (!C64250PJm.LJI().LIZJ(optString4, str)) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("exception has been discard (enqueue) due to exceed limit: ");
                    LIZ5.append(optString);
                    X1D.LIZIZ(LIZ5);
                    C78685UuP.LJLILLLLZI();
                    return;
                }
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("logType: ");
                LIZ6.append(optString);
                LIZ6.append(" message: ");
                LIZ6.append(optString3);
                LIZ6.append(" enqueue success");
                X1D.LIZIZ(LIZ6);
                C78685UuP.LJJJLZIJ();
                LIZLLL(c64246PJi, obj);
                return;
            }
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("logType: ");
            LIZ7.append(optString);
            LIZ7.append(" not sampled");
            X1D.LIZIZ(LIZ7);
            C78685UuP.LJJJLZIJ();
            return;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(c64246PJi.LIZ, "log_type");
            HashMap<C64243PJf, HashMap<String, LinkedList<C64246PJi>>> hashMap = LJ;
            synchronized (hashMap) {
                HashMap<String, LinkedList<C64246PJi>> hashMap2 = hashMap.get(C64243PJf.LIZ(c64246PJi, obj));
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(C64243PJf.LIZ(c64246PJi, obj), hashMap2);
                }
                linkedList = hashMap2.get(string);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    hashMap2.put(string, linkedList);
                }
            }
            linkedList.add(c64246PJi);
            if (linkedList.size() > 100) {
                linkedList.poll();
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZLLL(C64246PJi c64246PJi, Object obj) {
        boolean z;
        List<C64246PJi> list = LIZLLL.getList(C64243PJf.LIZ(c64246PJi, obj));
        list.add(c64246PJi);
        int size = list.size();
        if (size >= 30) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[enqueue] size=");
        LIZ.append(size);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJIJJLI();
        if (!z || !PKZ.LIZ || PKZ.LJI) {
            return;
        }
        try {
            C64214PIc.LIZ().LIZ(new ARunnableS18S0000000_11(20));
        } catch (Throwable unused) {
        }
    }

    public static void LJI(C64246PJi c64246PJi, Object obj, long j, File file) {
        JSONArray LIZIZ;
        LinkedList linkedList = new LinkedList();
        linkedList.add(c64246PJi);
        C64268PKe.LIZLLL();
        JSONObject jSONObject = C64268PKe.LIZJ(linkedList).LIZ;
        if (obj == LJI) {
            LIZIZ = null;
        } else {
            LIZIZ = PJV.LIZIZ(obj);
        }
        C64240PJc.LIZ(jSONObject, LIZIZ, new C64242PJe(file, j));
    }
}
