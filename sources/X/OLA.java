package X;

import Y.ARunnableS17S0000000_10;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS29S0200000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLA implements OLN {
    public final /* synthetic */ Aweme LIZ;

    @Override // X.OLN
    public final void LIZIZ(VSAProductCardsResponse.ProductDetail productDetail) {
        o.LJIIIZ(productDetail, "productDetail");
    }

    @Override // X.OLN
    public final void LIZJ() {
    }

    @Override // X.OLN
    public final void LJ() {
    }

    @Override // X.OLN
    public final void LIZLLL() {
        try {
            C38995FSd.LIZJ().execute(new ARunnableS17S0000000_10(10));
        } catch (Throwable unused) {
        }
    }

    public OLA(Aweme aweme) {
        this.LIZ = aweme;
    }

    @Override // X.OLN
    public final void LIZ(Context context) {
        o.LJIIIZ(context, "context");
        try {
            C38995FSd.LIZJ().execute(new ARunnableS29S0200000_10(context, this.LIZ, 49));
        } catch (Throwable unused) {
        }
    }

    @Override // X.OLN
    public final void LJFF(Context context, VSAProductCardsResponse.ProductDetail productDetail) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(productDetail, "productDetail");
        try {
            C38995FSd.LIZJ().execute(new ARunnableS21S0300000_10(this.LIZ, context, productDetail, 14));
        } catch (Throwable unused) {
        }
    }
}
