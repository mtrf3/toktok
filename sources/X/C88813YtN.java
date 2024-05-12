package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YtN, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88813YtN implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88814YtO();
        C88469Ynp c88469Ynp = new C88469Ynp();
        c88469Ynp.LJFF = new C88815YtP();
        c88469Ynp.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c88469Ynp);
        YEK yek = new YEK();
        yek.LJFF = new C88816YtQ();
        yek.LIZ = c58068Mqe;
        YEL LIZ = C05L.LIZ(c58068Mqe.LIZIZ, yek);
        LIZ.LJFF = new C88818YtS();
        LIZ.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(LIZ);
        YEK yek2 = new YEK();
        yek2.LJFF = new C88817YtR();
        yek2.LIZ = c58068Mqe;
        YEL LIZ2 = C05L.LIZ(c58068Mqe.LIZIZ, yek2);
        LIZ2.LJFF = new C88819YtT();
        LIZ2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(LIZ2);
        return new FEY(R.layout.byf, c58068Mqe, fe3);
    }
}
