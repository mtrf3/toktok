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
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class g extends AbstractC37594EpC<b, Object> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29541"));

    @InterfaceC37838Et8(params = {WM7.SCENE_SERVICE, "timeList"})
    public final String LJLILLLLZI = "registerPlaybackTime";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes11.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes11.dex */
    public interface b extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = WM7.SCENE_SERVICE, required = true)
        String getScene();

        @InterfaceC36563EWp(isGetter = true, keyPath = "timeList", primitiveClassType = Number.class, required = true)
        List<Number> getTimeList();
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
