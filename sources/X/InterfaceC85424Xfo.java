package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.Xfo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC85424Xfo extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "cpuUsage", required = true)
    Number getCpuUsage();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryAll", required = true)
    Number getMemoryAll();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryLimit", required = true)
    Number getMemoryLimit();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryRest", required = true)
    Number getMemoryRest();

    @InterfaceC36563EWp(isGetter = true, keyPath = "memoryUse", required = true)
    Number getMemoryUse();

    @InterfaceC36563EWp(isGetter = true, keyPath = "temperature", required = true)
    Number getTemperature();

    @InterfaceC36563EWp(isGetter = false, keyPath = "cpuUsage", required = true)
    void setCpuUsage(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "memoryAll", required = true)
    void setMemoryAll(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "memoryLimit", required = true)
    void setMemoryLimit(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "memoryRest", required = true)
    void setMemoryRest(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "memoryUse", required = true)
    void setMemoryUse(Number number);

    @InterfaceC36563EWp(isGetter = false, keyPath = "temperature", required = true)
    void setTemperature(Number number);
}
