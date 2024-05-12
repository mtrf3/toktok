package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YvU, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88944YvU implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEG yeg = new YEG(0);
        yeg.LJFF = new C88946YvW();
        YEK yek = new YEK();
        yek.LJFF = new C88947YvX();
        yek.LIZ = yeg;
        YEL LIZ = C05L.LIZ(yeg.LIZIZ, yek);
        LIZ.LJFF = new C88949YvZ();
        LIZ.LIZ = yeg;
        yeg.LIZIZ.add(LIZ);
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88945YvV();
        ye2.LIZ = yeg;
        yeg.LIZIZ.add(ye2);
        YEK yek2 = new YEK();
        yek2.LJFF = new C88948YvY();
        yek2.LIZ = ye2;
        YEL LIZ2 = C05L.LIZ(ye2.LIZIZ, yek2);
        LIZ2.LJFF = new C88950Yva();
        LIZ2.LIZ = ye2;
        ye2.LIZIZ.add(LIZ2);
        return new FEY(R.layout.acu, yeg, fe3);
    }
}
