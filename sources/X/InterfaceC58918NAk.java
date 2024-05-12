package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.NAk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58918NAk extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "autofillFields", primitiveClassType = String.class, required = false)
    List<String> getAutofillFields();

    @InterfaceC36563EWp(isGetter = true, keyPath = "autofillInfo", required = false)
    java.util.Map<String, Object> getAutofillInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "extraInfo", required = false)
    String getExtraInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "popupJsbStartTime", required = false)
    Number getPopupJsbStartTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "popupType", required = true)
    Number getPopupType();
}
