package X;

import android.view.View;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import org.json.JSONObject;

/* renamed from: X.Cg6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31934Cg6 extends COP<VNS> {
    public static final C31934Cg6 LIZIZ = new C31934Cg6();

    public C31934Cg6() {
        super("lynx");
    }

    @Override // X.COU
    public final void LIZ(View view, String str, JSONObject jSONObject) {
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
        JSONObject jSONObject2 = new JSONObject();
        ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).le();
        jSONObject2.put("virtual_aid", "99999");
        lynxViewMonitor.reportCustom((VNS) view, str, null, jSONObject, null, null, jSONObject2, 0);
    }
}
