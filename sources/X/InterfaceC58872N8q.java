package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.N8q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58872N8q extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC36563EWp(isGetter = true, keyPath = "state", required = false)
    Number getState();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC36563EWp(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "state", required = false)
    void setState(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "url", required = false)
    void setUrl(String str);
}
