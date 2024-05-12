package X;

import android.util.Printer;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2vG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73942vG implements Printer {
    public final Printer LJLIL;
    public final java.util.Map<String, Integer> LJLILLLLZI = new LinkedHashMap();

    public C73942vG(Printer printer) {
        this.LJLIL = printer;
    }

    @Override // android.util.Printer
    public final void println(String x) {
        o.LJIIIZ(x, "x");
        Printer printer = this.LJLIL;
        if (printer != null) {
            printer.println(x);
        }
        int i = 0;
        if (x.charAt(0) == '>') {
            Integer num = (Integer) ((LinkedHashMap) this.LJLILLLLZI).get(x);
            if (num != null) {
                i = num.intValue();
            }
            this.LJLILLLLZI.put(x, Integer.valueOf(i + 1));
        }
    }
}
