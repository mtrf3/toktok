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
public abstract class k extends AbstractC37594EpC<b, c> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "27096"));

    @InterfaceC37838Et8(params = {"enterMethod"}, results = {"code", "msg"})
    public final String LJLILLLLZI = "searchRefreshPage";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes9.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes9.dex */
    public interface b extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "enterMethod", required = true)
        String getEnterMethod();
    }

    @InterfaceC31182CLq
    /* loaded from: classes9.dex */
    public interface c extends XBaseResultModel {
        @ED6(option = {1, 0, -1, -2})
        @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "code", required = true)
        Number getCode();

        @InterfaceC36563EWp(isGetter = true, keyPath = "msg", required = false)
        String getMsg();

        @ED6(option = {1, 0, -1, -2})
        @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "code", required = true)
        void setCode(Number number);

        @InterfaceC36563EWp(isGetter = false, keyPath = "msg", required = false)
        void setMsg(String str);
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
