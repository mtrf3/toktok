package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.Chf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC32031Chf extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "uploadedImageList", nestedClassType = InterfaceC32032Chg.class, required = true)
    List<InterfaceC32032Chg> getUploadedImageList();

    @InterfaceC36563EWp(isGetter = false, keyPath = "uploadedImageList", nestedClassType = InterfaceC32032Chg.class, required = true)
    void setUploadedImageList(List<? extends InterfaceC32032Chg> list);
}
