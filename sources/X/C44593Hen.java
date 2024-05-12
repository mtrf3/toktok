package X;

import Y.IDComparatorS30S0000000_2;
import com.ss.android.ugc.aweme.property.SmartCompileModelV2;
import com.ss.android.ugc.aweme.property.VESynthesisSettingsCategoryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Hen, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44593Hen implements InterfaceC44595Hep {
    public static final C44593Hen LIZ = new C44593Hen();
    public static final J30 LIZIZ;

    static {
        J30 j30;
        SmartCompileModelV2 LIZ2 = C44597Her.LIZ();
        if (LIZ2 != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("SmartCompileV2 , component init , model : ");
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
        AbstractC44565HeL c44569HeP;
        o.LJIIIZ(labelProbabilityMap, "labelProbabilityMap");
        if (LIZIZ == null) {
            return null;
        }
        List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(43), labelProbabilityMap.entrySet());
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
            if (o.LJ(str, "skip")) {
                c44569HeP = new C44569HeP(str);
            } else {
                int LJJLIIJ = s.LJJLIIJ(str, "_", 6);
                if (LJJLIIJ <= 0 || LJJLIIJ >= str.length() - 1) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("SmartCompileV2 ErrorLabel:");
                    LIZ2.append(str);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
                } else {
                    VESynthesisSettingsCategoryItem[] LIZ3 = C44598Hes.LIZ();
                    if (LIZ3 != null) {
                        int length = LIZ3.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            VESynthesisSettingsCategoryItem vESynthesisSettingsCategoryItem = LIZ3[i];
                            if (o.LJ(vESynthesisSettingsCategoryItem.key, str)) {
                                String str2 = vESynthesisSettingsCategoryItem.value;
                                if (str2 != null) {
                                    String substring = str.substring(LJJLIIJ + 1, str.length());
                                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    if (o.LJ(substring, "sw")) {
                                        c44569HeP = new C44567HeN(str2, str);
                                    } else if (o.LJ(substring, "hw")) {
                                        c44569HeP = new C44566HeM(str2, str);
                                    } else {
                                        StringBuilder LIZ4 = X1D.LIZ();
                                        LIZ4.append("SmartCompileV2 ErrorLabel:");
                                        LIZ4.append(str);
                                        C78983UzD.LJIILL(X1D.LIZIZ(LIZ4));
                                    }
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("SmartCompileV2 ErrorLabel:");
                    LIZ5.append(str);
                    C78983UzD.LJIILL(X1D.LIZIZ(LIZ5));
                }
            }
            arrayList3.add(c44569HeP);
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("SmartCompileV2 , result : ");
        LIZ6.append(arrayList3);
        C5Z5.LIZ(X1D.LIZIZ(LIZ6));
        return arrayList3;
    }
}
