package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YqY, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88638YqY implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88640Yqa();
        C81130Vsk c81130Vsk = new C81130Vsk(1);
        c81130Vsk.LJFF = new C88643Yqd();
        c81130Vsk.LIZ = ye2;
        ye2.LIZIZ.add(c81130Vsk);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new C88641Yqb();
        ye22.LIZ = ye2;
        ye2.LIZIZ.add(ye22);
        YEK yek = new YEK();
        yek.LJFF = new C88642Yqc();
        yek.LIZ = ye22;
        ye22.LIZIZ.add(yek);
        return new FEY(R.layout.chy, ye2, fe3);
    }
}
