package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YsL, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88749YsL implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88750YsM();
        YP1 yp1 = new YP1(i);
        yp1.LJFF = new C88752YsO();
        yp1.LIZ = ye2;
        ye2.LIZIZ.add(yp1);
        YP1 yp12 = new YP1(i);
        yp12.LJFF = new C88753YsP();
        yp12.LIZ = ye2;
        ye2.LIZIZ.add(yp12);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new C88751YsN();
        ye22.LIZ = ye2;
        ye2.LIZIZ.add(ye22);
        return new FEY(R.layout.dl3, ye2, fe3);
    }
}
