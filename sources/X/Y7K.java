package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes16.dex */
public interface Y7K extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "command", required = true)
    String getCommand();

    @InterfaceC36563EWp(isGetter = true, keyPath = "params", required = false)
    java.util.Map<String, Object> getParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "timeStamp", required = true)
    Number getTimeStamp();
}
