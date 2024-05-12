package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.SGp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71819SGp extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "errorInfo", nestedClassType = InterfaceC71822SGs.class, required = false)
    InterfaceC71822SGs getErrorInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "imageInfos", nestedClassType = InterfaceC71821SGr.class, required = false)
    List<InterfaceC71821SGr> getImageInfos();

    @InterfaceC36563EWp(isGetter = true, keyPath = "traceId", required = true)
    String getTraceId();

    @InterfaceC36563EWp(isGetter = false, keyPath = "errorInfo", nestedClassType = InterfaceC71822SGs.class, required = false)
    void setErrorInfo(InterfaceC71822SGs interfaceC71822SGs);

    @InterfaceC36563EWp(isGetter = false, keyPath = "imageInfos", nestedClassType = InterfaceC71821SGr.class, required = false)
    void setImageInfos(List<? extends InterfaceC71821SGr> list);

    @InterfaceC36563EWp(isGetter = false, keyPath = "traceId", required = true)
    void setTraceId(String str);
}
