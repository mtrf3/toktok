package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes11.dex */
public interface OK9 extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "latitude", required = true)
    Number getLatitude();

    @InterfaceC36563EWp(isGetter = true, keyPath = "longitude", required = true)
    Number getLongitude();

    @InterfaceC36563EWp(isGetter = false, keyPath = "latitude", required = true)
    void setLatitude(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "longitude", required = true)
    void setLongitude(Number number);
}
