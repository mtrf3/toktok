package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.O0v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC61217O0v extends XBaseResultModel {
    @ED7(option = {"success", "error"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "resultCode", required = true)
    String getResultCode();

    @ED7(option = {"success", "error"})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "resultCode", required = true)
    void setResultCode(String str);
}
