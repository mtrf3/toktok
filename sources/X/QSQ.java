package X;

import com.bytedance.common.utility.collection.WeakHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QSQ implements InterfaceC67000QRg {
    public final Object LJLIL;

    @Override // X.InterfaceC67000QRg
    public final void LJII() {
        C1JX.LJIIIIZZ("Push Sender Monitor: ", "update sender success");
        QSS.LIZIZ(0, "update sender success", null);
    }

    @Override // X.InterfaceC67000QRg
    public final void LJIIL() {
        C1JX.LJIIIIZZ("Push switcher monitor：", "the out-app switcher upload success");
        QSS.LIZ(0, "the out-app switcher upload success", null);
    }

    public final int LJFF() {
        return ((ArrayList) this.LJLIL).size();
    }

    @Override // X.InterfaceC67000QRg
    public final void LJIILLIIL() {
        if (QST.LIZJ.compareAndSet(false, true)) {
            if (QST.LIZ().hasMessages(2)) {
                QST.LIZ().removeMessages(2);
            }
            QST.LIZIZ(0, System.currentTimeMillis() - QST.LIZLLL);
        }
    }

    @Override // X.InterfaceC67000QRg
    public final void init() {
        QRR qrr = (QRR) this.LJLIL;
        if (C36929EeT.LJFF(QM0.LIZ)) {
            QST.LIZLLL = System.currentTimeMillis();
            QST.LIZ().sendEmptyMessageDelayed(2, qrr.LJIL);
        }
    }

    public /* synthetic */ QSQ(int i) {
        this.LJLIL = new ArrayList(i);
    }

    public final void LIZ(Object obj) {
        ((ArrayList) this.LJLIL).add(obj);
    }

    @Override // X.InterfaceC67000QRg
    public final void LIZJ(int i) {
        java.util.Map<Integer, Boolean> map = QSS.LIZIZ;
        synchronized (map) {
            if (((Boolean) ((ConcurrentHashMap) map).get(Integer.valueOf(i))) == null) {
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Boolean.TRUE);
                WeakHandler weakHandler = QSS.LIZ;
                weakHandler.sendMessageDelayed(weakHandler.obtainMessage(1001, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1L));
            }
        }
    }

    public final void LJ(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                Object obj2 = this.LJLIL;
                ((ArrayList) obj2).ensureCapacity(((ArrayList) obj2).size() + objArr.length);
                Collections.addAll((ArrayList) this.LJLIL, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            ((ArrayList) this.LJLIL).addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                ((ArrayList) this.LJLIL).add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                ((ArrayList) this.LJLIL).add(it2.next());
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Don't know how to spread ");
            LIZ.append(obj.getClass());
            throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC67000QRg
    public final void LJI(int i) {
        java.util.Map<Integer, Boolean> map = QSS.LIZIZ;
        synchronized (map) {
            Boolean bool = (Boolean) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue()) {
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Boolean.FALSE);
                QSS.LIZ.removeMessages(1001, Integer.valueOf(i));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C67007QRn.LJI(QM0.LIZ).LIZLLL(i));
                LIZ.append(" register success");
                String LIZIZ = X1D.LIZIZ(LIZ);
                C79062V1e.LJI("Push Sender Monitor: ", i, " register success");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 0);
                    jSONObject.put("pushType", i);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                C79004UzY.LJJJJ("push_monitor_register_result", jSONObject, null, null);
                QSU.LIZ("1004", LIZIZ, 0, jSONObject);
            }
        }
    }

    public final Object[] LJIIIZ(Object[] objArr) {
        return ((ArrayList) this.LJLIL).toArray(objArr);
    }

    public QSQ(QRR qrr) {
        this.LJLIL = qrr;
        C79004UzY.LJLJJLL = qrr.LJIIZILJ;
    }

    @Override // X.InterfaceC67000QRg
    public final void LIZIZ(int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (i != 301) {
            if (i != 302) {
                str2 = "Server return empty response";
            } else {
                str2 = "Server return not success";
            }
        } else {
            str2 = "network error";
        }
        QSS.LIZ(i, str2, jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Push switcher monitor：upload error，reason: ");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC67000QRg
    public final void LIZLLL(int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        switch (i) {
            case 301:
                str2 = "network error";
                break;
            case 302:
                str2 = "server return error";
                break;
            case 303:
                str2 = "server return empty allow_push_list";
                break;
            default:
                str2 = "update_sender api return empty";
                break;
        }
        QSS.LIZIZ(i, str2, jSONObject);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Push Sender Monitor: update sender error, reason: ");
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC67000QRg
    public final void LJIIIIZZ(String str, boolean z) {
        if (z) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 107);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("sender", str);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C79004UzY.LJJJJ("push_monitor_register_result", jSONObject, null, jSONObject2);
        QSU.LIZ("1004", "This device does not support the sender/channel delivered by the server", 107, jSONObject2);
    }

    @Override // X.InterfaceC67000QRg
    public final void LJIILL(int i, int i2, String str, String str2) {
        java.util.Map<Integer, Boolean> map = QSS.LIZIZ;
        synchronized (map) {
            Boolean bool = (Boolean) ((ConcurrentHashMap) map).get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue()) {
                ((ConcurrentHashMap) map).put(Integer.valueOf(i), Boolean.FALSE);
                QSS.LIZ.removeMessages(1001, Integer.valueOf(i));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("pushType", i);
                    jSONObject.put("status", i2);
                    jSONObject.put("3rd_code", str);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("msg", str2);
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                String str3 = C67007QRn.LJI(QM0.LIZ).LIZLLL(i) + " register failed，reason: " + str2;
                C79004UzY.LJJJJ("push_monitor_register_result", jSONObject, null, jSONObject2);
                QSU.LIZ("1004", str3, i2, jSONObject);
            }
        }
    }
}
