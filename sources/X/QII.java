package X;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QII implements J2V {
    public final /* synthetic */ QIN LIZ;
    public final /* synthetic */ QI3 LIZIZ;

    @Override // X.J2V
    public final Object LIZ() {
        String str;
        C48306Ixa c48306Ixa;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appId", this.LIZ.LIZ);
            jSONObject.put("channel", this.LIZ.LIZJ);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("AppLog Version", "5.6.8-bugfix.11");
            jSONObject2.put("AppLog Region", "global");
            jSONObject2.put("API Encrypt", this.LIZIZ.LJIJI);
            jSONObject2.put("Debug Log", false);
            this.LIZ.getClass();
            jSONObject2.put("Custom Log", false);
            jSONObject2.put("Auto Start", this.LIZ.LIZIZ);
            jSONObject2.put("Auto Active", this.LIZ.LJIJJ);
            this.LIZ.getClass();
            jSONObject2.put("Silence", false);
            jSONObject2.put("Sp Name", this.LIZ.LJJ);
            jSONObject2.put("Db Name", this.LIZ.LIZ());
            this.LIZ.getClass();
            jSONObject2.put("Lifycycle", false);
            this.LIZIZ.getClass();
            jSONObject2.put("Disable Personalization", false);
            jSONObject2.put("Minor Version", this.LIZ.LJIILLIIL);
            jSONObject2.put("Version Code", String.valueOf(this.LIZ.LJIILIIL));
            jSONObject2.put("Version Name", this.LIZ.LJIIJJI);
            jSONObject2.put("App Name", this.LIZ.LJIIIZ);
            if (this.LIZ.LJII == 1) {
                str = "main";
            } else {
                str = "child";
            }
            jSONObject2.put("Process", str);
            jSONObject2.put("Region", this.LIZ.LJ);
            jSONObject2.put("Language", this.LIZ.LIZLLL);
            this.LIZ.getClass();
            jSONObject2.put("Play Session", false);
            jSONObject2.put("Event Sampling", this.LIZIZ.LJJ);
            jSONObject2.put("Event Priority", this.LIZIZ.LJJI);
            this.LIZIZ.getClass();
            jSONObject2.put("Event User Id", false);
            this.LIZIZ.getClass();
            jSONObject2.put("Tourist Mode", false);
            jSONObject2.put("Tourist Event", this.LIZIZ.LJIJJLI);
            jSONObject2.put("Dau Fix", this.LIZIZ.LJIL);
            this.LIZIZ.getClass();
            jSONObject2.put("HTTP Proxy", false);
            this.LIZIZ.getClass();
            jSONObject2.put("EXP Batch Interval", (Object) null);
            if (this.LIZ.LJIIJ == null) {
                jSONObject2.put("Server Domain", "default");
            } else {
                ArrayList arrayList = new ArrayList();
                C48852JFg c48852JFg = this.LIZ.LJIIJ.LIZLLL;
                if (c48852JFg != null && (c48306Ixa = c48852JFg.LJLILLLLZI) != null) {
                    if (!TextUtils.isEmpty(c48306Ixa.LJLIL)) {
                        arrayList.add(this.LIZ.LJIIJ.LIZLLL.LJLILLLLZI.LJLIL);
                    }
                    if (!TextUtils.isEmpty(this.LIZ.LJIIJ.LIZLLL.LJLILLLLZI.LJLILLLLZI)) {
                        arrayList.add(this.LIZ.LJIIJ.LIZLLL.LJLILLLLZI.LJLILLLLZI);
                    }
                }
                String[] strArr = this.LIZ.LJIIJ.LIZ;
                if (strArr != null && strArr.length > 0) {
                    arrayList.add(TextUtils.join(";", strArr));
                }
                if (!TextUtils.isEmpty(this.LIZ.LJIIJ.LIZJ)) {
                    arrayList.add(this.LIZ.LJIIJ.LIZJ);
                }
                if (!TextUtils.isEmpty(this.LIZ.LJIIJ.LIZJ)) {
                    arrayList.add(this.LIZ.LJIIJ.LIZJ);
                }
                jSONObject2.put("Server Domain", TextUtils.join("、", arrayList));
            }
            jSONObject.put("config", jSONObject2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public QII(QI3 qi3, QIN qin) {
        this.LIZIZ = qi3;
        this.LIZ = qin;
    }
}
