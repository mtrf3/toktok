package X;

import Y.ARunnableS7S1100000_6;
import Y.IDRunnableS0S0201000;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.jsbridge.JsBridge2PermissionConfigurator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ewo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38066Ewo {
    public final /* synthetic */ InterfaceC38069Ewr LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C38065Ewn LIZJ;

    public final void LIZ(Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fetch configurations failed, url: ");
        LIZ.append(this.LIZJ.LJ);
        X1D.LIZIZ(LIZ);
        if (this.LIZJ.LJIIIZ.incrementAndGet() < 3) {
            this.LIZJ.LIZIZ(this.LIZ, this.LIZIZ);
            return;
        }
        C36741EbR c36741EbR = C37960Ev6.LJIJJLI;
        c36741EbR.LIZIZ = Boolean.FALSE;
        c36741EbR.LIZ = th.getMessage();
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZJ(this.LIZJ.LJ, "url");
        c38185Eyj.LIZJ(this.LIZIZ, "param");
        c38185Eyj.LIZJ(C16880lQ.LJLLJ(th.getClass()), "exception_name");
        c38185Eyj.LIZJ(th.getMessage(), "exception_message");
        c38185Eyj.LIZ("label_fetch_on_failed", C38113ExZ.LJIIIZ);
        C38065Ewn c38065Ewn = this.LIZJ;
        c38065Ewn.LJFF.execute(new IDRunnableS0S0201000(1, c38065Ewn, this.LIZ, 6));
    }

    public final void LIZIZ(String str) {
        C38065Ewn c38065Ewn = this.LIZJ;
        c38065Ewn.getClass();
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "data"), "packages"), ((JsBridge2PermissionConfigurator) c38065Ewn.LIZJ).LIZIZ());
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (JSONObjectProtectorUtils.getJSONObject(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), "content").length() > 0) {
                    }
                }
                C37960Ev6.LJIJJLI.LIZIZ = Boolean.TRUE;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Fetch configurations succeed, url: ");
                LIZ.append(this.LIZJ.LJ);
                X1D.LIZIZ(LIZ);
                this.LIZJ.LJFF.execute(new ARunnableS7S1100000_6(this, str, 1));
                return;
            }
        } catch (Exception unused) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("check response format failed, url: ");
            LIZ2.append(c38065Ewn.LJ);
            LIZ2.append(", response: ");
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("check response format failed, url: ");
        LIZ(new Throwable(C025908h.LIZIZ(LIZ3, this.LIZJ.LJ, ", response: ", str, LIZ3)));
    }

    public C38066Ewo(C38065Ewn c38065Ewn, InterfaceC38069Ewr interfaceC38069Ewr, String str) {
        this.LIZJ = c38065Ewn;
        this.LIZ = interfaceC38069Ewr;
        this.LIZIZ = str;
    }
}
