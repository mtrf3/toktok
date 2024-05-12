package X;

import Y.ARunnableS1S2101000_11;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65926Pu6 {
    public static final CopyOnWriteArrayList<InterfaceC65941PuL> LIZ = new CopyOnWriteArrayList<>();
    public static boolean LIZIZ;

    public static void LIZ(String tag, InterfaceC65784Pro interfaceC65784Pro, int i, Throwable th) {
        String str;
        o.LJIIIZ(tag, "tag");
        if (!C35810E3q.LJIIIIZZ() && i != 6) {
            if (((Boolean) C34639Did.LJIIL.getValue()).booleanValue()) {
                return;
            }
            if (((Boolean) C34639Did.LJIIJJI.getValue()).booleanValue() && o.LJ("Helios:Network-Invoke", tag)) {
                return;
            }
        }
        Iterator<InterfaceC65941PuL> it = LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(tag, interfaceC65784Pro, i, th);
        }
        if (!LIZIZ) {
            return;
        }
        if (interfaceC65784Pro != null) {
            str = (String) interfaceC65784Pro.invoke();
        } else {
            str = null;
        }
        if (!LIZIZ) {
            return;
        }
        HandlerThreadC65936PuG.LIZ();
        HandlerThreadC65936PuG.LJLILLLLZI.post(new ARunnableS1S2101000_11(i, tag, str, th, 0));
    }

    public static /* synthetic */ void LIZIZ(String str, InterfaceC65784Pro interfaceC65784Pro, int i, Throwable th, int i2) {
        if ((i2 & 2) != 0) {
            interfaceC65784Pro = null;
        }
        if ((i2 & 4) != 0) {
            i = 3;
        }
        if ((i2 & 8) != 0) {
            th = null;
        }
        LIZ(str, interfaceC65784Pro, i, th);
    }
}
