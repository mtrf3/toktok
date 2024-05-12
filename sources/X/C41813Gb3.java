package X;

import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Gb3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41813Gb3 implements InterfaceC48038ItG, InterfaceC43405H1t, InterfaceC41817Gb7 {
    public static final C41813Gb3 LJLIL = new C41813Gb3();

    @Override // X.InterfaceC41817Gb7
    public String getName() {
        return "ToolsWaveReporter";
    }

    @Override // X.InterfaceC41817Gb7
    public void LIZ(C41815Gb5 c41815Gb5) {
        H7B.LIZJ(c41815Gb5.getMsg());
        C78983UzD.LJIJ(c41815Gb5, "creative_tools_publish");
        if (!o.LJ(c41815Gb5.getCode(), "777005")) {
            return;
        }
        C41819Gb9 c41819Gb9 = new C41819Gb9("Wave EventObserver internal error", c41815Gb5);
        C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
        C41775GaR.LJ(C41819Gb9.optMessage$default(c41819Gb9, null, 1, null), c41819Gb9, null);
        throw c41815Gb5;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        Object LJLLLL = ORZ.LJLLLL(it);
        if (LJLLLL != null) {
            return LJLLLL;
        }
        throw new RuntimeException("load music result is empty");
    }

    @Override // X.InterfaceC41817Gb7
    public void log(String msg) {
        o.LJIIIZ(msg, "msg");
        H7B.LJ(msg);
    }

    public static void LIZJ(String tag, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ(tag, message);
    }

    public static void LIZLLL(String str, Throwable th) {
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZLLL(str, th);
    }

    public static void LJFF(String tag, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        C60903NvH.LJIIJJI().getPublishService().LJJ().LJ(tag, message);
    }

    @Override // X.InterfaceC43405H1t
    public void LIZIZ(String tag, String message) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(message, "message");
        H78.LIZ(message);
    }

    public void LJ(String tag, AqS156S0100000_6 aqS156S0100000_6) {
        o.LJIIIZ(tag, "tag");
        C60903NvH.LJIIJJI().getPublishService().LJJ().LJFF(tag, aqS156S0100000_6);
    }
}
