package defpackage;

import X.AbstractC37594EpC;
import X.C51029K0z;
import X.EnumC38004Evo;
import X.InterfaceC31169CLd;
import X.InterfaceC36563EWp;
import X.InterfaceC37838Et8;
import X.OSZ;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class f extends AbstractC37594EpC<b, Object> {
    public static final Map<String, Object> LJLJJI = C51029K0z.LJJIIZI(new OSZ("TicketID", "26981"));

    @InterfaceC37838Et8(params = {"title", "content", "buttons", "id"})
    public final String LJLILLLLZI = "ecOpenAlert";
    public final EnumC38004Evo LJLJI = EnumC38004Evo.PRIVATE;

    /* loaded from: classes9.dex */
    public static final class a {
    }

    @InterfaceC31169CLd
    /* loaded from: classes9.dex */
    public interface b extends XBaseParamModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "buttons", nestedClassType = c.class, required = true)
        c getButtons();

        @InterfaceC36563EWp(isGetter = true, keyPath = "content", required = true)
        String getContent();

        @InterfaceC36563EWp(isGetter = true, keyPath = "id", required = true)
        String getId();

        @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = true)
        String getTitle();
    }

    /* loaded from: classes9.dex */
    public interface c extends XBaseModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "cancel", nestedClassType = d.class, required = true)
        d getCancel();

        @InterfaceC36563EWp(isGetter = true, keyPath = "confirm", nestedClassType = e.class, required = true)
        e getConfirm();
    }

    /* loaded from: classes9.dex */
    public interface d extends XBaseModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "text", required = true)
        String getText();
    }

    /* loaded from: classes9.dex */
    public interface e extends XBaseModel {
        @InterfaceC36563EWp(isGetter = true, keyPath = "text", required = true)
        String getText();
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
