package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ift, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47209Ift {
    public InterfaceC46811IYt LIZJ;
    public int LIZ = -1;
    public final List<InterfaceC46811IYt> LIZIZ = FII.LIZ();
    public boolean LIZLLL = false;

    public final boolean LIZIZ(String str) {
        InterfaceC46811IYt interfaceC46811IYt = this.LIZJ;
        if (interfaceC46811IYt == null) {
            return false;
        }
        if (!TextUtils.equals(str, interfaceC46811IYt.getKey()) && !LIZJ(str, this.LIZJ.LJIIJ()) && !LIZJ(str, this.LIZJ.LJFF())) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(String str, List list) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((InterfaceC46813IYv) it.next()).getKey(), str)) {
                return true;
            }
        }
        return false;
    }

    public final List LIZ(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (this.LIZ != -1 && this.LIZIZ.size() != 0) {
            int max = Math.max(0, this.LIZ - i);
            int max2 = Math.max(this.LIZ, 0);
            int min = Math.min(this.LIZ + 1, this.LIZIZ.size());
            int min2 = Math.min(AnonymousClass036.LIZIZ(this.LIZ, i2, 0, 1), this.LIZIZ.size());
            if (i2 != 0) {
                if (i != 0) {
                    arrayList.addAll(this.LIZIZ.subList(max, max2));
                    arrayList.addAll(this.LIZIZ.subList(min, min2));
                    return arrayList;
                }
            } else if (i != 0) {
                if (i2 == 0) {
                    return this.LIZIZ.subList(max, max2);
                }
            }
            return this.LIZIZ.subList(min, min2);
        }
        return arrayList;
    }
}
