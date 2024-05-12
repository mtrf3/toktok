package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QDK {
    public static QDM LIZ(int i) {
        int i2;
        Object value = QDM.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-countries>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractC65590Pog) value).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            QDM qdm = (QDM) next;
            qdm.getClass();
            try {
                i2 = CastIntegerProtector.parseInt(ujb.o.LJJJJZ(ujb.o.LJJJJZ(qdm.LJLJJI, "+", "", false), " ", "", false));
            } catch (NumberFormatException unused) {
                i2 = 86;
            }
            if (i2 == i) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (QDM) ListProtector.get(arrayList, 0);
    }
}
