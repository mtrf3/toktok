package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* loaded from: classes9.dex */
public interface K8P extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "history_list", nestedClassType = K8V.class, required = true)
    List<K8V> getHistoryList();

    @InterfaceC36563EWp(isGetter = false, keyPath = "history_list", nestedClassType = K8V.class, required = true)
    void setHistoryList(List<? extends K8V> list);
}
