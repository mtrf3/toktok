package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.Uhy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77914Uhy extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "data", nestedClassType = InterfaceC77915Uhz.class, required = true)
    List<InterfaceC77915Uhz> getData();

    @InterfaceC36563EWp(isGetter = false, keyPath = "data", nestedClassType = InterfaceC77915Uhz.class, required = true)
    void setData(List<? extends InterfaceC77915Uhz> list);
}
