package X;

import com.bytedance.helios.network.NetworkInvoker;
import org.json.JSONObject;

/* renamed from: X.Pk1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65301Pk1 implements E18 {
    public final E18 LIZ;

    public C65301Pk1(E18 e18) {
        this.LIZ = e18;
    }

    @Override // X.E18
    public final boolean LIZ(JSONObject jSONObject) {
        boolean z;
        E18 e18 = this.LIZ;
        if (e18 != null) {
            z = e18.LIZ(jSONObject);
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        NetworkInvoker.Companion.getClass();
        NetworkInvoker.networkInvoker.preInvoke(400402, "com.ss.android.common.applog.SendLogCallback", "onBeforeSendLog", this, new Object[]{jSONObject}, "java.lang.Boolean", new C65300Pk0());
        return true;
    }
}
