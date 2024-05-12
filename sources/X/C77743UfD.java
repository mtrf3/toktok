package X;

import com.bytedance.android.live.wallet.IWalletService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UfD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77743UfD implements InterfaceC77797Ug5 {
    public static final C77743UfD LIZ = new C77743UfD();

    @Override // X.InterfaceC77797Ug5
    public final void LIZ(EnumC77751UfL monitorType, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        EnumC77742UfC enumC77742UfC;
        InterfaceC77746UfG walletMonitorService = ((IWalletService) CN1.LIZ(IWalletService.class)).getWalletMonitorService();
        o.LJIIIIZZ(monitorType, "monitorType");
        int i = C77752UfM.LIZ[monitorType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    enumC77742UfC = EnumC77742UfC.BOTH;
                } else {
                    throw new C162476Zf();
                }
            } else {
                enumC77742UfC = EnumC77742UfC.APP_LOG;
            }
        } else {
            enumC77742UfC = EnumC77742UfC.MONITOR;
        }
        walletMonitorService.LIZ(enumC77742UfC, str, jSONObject, jSONObject2, jSONObject3, null);
    }
}
