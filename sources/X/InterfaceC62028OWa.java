package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.OWa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC62028OWa extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "preloadId", required = false)
    String getPreloadId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "videoUrls", nestedClassType = InterfaceC62030OWc.class, required = true)
    List<InterfaceC62030OWc> getVideoUrls();
}
