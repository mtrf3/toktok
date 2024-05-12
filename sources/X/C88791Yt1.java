package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Yt1, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88791Yt1 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new C88792Yt2();
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new C88793Yt3();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        YEK yek = new YEK();
        yek.LJFF = new C88794Yt4();
        yek.LIZ = c58068Mqe2;
        YEL LIZ = C05L.LIZ(c58068Mqe2.LIZIZ, yek);
        LIZ.LJFF = new C88795Yt5();
        LIZ.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(LIZ);
        return new FEY(R.layout.byh, c58068Mqe, fe3);
    }
}
