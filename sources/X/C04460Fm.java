package X;

import android.text.TextUtils;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04460Fm implements Printer {
    public final List<Printer> LJLIL = new ArrayList();
    public final List<Printer> LJLILLLLZI = new ArrayList();
    public final List<Printer> LJLJI = new ArrayList();
    public boolean LJLJJI = false;

    @Override // android.util.Printer
    public final void println(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.charAt(0) == '>' && this.LJLJJI) {
            Iterator it = ((ArrayList) this.LJLJI).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((ArrayList) this.LJLIL).contains(next)) {
                    ((ArrayList) this.LJLIL).add(next);
                }
            }
            ((ArrayList) this.LJLJI).clear();
            this.LJLJJI = false;
        }
        ((ArrayList) this.LJLIL).size();
        Iterator it2 = ((ArrayList) this.LJLIL).iterator();
        while (it2.hasNext()) {
            Printer printer = (Printer) it2.next();
            if (printer != null && this != printer) {
                printer.println(str);
            }
        }
        str.charAt(0);
    }
}
