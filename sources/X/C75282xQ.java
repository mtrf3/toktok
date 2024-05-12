package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2xQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75282xQ {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C75292xR.LJLIL);

    public static List LIZ(String cssString) {
        OSZ osz;
        o.LJIIJ(cssString, "cssString");
        List LJLJJL = s.LJLJJL(cssString, new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
        Iterator it = LJLJJL.iterator();
        while (it.hasNext()) {
            List LJLJJL2 = s.LJLJJL((String) it.next(), new String[]{":"}, 0, 6);
            if (LJLJJL2.size() == 2) {
                String str = (String) ListProtector.get(LJLJJL2, 0);
                if (str != null) {
                    String charSequence = s.LJZI(str).toString();
                    String str2 = (String) ListProtector.get(LJLJJL2, 1);
                    if (str2 != null) {
                        osz = new OSZ(charSequence, s.LJZI(str2).toString());
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.CharSequence");
                }
            } else {
                osz = null;
            }
            arrayList.add(osz);
        }
        List LJLL = ORZ.LJLL(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) LJLL).iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((List) LIZ.getValue()).contains(((OSZ) next).getFirst())) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }
}
