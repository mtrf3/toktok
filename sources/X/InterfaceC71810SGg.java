package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.SGg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC71810SGg extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "avatar", nestedClassType = InterfaceC71806SGc.class, required = true)
    InterfaceC71806SGc getAvatar();

    @InterfaceC36563EWp(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "seller_id", required = true)
    String getSellerId();
}
