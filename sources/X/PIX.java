package X;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PIX {
    public static boolean LIZ = false;
    public static int LIZIZ = 0;
    public static List<C64180PGu> LIZJ = null;
    public static volatile long LIZLLL = -1;
    public static long LJ = 100;
    public static long LJFF = 0;
    public static long LJI = 0;
    public static long LJII = 0;
    public static int LJIIIIZZ = 0;
    public static boolean LJIIIZ = false;
    public static volatile String LJIIJ = null;
    public static volatile boolean LJIIJJI = false;
    public static int LJIIL = -1;
    public static volatile long LJIILIIL = 0;
    public static long LJIILJJIL = -1;
    public static long LJIILL = -1;
    public static int LJIILLIIL = -1;
    public static MessageQueue LJIIZILJ;
    public static Field LJIJ;
    public static Field LJIJI;

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(6:15|16|6|7|8|9)|3|(1:14)|5|6|7|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        X.PJZ.LIZ.getClass();
        X.PJY.LIZ("NPTH_CATCH", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject LIZ() {
        /*
            X.0aN r0 = X.C10040aO.LIZ
            if (r0 == 0) goto Lb
            X.1PY r0 = (X.C1PY) r0     // Catch: java.lang.Throwable -> Lb
            X.PGw r4 = r0.LIZ()     // Catch: java.lang.Throwable -> Lb
            goto L2b
        Lb:
            X.PGu r4 = new X.PGu
            r4.<init>()
            java.lang.String r0 = X.PIX.LJIIJ
            r4.LJFF = r0
            long r5 = X.PIX.LIZLLL
            long r0 = X.PIX.LJIILL
            long r5 = r5 - r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
        L1f:
            long r0 = X.PIX.LJ
            long r5 = r5 * r0
            r4.LIZLLL = r5
            long r2 = X.PIX.LJIILIIL
            long r0 = X.PIX.LJI
            long r2 = r2 - r0
            r4.LJ = r2
        L2b:
            org.json.JSONObject r3 = r4.LIZ()
            goto L33
        L30:
            r5 = 1
            goto L1f
        L33:
            java.lang.String r1 = "message"
            java.lang.String r0 = r4.LJFF     // Catch: java.lang.Throwable -> L50
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "currentMessageCost"
            long r0 = r4.LIZLLL     // Catch: java.lang.Throwable -> L50
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "currentMessageCpu"
            long r0 = r4.LJ     // Catch: java.lang.Throwable -> L50
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "currentTick"
            long r0 = X.PIX.LIZLLL     // Catch: java.lang.Throwable -> L50
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L50
            goto L5b
        L50:
            r1 = move-exception
            X.PJY r0 = X.PJZ.LIZ
            r0.getClass()
            java.lang.String r0 = "NPTH_CATCH"
            X.PJY.LIZ(r0, r1)
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PIX.LIZ():org.json.JSONObject");
    }

    public static List<C64180PGu> LIZIZ() {
        List<C64177PGr> list;
        if (C10040aO.LIZ != null) {
            try {
                C64178PGs c64178PGs = C64125PEr.LIZLLL().LJIIIIZZ.LJIIIZ;
                if (c64178PGs != null) {
                    list = c64178PGs.LIZ();
                } else {
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        arrayList.add(C64179PGt.LIZ((C64177PGr) ListProtector.get(list, i)));
                    }
                    return arrayList;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        if (LIZJ == null) {
            return null;
        }
        LJIIJJI = true;
        ArrayList arrayList2 = new ArrayList();
        if (((ArrayList) LIZJ).size() == LIZIZ) {
            for (int i2 = LJIILLIIL; i2 < ((ArrayList) LIZJ).size(); i2++) {
                arrayList2.add(ListProtector.get(LIZJ, i2));
            }
            for (int i3 = 0; i3 < LJIILLIIL; i3++) {
                arrayList2.add(ListProtector.get(LIZJ, i3));
            }
        } else {
            arrayList2.addAll(LIZJ);
        }
        LJIIJJI = false;
        return arrayList2;
    }

    public static JSONArray LIZJ() {
        List<C64180PGu> LIZIZ2;
        JSONArray jSONArray = new JSONArray();
        try {
            LIZIZ2 = LIZIZ();
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
        }
        if (LIZIZ2 == null) {
            return jSONArray;
        }
        for (C64180PGu c64180PGu : LIZIZ2) {
            if (c64180PGu != null) {
                jSONArray.put(c64180PGu.LIZ());
            }
        }
        return jSONArray;
    }

    public static MessageQueue LJ() {
        if (LJIIZILJ == null && C16880lQ.LLJJJJ() != null) {
            Looper LLJJJJ = C16880lQ.LLJJJJ();
            if (LLJJJJ == Looper.myLooper()) {
                LJIIZILJ = Looper.myQueue();
            } else if (Build.VERSION.SDK_INT >= 23) {
                LJIIZILJ = LLJJJJ.getQueue();
            } else {
                try {
                    Field declaredField = LLJJJJ.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    LJIIZILJ = (MessageQueue) declaredField.get(LLJJJJ);
                } catch (Throwable unused) {
                }
            }
        }
        return LJIIZILJ;
    }

    public static C64180PGu LJI() {
        int size = ((ArrayList) LIZJ).size();
        int i = LIZIZ;
        if (size == i) {
            int i2 = (LJIILLIIL + 1) % i;
            LJIILLIIL = i2;
            return (C64180PGu) ListProtector.get(LIZJ, i2);
        }
        C64180PGu c64180PGu = new C64180PGu();
        ((ArrayList) LIZJ).add(c64180PGu);
        LJIILLIIL++;
        return c64180PGu;
    }

    public static boolean LJII() {
        if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "disable_monitor_gray_extra") != 1) {
            C64257PJt LIZIZ2 = PK0.LIZIZ();
            LIZIZ2.getClass();
            try {
                java.util.Map<String, Object> commonParams = LIZIZ2.LIZIZ.getCommonParams();
                if (commonParams.containsKey("isGrayExtra")) {
                    if (((Boolean) commonParams.get("isGrayExtra")).booleanValue()) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static JSONArray LIZLLL(long j) {
        MessageQueue LJ2 = LJ();
        JSONArray jSONArray = new JSONArray();
        if (LJ2 == null) {
            return jSONArray;
        }
        try {
            synchronized (LJ2) {
                Message LJFF2 = LJFF(LJ2);
                if (LJFF2 == null) {
                    return jSONArray;
                }
                int i = 0;
                int i2 = 0;
                while (LJFF2 != null && i < 300) {
                    i++;
                    i2++;
                    JSONObject LJIIIIZZ2 = LJIIIIZZ(LJFF2, j);
                    try {
                        LJIIIIZZ2.put("id", i2);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(LJIIIIZZ2);
                    if (LJFF2.getWhen() - j > 0 && i > 100) {
                        break;
                    }
                    Field field = LJIJI;
                    if (field == null) {
                        try {
                            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                            LJIJI = declaredField;
                            declaredField.setAccessible(true);
                            LJFF2 = (Message) LJIJI.get(LJFF2);
                        } catch (Exception unused2) {
                            LJFF2 = null;
                        }
                    } else {
                        LJFF2 = (Message) field.get(LJFF2);
                    }
                }
                return jSONArray;
            }
        } catch (Throwable th) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th);
            return jSONArray;
        }
    }

    public static Message LJFF(MessageQueue messageQueue) {
        Field field = LJIJ;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                LJIJ = declaredField;
                declaredField.setAccessible(true);
                return (Message) LJIJ.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static JSONObject LJIIIIZZ(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", obj);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }
}
