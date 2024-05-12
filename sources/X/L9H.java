package X;

import Y.IDComparatorS335S0100000_2;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L9H {
    public static final boolean LIZ(String str, List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((InterfaceC54080LKi) it.next()).tag(), str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(ActivityC45651qj activityC45651qj, AbstractC53892LDc abstractC53892LDc, List<? extends InterfaceC54080LKi> list, List<? extends InterfaceC54080LKi> list2) {
        boolean z;
        AbstractC53895LDf abstractC53895LDf;
        AbstractC53895LDf abstractC53895LDf2;
        String str;
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = (ArrayList) list2;
        if (arrayList.size() != arrayList2.size()) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = (InterfaceC54080LKi) it.next();
            if ((obj instanceof AbstractC53895LDf) && (abstractC53895LDf2 = (AbstractC53895LDf) obj) != null && !LIZ(abstractC53895LDf2.tag(), list2)) {
                if (((ArrayList) abstractC53892LDc.LJLJLJ).contains(abstractC53895LDf2)) {
                    AbstractC53895LDf abstractC53895LDf3 = abstractC53892LDc.LJLJJLL;
                    if (abstractC53895LDf3 != null) {
                        str = abstractC53895LDf3.tag();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, abstractC53895LDf2.tag())) {
                        abstractC53892LDc.LJLJJLL = null;
                    }
                    L9I l9i = L9J.LIZ;
                    if (l9i != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("remove child: parent > ");
                        LIZ.append(abstractC53892LDc);
                        LIZ.append(", child > ");
                        LIZ.append(abstractC53895LDf2);
                        l9i.log(X1D.LIZIZ(LIZ));
                    }
                    abstractC53895LDf2.LJIILL(null);
                    ((ArrayList) abstractC53892LDc.LJLJLJ).remove(abstractC53895LDf2);
                }
                z = true;
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC54080LKi interfaceC54080LKi = (InterfaceC54080LKi) next;
                if (!LIZ(interfaceC54080LKi.tag(), list)) {
                    if ((interfaceC54080LKi instanceof AbstractC53895LDf) && (abstractC53895LDf = (AbstractC53895LDf) interfaceC54080LKi) != null) {
                        abstractC53892LDc.LJIILLIIL(abstractC53895LDf);
                    }
                    z = true;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (!z) {
            if (arrayList2.size() == arrayList.size()) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (!TextUtils.equals(((InterfaceC54080LKi) ListProtector.get(list2, i3)).tag(), ((InterfaceC54080LKi) ListProtector.get(list, i3)).tag())) {
                    }
                }
                return;
            }
            return;
        }
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(list2, (List<PoiCategory>) 558);
        ArrayList arrayList3 = (ArrayList) abstractC53892LDc.LJLJLJ;
        if (arrayList3.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList3, new IDComparatorS335S0100000_2(aqS175S0100000_9, 0));
        }
        com.bytedance.hox.Hox LIZ2 = com.bytedance.hox.Hox.LJLLI.LIZ(activityC45651qj);
        LIZ2.LJLJI.clear();
        LIZ2.LJLJJL.clear();
    }
}
