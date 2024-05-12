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

/* loaded from: classes11.dex */
public abstract class h extends AbstractC37594EpC<b, c> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26908"));

    @InterfaceC37838Et8(params = {"biz"})
    public final String LJLILLLLZI = "removeReuseKitView";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes11.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes11.dex */
    public interface b extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "biz", required = true)
        String getBiz();
    }

    @InterfaceC31182CLq
    /* loaded from: classes11.dex */
    public interface c extends XBaseResultModel {
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
