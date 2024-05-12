package X;

import com.bytedance.retrofit2.client.Request;

/* renamed from: X.PmD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65437PmD extends AbstractC65440PmG {
    public C65437PmD() {
        super(null);
    }

    @Override // X.AbstractC65440PmG
    public final C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt c64797Pbt) {
        Boolean LIZIZ;
        Boolean LIZIZ2;
        C65881PtN c65881PtN = new C65881PtN(request);
        try {
            if (c65881PtN.LJFF(c65441PmH.LIZ.LIZJ)) {
                if (c65881PtN.LIZIZ) {
                    LIZIZ2 = c65881PtN.LIZ();
                } else {
                    LIZIZ2 = c65881PtN.LIZIZ();
                }
                if (LIZIZ2.booleanValue()) {
                    return new C65442PmI(true, true);
                }
            }
            if (c65881PtN.LIZLLL(c65441PmH.LIZ.LIZ)) {
                if (c65881PtN.LIZIZ) {
                    LIZIZ = c65881PtN.LIZ();
                } else {
                    LIZIZ = c65881PtN.LIZIZ();
                }
                if (LIZIZ.booleanValue()) {
                    return new C65442PmI(true, true);
                }
            }
        } catch (Throwable unused) {
        }
        return AbstractC65440PmG.LIZIZ;
    }
}
