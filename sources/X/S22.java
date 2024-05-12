package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.ss.android.ugc.aweme.ecommercelive.common.data.SellingItem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class S22<T extends ViewGroup> extends S2R<T, C2UO> implements InterfaceC71280RyG {
    public final S27<T> LIZLLL;
    public final InterfaceC71439S1z<T> LJ;
    public C68762mu LJFF;
    public C4MG LJI;
    public boolean LJII;
    public PromotionItem LJIIIIZZ;
    public SellingItem LJIIIZ;
    public java.util.Map<String, String> LJIIJ;
    public java.util.Map<String, ? extends Object> LJIIJJI;

    @Override // X.InterfaceC71280RyG
    public final void destroy() {
        C68762mu c68762mu = this.LJFF;
        if (c68762mu != null) {
            c68762mu.LIZ();
        }
    }

    public S22(C119754mx c119754mx, S23 s23, C208118Et c208118Et) {
        super(c119754mx);
        this.LIZLLL = s23;
        this.LJ = c208118Et;
    }

    public final void LIZLLL(int i, PromotionItem promotionItem, long j, boolean z) {
        C4MG c4mg;
        C4MG c4mg2;
        C4MG c4mg3;
        C4MG c4mg4 = null;
        if (2 == i) {
            if (this.LJI == null) {
                View LIZ = this.LIZLLL.LIZ(this.LIZ, promotionItem);
                if ((LIZ instanceof C4MG) && (c4mg3 = (C4MG) LIZ) != null) {
                    ((ViewGroup) this.LIZ).addView(c4mg3, 0, new ViewGroup.MarginLayoutParams(-2, -1));
                    c4mg4 = c4mg3;
                }
                this.LJI = c4mg4;
            }
            if (z && (c4mg2 = this.LJI) != null) {
                String name = promotionItem.getName();
                if (name == null) {
                    name = C29822Bn8.LIZ(this.LIZJ, R.string.htw, "context.resources.getStr…string.live_ec_flashsale)");
                }
                c4mg2.setFlashSaleInfo(name);
            }
            if (j <= 86400000 && (c4mg = this.LJI) != null) {
                c4mg.setCountDown(j);
            }
            this.LJII = true;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("no need to show flash sale, currentState = ");
        LIZ2.append(i);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ2));
        C4MG c4mg5 = this.LJI;
        if (c4mg5 != null) {
            C16880lQ.LJLLL(c4mg5, (ViewGroup) this.LIZ);
        }
        this.LJI = null;
        this.LJII = false;
    }
}
