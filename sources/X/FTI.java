package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes7.dex */
public interface FTI extends XBaseParamModel {
    @ED6(option = {0, 1})
    @InterfaceC36563EWp(defaultValue = @InterfaceC36566EWs(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "action", required = false)
    Number getAction();

    @InterfaceC36563EWp(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "packageName", required = false)
    String getPackageName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
