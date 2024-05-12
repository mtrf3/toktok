package X;

import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* loaded from: classes11.dex */
public interface NBB extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "cc_template_id", required = true)
    String getCcTemplateId();

    @InterfaceC36563EWp(defaultValue = @InterfaceC36566EWs(intValue = 0, type = DefaultType.INT), isGetter = true, keyPath = "music_begin_time", required = false)
    Number getMusicBeginTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "music_id", required = true)
    String getMusicId();
}
