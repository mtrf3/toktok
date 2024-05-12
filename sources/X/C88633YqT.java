package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YqT, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88633YqT implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEI yei = new YEI(0);
        yei.LJFF = new C88637YqX();
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88635YqV();
        ye2.LIZ = yei;
        YE2 LIZ = YE1.LIZ(yei.LIZIZ, ye2, 0);
        LIZ.LJFF = new C88636YqW();
        LIZ.LIZ = yei;
        yei.LIZIZ.add(LIZ);
        return new FEY(R.layout.acm, yei, fe3);
    }
}
