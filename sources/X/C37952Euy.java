package X;

import Y.ARunnableS4S1300000_6;
import android.os.Handler;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Euy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37952Euy implements InterfaceC37589Ep7 {
    public final C37905EuD LIZ;

    public C37952Euy(C37905EuD bdxBridge) {
        o.LJIIJ(bdxBridge, "bdxBridge");
        this.LIZ = bdxBridge;
    }

    @Override // X.InterfaceC37589Ep7
    public final void LIZ(String url, String name, JSONObject params, C37586Ep4 c37586Ep4) {
        o.LJIIJ(url, "url");
        o.LJIIJ(name, "name");
        o.LJIIJ(params, "params");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(params.get("__callback_id"));
        LIZ.append("_worker");
        params.put("__callback_id", X1D.LIZIZ(LIZ));
        params.put("__iframe_url", "");
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS4S1300000_6(this, c37586Ep4, params, url, 3));
    }
}
