package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

@InterfaceC31182CLq
/* renamed from: X.N8r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58873N8r extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "states", nestedClassType = InterfaceC58872N8q.class, required = false)
    List<InterfaceC58872N8q> getStates();

    @InterfaceC36563EWp(isGetter = false, keyPath = "states", nestedClassType = InterfaceC58872N8q.class, required = false)
    void setStates(List<? extends InterfaceC58872N8q> list);
}
