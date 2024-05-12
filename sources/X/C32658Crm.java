package X;

import com.bytedance.keva.Keva;

/* renamed from: X.Crm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32658Crm {
    public static final Keva LIZ = Keva.getRepo("match_item");

    public static boolean LIZJ() {
        return LIZ.getBoolean(LIZIZ(), false);
    }

    public static String LIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("bag_page_shown_");
        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        return X1D.LIZIZ(LIZ2);
    }

    public static String LIZIZ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("bag_show_entrance_");
        LIZ2.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        return X1D.LIZIZ(LIZ2);
    }
}
