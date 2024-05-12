package X;

import Y.ARunnableS17S0000000_10;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NhC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60030NhC implements InterfaceC60043NhP {
    public static final C60030NhC LJI = new C60030NhC();
    public static final Handler LJII = new Handler(C16880lQ.LLJJJJ());
    public static Handler LJIIIIZZ = null;
    public static final ARunnableS17S0000000_10 LJIIIZ = new ARunnableS17S0000000_10(14);
    public static final ARunnableS17S0000000_10 LJIIJ = new ARunnableS17S0000000_10(15);
    public int LIZIZ;
    public long LJFF;
    public final List<InterfaceC60042NhO> LIZ = new ArrayList();
    public final C60034NhG LIZLLL = new C60034NhG();
    public final C60036NhI LIZJ = new C60036NhI();
    public final C60038NhK LJ = new C60038NhK(new C60045NhR());

    public static void LIZ() {
        if (LJIIIIZZ == null) {
            Handler handler = new Handler(C16880lQ.LLJJJJ());
            LJIIIIZZ = handler;
            handler.post(LJIIIZ);
            LJIIIIZZ.postDelayed(LJIIJ, 200L);
        }
    }

    public final void LIZIZ(View view, InterfaceC60039NhL interfaceC60039NhL, JSONObject jSONObject) {
        EnumC59884Neq enumC59884Neq;
        Object obj;
        boolean z = false;
        if (C60040NhM.LIZ(view) == null) {
            C60034NhG c60034NhG = this.LIZLLL;
            if (c60034NhG.LIZLLL.contains(view)) {
                enumC59884Neq = EnumC59884Neq.PARENT_VIEW;
            } else if (c60034NhG.LJII) {
                enumC59884Neq = EnumC59884Neq.OBSTRUCTION_VIEW;
            } else {
                enumC59884Neq = EnumC59884Neq.UNDERLYING_VIEW;
            }
            if (enumC59884Neq == EnumC59884Neq.UNDERLYING_VIEW) {
                return;
            }
            JSONObject LIZ = interfaceC60039NhL.LIZ(view);
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                    jSONObject.put("childViews", optJSONArray);
                }
                optJSONArray.put(LIZ);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C60034NhG c60034NhG2 = this.LIZLLL;
            if (c60034NhG2.LIZ.size() != 0 && (obj = c60034NhG2.LIZ.get(view)) != null) {
                c60034NhG2.LIZ.remove(view);
                if (obj != null) {
                    try {
                        LIZ.put("adSessionId", obj);
                    } catch (JSONException unused) {
                        C1GE.LIZ("Error with setting ad session id");
                    }
                    this.LIZLLL.LJII = true;
                    this.LIZIZ++;
                }
            }
            C60034NhG c60034NhG3 = this.LIZLLL;
            C60037NhJ c60037NhJ = c60034NhG3.LIZIZ.get(view);
            if (c60037NhJ != null) {
                c60034NhG3.LIZIZ.remove(view);
                C60021Nh3 c60021Nh3 = c60037NhJ.LIZ;
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = c60037NhJ.LIZIZ.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                try {
                    LIZ.put("isFriendlyObstructionFor", jSONArray);
                    LIZ.put("friendlyObstructionClass", c60021Nh3.LIZIZ);
                    LIZ.put("friendlyObstructionPurpose", c60021Nh3.LIZJ);
                    LIZ.put("friendlyObstructionReason", c60021Nh3.LIZLLL);
                } catch (JSONException unused2) {
                    C1GE.LIZ("Error with setting friendly obstruction");
                }
            }
            if (enumC59884Neq == EnumC59884Neq.PARENT_VIEW) {
                z = true;
            }
            interfaceC60039NhL.LIZIZ(view, LIZ, this, z);
            this.LIZIZ++;
        }
    }
}
