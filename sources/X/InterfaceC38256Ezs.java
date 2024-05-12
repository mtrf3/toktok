package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Ezs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC38256Ezs extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "mode", required = false)
    String getMode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "result", required = false)
    java.util.Map<String, Object> getResult();

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "state", required = false)
    Number getState();

    @InterfaceC36563EWp(isGetter = false, keyPath = "mode", required = false)
    void setMode(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "result", required = false)
    void setResult(java.util.Map<String, ? extends Object> map);

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "state", required = false)
    void setState(Number number);
}
