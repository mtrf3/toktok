package X;

import a04.IDfS3S0000000_10;
import android.content.Context;
import java.util.HashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O8d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61407O8d {
    public static String LIZ;

    public static C39281gS LIZIZ() {
        JSONObject jSONObject;
        LIZ = C61161NzR.LIZIZ.LJ();
        try {
            jSONObject = new JSONObject(LIZ);
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            jSONObject = null;
        }
        C275716j c275716j = new C275716j();
        c275716j.LIZ = false;
        c275716j.LIZIZ = jSONObject;
        if (jSONObject == null) {
            c275716j.LIZIZ = new JSONObject();
        }
        return new C39281gS(c275716j);
    }

    public static C35191Zr LIZ() {
        C35191Zr LIZIZ = C35191Zr.LIZIZ();
        if (!LIZIZ.LIZ) {
            synchronized (C61407O8d.class) {
                if (!LIZIZ.LIZ) {
                    LIZJ(EF7.LIZIZ());
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZJ(Context context) {
        C22760uu c22760uu = new C22760uu(context);
        c22760uu.LIZIZ = LIZIZ();
        c22760uu.LIZJ = NK6.LIZ;
        c22760uu.LJ = new C59960Ng4();
        C06360Mu c06360Mu = new C06360Mu();
        c06360Mu.LIZ = true;
        c06360Mu.LIZIZ = new IDfS3S0000000_10(2);
        c06360Mu.LIZ(O0M.LIZ);
        C33897DSb.LIZ.getClass();
        if (C33897DSb.LIZ()) {
            c06360Mu.LIZ(new C36773Ebx());
        }
        C30371Hd c30371Hd = new C30371Hd(c06360Mu);
        if (c22760uu.LIZLLL == null) {
            c22760uu.LIZLLL = new HashMap();
        }
        ((HashMap) c22760uu.LIZLLL).put("c2s", c30371Hd);
        c22760uu.LIZ();
        C61161NzR.LIZIZ.LIZLLL(new AqS160S0100000_10(C35191Zr.LIZIZ(), 504));
    }
}
