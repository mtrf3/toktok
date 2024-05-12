package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OoO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63024OoO {
    public static final C247839o3 LIZ = C9X3.LIZ;

    public static int LIZ() {
        C247839o3 c247839o3 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("comment_filter_status_");
        LIZ2.append(C71945SLl.LIZIZ());
        Integer num = 0;
        Integer valueOf = Integer.valueOf(c247839o3.LIZ.getInt(X1D.LIZIZ(LIZ2), num.intValue()));
        o.LJIIIIZZ(valueOf, "storage.get(COMMENT_FILT…OMMENT_FILTER_NEVER_USED)");
        return valueOf.intValue();
    }

    public static boolean LIZIZ() {
        C247839o3 c247839o3 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("filter_comment_manager_visible_");
        LIZ2.append(C71945SLl.LIZIZ());
        Boolean LIZ3 = c247839o3.LIZ(Boolean.TRUE, X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LIZ3, "storage.get(COMMENT_MANA…ISIBLE + \"_\" + uid, true)");
        return LIZ3.booleanValue();
    }

    public static void LIZJ(int i) {
        C247839o3 c247839o3 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("comment_filter_status_");
        LIZ2.append(C71945SLl.LIZIZ());
        c247839o3.LIZ.storeInt(X1D.LIZIZ(LIZ2), Integer.valueOf(i).intValue());
    }

    public static void LIZLLL(int i) {
        C247839o3 c247839o3 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("comment_offensive_filter_");
        LIZ2.append(C71945SLl.LIZIZ());
        c247839o3.LIZ.storeInt(X1D.LIZIZ(LIZ2), Integer.valueOf(i).intValue());
    }

    public static void LJ(boolean z) {
        C247839o3 c247839o3 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("author_review_all_comments_");
        LIZ2.append(C71945SLl.LIZIZ());
        c247839o3.LIZLLL(Boolean.valueOf(z), X1D.LIZIZ(LIZ2));
    }
}
