package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.0T2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0T2 {
    public final Object LIZ;

    public final List LIZ() {
        List list = (List) this.LIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WJB) obj).LJIIIIZZ()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((WJB) it.next()).LIZJ());
        }
        return ORZ.LLJILJILJ(arrayList2);
    }

    public C0T2(int i) {
        if (i != 2) {
            this.LIZ = new E10();
        } else {
            this.LIZ = new ArrayList();
        }
    }

    public final boolean LIZIZ(CharSequence charSequence, C66515Q8p c66515Q8p) {
        String nationalNumberPattern = c66515Q8p.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        Matcher matcher = ((E10) this.LIZ).LIZ(nationalNumberPattern).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        return matcher.matches();
    }
}
