package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.FAm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC38536FAm extends XBaseParamModel {
    @ED7(option = {"update", "append", "clear", "get"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "action", required = true)
    String getAction();

    @InterfaceC36563EWp(isGetter = true, keyPath = "key", required = false)
    String getKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "userActData", required = false)
    String getUserActData();
}
