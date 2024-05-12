package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface NDL extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_from", required = false)
    String getEnterFrom();

    @InterfaceC36563EWp(isGetter = true, keyPath = "enter_method", required = false)
    String getEnterMethod();

    @InterfaceC36563EWp(isGetter = true, keyPath = "platform", required = false)
    String getPlatform();

    @InterfaceC36563EWp(isGetter = true, keyPath = "prevReactIds", primitiveClassType = String.class, required = false)
    List<String> getPrevReactIds();
}
