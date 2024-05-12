package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Ezn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC38251Ezn extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "content", required = true)
    String getContent();

    @InterfaceC36563EWp(isGetter = true, keyPath = "extra", required = false)
    String getExtra();

    @InterfaceC36563EWp(isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "uid", required = false)
    String getUid();
}
