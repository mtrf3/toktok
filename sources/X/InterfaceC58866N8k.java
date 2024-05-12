package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.N8k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58866N8k extends XBaseResultModel {
    @ED6(option = {1, 0, -1, -2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "code", required = true)
    Number getCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @ED6(option = {1, 0, -1, -2})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "code", required = true)
    void setCode(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);
}
