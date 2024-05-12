package X;

import android.app.Activity;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O6J extends O6R {
    public final /* synthetic */ ViewGroup LJLJJI;
    public final /* synthetic */ O6G LJLJJL;

    public O6J(ViewGroup viewGroup, O6G o6g) {
        this.LJLJJI = viewGroup;
        this.LJLJJL = o6g;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        if (str.length() == 0) {
            this.LJLJJL.LIZ(this.LJLJJI);
            return;
        }
        if (new JSONObject(str).optBoolean("close_activity", false)) {
            Activity LIZIZ = C27740Aue.LIZIZ(this.LJLJJI);
            if (LIZIZ == null) {
                return;
            }
            LIZIZ.finish();
            return;
        }
        this.LJLJJL.LIZ(this.LJLJJI);
    }
}
