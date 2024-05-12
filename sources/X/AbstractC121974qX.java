package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4qX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC121974qX {
    public InterfaceC121824qI LIZ;

    public void LIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
    }

    public void LIZIZ(InterfaceC126684y8 nleSession) {
        o.LJIIIZ(nleSession, "nleSession");
    }

    public abstract void LIZJ(NLEEditor nLEEditor);

    public final InterfaceC121824qI LIZLLL() {
        InterfaceC121824qI interfaceC121824qI = this.LIZ;
        if (interfaceC121824qI != null) {
            return interfaceC121824qI;
        }
        o.LJIJI("managerProxy");
        throw null;
    }

    public final void LJ(InterfaceC121824qI managerProxy) {
        o.LJIIIZ(managerProxy, "managerProxy");
        this.LIZ = managerProxy;
        synchronized (C121984qY.LIZJ) {
            Iterator it = ((ArrayList) C121984qY.LIZ).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) next;
                    if (((Number) ListProtector.get(C121984qY.LIZIZ, i)).intValue() != 1) {
                        managerProxy.getLogger().LIZ(str);
                    } else {
                        managerProxy.getLogger().LIZIZ(str);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            ((ArrayList) C121984qY.LIZ).clear();
            ((ArrayList) C121984qY.LIZIZ).clear();
        }
    }

    public final void LJFF(String debug) {
        o.LJIIIZ(debug, "debug");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(": ");
        LIZ.append(debug);
        String LIZIZ = X1D.LIZIZ(LIZ);
        InterfaceC121824qI interfaceC121824qI = this.LIZ;
        if (interfaceC121824qI != null) {
            interfaceC121824qI.getLogger().LIZ(LIZIZ);
        } else {
            C121984qY.LIZJ.LIZ(0, LIZIZ);
        }
    }

    public final void LJI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append(": ");
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        InterfaceC121824qI interfaceC121824qI = this.LIZ;
        if (interfaceC121824qI != null) {
            interfaceC121824qI.getLogger().LIZIZ(LIZIZ);
        } else {
            C121984qY.LIZJ.LIZ(1, LIZIZ);
        }
    }
}
