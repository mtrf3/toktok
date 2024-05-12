package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.N7a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58830N7a extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "page", required = false)
    String getPage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "ppre", required = true)
    String getPpre();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pre", required = true)
    String getPre();

    @InterfaceC36563EWp(isGetter = true, keyPath = "ts", required = true)
    Number getTs();

    @InterfaceC36563EWp(isGetter = false, keyPath = "page", required = false)
    void setPage(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "ppre", required = true)
    void setPpre(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "pre", required = true)
    void setPre(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "ts", required = true)
    void setTs(Number number);
}
