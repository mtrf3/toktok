package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Xfq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85426Xfq extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "cpuUsage", required = false)
    Boolean getCpuUsage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryAll", required = false)
    Boolean getMemoryAll();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryLimit", required = false)
    Boolean getMemoryLimit();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryRest", required = false)
    Boolean getMemoryRest();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryUse", required = false)
    Boolean getMemoryUse();

    @InterfaceC36563EWp(isGetter = true, keyPath = "temperature", required = false)
    Boolean getTemperature();
}
