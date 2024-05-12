package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ifj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47199Ifj {
    public InterfaceC46811IYt LIZIZ;
    public InterfaceC46811IYt LIZJ;
    public String LIZLLL;
    public final C47221Ig5 LIZ = new C47221Ig5();
    public int LJ = -1;

    public final List<InterfaceC46811IYt> LIZJ() {
        List<InterfaceC46811IYt> list = this.LIZ.get(this.LIZLLL);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public final boolean LIZLLL(String str) {
        InterfaceC46811IYt interfaceC46811IYt = this.LIZJ;
        if (interfaceC46811IYt == null) {
            return false;
        }
        if (!TextUtils.equals(str, interfaceC46811IYt.getKey()) && !LJ(str, this.LIZJ.LJIIJ()) && !LJ(str, this.LIZJ.LJFF())) {
            return false;
        }
        return true;
    }

    public static boolean LJ(String str, List list) {
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

    public final int LIZ(InterfaceC46811IYt interfaceC46811IYt, List<InterfaceC46811IYt> list) {
        int LIZIZ = LIZIZ(interfaceC46811IYt, list);
        int i = -1;
        if (LIZIZ != -1) {
            return LIZIZ;
        }
        if (list.size() != 0 && interfaceC46811IYt != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (TextUtils.equals(((InterfaceC46811IYt) ListProtector.get(list, i2)).getKey(), interfaceC46811IYt.getKey())) {
                    i = i2;
                }
            }
        }
        return i;
    }

    public final int LIZIZ(InterfaceC46811IYt interfaceC46811IYt, List<InterfaceC46811IYt> list) {
        int i = this.LJ;
        if (i != -1 && interfaceC46811IYt != null) {
            int min = Math.min(i + 9, list.size() - 1);
            for (int max = Math.max(i - 9, 0); max < min; max++) {
                if (TextUtils.equals(((InterfaceC46811IYt) ListProtector.get(list, max)).getKey(), interfaceC46811IYt.getKey())) {
                    return max;
                }
            }
        }
        return -1;
    }
}
