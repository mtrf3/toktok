package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes13.dex */
public interface SH1 extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "errorInfo", nestedClassType = SH2.class, required = false)
    SH2 getErrorInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "traceId", required = true)
    String getTraceId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoInfo", nestedClassType = InterfaceC71829SGz.class, required = false)
    InterfaceC71829SGz getVideoInfo();

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorInfo", nestedClassType = SH2.class, required = false)
    void setErrorInfo(SH2 sh2);

    @InterfaceC36563EWp(isGetter = false, keyPath = "traceId", required = true)
    void setTraceId(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "videoInfo", nestedClassType = InterfaceC71829SGz.class, required = false)
    void setVideoInfo(InterfaceC71829SGz interfaceC71829SGz);
}
