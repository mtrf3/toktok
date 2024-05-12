package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Fnc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40044Fnc implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ VNU LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ boolean LJLL = false;

    public final void LIZ() {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("fetchTime", this.LJLIL / 1000.0d);
            jSONObject2.put("completeTime", this.LJLILLLLZI / 1000.0d);
            jSONObject2.put("fetchTimeStamp", this.LJLJI / 1000.0d);
            jSONObject2.put("finishTimeStamp", this.LJLJJI / 1000.0d);
            jSONObject.put("timeMetrics", jSONObject2);
            VNU vnu = this.LJLJJL;
            if (vnu != null && vnu.LJI() != null) {
                String templateUrl = this.LJLJJL.LJI().getTemplateUrl();
                if (TextUtils.isEmpty(templateUrl)) {
                    templateUrl = "";
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("url", templateUrl);
                JSONObject jSONObject4 = this.LJLJJLL;
                if (jSONObject4 != null) {
                    long j = JSONObjectProtectorUtils.getLong(jSONObject4, "viewWidth");
                    long j2 = JSONObjectProtectorUtils.getLong(this.LJLJJLL, "viewHeight");
                    long j3 = JSONObjectProtectorUtils.getLong(this.LJLJJLL, "width");
                    long j4 = JSONObjectProtectorUtils.getLong(this.LJLJJLL, "height");
                    String string = JSONObjectProtectorUtils.getString(this.LJLJJLL, "config");
                    if (j <= 0) {
                        j = -1;
                    }
                    jSONObject3.put("viewWidth", j);
                    if (j2 <= 0) {
                        j2 = -1;
                    }
                    jSONObject3.put("viewHeight", j2);
                    if (j3 <= 0) {
                        j3 = -1;
                    }
                    jSONObject3.put("width", j3);
                    if (j4 <= 0) {
                        j4 = -1;
                    }
                    jSONObject3.put("height", j4);
                    jSONObject3.put("config", string);
                }
                jSONObject.put("metric", jSONObject3);
            }
            jSONObject.put("image_url", this.LJLJL);
            if (this.LJLJLJ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("successRate", i);
            jSONObject.put("memoryCost", this.LJLJLLL);
            jSONObject.put("is_memory", this.LJLL);
            Iterator<InterfaceC40047Fnf> it = C40046Fne.LIZ.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            ((InterfaceC79401VEf) VEZ.LIZIZ().LIZ(InterfaceC79401VEf.class)).reportImageStatus("lynx_image_status", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC40044Fnc(long j, long j2, long j3, long j4, VNU vnu, JSONObject jSONObject, String str, boolean z, int i) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = j3;
        this.LJLJJI = j4;
        this.LJLJJL = vnu;
        this.LJLJJLL = jSONObject;
        this.LJLJL = str;
        this.LJLJLJ = z;
        this.LJLJLLL = i;
    }
}
