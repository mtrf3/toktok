package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* renamed from: X.Erp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37757Erp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C37757Erp LJLIL = new C37757Erp();

    public C37757Erp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Object LIZ;
        boolean z;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("enable_router_if_handled");
            if (config != null) {
                LIZ = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(config, "enable"));
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Boolean bool = (Boolean) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
