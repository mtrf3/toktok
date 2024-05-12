package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.QRn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67007QRn {
    public static final java.util.Set LIZIZ = new CopyOnWriteArraySet();
    public static C67007QRn LIZJ;
    public final java.util.Map LIZ;

    public final JSONArray LIZ() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (Integer num : ((HashMap) this.LIZ).keySet()) {
                if (LJII(num.intValue())) {
                    jSONArray.put(num);
                }
            }
        } catch (Throwable unused) {
            for (Object obj : ((HashMap) this.LIZ).keySet()) {
                if (obj instanceof Integer) {
                    Integer num2 = (Integer) obj;
                    if (LJII(num2.intValue())) {
                        jSONArray.put(num2);
                    }
                }
            }
        }
        return jSONArray;
    }

    public C67007QRn(Context context) {
        HashMap hashMap = new HashMap();
        this.LIZ = hashMap;
        if (hashMap.size() == 0) {
            hashMap.put(5, new C67009QRp(5, "com.fcm.FcmPushAdapter", "fcm", new C67008QRo(QM0.LIZ)));
            hashMap.put(14, new C67009QRp(14, "com.adm.push.AdmPushAdapter", "amazon", new C67014QRu(QM0.LIZ)));
            hashMap.put(15, new C67009QRp(15, "com.bytedance.push.frontier.FrontierPushAdapter", "frontierPush", new C78880UxY()));
            hashMap.put(21, new C67009QRp(21, "com.bytedance.push.sync.SyncPushAdapter", "sync", new C67014QRu(QM0.LIZ)));
        }
        QM0.LIZ((Application) C16880lQ.LLLLL(context));
    }

    public static C67007QRn LJI(Context context) {
        if (LIZJ == null) {
            synchronized (C67007QRn.class) {
                if (LIZJ == null) {
                    LIZJ = new C67007QRn(context);
                }
            }
        }
        return LIZJ;
    }

    public static boolean LJIIIIZZ(int i) {
        Logger.debug();
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) LIZIZ;
        if (copyOnWriteArraySet.isEmpty()) {
            QRG.LIZIZ().getClass();
            LJ(QRG.LIZJ().LJIILIIL(), false);
        }
        return copyOnWriteArraySet.contains(Integer.valueOf(i));
    }

    public final InterfaceC67012QRs LIZIZ(int i) {
        InterfaceC67017QRx interfaceC67017QRx = (InterfaceC67017QRx) ((AbstractC67010QRq) ((HashMap) this.LIZ).get(Integer.valueOf(i))).LJFF(new Object[0]);
        if (interfaceC67017QRx == null) {
            return null;
        }
        return interfaceC67017QRx.LIZIZ();
    }

    public final int LIZJ(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            for (Integer num : ((HashMap) this.LIZ).keySet()) {
                if (str.equals(((InterfaceC67017QRx) ((AbstractC67010QRq) ((HashMap) this.LIZ).get(num)).LJFF(new Object[0])).LIZJ())) {
                    return num.intValue();
                }
            }
        }
        return -1;
    }

    public final String LIZLLL(int i) {
        if (((HashMap) this.LIZ).get(Integer.valueOf(i)) == null) {
            return "unknown";
        }
        return ((InterfaceC67017QRx) ((AbstractC67010QRq) ((HashMap) this.LIZ).get(Integer.valueOf(i))).LJFF(new Object[0])).LIZ();
    }

    public final boolean LJFF(String str) {
        try {
            if (!TextUtils.isEmpty(str) && !"[]".equals(str)) {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() <= 0) {
                    return false;
                }
                if (jSONArray.optInt(0) != -9307) {
                    String jSONArray2 = LIZ().toString();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        int optInt = jSONArray.optInt(i);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(optInt);
                        LIZ.append("");
                        if (!jSONArray2.contains(X1D.LIZIZ(LIZ))) {
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public final boolean LJII(int i) {
        InterfaceC67017QRx interfaceC67017QRx = (InterfaceC67017QRx) ((AbstractC67010QRq) ((HashMap) this.LIZ).get(Integer.valueOf(i))).LJFF(new Object[0]);
        if (interfaceC67017QRx == null) {
            return false;
        }
        return interfaceC67017QRx.LIZLLL();
    }

    public static void LJ(String str, boolean z) {
        if (z) {
            QRG.LIZIZ().getClass();
            QRG.LIZJ().LJJIIJ(str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1JX.LJIIIIZZ("support:", str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            Logger.debug();
            ((CopyOnWriteArraySet) LIZIZ).clear();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                int optInt = jSONArray.optInt(i);
                if (optInt > 0) {
                    ((CopyOnWriteArraySet) LIZIZ).add(Integer.valueOf(optInt));
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
