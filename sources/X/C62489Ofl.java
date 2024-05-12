package X;

import android.view.View;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ofl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62489Ofl implements InterfaceC19530ph {
    public final /* synthetic */ C62493Ofp LIZ;

    public C62489Ofl(C62493Ofp c62493Ofp) {
        this.LIZ = c62493Ofp;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        String str;
        o.LJIIIZ(itemID, "itemID");
        InterfaceC62486Ofi interfaceC62486Ofi = this.LIZ.LJIIIIZZ.LJLJJL;
        JSONObject jSONObject = new JSONObject();
        Integer num = null;
        if (interfaceC62486Ofi != null) {
            str = interfaceC62486Ofi.key();
        } else {
            str = null;
        }
        jSONObject.put("action_id", str);
        jSONObject.put("expose_time", System.currentTimeMillis());
        if (interfaceC62486Ofi != null) {
            num = Integer.valueOf(Boolean.valueOf(interfaceC62486Ofi.enable()).booleanValue() ? 1 : 0);
        }
        jSONObject.put("enabled", num);
        C62468OfQ.LIZIZ.add(jSONObject);
    }
}
