package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes16.dex */
public interface Y71 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "textJson", required = false)
    String getTextJson();

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "textState", required = false)
    Number getTextState();

    @InterfaceC36563EWp(isGetter = false, keyPath = "textJson", required = false)
    void setTextJson(String str);

    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "textState", required = false)
    void setTextState(Number number);
}
