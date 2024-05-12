package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.EqW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC37676EqW extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "pageSourceList", nestedClassType = EX4.class, required = false)
    List<EX4> getPageSourceList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pdp_template", required = false)
    String getPdpTemplate();

    @InterfaceC36563EWp(isGetter = true, keyPath = "productIdList", primitiveClassType = String.class, required = true)
    List<String> getProductIdList();

    @InterfaceC36563EWp(isGetter = true, keyPath = "sourcePageType", required = true)
    String getSourcePageType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trafficSourceList", primitiveClassType = Number.class, required = false)
    List<Number> getTrafficSourceList();
}
