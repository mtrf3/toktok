package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Yu6, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88858Yu6 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88859Yu7();
        YEA yea = new YEA();
        yea.LJFF = new C88860Yu8();
        yea.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yea);
        YEA yea2 = new YEA();
        yea2.LJFF = new C88861Yu9();
        yea2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yea2);
        YEK yek = new YEK();
        yek.LJFF = new C88862YuA();
        yek.LIZ = c58068Mqe;
        YEL LIZ = C05L.LIZ(c58068Mqe.LIZIZ, yek);
        LIZ.LJFF = new C88863YuB();
        LIZ.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(LIZ);
        return new FEY(R.layout.ql, c58068Mqe, fe3);
    }
}
