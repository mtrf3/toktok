package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0100000_6;

/* renamed from: X.EGu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36152EGu {
    public static WeakReference<View> LIZ;
    public static final CopyOnWriteArraySet<EEY> LIZIZ = new CopyOnWriteArraySet<>();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(E4K.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C36153EGv.LJLIL);
    public static int LJ = 1;
    public static boolean LJFF;

    public static int LJI() {
        int i;
        if (LJFF) {
            return LJ;
        }
        if (!LJ()) {
            i = 2;
        } else if (C38986FRu.LIZ().LIZ()) {
            i = 3;
        } else {
            i = 1;
        }
        LJ = i;
        LJFF = true;
        return i;
    }

    public static boolean LJ() {
        Boolean LJ2 = C38987FRv.LJ();
        if (LJ2 == null) {
            return F9J.LIZIZ(EF7.LIZIZ(), 0, "prefs_feed_check").getBoolean("key_first_launch", true);
        }
        return LJ2.booleanValue();
    }

    public static boolean LJFF() {
        if (LJI() == 3) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(InterfaceC65784Pro interfaceC65784Pro) {
        if (!C38686FGg.LJI || !LJ() || interfaceC65784Pro == null || !((Boolean) interfaceC65784Pro.invoke()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        if (!C38686FGg.LJI || LJI() != 1 || interfaceC65784Pro == null || !((Boolean) interfaceC65784Pro.invoke()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(long j) {
        C62822Ol8 c62822Ol8 = LIZJ;
        if (((Number) c62822Ol8.getValue()).longValue() == 0 || System.currentTimeMillis() - ((Number) c62822Ol8.getValue()).longValue() < TimeUnit.DAYS.toMillis(j)) {
            return true;
        }
        return false;
    }

    public static void LIZ(boolean z, EEY eey, InterfaceC65784Pro interfaceC65784Pro) {
        if (z) {
            Iterator<EEY> it = LIZIZ.iterator();
            while (it.hasNext()) {
                if (eey.key().equals(it.next().key())) {
                    return;
                }
            }
            LIZIZ.add(eey);
            C36093EEn c36093EEn = C36093EEn.LIZ;
            EnumC36092EEm enumC36092EEm = EnumC36092EEm.NEW_USER;
            AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(eey, 150);
            c36093EEn.getClass();
            C36093EEn.LIZIZ(enumC36092EEm, false, aqS156S0100000_6);
            return;
        }
        interfaceC65784Pro.invoke();
    }
}
