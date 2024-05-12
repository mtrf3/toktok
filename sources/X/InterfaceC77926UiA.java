package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.UiA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77926UiA extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "channel", required = true)
    String getChannel();

    @InterfaceC36563EWp(isGetter = true, keyPath = "definition", required = false)
    String getDefinition();

    @InterfaceC36563EWp(isGetter = true, keyPath = "definitionPath", required = false)
    String getDefinitionPath();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shrink", required = false)
    String getShrink();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shrinkPath", required = false)
    String getShrinkPath();
}
