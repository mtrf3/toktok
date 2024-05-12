package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes7.dex */
public interface FTN extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "msg", required = true)
    String getMsg();

    @InterfaceC36563EWp(isGetter = false, keyPath = "code", required = true)
    void setCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "msg", required = true)
    void setMsg(String str);
}
