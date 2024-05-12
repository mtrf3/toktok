package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.E3y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35818E3y {
    public static final List<WeakReference<InterfaceC88472Yns<Integer, C76800UCe>>> LIZ = new ArrayList();
    public static final java.util.Map<Integer, ArrayList<InterfaceC65784Pro<C76800UCe>>> LIZIZ = new LinkedHashMap();
    public static int LIZJ;
    public static int LIZLLL;

    public static final boolean LIZ() {
        if (LIZJ < 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ() {
        /*
            boolean r0 = X.C36152EGu.LJ()
            if (r0 == 0) goto L15
        L7:
            X.FAM r1 = X.C56662Kg.LIZ()
            java.lang.String r0 = "feed_total"
            boolean r0 = r1.LJIIIIZZ(r0)
            if (r0 != 0) goto L21
        L13:
            r0 = 1
        L14:
            return r0
        L15:
            X.EEn r0 = X.C36093EEn.LIZ
            r0.getClass()
            boolean r0 = X.EEZ.LIZIZ()
            if (r0 != 0) goto L21
            goto L13
        L21:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35818E3y.LIZIZ():boolean");
    }

    public static void LIZLLL(int i) {
        LIZIZ.remove(Integer.valueOf(i));
    }

    public static final void LJ(int i) {
        LIZLLL = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LIZLLL(3);
                    }
                } else {
                    LIZLLL(2);
                }
            } else {
                LIZLLL(1);
            }
        } else {
            LIZLLL(0);
        }
        ArrayList arrayList = (ArrayList) ((LinkedHashMap) LIZIZ).get(Integer.valueOf(LIZLLL));
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC65784Pro) it.next()).invoke();
            }
        }
    }

    public static final void LIZJ(int i, InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        java.util.Map<Integer, ArrayList<InterfaceC65784Pro<C76800UCe>>> map = LIZIZ;
        Object obj = ((LinkedHashMap) map).get(Integer.valueOf(i));
        if (obj == null) {
            obj = new ArrayList();
        }
        ArrayList<InterfaceC65784Pro<C76800UCe>> arrayList = (ArrayList) obj;
        arrayList.add(callback);
        map.put(Integer.valueOf(i), arrayList);
    }
}
