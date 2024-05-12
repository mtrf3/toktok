package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ytm, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88838Ytm implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEI yei = new YEI(0);
        yei.LJFF = new C88839Ytn();
        C38631FEd c38631FEd = new C38631FEd(R.layout.ci4, "search_layout_search_mix_head", fe3);
        c38631FEd.LJFF = new C88841Ytp();
        c38631FEd.LJIIZILJ(yei);
        YEI yei2 = new YEI(0);
        yei2.LJFF = new C88840Yto();
        yei2.LIZ = yei;
        yei.LIZIZ.add(yei2);
        return new FEY(R.layout.ci3, yei, fe3);
    }
}
