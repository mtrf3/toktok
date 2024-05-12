package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UOu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77128UOu implements InterfaceC61107NyZ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ UPK LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        o.LJIIIZ(results, "results");
        int i = C76868UEu.LIZ[results[0].LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    UQ4.LJ(this.LIZ, "system", "contact", false, false, this.LIZIZ.LJFF(), "off", UQ4.LJII(), null, null, 768);
                    this.LIZIZ.LIZJ(1);
                    this.LIZIZ.getClass();
                    UPK.LJIIIZ();
                }
            } else {
                UQ4.LJ(this.LIZ, "system", "contact", false, true, this.LIZIZ.LJFF(), "unknown", UQ4.LJII(), null, null, 768);
                this.LIZIZ.LIZJ(1);
                this.LIZIZ.getClass();
                UPK.LJIIIZ();
            }
        } else {
            UQ4.LJ(this.LIZ, "system", "contact", true, false, this.LIZIZ.LJFF(), "unknown", UQ4.LJII(), null, null, 784);
            UQ4.LIZLLL(this.LIZ, "system", "contact", this.LIZIZ.LJFF(), UQ4.LJI("unknown", UQ4.LJII()), "process", null, null, 448);
            this.LIZIZ.LIZLLL(1);
            this.LIZIZ.LJII(1, true, null);
        }
        UP0 up0 = (UP0) this.LIZIZ.LJFF.getValue();
        if (up0 != null && ((C72743Sgl) up0.LJFF.getValue()).LIZIZ) {
            C72743Sgl c72743Sgl = (C72743Sgl) up0.LJFF.getValue();
            if (c72743Sgl.LIZIZ) {
                C16880lQ.LJLLLL(c72743Sgl.LIZLLL, c72743Sgl.LIZJ);
                c72743Sgl.LIZIZ = false;
            }
        }
    }

    public C77128UOu(UPK upk, String str) {
        this.LIZ = str;
        this.LIZIZ = upk;
    }
}
