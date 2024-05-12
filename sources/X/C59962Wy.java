package X;

import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59962Wy {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C59952Wx.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C2X0.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C59942Ww.LJLIL);

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZ.getValue();
    }

    public static void LIZ(int i, String str) {
        java.util.Set set = (java.util.Set) ((HashMap) LIZIZ.getValue()).get(str);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2X1 c2x1 = (C2X1) ((Reference) it.next()).get();
            if (c2x1 != null) {
                c2x1.LIZ();
            }
        }
        ORS.LJJLIIJ(set, C59972Wz.LJLIL);
        if (set.isEmpty()) {
            ((HashMap) LIZIZ.getValue()).remove(str);
        }
    }

    public static void LIZJ(int i, String str) {
        Integer num = (Integer) LIZIZ().get(str);
        if (num == null || i != num.intValue()) {
            LIZIZ().put(str, Integer.valueOf(i));
            LiveData liveData = (LiveData) ((HashMap) LIZJ.getValue()).get(str);
            if (liveData != null) {
                liveData.postValue(Integer.valueOf(i));
            }
            LIZ(i, str);
        }
    }
}
