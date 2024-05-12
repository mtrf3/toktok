package X;

import X.QQI;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.QPx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66965QPx<R extends QQI> implements QQ7, QQ8 {
    public final Context LIZ;
    public final String LIZIZ;
    public final QQ1 LIZJ;
    public final QQ4 LIZLLL;
    public QQE LJ;
    public C66966QPy LJFF;
    public boolean LJI;

    public abstract void LJ(R r);

    public abstract void LJFF(JSONObject jSONObject, JSONObject jSONObject2);

    public abstract void LJII(JSONObject jSONObject, JSONObject jSONObject2);

    public abstract R LJIIJ(boolean z, QQ4 qq4);

    static {
        new QQ5();
        new QQ6();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66965QPx.LIZJ():boolean");
    }

    public final void LJIIIZ() {
        C66966QPy c66966QPy = new C66966QPy(this);
        if (c66966QPy.LJLIL.compareAndSet(false, true)) {
            if (AbstractRunnableC65809PsD.LJLJL == null) {
                AbstractRunnableC65809PsD.LJLJL = C65810PsE.LIZ();
            }
            C65810PsE c65810PsE = AbstractRunnableC65809PsD.LJLJL;
            synchronized (c65810PsE) {
                c66966QPy.LJLJJI = C65810PsE.LJIILIIL.incrementAndGet();
                if (!c65810PsE.LIZ) {
                    c65810PsE.LJFF();
                }
                if (c66966QPy.LJLJJLL == EnumC65806PsA.IMMEDIATE) {
                    RunnableC39007FSp.LIZIZ(c66966QPy);
                } else {
                    c66966QPy.LJLJI.removeMessages(0);
                    c66966QPy.LJLJI.sendEmptyMessageDelayed(0, 1000L);
                    c65810PsE.LJ.add(c66966QPy);
                }
            }
        }
        this.LJFF = c66966QPy;
    }

    public static String LIZLLL(String str) {
        String LJI = C1GE.LJI(str, "passport_csrf_token");
        if (TextUtils.isEmpty(LJI)) {
            return C1GE.LJI(str, "passport_csrf_token_default");
        }
        return LJI;
    }

    public static JSONObject LJI(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        if (jSONObject.has("data")) {
            try {
                Object opt = jSONObject.opt("data");
                if (opt == null) {
                    return null;
                }
                if (opt instanceof JSONObject) {
                    jSONObject2 = (JSONObject) opt;
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    JSONObject jSONObject3 = new JSONObject();
                    try {
                        jSONObject3.put("data", jSONArray);
                        jSONObject2 = jSONObject3;
                    } catch (Exception e) {
                        e = e;
                        jSONObject2 = jSONObject3;
                        C16880lQ.LLLLIIL(e);
                        return jSONObject2;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return jSONObject2;
    }

    public final void LIZIZ(List<C66967QPz> list) {
        String str;
        try {
            Context context = this.LIZ;
            if (context != null) {
                str = ((QTW) QTW.LIZIZ(context)).LLF;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                ((ArrayList) list).add(new C66967QPz("x-tt-multi-sids", str));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZ(String str, List list) {
        try {
            String LIZLLL = LIZLLL(str);
            if (!TextUtils.isEmpty(LIZLLL)) {
                ((ArrayList) list).add(new C66967QPz("x-tt-passport-csrf-token", LIZLLL));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public AbstractC66965QPx(Context context, QQ1 qq1, QQE qqe) {
        this.LIZ = C16880lQ.LLLLL(context);
        this.LIZIZ = qq1.LIZ;
        this.LIZJ = qq1;
        this.LJ = qqe;
        if (qqe != null) {
            qqe.mJobController = this;
        }
        this.LIZLLL = new QQ4(qq1);
    }

    public final boolean LJIIIIZZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!"success".equals(str)) {
            if (("error".equals(str) || "exception".equals(str)) && jSONObject2 != null) {
                if (jSONObject2.has("error_code")) {
                    QQ4 qq4 = this.LIZLLL;
                    qq4.LIZIZ = jSONObject2.optInt("error_code", qq4.LIZIZ);
                } else if (jSONObject2.has("code")) {
                    QQ4 qq42 = this.LIZLLL;
                    qq42.LIZIZ = jSONObject2.optInt("code", qq42.LIZIZ);
                }
                this.LIZLLL.LIZJ = jSONObject2.optString("description");
                QQ4 qq43 = this.LIZLLL;
                qq43.LJ = qq43.LIZJ;
                LJFF(jSONObject2, jSONObject);
                return false;
            }
            return false;
        }
        if (jSONObject2 != null) {
            LJII(jSONObject, jSONObject2);
            return true;
        }
        return true;
    }
}
