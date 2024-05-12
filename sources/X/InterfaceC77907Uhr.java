package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Uhr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77907Uhr extends XBaseResultModel {
    @ED6(option = {0, 1, 2, 3, 4})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "errorCode", required = false)
    Number getErrorCode();

    @ED6(option = {0, 1, 2, 3, 4})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "errorCode", required = false)
    void setErrorCode(Number number);
}
