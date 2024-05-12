package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class LIQ {
    public static final ArrayList<String> LIZ = new ArrayList<>();

    public static String LIZ() {
        LMU lmu;
        int i;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL != null && ((i = (lmu = C3SZ.LIZ(LIZLLL).LJLIL).LIZ) == 1 || i == 2)) {
            String str = lmu.LIZIZ;
            lmu.LIZIZ = null;
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                ListProtector.add(LIZ, 0, str);
                lmu.LIZIZ = "";
            }
            String str2 = lmu.LIZJ;
            lmu.LIZJ = null;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                List LJLJJL = s.LJLJJL(str2, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
                Iterator it = LJLJJL.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                LIZ.addAll(0, arrayList);
                lmu.LIZJ = "";
            }
        }
        ArrayList<String> arrayList2 = LIZ;
        if (arrayList2.size() == 0) {
            return "";
        }
        String params = C75792yF.LIZJ(arrayList2);
        arrayList2.clear();
        o.LJIIIIZZ(params, "params");
        return params;
    }
}
