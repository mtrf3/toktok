package X;

import android.app.Application;
import android.util.AndroidRuntimeException;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Flz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39943Flz {
    public static void LIZ(C39935Flr c39935Flr) {
        C39941Flx.LIZ();
        InterfaceC39940Flw interfaceC39940Flw = c39935Flr.LIZJ;
        if (interfaceC39940Flw == null) {
            interfaceC39940Flw = C39944Fm0.LIZ;
        }
        C34K c34k = new C34K();
        c34k.element = false;
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        try {
            c34k.element = true;
        } catch (Throwable unused) {
            C16880lQ.LLLLIIL(new AndroidRuntimeException("Fresco Not Found, Image will not work normally"));
        }
        if (c34k.element) {
            if (!W5I.LIZLLL) {
                W5I.LIZIZ(C39849FkT.LIZ(), null);
            }
            LJIIIZ.LJIJ = new C80036Vb6();
        }
        C39945Fm1 c39945Fm1 = new C39945Fm1(c39935Flr, c34k);
        LynxEnv LJIIIZ2 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ2, "LynxEnv.inst()");
        LJIIIZ2.LIZJ = new C40029FnN();
        LynxEnv LJIIIZ3 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ3, "LynxEnv.inst()");
        LJIIIZ3.LJIJJLI = c39935Flr.LIZ;
        LynxEnv LJIIIZ4 = LynxEnv.LJIIIZ();
        Application LIZ = C39849FkT.LIZ();
        AbstractC40526FvO abstractC40526FvO = c39935Flr.LIZLLL;
        if (abstractC40526FvO == null) {
            abstractC40526FvO = new C40523FvL();
        }
        LJIIIZ4.LJI(LIZ, interfaceC39940Flw, abstractC40526FvO, c39945Fm1);
        LynxEnv LJIIIZ5 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ5, "LynxEnv.inst()");
        LJIIIZ5.LJIIL();
        if (LJIIIZ5.LJIILIIL) {
            LLog.LIZJ(C39950Fm6.LIZIZ);
            LLog.LIZ(new C39950Fm6());
            if (c39935Flr.LJI != null) {
                Application context = C39849FkT.LIZ();
                o.LJIIJ(context, "context");
            }
        }
        for (Map.Entry<String, C39947Fm3> entry : c39935Flr.LJFF.entrySet()) {
            LynxEnv LJIIIZ6 = LynxEnv.LJIIIZ();
            LJIIIZ6.LJFF().LIZJ(entry.getKey(), entry.getValue().LIZ, entry.getValue().LIZIZ);
        }
        InterfaceC88472Yns<LynxEnv, C76800UCe> interfaceC88472Yns = c39935Flr.LJII;
        LynxEnv LJIIIZ7 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ7, "LynxEnv.inst()");
        interfaceC88472Yns.invoke(LJIIIZ7);
        if (!C39849FkT.LIZ) {
            LynxEnv LJIIIZ8 = LynxEnv.LJIIIZ();
            LJIIIZ8.getClass();
            LLog.LIZLLL(2, "LynxEnv", "Turn off redbox");
            LJIIIZ8.LJIILL("enable_redbox", false);
            LynxEnv.LJIIIZ().LIZIZ(false);
            return;
        }
        List<InterfaceC39851FkV> list = c39935Flr.LIZIZ;
        if (list.size() <= 0) {
            return;
        }
        LynxEnv.LJIIIZ().LIZIZ(true);
        if (!C39849FkT.LIZIZ) {
            LynxEnv.LJIIIZ().LIZ();
        }
        LynxDevtoolGlobalHelper.getInstance().registerCardListener(C39946Fm2.LIZIZ);
        for (InterfaceC39851FkV processor : list) {
            o.LJIIJ(processor, "processor");
            List<InterfaceC39851FkV> list2 = C39946Fm2.LIZ;
            synchronized (list2) {
                ((ArrayList) list2).add(processor);
            }
        }
    }
}
