package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes8.dex */
public interface HT3 extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "music", required = true)
    String getMusic();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trackInfo", nestedClassType = HT2.class, required = false)
    HT2 getTrackInfo();
}
