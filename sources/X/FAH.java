package X;

import android.text.TextUtils;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class FAH implements Printer {
    public final List<Printer> LJLIL = new ArrayList();
    public final List<Printer> LJLILLLLZI = new ArrayList();
    public final List<Printer> LJLJI = new ArrayList();
    public boolean LJLJJI = false;
    public boolean LJLJJL = false;

    @Override // android.util.Printer
    public final void println(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.charAt(0) == '>' && this.LJLJJL) {
            Iterator it = ((ArrayList) this.LJLJI).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((ArrayList) this.LJLIL).contains(next)) {
                    ((ArrayList) this.LJLIL).add(next);
                }
            }
            ((ArrayList) this.LJLJI).clear();
            this.LJLJJL = false;
        }
        ((ArrayList) this.LJLIL).size();
        Iterator it2 = ((ArrayList) this.LJLIL).iterator();
        while (it2.hasNext()) {
            Printer printer = (Printer) it2.next();
            if (printer != null) {
                printer.println(str);
            }
        }
        if (str.charAt(0) == '<' && this.LJLJJI) {
            Iterator it3 = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                ((ArrayList) this.LJLIL).remove(next2);
                ((ArrayList) this.LJLJI).remove(next2);
            }
            ((ArrayList) this.LJLILLLLZI).clear();
            this.LJLJJI = false;
        }
    }
}
