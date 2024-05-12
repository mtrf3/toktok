package X;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QPp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66957QPp {
    public static volatile C66957QPp LIZLLL;
    public final QTW LIZ;
    public volatile boolean LIZIZ;
    public C66961QPt LIZJ;

    public C66957QPp(QTW qtw) {
        this.LIZ = qtw;
    }

    public static C66961QPt LIZLLL(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C66961QPt c66961QPt = new C66961QPt();
            c66961QPt.LIZ = jSONObject.optString("message");
            c66961QPt.LIZIZ = jSONObject.optInt("protocol_type");
            c66961QPt.LIZLLL = jSONObject.optString("log_id");
            c66961QPt.LJ = jSONObject.optBoolean("degrade");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (optJSONObject != null) {
                optJSONObject.optString("device_name");
                optJSONObject.optString("user_name");
                c66961QPt.LIZJ = optJSONObject.optLong("user_id");
            }
            return c66961QPt;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void LIZ(C66961QPt c66961QPt) {
        if (c66961QPt != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("logId", c66961QPt.LIZLLL);
                jSONObject.put("protocol_type", c66961QPt.LIZIZ);
                jSONObject.put("is_login", this.LIZ.LLIIIJ);
                jSONObject.put("user_id", this.LIZ.LLFII);
                C79146V4k.LJJJZ("passport_receive_frontier_message", jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final synchronized void LIZIZ(String str) {
        C66961QPt LIZLLL2 = LIZLLL(str);
        LIZ(LIZLLL2);
        if (this.LIZIZ) {
            return;
        }
        if (!this.LIZ.LLIIIJ) {
            return;
        }
        if (LIZLLL2 == null) {
            return;
        }
        if (LIZLLL2.LJ) {
            return;
        }
        if (QWR.LIZIZ() && LIZLLL2.LIZJ != this.LIZ.LLFII) {
            return;
        }
        this.LIZJ = LIZLLL2;
        if (C66952QPk.LIZ) {
            C66953QPl c66953QPl = C66953QPl.LJZL;
            if (!C66953QPl.LLD) {
                c66953QPl.getClass();
            } else {
                c66953QPl.LJLJLJ.removeMessages(1000);
            }
        }
        this.LIZIZ = true;
        String LIZJ = C66953QPl.LJZL.LIZJ("frontier", false, false);
        QQM.LJIIJJI(this.LIZ.LLILLL, LIZJ, new C66958QPq(this, LIZJ)).LJIIIZ();
    }

    public final void LIZJ(String str, List list, boolean z) {
        InterfaceC66963QPv interfaceC66963QPv;
        if (z) {
            if (C66952QPk.LIZ) {
                C66953QPl c66953QPl = C66953QPl.LJZL;
                c66953QPl.getClass();
                C38901fq.LJII(str, list, true);
                if (C66953QPl.LLD && (interfaceC66963QPv = c66953QPl.LJLLJ) != null && ((QTW) interfaceC66963QPv).LLIIIJ) {
                    c66953QPl.LIZ();
                    InterfaceC66963QPv interfaceC66963QPv2 = c66953QPl.LJLLJ;
                    if (interfaceC66963QPv2 != null) {
                        ((QTW) interfaceC66963QPv2).LIZJ(true);
                    }
                    R7H r7h = c66953QPl.LJLLILLLL;
                    if (r7h != null) {
                        r7h.LJJIIJ("frontier", null, null);
                    }
                }
            }
        } else {
            this.LIZJ = null;
        }
        if (C66952QPk.LIZ) {
            C66953QPl c66953QPl2 = C66953QPl.LJZL;
            if (!C66953QPl.LLD) {
                c66953QPl2.getClass();
            } else {
                c66953QPl2.LJLJLJ.sendEmptyMessageDelayed(1000, c66953QPl2.LJLJJLL.LIZJ);
            }
        }
        this.LIZIZ = false;
    }
}
