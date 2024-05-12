package defpackage;

import X.AbstractC37594EpC;
import X.C51029K0z;
import X.ED6;
import X.EnumC38004Evo;
import X.InterfaceC31169CLd;
import X.InterfaceC31182CLq;
import X.InterfaceC36563EWp;
import X.InterfaceC37838Et8;
import X.OSZ;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class j extends AbstractC37594EpC<b, c> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27104"));

    @InterfaceC37838Et8(params = {"refreshLocationAccuracy", "byUser"}, results = {"refreshResult", "locationMobParams"})
    public final String LJLILLLLZI = "searchRefreshLocation";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes9.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes9.dex */
    public interface b extends XBaseParamModel {
        @ED6(option = {0, 1})
        @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "byUser", required = true)
        Number getByUser();

        @ED6(option = {2, 3})
        @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "refreshLocationAccuracy", required = true)
        Number getRefreshLocationAccuracy();
    }

    @InterfaceC31182CLq
    /* loaded from: classes9.dex */
    public interface c extends XBaseResultModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "locationMobParams", required = true)
        Map<String, Object> getLocationMobParams();

        @ED6(option = {0, 1, 2})
        @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "refreshResult", required = true)
        Number getRefreshResult();

        @InterfaceC36563EWp(isGetter = false, keyPath = "locationMobParams", required = true)
        void setLocationMobParams(Map<String, ? extends Object> map);

        @ED6(option = {0, 1, 2})
        @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "refreshResult", required = true)
        void setRefreshResult(Number number);
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
