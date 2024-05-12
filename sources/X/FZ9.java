package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes7.dex */
public interface FZ9 extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "biz", required = false)
    String getBiz();

    @InterfaceC36563EWp(isGetter = true, keyPath = "exposureType", required = true)
    Number getExposureType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "key", required = true)
    String getKey();
}
