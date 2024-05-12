package X;

import android.app.Application;
import android.util.AndroidRuntimeException;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.FmD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39957FmD {
    public static void LIZ(C39966FmM c39966FmM, InterfaceC60323Nlv token) {
        o.LJIIJ(token, "token");
        LynxEnv.LJIIIZ().getClass();
        c39966FmM.LIZ.getClass();
        C39963FmJ c39963FmJ = C39963FmJ.LIZ;
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
                W5I.LIZIZ(C39961FmH.LIZ(), null);
            }
            LJIIIZ.LJIJ = new C80036Vb6();
        }
        C39959FmF c39959FmF = new C39959FmF(c39966FmM, c34k);
        LynxEnv LJIIIZ2 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ2, "LynxEnv.inst()");
        LJIIIZ2.LIZJ = new C40028FnM(token);
        LynxEnv LJIIIZ3 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ3, "LynxEnv.inst()");
        LJIIIZ3.LJIJJLI = c39966FmM.LIZ.LIZ;
        LynxEnv LJIIIZ4 = LynxEnv.LJIIIZ();
        Application LIZ = C39961FmH.LIZ();
        c39966FmM.LIZ.getClass();
        LJIIIZ4.LJI(LIZ, c39963FmJ, new C40524FvM(token), c39959FmF);
        LynxEnv LJIIIZ5 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ5, "LynxEnv.inst()");
        LJIIIZ5.LJIIL();
        if (LJIIIZ5.LJIILIIL) {
            LLog.LIZJ(C39956FmC.LIZLLL);
            LLog.LIZ(new C39956FmC(token));
            c39966FmM.LIZ.getClass();
        }
        for (Map.Entry entry : ((LinkedHashMap) c39966FmM.LIZ.LIZLLL).entrySet()) {
            LynxEnv LJIIIZ6 = LynxEnv.LJIIIZ();
            LJIIIZ6.LJFF().LIZJ((String) entry.getKey(), ((C31970Cgg) entry.getValue()).LIZ, ((C31970Cgg) entry.getValue()).LIZIZ);
        }
        C39962FmI c39962FmI = c39966FmM.LIZ.LJ;
        LynxEnv LJIIIZ7 = LynxEnv.LJIIIZ();
        o.LJFF(LJIIIZ7, "LynxEnv.inst()");
        c39962FmI.invoke(LJIIIZ7);
        if (!C39961FmH.LIZIZ) {
            LynxEnv LJIIIZ8 = LynxEnv.LJIIIZ();
            LJIIIZ8.getClass();
            LLog.LIZLLL(2, "LynxEnv", "Turn off redbox");
            LJIIIZ8.LJIILL("enable_redbox", false);
            LynxEnv.LJIIIZ().LIZIZ(false);
            return;
        }
        ArrayList arrayList = (ArrayList) c39966FmM.LIZ.LIZIZ;
        if (arrayList.size() <= 0) {
            return;
        }
        LynxEnv.LJIIIZ().LIZIZ(true);
        if (!C39961FmH.LIZJ) {
            LynxEnv.LJIIIZ().LIZ();
        }
        LynxDevtoolGlobalHelper.getInstance().registerCardListener(C39967FmN.LIZIZ);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object processor = it.next();
            o.LJIIJ(processor, "processor");
            ((ArrayList) C39967FmN.LIZ).add(processor);
        }
    }
}
