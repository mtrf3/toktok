package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.C27162AlK;
import X.C46580IPw;
import X.C70757Rpp;
import X.C70763Rpv;
import X.C80766Vms;
import X.C80769Vmv;
import X.C8YN;
import X.InterfaceC70286RiE;
import X.TBT;
import Y.IDiS273S0100000_12;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.HeaderBrickVO;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderBrickVH extends BaseBrickVH<HeaderBrickVO> implements InterfaceC70286RiE {
    public C70757Rpp LJLJLLL;
    public int LJLL;
    public boolean LJLLI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void V() {
        C8YN.LJII(this, L(), new TBT() { // from class: X.Ri6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C27723AuN) obj).LJLILLLLZI;
            }
        }, null, new AqS194S0100000_12(this, 205), 6);
        C8YN.LJII(this, M(), new TBT() { // from class: X.RiD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C69947Rcl) obj).LJLIL);
            }
        }, null, new AqS194S0100000_12(this, 206), 6);
        C80766Vms c80766Vms = (C80766Vms) this.itemView.findViewById(R.id.bng);
        o.LJIIIIZZ(c80766Vms, "itemView.commerce_header_pager");
        this.LJLJLLL = new C70757Rpp(c80766Vms, this);
        ((C80769Vmv) this.itemView.findViewById(R.id.bng)).setAdapter(this.LJLJLLL);
        ((C80769Vmv) this.itemView.findViewById(R.id.bng)).setOnPageChangeListener(new IDiS273S0100000_12(this, 2));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final String getModuleName() {
        return "head_pic";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void U() {
        C70757Rpp c70757Rpp = this.LJLJLLL;
        if (c70757Rpp != null) {
            for (C70763Rpv c70763Rpv : ((LinkedHashMap) c70757Rpp.LJLLI).values()) {
                c70763Rpv.LJ.LJFF(true);
                C46580IPw c46580IPw = c70763Rpv.LIZJ;
                Object uiPlayListener = c70763Rpv.LJII.getValue();
                c46580IPw.getClass();
                o.LJIIIZ(uiPlayListener, "uiPlayListener");
                if (c46580IPw.LJFF().contains(uiPlayListener)) {
                    c46580IPw.LJFF().remove(uiPlayListener);
                }
            }
            ((LinkedHashMap) c70757Rpp.LJLLI).clear();
        }
    }

    public HeaderBrickVH() {
        super(R.layout.a39);
        this.LJLLI = true;
    }

    @Override // X.InterfaceC70286RiE
    public final void LLIL() {
        N().LJZ = true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onPause() {
        super.onPause();
        C70757Rpp c70757Rpp = this.LJLJLLL;
        if (c70757Rpp != null) {
            c70757Rpp.LJJIIJZLJL(this.LJLL);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C70757Rpp c70757Rpp = this.LJLJLLL;
        if (c70757Rpp != null) {
            c70757Rpp.LJJIIJZLJL(this.LJLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(HeaderBrickVO headerBrickVO) {
        List arrayList;
        HeaderBrickVO item = headerBrickVO;
        o.LJIIIZ(item, "item");
        if (item.LIZ() != null) {
            HeaderBizData LIZ = item.LIZ();
            List<ProductBannerLabel> list = null;
            if (LIZ != null && LIZ.items != null) {
                HeaderBizData LIZ2 = item.LIZ();
                if (LIZ2 == null || (arrayList = LIZ2.items) == null) {
                    arrayList = new ArrayList();
                }
                ((ImageView) this.itemView.findViewById(R.id.bnh)).setVisibility(8);
                C70757Rpp c70757Rpp = this.LJLJLLL;
                if (c70757Rpp != null) {
                    ((ArrayList) c70757Rpp.LJLJLJ).clear();
                    ((ArrayList) c70757Rpp.LJLJLJ).addAll(arrayList);
                    c70757Rpp.notifyDataSetChanged();
                }
                C70757Rpp c70757Rpp2 = this.LJLJLLL;
                if (c70757Rpp2 != null) {
                    HeaderBizData LIZ3 = item.LIZ();
                    if (LIZ3 != null) {
                        list = LIZ3.productBannerLabel;
                    }
                    ((ArrayList) c70757Rpp2.LJLJLLL).clear();
                    if (list != null) {
                        ((ArrayList) c70757Rpp2.LJLJLLL).addAll(list);
                    }
                }
                C70757Rpp c70757Rpp3 = this.LJLJLLL;
                if (c70757Rpp3 != null) {
                    c70757Rpp3.LJLL = M().iv0().LJ();
                }
                if (this.LJLL < item.LJIILJJIL()) {
                    this.itemView.findViewById(R.id.ela).setVisibility(8);
                } else {
                    this.itemView.findViewById(R.id.ela).setVisibility(0);
                    ((TextView) this.itemView.findViewById(R.id.ela)).setText(C27162AlK.LIZ(String.valueOf((this.LJLL - item.LJIILJJIL()) + 1), String.valueOf(item.LJIIL().size() - item.LJIILIIL())));
                }
                ((C80769Vmv) this.itemView.findViewById(R.id.bng)).setCurrentItem(this.LJLL);
                return;
            }
        }
        this.itemView.findViewById(R.id.ela).setVisibility(8);
        ((ImageView) this.itemView.findViewById(R.id.bnh)).setVisibility(0);
    }
}
