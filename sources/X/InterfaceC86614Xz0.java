package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Xz0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86614Xz0 extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "clientCode", required = false)
    Number getClientCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "header", required = false)
    java.util.Map<String, Object> getHeader();

    @InterfaceC36563EWp(isGetter = true, keyPath = "httpCode", required = true)
    Number getHttpCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "rawResponse", required = false)
    String getRawResponse();

    @InterfaceC36563EWp(isGetter = true, keyPath = "response", required = true)
    Object getResponse();

    @ED7(option = {"arraybuffer", "base64"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "responseType", required = false)
    String getResponseType();

    @InterfaceC36563EWp(isGetter = false, keyPath = "clientCode", required = false)
    void setClientCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "header", required = false)
    void setHeader(java.util.Map<String, ? extends Object> map);

    @InterfaceC36563EWp(isGetter = false, keyPath = "httpCode", required = true)
    void setHttpCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "rawResponse", required = false)
    void setRawResponse(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "response", required = true)
    void setResponse(Object obj);

    @ED7(option = {"arraybuffer", "base64"})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "responseType", required = false)
    void setResponseType(String str);
}
