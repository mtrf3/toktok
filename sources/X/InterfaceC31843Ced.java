package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.Ced, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31843Ced extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "coverUrl", required = true)
    String getCoverUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "desc", required = true)
    String getDesc();

    @InterfaceC36563EWp(isGetter = true, keyPath = "descriptionStarlingKey", required = false)
    String getDescriptionStarlingKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "descriptionStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getDescriptionStarlingKeyArgs();

    @InterfaceC36563EWp(isGetter = true, keyPath = "innerUrl", required = true)
    String getInnerUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "outerDescription", required = false)
    String getOuterDescription();

    @InterfaceC36563EWp(isGetter = true, keyPath = "outerTitle", required = false)
    String getOuterTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "outerUrl", required = true)
    String getOuterUrl();

    @InterfaceC36563EWp(isGetter = true, keyPath = "quotePreviewText", required = true)
    String getQuotePreviewText();

    @InterfaceC36563EWp(isGetter = true, keyPath = "quotePreviewTextStarlingKey", required = false)
    String getQuotePreviewTextStarlingKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "quotePreviewTextStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getQuotePreviewTextStarlingKeyArgs();

    @InterfaceC36563EWp(isGetter = true, keyPath = "receiverPreviewText", required = true)
    String getReceiverPreviewText();

    @InterfaceC36563EWp(isGetter = true, keyPath = "receiverPreviewTextStarlingKey", required = false)
    String getReceiverPreviewTextStarlingKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "receiverPreviewTextStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getReceiverPreviewTextStarlingKeyArgs();

    @InterfaceC36563EWp(isGetter = true, keyPath = "senderPreviewText", required = true)
    String getSenderPreviewText();

    @InterfaceC36563EWp(isGetter = true, keyPath = "senderPreviewTextStarlingKey", required = false)
    String getSenderPreviewTextStarlingKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "senderPreviewTextStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getSenderPreviewTextStarlingKeyArgs();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = true)
    String getTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "titleStarlingKey", required = false)
    String getTitleStarlingKey();

    @InterfaceC36563EWp(isGetter = true, keyPath = "titleStarlingKeyArgs", primitiveClassType = String.class, required = false)
    List<String> getTitleStarlingKeyArgs();
}
