package defpackage;

import X.AbstractC37594EpC;
import X.C51029K0z;
import X.EnumC38004Evo;
import X.InterfaceC31169CLd;
import X.InterfaceC31182CLq;
import X.InterfaceC36563EWp;
import X.InterfaceC37838Et8;
import X.OSZ;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* loaded from: classes16.dex */
public abstract class d extends AbstractC37594EpC<b, c> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26292"));

    @InterfaceC37838Et8(params = {""}, results = {"fromGroupId", "historyList"})
    public final String LJLILLLLZI = "ec_mall_get_search_word_request_params";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes16.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes16.dex */
    public interface b extends XBaseParamModel {
    }

    @InterfaceC31182CLq
    /* loaded from: classes16.dex */
    public interface c extends XBaseResultModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "fromGroupId", required = true)
        String getFromGroupId();

        @InterfaceC36563EWp(isGetter = true, keyPath = "historyList", required = true)
        String getHistoryList();

        @InterfaceC36563EWp(isGetter = false, keyPath = "fromGroupId", required = true)
        void setFromGroupId(String str);

        @InterfaceC36563EWp(isGetter = false, keyPath = "historyList", required = true)
        void setHistoryList(String str);
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
