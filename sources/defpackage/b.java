package defpackage;

import X.AbstractC37594EpC;
import X.C51029K0z;
import X.EnumC38004Evo;
import X.InterfaceC31169CLd;
import X.InterfaceC36563EWp;
import X.InterfaceC37838Et8;
import X.OSZ;
import X.WM7;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b extends AbstractC37594EpC<a, Object> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "28065"));

    @InterfaceC37838Et8(params = {"status", WM7.SCENE_SERVICE})
    public final String LJLILLLLZI = "adComponentStatus";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    @InterfaceC31169CLd
    /* loaded from: classes.dex */
    public interface a extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = WM7.SCENE_SERVICE, required = true)
        String getScene();

        @InterfaceC36563EWp(isGetter = true, keyPath = "status", required = true)
        Number getStatus();
    }

    /* renamed from: b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0004b {
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
