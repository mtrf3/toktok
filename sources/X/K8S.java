package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* loaded from: classes9.dex */
public interface K8S extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "commentID", required = true)
    String getCommentID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "commentStr", required = true)
    String getCommentStr();

    @InterfaceC36563EWp(isGetter = false, keyPath = "commentID", required = true)
    void setCommentID(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "commentStr", required = true)
    void setCommentStr(String str);
}
