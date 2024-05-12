package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.PDa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64082PDa implements InterfaceC64103PDv {
    public static volatile C64082PDa LJLJJL;
    public static final AtomicBoolean LJLJJLL = new AtomicBoolean(false);
    public boolean LJLIL;
    public boolean LJLILLLLZI = true;
    public JSONObject LJLJI;
    public JSONObject LJLJJI;

    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
    }

    public static C64082PDa LIZIZ() {
        IConfigManager iConfigManager;
        if (LJLJJL == null) {
            synchronized (C64082PDa.class) {
                if (LJLJJL == null) {
                    LJLJJL = new C64082PDa();
                }
            }
        }
        AtomicBoolean atomicBoolean = LJLJJLL;
        if (!atomicBoolean.get() && (iConfigManager = (IConfigManager) C171096nZ.LIZ(IConfigManager.class)) != null) {
            atomicBoolean.set(true);
            iConfigManager.registerConfigListener(LJLJJL);
        }
        return LJLJJL;
    }

    public final byte LIZJ(String str, boolean z) {
        JSONObject jSONObject;
        byte b = 0;
        if (!this.LJLILLLLZI) {
            return (byte) 0;
        }
        if (z && ((jSONObject = this.LJLJJI) == null || jSONObject.optDouble(str, -1.0d) > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
            b = (byte) 16;
        }
        JSONObject jSONObject2 = this.LJLJI;
        if (jSONObject2 != null && jSONObject2.optDouble(str, -1.0d) > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return (byte) (b | 1);
        }
        return b;
    }

    @Override // X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        boolean optBoolean;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("tracing")) == null) {
            optBoolean = true;
        } else {
            optBoolean = optJSONObject.optBoolean("enable_open", true);
        }
        this.LJLILLLLZI = optBoolean;
        if (!this.LJLIL) {
            this.LJLJI = C43001GuD.LJIJI("tracing", "allow_service_list", jSONObject);
            this.LJLJJI = C43001GuD.LJIJI("tracing", "allow_error_list", jSONObject);
            this.LJLIL = true;
        }
    }
}
