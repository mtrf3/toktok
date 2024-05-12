package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* loaded from: classes11.dex */
public interface NDM extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "prevReactIds", primitiveClassType = String.class, required = false)
    List<String> getPrevReactIds();

    @InterfaceC36563EWp(isGetter = false, keyPath = "prevReactIds", primitiveClassType = String.class, required = false)
    void setPrevReactIds(List<String> list);
}
