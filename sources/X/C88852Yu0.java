package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Yu0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88852Yu0 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88853Yu1();
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new C88854Yu2();
        ye22.LIZ = ye2;
        YE2 LIZ = YE1.LIZ(ye2.LIZIZ, ye22, 0);
        LIZ.LJFF = new C88855Yu3();
        LIZ.LIZ = ye2;
        YE2 LIZ2 = YE1.LIZ(ye2.LIZIZ, LIZ, 0);
        LIZ2.LJFF = new C88856Yu4();
        LIZ2.LIZ = ye2;
        ye2.LIZIZ.add(LIZ2);
        C38631FEd c38631FEd = new C38631FEd(R.layout.aab, "common_feed_commerce_intro_area_layout", fe3);
        c38631FEd.LJFF = new C88857Yu5();
        c38631FEd.LJIIZILJ(ye2);
        return new FEY(R.layout.aa6, ye2, fe3);
    }
}
