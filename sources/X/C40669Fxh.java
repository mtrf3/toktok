package X;

import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.Fxh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40669Fxh {
    public static final C40669Fxh LIZ = new C40669Fxh();
    public static C40665Fxd LIZIZ;

    public final synchronized C40665Fxd LIZ() {
        C40665Fxd c40665Fxd;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c40665Fxd = LIZIZ;
        if (c40665Fxd != null) {
            if (!o.LJ((String) c40665Fxd.LJLIL, curUserId)) {
                InterfaceC57138Mbe interfaceC57138Mbe = (InterfaceC57138Mbe) c40665Fxd.LJLILLLLZI;
                if (interfaceC57138Mbe != null) {
                    interfaceC57138Mbe.LIZ();
                }
                InterfaceC55760LuW interfaceC55760LuW = (InterfaceC55760LuW) c40665Fxd.LJLJI;
                if (interfaceC55760LuW != null) {
                    interfaceC55760LuW.LIZ();
                }
            }
        }
        C57170McA c57170McA = new C57170McA();
        EventBus.LIZJ().LJIILJJIL(c57170McA);
        c40665Fxd = new C40665Fxd(curUserId, c57170McA, new A7W(0));
        LIZIZ = c40665Fxd;
        return c40665Fxd;
    }
}
