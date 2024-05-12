package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface NA2 extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "params", required = false)
    java.util.Map<String, Object> getParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
