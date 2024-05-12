package ql1;

import X.AbstractC60811Ntn;
import X.C72818Shy;
import X.InterfaceC60761Nsz;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsAssem;
import com.ss.android.ugc.aweme.poi.reviews.assem.PoiReviewFloatingActionAssem;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class IDbS493S0100000_3 extends AbstractC60811Ntn {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz interfaceC60761Nsz) {
        switch (this.$t) {
            case 0:
                LJJJJJ$0(this, interfaceC60761Nsz);
                return;
            case 1:
                LJJJJJ$1(this, interfaceC60761Nsz);
                return;
            default:
                super.LJJJJJ(interfaceC60761Nsz);
                return;
        }
    }

    public IDbS493S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJJJJ$0(IDbS493S0100000_3 iDbS493S0100000_3, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C72818Shy.LIZLLL("syncReviewToNative", (PoiDetailReviewsAssem) iDbS493S0100000_3.l0);
    }

    public static final void LJJJJJ$1(IDbS493S0100000_3 iDbS493S0100000_3, InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C72818Shy.LIZLLL("syncReviewToNative", (PoiReviewFloatingActionAssem) iDbS493S0100000_3.l0);
    }
}
