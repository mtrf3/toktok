package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8df, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215918df {
    public static final /* synthetic */ int LIZ = 0;

    public static C215958dj LIZ() {
        C215958dj c215958dj = new C215958dj();
        c215958dj.LJ = 20002;
        EnumC215878db enumC215878db = EnumC215878db.NORMAL;
        o.LJIIIZ(enumC215878db, "<set-?>");
        c215958dj.LJIIIZ = enumC215878db;
        c215958dj.LIZLLL = 1001;
        return c215958dj;
    }

    public static C215958dj LIZIZ(C214928c4 c214928c4) {
        long currentTimeMillis = System.currentTimeMillis();
        C215958dj LIZ2 = LIZ();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fake_");
        LIZ3.append(currentTimeMillis);
        LIZ2.LJ(X1D.LIZIZ(LIZ3));
        EnumC215878db enumC215878db = EnumC215878db.NORMAL;
        o.LJIIIZ(enumC215878db, "<set-?>");
        LIZ2.LJIIIZ = enumC215878db;
        LIZ2.LIZIZ = currentTimeMillis;
        LIZ2.LJIILL = c214928c4.LJLJI;
        String aid = c214928c4.LJLIL.getAid();
        if (aid == null) {
            aid = "";
        }
        LIZ2.LJIILJJIL = aid;
        LIZ2.LJIILIIL = ((RBX) HG3.LJIILL()).getCurUserId();
        if (true != LIZ2.LJIIJ) {
            LIZ2.LJIIJ = true;
            LIZ2.LJI = true;
        }
        LIZ2.LIZJ = c214928c4.LJLILLLLZI;
        return LIZ2;
    }
}
