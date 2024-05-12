package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes11.dex */
public interface O9Y extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "distance", required = true)
    Number getDistance();

    @InterfaceC36563EWp(isGetter = true, keyPath = "is_bottom", required = true)
    Boolean is_bottom();

    @InterfaceC36563EWp(isGetter = false, keyPath = "distance", required = true)
    void setDistance(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "is_bottom", required = true)
    void set_bottom(Boolean bool);
}
