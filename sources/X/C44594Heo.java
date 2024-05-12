package X;

import Y.IDComparatorS30S0000000_2;
import com.ss.android.ugc.aweme.property.SmartCompileModelV1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Heo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44594Heo implements InterfaceC44595Hep {
    public static final C44594Heo LIZ = new C44594Heo();
    public static final J30 LIZIZ;

    static {
        J30 j30;
        SmartCompileModelV1 LIZ2 = C44596Heq.LIZ();
        if (LIZ2 != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SmartCompileV1 , component init , model : ");
            LIZ3.append(LIZ2);
            H78.LJI(X1D.LIZIZ(LIZ3));
            j30 = new J30(new C44592Hem(LIZ2));
        } else {
            j30 = null;
        }
        LIZIZ = j30;
    }

    @Override // X.InterfaceC44595Hep
    public final void init() {
        J30 j30 = LIZIZ;
        if (j30 != null) {
            j30.LIZLLL();
        }
    }

    @Override // X.InterfaceC44595Hep
    public final List<AbstractC44565HeL> LIZ(java.util.Map<String, Float> labelProbabilityMap, boolean z) {
        SmartCompileModelV1 LIZ2;
        AbstractC44565HeL c44566HeM;
        o.LJIIIZ(labelProbabilityMap, "labelProbabilityMap");
        if (LIZIZ == null || (LIZ2 = C44596Heq.LIZ()) == null) {
            return null;
        }
        List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(42), labelProbabilityMap.entrySet());
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLILII, 10));
        Iterator it = LLILII.iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!z || !o.LJ(next, "skip")) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            int hashCode = str.hashCode();
            if (hashCode != 3343) {
                if (hashCode != 3684) {
                    if (hashCode == 3532159 && str.equals("skip")) {
                        c44566HeM = new C44569HeP(str);
                        arrayList3.add(c44566HeM);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("SmartCompileV1 ErrorLabel:");
                    LIZ3.append(str);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ3));
                } else if (!str.equals("sw")) {
                    StringBuilder LIZ32 = X1D.LIZ();
                    LIZ32.append("SmartCompileV1 ErrorLabel:");
                    LIZ32.append(str);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ32));
                } else {
                    c44566HeM = new C44567HeN(LIZ2.getSwCompileSetting(), str);
                    arrayList3.add(c44566HeM);
                }
            } else if (!str.equals("hw")) {
                StringBuilder LIZ322 = X1D.LIZ();
                LIZ322.append("SmartCompileV1 ErrorLabel:");
                LIZ322.append(str);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ322));
            } else {
                c44566HeM = new C44566HeM(LIZ2.getHwCompileSetting(), str);
                arrayList3.add(c44566HeM);
            }
        }
        if (arrayList3.size() < 2) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("SmartCompileV1 ErrorResultLabelSize:");
            LIZ4.append(arrayList3.size());
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ4));
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("SmartCompileV1 , result : ");
        LIZ5.append(arrayList3);
        C5Z5.LIZ(X1D.LIZIZ(LIZ5));
        return arrayList3;
    }
}
