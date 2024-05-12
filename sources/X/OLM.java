package X;

import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLM implements OLO {
    public final /* synthetic */ OLK LIZ;
    public final /* synthetic */ OLN LIZIZ;

    @Override // X.OLO
    public final void LIZ() {
        this.LIZIZ.LJ();
    }

    @Override // X.OLO
    public final void LIZJ() {
        this.LIZ.LIZLLL = false;
        this.LIZ.LIZ();
        this.LIZIZ.LIZLLL();
    }

    @Override // X.OLO
    public final void LIZLLL() {
        this.LIZIZ.LIZJ();
    }

    @Override // X.OLO
    public final void LJ(VSAProductCardsResponse.ProductDetail productDetail) {
        this.LIZIZ.LIZ(this.LIZ.LIZ);
    }

    public OLM(OLK olk, OLA ola) {
        this.LIZ = olk;
        this.LIZIZ = ola;
    }

    @Override // X.OLO
    public final void LIZIZ(int i, VSAProductCardsResponse.ProductDetail productDetail) {
        o.LJIIIZ(productDetail, "productDetail");
        this.LIZIZ.LJFF(this.LIZ.LIZ, productDetail);
    }

    @Override // X.OLO
    public final void LJFF(int i, VSAProductCardsResponse.ProductDetail productDetail) {
        o.LJIIIZ(productDetail, "productDetail");
        this.LIZIZ.LIZIZ(productDetail);
    }
}
