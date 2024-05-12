package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.FcV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC39355FcV extends XBaseParamModel {
    @ED6(option = {0, 1, 2})
    @InterfaceC36563EWp(defaultValue = @InterfaceC36566EWs(intValue = 0, type = DefaultType.INT), isEnum = true, isGetter = true, keyPath = "action", required = false)
    Number getAction();

    @InterfaceC36563EWp(isGetter = true, keyPath = "animated", required = false)
    Boolean getAnimated();

    @InterfaceC36563EWp(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "replace", required = false)
    Boolean getReplace();

    @ED7(option = {"alwaysCloseAfterOpen", "alwaysCloseBeforeOpen", "onlyCloseAfterOpenSucceed"})
    @InterfaceC36563EWp(defaultValue = @InterfaceC36566EWs(stringValue = "onlyCloseAfterOpenSucceed", type = DefaultType.STRING), isEnum = true, isGetter = true, keyPath = "replaceType", required = false)
    String getReplaceType();

    @InterfaceC36563EWp(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
