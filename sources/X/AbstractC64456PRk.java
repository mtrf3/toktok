package X;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.PRk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64456PRk {
    public volatile boolean LIZ;
    public final LinkedBlockingDeque<C64464PRs> LIZIZ = new LinkedBlockingDeque<>();
    public final CopyOnWriteArrayList<InterfaceC64469PRx> LIZJ;

    public final void LJ() {
        this.LIZ = true;
        PFC.LJLLJ = true;
        C64454PRi c64454PRi = C64454PRi.LJLILLLLZI;
        c64454PRi.getClass();
        if (!C64454PRi.LJLJJI) {
            if (C53240Kuy.LIZ()) {
                PFC pfc = PFC.LJLJLLL;
                if (pfc == null) {
                    PFC.LJIILJJIL(100L);
                    PFC.LJLLJ = true;
                    PFC.LJLLILLLL = true;
                    C36381bm.LJIL.LJIIIIZZ();
                    C25500zK.LJI();
                    new PFC(false).LJIILL();
                    C64125PEr.LIZLLL().getClass();
                } else {
                    pfc.LJ(true, 100L, false);
                }
            }
            C36381bm.LJIL.LIZLLL(c64454PRi);
        }
        C64454PRi.LJLJJI = true;
        this.LIZIZ.addFirst(new C64464PRs());
    }

    public AbstractC64456PRk() {
        new DecimalFormat("#.00");
        CopyOnWriteArrayList<InterfaceC64469PRx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(new C64457PRl());
        copyOnWriteArrayList.add(new C64459PRn());
        copyOnWriteArrayList.add(new C64465PRt());
        this.LIZJ = copyOnWriteArrayList;
    }

    public final JSONArray LIZLLL(float f) {
        C64464PRs pollLast;
        boolean z;
        JSONArray jSONArray = new JSONArray();
        while (true) {
            try {
                pollLast = this.LIZIZ.pollLast();
                if (pollLast != null) {
                    if (pollLast.LIZ.size() == f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                } else {
                    pollLast = null;
                    break;
                }
            } catch (Throwable unused) {
            }
        }
        if (pollLast == null) {
            int i = (int) f;
            if (i == 0) {
                return new JSONArray();
            }
            JSONArray jSONArray2 = new JSONArray();
            try {
                C118234kV it = C78842Uww.LJJ(0, i).iterator();
                while (it.LJLJI) {
                    it.nextInt();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("dropType", 4);
                    jSONArray2.put(jSONObject);
                }
                return jSONArray2;
            } catch (Throwable unused2) {
                return jSONArray2;
            }
        }
        Iterator<C64467PRv> it2 = pollLast.LIZ.iterator();
        while (it2.hasNext()) {
            C64467PRv next = it2.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dropType", next.LIZ);
            jSONObject2.put("isDoFrame", next.LIZIZ);
            JSONArray jSONArray3 = new JSONArray();
            for (C64468PRw c64468PRw : next.LIZJ) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("methodStack", c64468PRw.LIZ);
                jSONObject3.put("percent", c64468PRw.LIZIZ);
                jSONArray3.put(jSONObject3);
            }
            jSONObject2.put("messageResult", jSONArray3);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }
}
