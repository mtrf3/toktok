package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes7.dex */
public interface FTP extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "content", required = true)
    String getContent();

    @InterfaceC36563EWp(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "phoneNumber", required = true)
    String getPhoneNumber();
}
