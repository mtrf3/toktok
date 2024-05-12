package defpackage;

import X.AbstractC37594EpC;
import X.C51029K0z;
import X.EnumC38004Evo;
import X.InterfaceC31169CLd;
import X.InterfaceC36563EWp;
import X.InterfaceC37838Et8;
import X.OSZ;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class e extends AbstractC37594EpC<b, Object> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29071"));

    @InterfaceC37838Et8(params = {"searchWord", "searchWordId", "searchWordPosition", "searchLogId", "ecHintCouponInfo", "promotionInfo", "attachProducts"})
    public final String LJLILLLLZI = "ec_mall_set_search_data";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes9.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes9.dex */
    public interface b extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "attachProducts", required = false)
        String getAttachProducts();

        @InterfaceC36563EWp(isGetter = true, keyPath = "ecHintCouponInfo", required = false)
        String getEcHintCouponInfo();

        @InterfaceC36563EWp(isGetter = true, keyPath = "promotionInfo", required = false)
        String getPromotionInfo();

        @InterfaceC36563EWp(isGetter = true, keyPath = "searchLogId", required = true)
        String getSearchLogId();

        @InterfaceC36563EWp(isGetter = true, keyPath = "searchWord", required = true)
        String getSearchWord();

        @InterfaceC36563EWp(isGetter = true, keyPath = "searchWordId", required = true)
        String getSearchWordId();

        @InterfaceC36563EWp(isGetter = true, keyPath = "searchWordPosition", required = true)
        Number getSearchWordPosition();
    }

    @Override // X.AbstractC37594EpC, X.InterfaceC37666EqM
    public final EnumC38004Evo getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC37666EqM
    public final String getName() {
        return this.LJLILLLLZI;
    }
}
