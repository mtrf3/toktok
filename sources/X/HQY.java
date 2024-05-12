package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes8.dex */
public interface HQY extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "anchors", required = false)
    String getAnchors();

    @InterfaceC36563EWp(isGetter = true, keyPath = "aweme", required = true)
    java.util.Map<String, Object> getAweme();

    @InterfaceC36563EWp(isGetter = true, keyPath = "challengeName", required = false)
    String getChallengeName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "extra", required = false)
    java.util.Map<String, Object> getExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "nleSummary", required = true)
    String getNleSummary();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shootWay", required = true)
    String getShootWay();

    @InterfaceC36563EWp(isGetter = true, keyPath = "templateId", required = true)
    String getTemplateId();
}
