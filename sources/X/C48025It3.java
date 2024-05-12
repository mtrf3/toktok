package X;

import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.It3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48025It3 implements InterfaceC48026It4 {
    public static final C48025It3 LIZ = new C48025It3();

    @Override // X.InterfaceC48026It4
    public final void LIZ(JSONObject jSONObject) {
        if (o.LJ("net_quality", "net_quality")) {
            if (FMX.LIZJ("net_quality")) {
                AppLogNewUtils.onEventV3("net_quality", jSONObject);
                return;
            }
            return;
        }
        AppLogNewUtils.onEventV3("net_quality", jSONObject);
    }
}
