package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z69 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEG yeg = new YEG(0);
        yeg.LJFF = new Z6A();
        YEK yek = new YEK();
        yek.LJFF = new Z6C();
        yek.LIZ = yeg;
        YEL LIZ = C05L.LIZ(yeg.LIZIZ, yek);
        LIZ.LJFF = new Z6F();
        LIZ.LIZ = yeg;
        yeg.LIZIZ.add(LIZ);
        YEL yel = new YEL();
        yel.LJFF = new Z6G();
        yel.LIZ = yeg;
        yeg.LIZIZ.add(yel);
        YEK yek2 = new YEK();
        yek2.LJFF = new Z6D();
        yek2.LIZ = yeg;
        yeg.LIZIZ.add(yek2);
        YEG yeg2 = new YEG(0);
        yeg2.LJFF = new Z6B();
        yeg2.LIZ = yeg;
        yeg.LIZIZ.add(yeg2);
        YEL yel2 = new YEL();
        yel2.LJFF = new Z6H();
        yel2.LIZ = yeg2;
        yeg2.LIZIZ.add(yel2);
        YEK yek3 = new YEK();
        yek3.LJFF = new Z6E();
        yek3.LIZ = yeg2;
        yeg2.LIZIZ.add(yek3);
        return new FEY(R.layout.cpb, yeg, fe3);
    }
}
