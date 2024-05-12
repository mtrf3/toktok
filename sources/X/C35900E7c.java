package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.E7c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35900E7c implements InterfaceC28214B5m {
    @Override // X.InterfaceC28214B5m
    public final void LIZ(B8B b8b) {
        int i;
        try {
            JSONObject jSONObject = b8b.LJLJI;
            Boolean LIZLLL = C38987FRv.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
            if (LIZLLL.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cold_start_first_launch", i);
        } catch (Throwable unused) {
        }
        FMX.LJIILJJIL("ui_sample_report", b8b.LJLJI);
    }
}
