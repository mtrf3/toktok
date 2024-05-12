package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* loaded from: classes13.dex */
public interface SQA extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "aweme_id", required = true)
    String getAwemeId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "hybrid_label", required = false)
    String getHybridLabel();

    @InterfaceC36563EWp(isGetter = true, keyPath = "label_private", required = false)
    String getLabelPrivate();

    @InterfaceC36563EWp(isGetter = true, keyPath = "private_status", nestedClassType = SQC.class, required = false)
    SQC getPrivateStatus();

    @InterfaceC36563EWp(isGetter = true, keyPath = "video_text", required = false)
    String getVideoText();

    @InterfaceC36563EWp(isGetter = true, keyPath = "is_delete", required = false)
    Number isDelete();
}
