package X;

import android.graphics.Typeface;

/* renamed from: X.VeE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80230VeE extends AbstractC06680Oa {
    public final /* synthetic */ QXX LIZ;
    public final /* synthetic */ C80229VeD LIZIZ;

    @Override // X.AbstractC06680Oa
    public final void LIZJ(int i) {
        this.LIZIZ.LJIIL = true;
        this.LIZ.LLLF(i);
    }

    @Override // X.AbstractC06680Oa
    public final void LIZLLL(Typeface typeface) {
        C80229VeD c80229VeD = this.LIZIZ;
        c80229VeD.LJIILIIL = Typeface.create(typeface, c80229VeD.LIZLLL);
        C80229VeD c80229VeD2 = this.LIZIZ;
        c80229VeD2.LJIIL = true;
        this.LIZ.LLLFF(c80229VeD2.LJIILIIL, false);
    }

    public C80230VeE(C80229VeD c80229VeD, QXX qxx) {
        this.LIZIZ = c80229VeD;
        this.LIZ = qxx;
    }
}
