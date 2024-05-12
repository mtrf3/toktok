package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Xyw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86610Xyw extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "body", required = false)
    Object getBody();

    @ED7(option = {"base64"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "bodyType", required = false)
    String getBodyType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "disableRedirect", required = false)
    Boolean getDisableRedirect();

    @InterfaceC36563EWp(isGetter = true, keyPath = "header", required = false)
    java.util.Map<String, Object> getHeader();

    @InterfaceC36563EWp(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "jsonFormatOption", required = false)
    Number getJsonFormatOption();

    @ED7(option = {"GET", "POST"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "method", required = true)
    String getMethod();

    @InterfaceC36563EWp(isGetter = true, keyPath = "params", required = false)
    java.util.Map<String, Object> getParams();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
