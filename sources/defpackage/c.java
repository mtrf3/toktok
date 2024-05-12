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

/* loaded from: classes.dex */
public abstract class c extends AbstractC37594EpC<b, InterfaceC0005c> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26093"));

    @InterfaceC37838Et8(params = {""}, results = {"previousPage"})
    public final String LJLILLLLZI = "ec_mall_get_previous_page";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes.dex */
    public interface b extends XBaseParamModel {
    }

    @InterfaceC31182CLq
    /* renamed from: c$c, reason: collision with other inner class name */
    /* loaded from: classes11.dex */
    public interface InterfaceC0005c extends XBaseResultModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "previousPage", required = true)
        String getPreviousPage();

        @InterfaceC36563EWp(isGetter = false, keyPath = "previousPage", required = true)
        void setPreviousPage(String str);
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
