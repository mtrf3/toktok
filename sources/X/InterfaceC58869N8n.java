package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.N8n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58869N8n extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "debugBtn", nestedClassType = InterfaceC58870N8o.class, required = true)
    List<InterfaceC58870N8o> getDebugBtn();

    @InterfaceC36563EWp(isGetter = true, keyPath = "extraData", required = true)
    java.util.Map<String, Object> getExtraData();

    @ED6(option = {1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "lifecycle", required = true)
    Number getLifecycle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pageName", required = true)
    String getPageName();
}
