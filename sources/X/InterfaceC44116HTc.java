package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.HTc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC44116HTc extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "files", nestedClassType = InterfaceC44115HTb.class, required = false)
    List<InterfaceC44115HTb> getFiles();

    @InterfaceC36563EWp(isGetter = false, keyPath = "files", nestedClassType = InterfaceC44115HTb.class, required = false)
    void setFiles(List<? extends InterfaceC44115HTb> list);
}
