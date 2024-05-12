package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface N72 extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "event", required = true)
    String getEvent();

    @InterfaceC36563EWp(isGetter = true, keyPath = "params", required = false)
    java.util.Map<String, Object> getParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "terminateFlow", required = true)
    boolean getTerminateFlow();
}
