package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes16.dex */
public interface Y7E extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "defaultTime", required = true)
    Number getDefaultTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isTimeIndicatorSuffix", required = false)
    Boolean isTimeIndicatorSuffix();

    @InterfaceC36563EWp(isGetter = true, keyPath = "isTwelveHourFormat", required = false)
    Boolean isTwelveHourFormat();
}
