package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GdP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC41959GdP implements Runnable {
    public final /* synthetic */ InterfaceC65784Pro<C140295ez> LJLIL;
    public final /* synthetic */ C41967GdX LJLILLLLZI;

    public RunnableC41959GdP(InterfaceC65784Pro<C140295ez> interfaceC65784Pro, C41967GdX c41967GdX) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = c41967GdX;
    }

    public final void LIZ() {
        java.util.Map<String, String> params = this.LJLIL.invoke().LIZ;
        C41970Gda c41970Gda = (C41970Gda) this.LJLILLLLZI.LIZ.getValue();
        c41970Gda.getClass();
        o.LJIIIZ(params, "params");
        if (params.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(((Keva) c41970Gda.LIZ.getValue()).getString("key_creation_biz_metrics", "{}"));
            for (Map.Entry entry : ((LinkedHashMap) params).entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            ((Keva) c41970Gda.LIZ.getValue()).storeString("key_creation_biz_metrics", jSONObject.toString());
        } catch (JSONException unused) {
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
}
