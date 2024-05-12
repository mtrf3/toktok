package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.model.PdpV2EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBizExtra;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBizExtra;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import ujb.o;

/* renamed from: X.RiS, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70300RiS implements InterfaceC87283bg {
    public PdpV2EnterParams LJLIL;
    public DynamicPage LJLILLLLZI;
    public List<? extends AbstractC27664AtQ<?, ?>> LJLJI;
    public java.util.Map<String, ? extends Object> LJLJJI;
    public boolean LJLJJLL;
    public ProductInfoBizExtra LJLJL;
    public SkuBizExtra LJLJLLL;
    public String LJLLI;
    public SkuPanelState LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJZ;
    public int LJZI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1015));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1018));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1019));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1014));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1016));
    public long LJLZ = -1;

    public final int LIZ() {
        PdpV2EnterParams pdpV2EnterParams = this.LJLIL;
        if (pdpV2EnterParams != null) {
            return pdpV2EnterParams.getPdpPageType();
        }
        return EnumC27447Apv.SEMI_PDP.getValue();
    }

    public final String LIZIZ() {
        String productId;
        PdpV2EnterParams pdpV2EnterParams = this.LJLIL;
        if (pdpV2EnterParams == null || (productId = pdpV2EnterParams.getProductId()) == null) {
            return "";
        }
        return productId;
    }

    public final ProductInfoBizExtra LIZJ() {
        ProductInfoBizExtra productInfoBizExtra = this.LJLJL;
        if (productInfoBizExtra == null) {
            return (ProductInfoBizExtra) this.LJLJLJ.getValue();
        }
        return productInfoBizExtra;
    }

    public final SkuBizExtra LIZLLL() {
        SkuBizExtra skuBizExtra = this.LJLJLLL;
        if (skuBizExtra == null) {
            return (SkuBizExtra) this.LJLL.getValue();
        }
        return skuBizExtra;
    }

    public final boolean LJ() {
        PdpV2EnterParams pdpV2EnterParams = this.LJLIL;
        if (pdpV2EnterParams != null) {
            return pdpV2EnterParams.getFullScreen();
        }
        return false;
    }

    public final void LJFF(java.util.Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap;
        if (map == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (String str : map.keySet()) {
                if (o.LJJJLIIL(str, "ec_", false)) {
                    linkedHashMap.put(o.LJJJJZ(str, "ec_", "", false), map.get(str));
                } else {
                    linkedHashMap.put(str, map.get(str));
                }
            }
        }
        this.LJLJJI = linkedHashMap;
    }
}
