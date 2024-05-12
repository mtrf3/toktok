package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.VUw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79834VUw implements VV1 {
    public final VNL LIZ;
    public final RecyclerView LIZIZ;
    public VV1 LIZJ;
    public boolean LIZLLL;

    @Override // X.VV1
    public final void LIZIZ() {
        this.LIZJ.LIZIZ();
    }

    @Override // X.VV1
    public final void LIZ(C79831VUt c79831VUt) {
        this.LIZJ.LIZ(c79831VUt);
    }

    @Override // X.VV1
    public final void LIZJ(C79831VUt c79831VUt) {
        this.LIZJ.LIZJ(c79831VUt);
    }

    @Override // X.VV1
    public final void LIZLLL(C79831VUt c79831VUt) {
        this.LIZJ.LIZLLL(c79831VUt);
    }

    public C79834VUw(VNL vnl, C79688VPg c79688VPg) {
        this.LIZ = vnl;
        this.LIZIZ = c79688VPg;
        this.LIZJ = new C79826VUo(vnl);
    }
}
