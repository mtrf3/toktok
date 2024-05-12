package X;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Eeb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36937Eeb implements InterfaceC36938Eec {
    public final List<InterfaceC36938Eec> LIZ = new ArrayList();

    @Override // X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC36938Eec) it.next()).onEvent(event);
            } catch (Throwable th) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("EventObserver event:");
                LIZ.append(event.LIZ);
                LIZ.append(" run error:");
                C36742EbS.LJLIL.getClass();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                o.LJIIIIZZ(stringWriter2, "stringWriter.toString()");
                String substring = stringWriter2.substring(0, Math.min(stringWriter2.length(), Integer.MAX_VALUE));
                o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                LIZ.append(substring);
                C41816Gb6.LIZIZ(777005, X1D.LIZIZ(LIZ), th);
            }
        }
    }
}
