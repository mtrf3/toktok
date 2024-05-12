package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* loaded from: classes13.dex */
public interface SQB extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "changeset", nestedClassType = SQA.class, required = true)
    List<SQA> getChangeset();

    @InterfaceC36563EWp(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();
}
