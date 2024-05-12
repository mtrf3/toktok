package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Yqs, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88658Yqs implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88663Yqx();
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88660Yqu();
        ye2.LIZ = c58068Mqe;
        YE2 LIZ = YE1.LIZ(c58068Mqe.LIZIZ, ye2, 0);
        LIZ.LJFF = new C88661Yqv();
        LIZ.LIZ = c58068Mqe;
        YE2 LIZ2 = YE1.LIZ(c58068Mqe.LIZIZ, LIZ, 0);
        LIZ2.LJFF = new C88662Yqw();
        LIZ2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(LIZ2);
        return new FEY(R.layout.bxh, c58068Mqe, fe3);
    }
}
