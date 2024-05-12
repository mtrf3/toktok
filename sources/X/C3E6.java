package X;

import Y.IDHandlerS6S0000000_1;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.3E6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3E6 {
    public static final C3E6 LIZ = new C3E6();
    public static IDHandlerS6S0000000_1 LIZIZ;
    public static List<String> LIZJ;

    public static final void LIZIZ() {
        if (C3E8.LIZ()) {
            return;
        }
        if (LIZJ == null) {
            LIZJ = new CopyOnWriteArrayList();
        }
        if (LIZIZ == null) {
            LIZIZ = new IDHandlerS6S0000000_1(2);
        }
    }

    public static final void LIZJ() {
        if (C3E8.LIZ()) {
            return;
        }
        IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = LIZIZ;
        if (iDHandlerS6S0000000_1 != null) {
            iDHandlerS6S0000000_1.removeMessages(220);
            LIZIZ = null;
        }
        if (LIZJ != null) {
            LIZJ = null;
        }
    }

    public static final void LJ() {
        List<String> list;
        Integer valueOf;
        if (!C3E8.LIZ() && (list = LIZJ) != null && (valueOf = Integer.valueOf(((CopyOnWriteArrayList) list).size())) != null && valueOf.intValue() > 0) {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            List<String> list2 = LIZJ;
            o.LJI(list2);
            C4WC.LJJI(list2);
            List<String> list3 = LIZJ;
            o.LJI(list3);
            ((CopyOnWriteArrayList) list3).clear();
            IDHandlerS6S0000000_1 iDHandlerS6S0000000_1 = LIZIZ;
            if (iDHandlerS6S0000000_1 != null) {
                iDHandlerS6S0000000_1.removeMessages(220);
            }
        }
    }

    public static final void LIZ(String str) {
        List<String> list;
        IDHandlerS6S0000000_1 iDHandlerS6S0000000_1;
        if (!C3E8.LIZ() && (list = LIZJ) != null && !((CopyOnWriteArrayList) list).contains(str)) {
            List<String> list2 = LIZJ;
            o.LJI(list2);
            if (((CopyOnWriteArrayList) list2).isEmpty() && (iDHandlerS6S0000000_1 = LIZIZ) != null) {
                iDHandlerS6S0000000_1.sendEmptyMessageDelayed(220, 5000L);
            }
            List<String> list3 = LIZJ;
            o.LJI(list3);
            ((CopyOnWriteArrayList) list3).add(str);
            List<String> list4 = LIZJ;
            o.LJI(list4);
            if (((CopyOnWriteArrayList) list4).size() == 25) {
                LJ();
            }
        }
    }

    public static final void LIZLLL(List<? extends C3L4> list) {
        if (!C3E8.LIZ() && list != null && (!list.isEmpty())) {
            LIZ.getClass();
            ArrayList arrayList = new ArrayList();
            for (C3L4 c3l4 : list) {
                if (c3l4.LJIIIIZZ() == 0) {
                    IMUser LJFF = C80533Eb.LJFF(String.valueOf(C81273Gx.LIZLLL(c3l4.LJFF())), C79004UzY.LJIILIIL(c3l4.LJFF()));
                    if (LJFF != null && TextUtils.isEmpty(LJFF.getSecUid())) {
                        arrayList.add(c3l4.LJFF());
                    }
                    if (arrayList.size() == 25) {
                        break;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C4WC.LJJI(arrayList);
            }
        }
    }
}
