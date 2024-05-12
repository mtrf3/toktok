package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Uw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08460Uw {
    public static final C08440Uu LIZ = new C08440Uu("", null, 6);

    public static final List LIZ(int i, int i2, List list) {
        if (i <= i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = ListProtector.get(list, i3);
                C08410Ur c08410Ur = (C08410Ur) obj;
                if (LIZIZ(i, i2, c08410Ur.LIZIZ, c08410Ur.LIZJ)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C08410Ur c08410Ur2 = (C08410Ur) ListProtector.get(arrayList, i4);
                arrayList2.add(new C08410Ur(c08410Ur2.LIZ, Math.max(i, c08410Ur2.LIZIZ) - i, Math.min(i2, c08410Ur2.LIZJ) - i, c08410Ur2.LIZLLL));
            }
            return arrayList2;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start (");
        LIZ2.append(i);
        LIZ2.append(") should be less than or equal to end (");
        LIZ2.append(i2);
        LIZ2.append(')');
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final boolean LIZIZ(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (Math.max(i, i3) < Math.min(i2, i4)) {
            return true;
        }
        if (i <= i3 && i4 <= i2) {
            if (i2 != i4) {
                return true;
            }
            if (i3 == i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i == i2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z3 == z4) {
                return true;
            }
        }
        if (i3 <= i && i2 <= i4) {
            if (i4 != i2) {
                return true;
            }
            if (i == i2) {
                z = true;
            } else {
                z = false;
            }
            if (i3 == i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                return true;
            }
        }
        return false;
    }
}
