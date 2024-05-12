package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.helios.api.consumer.ReportParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.compliance.sandbox.settings.PnsNetSandboxDfidConfigModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PaS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64708PaS implements InterfaceC65943PuN {
    @Override // X.InterfaceC65943PuN
    public final int LIZ() {
        return 8;
    }

    @Override // X.InterfaceC65943PuN
    public final int priority() {
        return 0;
    }

    @Override // X.InterfaceC65943PuN
    public final void LIZIZ(PYQ event) {
        String host;
        InterfaceC37276Ek4 interfaceC37276Ek4;
        String host2;
        String method;
        String str;
        C37274Ek2 c37274Ek2;
        InterfaceC48133Iun interfaceC48133Iun;
        o.LJIIIZ(event, "event");
        if (!(event instanceof C65896Ptc)) {
            return;
        }
        C62822Ol8 c62822Ol8 = C38246Ezi.LIZ;
        double d = ((PnsNetSandboxDfidConfigModel) c62822Ol8.getValue()).stackSampleRate;
        if (d >= 1.0d || (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d) <= d)) {
            C65896Ptc c65896Ptc = (C65896Ptc) event;
            if (c65896Ptc.LJLILLLLZI.size() <= 0 || (host = ((android.net.Uri) ListProtector.get(c65896Ptc.LJLILLLLZI, 0)).getHost()) == null || C38245Ezh.LIZ(host)) {
                return;
            }
            Object obj = event.LJJJJL().LJLIL.LJ;
            String str2 = null;
            Request request = null;
            if (obj instanceof InterfaceC37276Ek4) {
                interfaceC37276Ek4 = (InterfaceC37276Ek4) obj;
            } else {
                interfaceC37276Ek4 = null;
            }
            if (interfaceC37276Ek4 == null) {
                if (!(obj instanceof InterfaceC48133Iun) || (interfaceC48133Iun = (InterfaceC48133Iun) obj) == null) {
                    return;
                }
                okhttp3.Request request2 = interfaceC48133Iun.request();
                host2 = request2.url().LIZLLL;
                method = request2.method();
                str = request2.headers().LIZLLL("x-tt-dataflow-id");
            } else {
                Request request3 = interfaceC37276Ek4.request();
                host2 = request3.getHost();
                method = request3.getMethod();
                EJ6 firstHeader = request3.getFirstHeader("x-tt-dataflow-id");
                if (firstHeader != null) {
                    str2 = firstHeader.LIZIZ;
                }
                str = str2;
                request = request3;
            }
            if (C38245Ezh.LIZ(host2)) {
                return;
            }
            if (str == null) {
                event.LJJJJL().LJLLLL.add(new ReportParam("sandbox_report_tags", "dataflow_id_allow_stack", "category", false, false, 24, null));
                event.LJJJJL().LJLLLL.add(new ReportParam("sandbox_report_method", method, "category", false, false, 24, null));
                if (request != null && (c37274Ek2 = (C37274Ek2) request.tag(C37274Ek2.class)) != null) {
                    List<ReportParam> list = event.LJJJJL().LJLLLL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(c37274Ek2.LIZ.getDeclaringClass().getName());
                    LIZ.append('#');
                    LIZ.append(c37274Ek2.LIZ.getName());
                    list.add(new ReportParam("sandbox_report_invocation", X1D.LIZIZ(LIZ), "category", false, false, 24, null));
                }
                c65896Ptc.LJLJJLL = true;
                c65896Ptc.LJLJJL = true;
                event.LJJJJL().LJZI.LJLILLLLZI = true;
                return;
            }
            double d2 = ((PnsNetSandboxDfidConfigModel) c62822Ol8.getValue()).stackDfidSampleRate;
            if (d2 >= 1.0d || (d2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d) <= d2)) {
                event.LJJJJL().LJLLLL.add(new ReportParam("sandbox_report_tags", str, "category", false, false, 24, null));
                event.LJJJJL().LJLLLL.add(new ReportParam("sandbox_report_method", method, "category", false, false, 24, null));
                c65896Ptc.LJLJJLL = false;
                c65896Ptc.LJLJJL = true;
                event.LJJJJL().LJZI.LJLILLLLZI = true;
            }
        }
    }
}
