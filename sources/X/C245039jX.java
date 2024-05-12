package X;

import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.9jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245039jX {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public static final C245029jW LJI = new C245029jW();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C245079jb.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C245069ja.LJLIL);

    public static String LIZ() {
        Calendar calendar = Calendar.getInstance();
        o.LJIIIIZZ(calendar, "calendar");
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return String.valueOf(calendar.getTimeInMillis());
    }

    public final void LIZIZ() {
        String LIZ = LIZ();
        String LIZ2 = C247509nW.LIZ(this.LIZ);
        LJI.getClass();
        if (!o.LJ(LIZ, C245029jW.LIZIZ().getString(LIZ2, ""))) {
            C245029jW.LIZIZ().storeInt(C247509nW.LIZ(this.LIZIZ), 0);
            C245029jW.LIZIZ().storeString(C247509nW.LIZ(this.LIZ), LIZ());
        }
        C245029jW.LIZIZ().storeInt(C247509nW.LIZ(this.LIZJ), 0);
    }

    public C245039jX(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextLinkManager");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("current_day_date_");
        LIZ2.append(i);
        this.LIZ = X1D.LIZIZ(LIZ2);
        this.LIZIZ = KMP.LJ("text_link_show_times_", i);
        this.LIZJ = KMP.LJ("text_link_dismiss_after_", i);
        LIZIZ();
    }
}
