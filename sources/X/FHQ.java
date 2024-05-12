package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHQ implements FI2 {
    public static final FHQ LIZ = new FHQ();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(FI0.LJLIL);
    public static final java.util.Set<String> LIZJ = new HashSet();
    public static java.util.Set<String> LIZLLL = new HashSet();
    public static boolean LJ;

    @Override // X.FI2
    public final List<Integer> LIZ() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = LIZLLL.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(it.next())));
        }
        return arrayList;
    }

    public static void LIZIZ(String key) {
        o.LJIIIZ(key, "key");
        C38723FHr.LIZIZ.getClass();
        C38731FHz c38731FHz = C38731FHz.LIZIZ;
        int i = -1;
        if (c38731FHz.LIZ.LIZJ().contains(key)) {
            i = c38731FHz.LIZ.LIZJ().getInt(key, -1);
        }
        java.util.Set<String> set = LIZJ;
        ((HashSet) set).add(String.valueOf(i));
        C62822Ol8 c62822Ol8 = LIZIZ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeInt(key, i);
        if (!LJ) {
            LJ = true;
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-keva>(...)");
            java.util.Set<String> stringSet = ((Keva) value2).getStringSet("ColdBootABVid_vidSet", LIZLLL);
            o.LJIIIIZZ(stringSet, "keva.getStringSet(KEVA_VID_NAME, dumpVids)");
            LIZLLL = stringSet;
        }
        Object value3 = c62822Ol8.getValue();
        o.LJIIIIZZ(value3, "<get-keva>(...)");
        ((Keva) value3).storeStringSet("ColdBootABVid_vidSet", set);
    }
}
