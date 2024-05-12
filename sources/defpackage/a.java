package defpackage;

import X.AbstractC37594EpC;
import X.C51029K0z;
import X.EnumC38004Evo;
import X.InterfaceC31169CLd;
import X.InterfaceC36563EWp;
import X.InterfaceC37838Et8;
import X.OSZ;
import X.WM7;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends AbstractC37594EpC<InterfaceC0002a, Object> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "29726"));

    @InterfaceC37838Et8(params = {WM7.SCENE_SERVICE, "size"})
    public final String LJLILLLLZI = "adComponentSize";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    @InterfaceC31169CLd
    /* renamed from: a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0002a extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = WM7.SCENE_SERVICE, required = true)
        String getScene();

        @InterfaceC36563EWp(isGetter = true, keyPath = "size", nestedClassType = c.class, required = true)
        c getSize();
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    /* loaded from: classes.dex */
    public interface c extends XBaseModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "height", required = true)
        Number getHeight();

        @InterfaceC36563EWp(isGetter = true, keyPath = "width", required = true)
        Number getWidth();
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
