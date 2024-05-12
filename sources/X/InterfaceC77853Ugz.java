package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.Ugz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77853Ugz extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "asciName", required = true)
    String getAsciName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "code", required = true)
    String getCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC36563EWp(isGetter = false, keyPath = "asciName", required = true)
    void setAsciName(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "code", required = true)
    void setCode(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "name", required = true)
    void setName(String str);
}
