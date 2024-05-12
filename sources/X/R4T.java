package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R4T implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;
    public final WeakReference<Context> LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;

    public R4T(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        this.LJLILLLLZI = weakReference;
        this.LJLIL = c38049EwX;
    }

    public final void LIZ(C38048EwW c38048EwW, int i) {
        int i2;
        if (c38048EwW == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            jSONObject.put("code", i2);
            jSONObject.put("errorCode", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJLIL.LIZLLL(c38048EwW.LIZIZ, jSONObject);
    }

    @Override // X.InterfaceC38012Evw
    public final void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        if (this.LJLILLLLZI.get() == null) {
            return;
        }
        c38048EwW.LJIIJ = false;
        this.LJLJI = JSONObjectProtectorUtils.getString(c38048EwW.LIZLLL, "code");
        try {
            this.LJLJJI = JSONObjectProtectorUtils.getBoolean(c38048EwW.LIZLLL, "ignoreErrorToast");
        } catch (JSONException unused) {
        }
        R4S r4s = new R4S(this, c38048EwW);
        Application application = C58725N2z.LIZ;
        String str = this.LJLJI;
        HashMap hashMap = new HashMap();
        C69012R6q c69012R6q = new C69012R6q(str);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/validate_code/v1/");
        qqn.LJ(C69013R6r.LJIIJJI(c69012R6q), hashMap);
        new C69013R6r(application, qqn.LJFF(), c69012R6q, r4s).LJIIIZ();
    }
}
