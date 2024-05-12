package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z78 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C56523MGh c56523MGh = new C56523MGh();
        c56523MGh.LJFF = new C89408Z7c();
        YEC yec = new YEC(0);
        yec.LJFF = new Z7Y();
        yec.LIZ = c56523MGh;
        c56523MGh.LIZIZ.add(yec);
        YEG yeg = new YEG(0);
        yeg.LJFF = new Z7X();
        yeg.LIZ = c56523MGh;
        c56523MGh.LIZIZ.add(yeg);
        YEI yei = new YEI(0);
        yei.LJFF = new Z7V();
        yei.LIZ = yeg;
        yeg.LIZIZ.add(yei);
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new Z7S();
        ye2.LIZ = yei;
        yei.LIZIZ.add(ye2);
        C81127Vsh c81127Vsh = new C81127Vsh();
        c81127Vsh.LJFF = new Z7U();
        c81127Vsh.LIZ = ye2;
        ye2.LIZIZ.add(c81127Vsh);
        YEI yei2 = new YEI(0);
        yei2.LJFF = new Z7W();
        yei2.LIZ = yei;
        yei.LIZIZ.add(yei2);
        C56974MXq c56974MXq = new C56974MXq();
        c56974MXq.LJFF = new C89406Z7a();
        c56974MXq.LIZ = yei2;
        yei2.LIZIZ.add(c56974MXq);
        C56974MXq c56974MXq2 = new C56974MXq();
        c56974MXq2.LJFF = new C89407Z7b();
        c56974MXq2.LIZ = yei2;
        yei2.LIZIZ.add(c56974MXq2);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new Z7T();
        ye22.LIZ = c56523MGh;
        c56523MGh.LIZIZ.add(ye22);
        C56974MXq c56974MXq3 = new C56974MXq();
        c56974MXq3.LJFF = new Z7Z();
        c56974MXq3.LIZ = ye22;
        ye22.LIZIZ.add(c56974MXq3);
        return new FEY(R.layout.bky, c56523MGh, fe3);
    }
}
