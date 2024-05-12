package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Guj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC43033Guj extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "campaignInfo", required = true)
    String getCampaignInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "deliverableId", required = true)
    String getDeliverableId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "sparkAdsAuth", required = false)
    String getSparkAdsAuth();

    @InterfaceC36563EWp(isGetter = true, keyPath = "submitText", nestedClassType = InterfaceC43034Guk.class, required = false)
    InterfaceC43034Guk getSubmitText();
}
