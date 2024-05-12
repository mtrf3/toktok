package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.utils.Au2S19S0100000_10;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OLK {
    public final Context LIZ;
    public final InterfaceC82683Wch LIZIZ;
    public final OLL LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;

    public final boolean LIZIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZIZ;
        if (interfaceC82683Wch == null || !interfaceC82683Wch.isShowing()) {
            return false;
        }
        return true;
    }

    public final void LIZLLL() {
        if (!this.LIZLLL || LIZIZ()) {
            return;
        }
        this.LJ = true;
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS46S0100000_10(this, 173));
        } catch (Throwable unused) {
        }
    }

    public final void LIZ() {
        if (!LIZIZ() && !this.LJ) {
            return;
        }
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS46S0100000_10(this, 171));
        } catch (Throwable unused) {
        }
    }

    public final void LIZJ() {
        LIZ();
        this.LIZLLL = false;
        this.LJ = false;
        try {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS46S0100000_10(this, 172));
        } catch (Throwable unused) {
        }
    }

    public OLK(Context context, String label) {
        HomeTabAbility homeTabAbility;
        LLQ OH;
        View LJIIJ;
        int i;
        List<InterfaceC54080LKi> fd;
        InterfaceC54080LKi interfaceC54080LKi;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        OLL oll = new OLL(context);
        this.LIZJ = oll;
        boolean LIZJ = LUT.LIZJ(context);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            MainActivityScope LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI);
            if (LJJLIIIJJI != null) {
                homeTabAbility = C87277YNd.LJIL(LJJLIIIJJI);
            } else {
                homeTabAbility = null;
            }
            if (LIZJ) {
                String str = (homeTabAbility == null || (fd = homeTabAbility.fd()) == null || (interfaceC54080LKi = (InterfaceC54080LKi) ORZ.LJLLLLLL(1, fd)) == null || (str = interfaceC54080LKi.tag()) == null) ? "" : "SHOP_MALL";
                OH = homeTabAbility.OH(LJJIFFI);
                if (OH == null && (LJIIJ = OH.LJIIJ(str)) != null) {
                    C142425iQ c142425iQ = new C142425iQ(context);
                    c142425iQ.LIZ.LIZIZ = LJIIJ;
                    c142425iQ.LJFF();
                    c142425iQ.LJI(WHL.TOP);
                    C82682Wcg c82682Wcg = c142425iQ.LIZ;
                    c82682Wcg.LJIJ = oll;
                    c82682Wcg.LJIJJLI = false;
                    c82682Wcg.LJII = -1001L;
                    c82682Wcg.LJIIJ = 200L;
                    c142425iQ.LIZ.LJIIIIZZ = C7MY.LIZIZ(12);
                    c142425iQ.LIZ.LJFF = C7MY.LIZIZ(-8);
                    c142425iQ.LJIIJ(null, true);
                    boolean z = !LIZJ;
                    C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
                    c82682Wcg2.LJIIL = z;
                    c82682Wcg2.LJIIJJI = z;
                    c142425iQ.LJII(new AqS160S0100000_10(this, 528));
                    c142425iQ.LJ(new AqS160S0100000_10(this, 529));
                    if (C52935Kq3.LIZ()) {
                        i = R.attr.dj;
                    } else {
                        i = R.attr.d5;
                    }
                    c142425iQ.LJIIIZ(i);
                    if (label != null && !ujb.o.LJJJJJL(label)) {
                        C7Z3 c7z3 = new C7Z3(context);
                        o.LJIIIZ(label, "label");
                        if (!ujb.o.LJJJJJL(label)) {
                            try {
                                C59946Nfq LIZ = NDH.LIZ();
                                LIZ.LJIIJ(label);
                                LIZ.LJIIL(92);
                                LIZ.LJIIJJI(C78609UtB.LJJJ(R.attr.dj, c7z3.getContext()));
                                LIZ.LIZ(C78609UtB.LJJJ(R.attr.dn, c7z3.getContext()));
                                LIZ.LIZIZ(C32151Nz.LJIIZILJ(2));
                                C59947Nfr c59947Nfr = LIZ.LIZ;
                                if (c59947Nfr != null) {
                                    c59947Nfr.LJIIIIZZ = -2;
                                }
                                LIZ.LIZLLL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                                LIZ.LIZJ(TextUtils.TruncateAt.END);
                                LIZ.LJFF();
                                LIZ.LJII(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                                LIZ.LJIIIIZZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
                                C59947Nfr c59947Nfr2 = LIZ.LIZ;
                                if (c59947Nfr2 != null) {
                                    c7z3.LJLIL.LIZ(c59947Nfr2);
                                    c7z3.setVisibility(0);
                                }
                            } catch (Throwable unused) {
                                c7z3.setVisibility(8);
                            }
                        } else {
                            c7z3.setVisibility(8);
                        }
                        WHL position = WHL.TOP;
                        o.LJIIIZ(position, "position");
                        C82682Wcg c82682Wcg3 = c142425iQ.LIZ;
                        c82682Wcg3.LJIJI = c7z3;
                        c82682Wcg3.LJIJJ = position;
                    }
                    this.LIZIZ = c142425iQ.LIZJ();
                    return;
                }
            }
            if (homeTabAbility == null) {
                return;
            }
            OH = homeTabAbility.OH(LJJIFFI);
            if (OH == null) {
            }
        }
    }

    public final void LJ(VSAProductCardsResponse.ProductCard productCard, OLA ola, java.util.Map trackParams) {
        List<VSAProductCardsResponse.ProductDetail> subList;
        o.LJIIIZ(productCard, "productCard");
        o.LJIIIZ(trackParams, "trackParams");
        boolean z = false;
        if (this.LIZIZ == null) {
            this.LIZLLL = false;
            LIZ();
            ola.LIZLLL();
            return;
        }
        this.LIZLLL = true;
        OLL oll = this.LIZJ;
        if (oll != null) {
            OLM olm = new OLM(this, ola);
            oll.LIZLLL();
            oll.LJLIL = olm;
            oll.LJLILLLLZI.putAll(trackParams);
            OLL.LJLLI.getClass();
            int LIZ = OL9.LIZ(productCard);
            if (LIZ <= 0) {
                oll.LJLJL = false;
                oll.setVisibility(8);
                OLO olo = oll.LJLIL;
                if (olo != null) {
                    olo.LIZJ();
                    return;
                }
                return;
            }
            List<VSAProductCardsResponse.ProductDetail> productDetailList = productCard.getProductDetailList();
            C42785Gqj c42785Gqj = null;
            if (productDetailList == null || (subList = productDetailList.subList(0, LIZ)) == null || subList.isEmpty()) {
                oll.LJLJL = false;
                oll.setVisibility(8);
                OLO olo2 = oll.LJLIL;
                if (olo2 == null) {
                    return;
                }
                olo2.LIZJ();
                return;
            }
            oll.LJLJL = true;
            oll.setVisibility(0);
            OLJ olj = new OLJ(oll);
            if (subList.size() > 1) {
                oll.LJLJI = OLI.AD_MULTI_BUBBLE;
                oll.LIZ(R.id.ky0).setVisibility(0);
                oll.LIZ(R.id.nba).setVisibility(8);
                C42785Gqj c42785Gqj2 = (C42785Gqj) oll.LIZ(R.id.ky0);
                c42785Gqj2.getClass();
                c42785Gqj2.LIZ();
                c42785Gqj2.LJLJI = olj;
                if (!subList.isEmpty()) {
                    c42785Gqj2.setVisibility(0);
                    ((ArrayList) c42785Gqj2.LJLILLLLZI).addAll(subList);
                    if (subList.size() > 1) {
                        z = true;
                    }
                    c42785Gqj2.LJLJJL = z;
                    View currentView = c42785Gqj2.getCurrentView();
                    o.LJIIIIZZ(currentView, "currentView");
                    c42785Gqj2.LIZIZ(currentView);
                    c42785Gqj = c42785Gqj2;
                } else {
                    olj.LIZJ();
                }
                oll.LJLJJLL = c42785Gqj;
            } else {
                oll.LJLJI = OLI.AD_SINGLE_BUBBLE;
                oll.LIZ(R.id.ky0).setVisibility(8);
                oll.LIZ(R.id.nba).setVisibility(0);
                C61745OLd c61745OLd = (C61745OLd) oll.LIZ(R.id.nba);
                c61745OLd.LIZJ(0, (VSAProductCardsResponse.ProductDetail) ORZ.LJLLJ(subList), olj);
                oll.LJLJJLL = c61745OLd;
            }
            ((TextView) oll.LIZ(R.id.az7)).setText(ED2.LIZ(productCard.getBtnText()));
            C16880lQ.LJIIJ(new Au2S19S0100000_10(oll, 1), oll);
            View btn_shop = oll.LIZ(R.id.az7);
            o.LJIIIIZZ(btn_shop, "btn_shop");
            C16880lQ.LJIIJ(new Au2S19S0100000_10(oll, 2), btn_shop);
            View iv_close = oll.LIZ(R.id.f0h);
            o.LJIIIIZZ(iv_close, "iv_close");
            C16880lQ.LJIIJ(new Au2S19S0100000_10(oll, 3), iv_close);
        }
    }
}
