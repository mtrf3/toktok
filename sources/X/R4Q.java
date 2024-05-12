package X;

import android.content.Context;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R4Q implements InterfaceC38012Evw {
    public final C38049EwX LJLIL;
    public final WeakReference<Context> LJLILLLLZI;
    public R4P LJLJI;

    public R4Q(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        this.LJLILLLLZI = weakReference;
        this.LJLIL = c38049EwX;
    }

    public final void LIZ(C38048EwW c38048EwW, boolean z) {
        int i;
        if (c38048EwW == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject.put("code", i);
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
        if (TextUtils.isEmpty(R41.LIZ().getCurUser().getBindPhone())) {
            C5S1 c5s1 = new C5S1(this.LJLILLLLZI.get());
            c5s1.LIZJ(R.string.h0p);
            c5s1.LJ();
            LIZ(c38048EwW, false);
            return;
        }
        c38048EwW.LJIIJ = false;
        this.LJLJI = new R4P(this, c38048EwW);
        HashMap hashMap = new HashMap();
        if (C35338Dtu.LIZ()) {
            hashMap.put("is6Digits", "1");
        }
        new R7H(C58725N2z.LIZ).LIZIZ("", 22, hashMap, this.LJLJI);
    }
}
