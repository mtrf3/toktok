package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.OId, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61667OId extends AbstractC61668OIe {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        Activity LIZLLL2;
        Activity LIZLLL3;
        o.LJIIIZ(type, "type");
        XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC61670OIg.class, null);
        String pageName = ((InterfaceC61669OIf) xBaseParamModel).getPageName();
        int hashCode = pageName.hashCode();
        if (hashCode != -1818618242) {
            if (hashCode != -1642579952) {
                if (hashCode == 985115772 && pageName.equals("app_setting_page")) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("package:");
                    LIZ.append(GlobalContext.getApplicationContext().getPackageName());
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ)));
                    try {
                        intent.putExtra("pns.sandbox.dataflow_id", 1207965697);
                        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
                        if (interfaceC38263Ezz != null && (LIZLLL3 = interfaceC38263Ezz.LIZLLL()) != null) {
                            C16880lQ.LIZIZ(LIZLLL3, intent);
                        }
                    } catch (Exception e) {
                        C0NB.LIZIZ("OpenLiveInterruptGuideJumpSettingMethod", e.getMessage());
                    }
                }
            } else if (pageName.equals("battery_setting_page") && Build.VERSION.SDK_INT >= 23) {
                Intent intent2 = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                try {
                    intent2.putExtra("pns.sandbox.dataflow_id", 1207965697);
                    InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
                    if (interfaceC38263Ezz2 != null && (LIZLLL2 = interfaceC38263Ezz2.LIZLLL()) != null) {
                        C16880lQ.LIZIZ(LIZLLL2, intent2);
                    }
                } catch (Exception e2) {
                    C0NB.LIZIZ("OpenLiveInterruptGuideJumpSettingMethod", e2.getMessage());
                }
            }
        } else if (pageName.equals("home_setting_page")) {
            Intent intent3 = new Intent("android.settings.SETTINGS");
            try {
                intent3.putExtra("pns.sandbox.dataflow_id", 1207965697);
                InterfaceC38263Ezz interfaceC38263Ezz3 = this.LJLIL;
                if (interfaceC38263Ezz3 != null && (LIZLLL = interfaceC38263Ezz3.LIZLLL()) != null) {
                    C16880lQ.LIZIZ(LIZLLL, intent3);
                }
            } catch (Exception e3) {
                C0NB.LIZIZ("OpenLiveInterruptGuideJumpSettingMethod", e3.getMessage());
            }
        }
        c37356ElM.onSuccess(xBaseResultModel, "");
    }
}
