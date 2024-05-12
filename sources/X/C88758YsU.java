package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YsU, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88758YsU implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEI yei = new YEI(0);
        yei.LJFF = new C88760YsW();
        C81127Vsh c81127Vsh = new C81127Vsh();
        c81127Vsh.LJFF = new C88759YsV();
        c81127Vsh.LIZ = yei;
        yei.LIZIZ.add(c81127Vsh);
        YEL yel = new YEL();
        yel.LJFF = new C88761YsX();
        yel.LIZ = yei;
        yei.LIZIZ.add(yel);
        return new FEY(R.layout.byn, yei, fe3);
    }
}
