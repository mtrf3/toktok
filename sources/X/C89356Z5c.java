package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Z5c, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C89356Z5c implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C89357Z5d();
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new C89364Z5k();
        c58068Mqe.LIZ = ye2;
        ye2.LIZIZ.add(c58068Mqe);
        C38631FEd c38631FEd = new C38631FEd(R.layout.byo, "nows_user_now_layout", fe3);
        c38631FEd.LJFF = new C89371Z5r();
        c38631FEd.LJIIZILJ(c58068Mqe);
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new C89365Z5l();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        C81135Vsp c81135Vsp = new C81135Vsp();
        c81135Vsp.LJFF = new C89368Z5o();
        c81135Vsp.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c81135Vsp);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new C89359Z5f();
        ye22.LIZ = c81135Vsp;
        YE2 LIZ = YE1.LIZ(c81135Vsp.LIZIZ, ye22, 0);
        LIZ.LJFF = new C89360Z5g();
        LIZ.LIZ = c58068Mqe2;
        YE2 LIZ2 = YE1.LIZ(c58068Mqe2.LIZIZ, LIZ, 0);
        LIZ2.LJFF = new C89361Z5h();
        LIZ2.LIZ = c58068Mqe2;
        YE2 LIZ3 = YE1.LIZ(c58068Mqe2.LIZIZ, LIZ2, 0);
        LIZ3.LJFF = new C89362Z5i();
        LIZ3.LIZ = c58068Mqe2;
        YE2 LIZ4 = YE1.LIZ(c58068Mqe2.LIZIZ, LIZ3, 0);
        LIZ4.LJFF = new C89363Z5j();
        LIZ4.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(LIZ4);
        C87237YLp c87237YLp = new C87237YLp(1);
        c87237YLp.LJFF = new C89369Z5p();
        c87237YLp.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c87237YLp);
        YE2 ye23 = new YE2(0);
        ye23.LJFF = new C89358Z5e();
        ye23.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(ye23);
        YEL yel = new YEL();
        yel.LJFF = new C89367Z5n();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        YK1 yk1 = new YK1();
        yk1.LJFF = new C89366Z5m();
        yk1.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yk1);
        C38631FEd c38631FEd2 = new C38631FEd(R.layout.by9, "nows_normal_add_post_button_layout", fe3);
        c38631FEd2.LJFF = new C89370Z5q();
        c38631FEd2.LJIIZILJ(c58068Mqe);
        return new FEY(R.layout.byd, ye2, fe3);
    }
}
