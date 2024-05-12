package X;

import Y.ARunnableS34S0200000_15;
import Y.ARunnableS6S1101000_15;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.XtP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86267XtP extends AbstractC86252XtA {
    public final /* synthetic */ C86266XtO LJLJJLL;

    @Override // X.InterfaceC86221Xsf
    public final void LIZIZ(JSONObject jSONObject) {
        Activity LJIJJLI = UC0.LJIJJLI(this.LJLJJLL.LJLJJI);
        if (LJIJJLI == null) {
            return;
        }
        LJIJJLI.runOnUiThread(new ARunnableS34S0200000_15(jSONObject, this, 19));
    }

    @Override // X.InterfaceC86221Xsf
    public final void LIZJ(JSONArray jSONArray) {
        Activity LJIJJLI = UC0.LJIJJLI(this.LJLJJLL.LJLJJI);
        if (LJIJJLI == null) {
            return;
        }
        LJIJJLI.runOnUiThread(new ARunnableS34S0200000_15(jSONArray, this, 19));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86267XtP(C86266XtO c86266XtO, WeakReference weakReference) {
        super(weakReference);
        this.LJLJJLL = c86266XtO;
    }

    @Override // X.InterfaceC86221Xsf
    public final void LIZ(int i, String str) {
        Activity LJIJJLI = UC0.LJIJJLI(this.LJLJJLL.LJLJJI);
        if (LJIJJLI == null) {
            return;
        }
        LJIJJLI.runOnUiThread(new ARunnableS6S1101000_15(this, i, str, 1));
    }
}
