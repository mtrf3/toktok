package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24530xl {
    public final List<C24750y7> LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final List<C24750y7> LIZLLL;
    public final HashMap<Integer, C24640xw> LJ;
    public final C62822Ol8 LJFF;

    public final int LIZ(C24750y7 keyInfo) {
        o.LJIIIZ(keyInfo, "keyInfo");
        C24640xw c24640xw = this.LJ.get(Integer.valueOf(keyInfo.LIZJ));
        if (c24640xw != null) {
            return c24640xw.LIZIZ;
        }
        return -1;
    }

    public C24530xl(List<C24750y7> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
        if (i >= 0) {
            this.LIZLLL = new ArrayList();
            HashMap<Integer, C24640xw> hashMap = new HashMap<>();
            int size = ((ArrayList) list).size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C24750y7 c24750y7 = (C24750y7) ListProtector.get(this.LIZ, i3);
                hashMap.put(Integer.valueOf(c24750y7.LIZJ), new C24640xw(i3, i2, c24750y7.LIZLLL));
                i2 += c24750y7.LIZLLL;
            }
            this.LJ = hashMap;
            this.LJFF = C221108m2.LIZIZ(new IDqS420S0100000(this, 173));
            return;
        }
        "Invalid start index".toString();
        throw new IllegalArgumentException("Invalid start index");
    }

    public final boolean LIZIZ(int i, int i2) {
        int i3;
        C24640xw c24640xw = this.LJ.get(Integer.valueOf(i));
        if (c24640xw != null) {
            int i4 = c24640xw.LIZIZ;
            int i5 = i2 - c24640xw.LIZJ;
            c24640xw.LIZJ = i2;
            if (i5 != 0) {
                Iterator LJ = C06540Nm.LJ(this.LJ, "groupInfos.values");
                while (LJ.hasNext()) {
                    C24640xw c24640xw2 = (C24640xw) LJ.next();
                    if (c24640xw2.LIZIZ >= i4 && !o.LJ(c24640xw2, c24640xw) && (i3 = c24640xw2.LIZIZ + i5) >= 0) {
                        c24640xw2.LIZIZ = i3;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
