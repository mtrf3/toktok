package com.ss.android.ugc.aweme.legoImp.task.experiments;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class TrackerUploadRate extends F9E {

    @InterfaceC65349Pkn("assemble_container_init_event_rate")
    public final float assemAssembleContainerInitEventRate;

    @InterfaceC65349Pkn("assem_init_event_rate")
    public final float assemInitEventRate;

    @InterfaceC65349Pkn("assem_init_host_event")
    public final float assemInitializeHostEvent;

    @InterfaceC65349Pkn("bind_proxy_event_rate")
    public final float bindProxyEventRate;

    @InterfaceC65349Pkn("cold_start_rate_event")
    public final float coldStartTrackRate;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("hierarchy_data_performance_rate")
    public final float hierarchyDataPerformanceRate;

    @InterfaceC65349Pkn("on_host_bind_event_rate")
    public final float onHostBindEventRate;

    @InterfaceC65349Pkn("vprovider_bind_event")
    public final float providerBindEvent;

    @InterfaceC65349Pkn("vprovider_provide_event")
    public final float providerProvideEvent;

    @InterfaceC65349Pkn("assem_create_instance_event_rate")
    public final float subscribeAssemCreateEvent;

    @InterfaceC65349Pkn("assem_dsl_event_rate")
    public final float subscribeAssemDslEvent;

    @InterfaceC65349Pkn("assem_lifecycle_event_rate")
    public final float subscribeAssemLifecycleEvent;

    @InterfaceC65349Pkn("assemble_event_rate")
    public final float subscribeAssembleEvent;

    @InterfaceC65349Pkn("bind_ability_event_rate")
    public final float subscribeBindAbilityEvent;

    @InterfaceC65349Pkn("get_ability_event_rate")
    public final float subscribeGetAbilityEvent;

    @InterfaceC65349Pkn("vscope_event")
    public final float vScopePerformanceEvent;

    @InterfaceC65349Pkn("view_model_create_instance_event_rate")
    public final float viewModelCreateEvent;

    @InterfaceC65349Pkn("view_model_subscribe_performance_rate")
    public final float viewModelSubscribePerformanceEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TrackerUploadRate() {
        /*
            r22 = this;
            r1 = 0
            r2 = 0
            r20 = 524287(0x7ffff, float:7.34683E-40)
            r21 = 0
            r0 = r22
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r16 = r2
            r17 = r2
            r18 = r2
            r19 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.experiments.TrackerUploadRate.<init>():void");
    }

    public static /* synthetic */ TrackerUploadRate copy$default(TrackerUploadRate trackerUploadRate, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i, Object obj) {
        boolean z2 = z;
        float f19 = f;
        float f20 = f7;
        float f21 = f6;
        float f22 = f5;
        float f23 = f4;
        float f24 = f2;
        float f25 = f3;
        float f26 = f13;
        float f27 = f12;
        float f28 = f11;
        float f29 = f10;
        float f30 = f8;
        float f31 = f9;
        float f32 = f18;
        float f33 = f17;
        float f34 = f16;
        float f35 = f14;
        float f36 = f15;
        if ((i & 1) != 0) {
            z2 = trackerUploadRate.enable;
        }
        if ((i & 2) != 0) {
            f19 = trackerUploadRate.assemInitEventRate;
        }
        if ((i & 4) != 0) {
            f24 = trackerUploadRate.onHostBindEventRate;
        }
        if ((i & 8) != 0) {
            f25 = trackerUploadRate.bindProxyEventRate;
        }
        if ((i & 16) != 0) {
            f23 = trackerUploadRate.assemAssembleContainerInitEventRate;
        }
        if ((i & 32) != 0) {
            f22 = trackerUploadRate.hierarchyDataPerformanceRate;
        }
        if ((i & 64) != 0) {
            f21 = trackerUploadRate.viewModelSubscribePerformanceEvent;
        }
        if ((i & 128) != 0) {
            f20 = trackerUploadRate.viewModelCreateEvent;
        }
        if ((i & 256) != 0) {
            f30 = trackerUploadRate.subscribeAssemCreateEvent;
        }
        if ((i & 512) != 0) {
            f31 = trackerUploadRate.subscribeBindAbilityEvent;
        }
        if ((i & 1024) != 0) {
            f29 = trackerUploadRate.subscribeGetAbilityEvent;
        }
        if ((i & 2048) != 0) {
            f28 = trackerUploadRate.subscribeAssemDslEvent;
        }
        if ((i & 4096) != 0) {
            f27 = trackerUploadRate.subscribeAssemLifecycleEvent;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            f26 = trackerUploadRate.subscribeAssembleEvent;
        }
        if ((i & 16384) != 0) {
            f35 = trackerUploadRate.coldStartTrackRate;
        }
        if ((32768 & i) != 0) {
            f36 = trackerUploadRate.assemInitializeHostEvent;
        }
        if ((65536 & i) != 0) {
            f34 = trackerUploadRate.vScopePerformanceEvent;
        }
        if ((131072 & i) != 0) {
            f33 = trackerUploadRate.providerBindEvent;
        }
        if ((i & 262144) != 0) {
            f32 = trackerUploadRate.providerProvideEvent;
        }
        float f37 = f21;
        return trackerUploadRate.copy(z2, f19, f24, f25, f23, f22, f37, f20, f30, f31, f29, f28, f27, f26, f35, f36, f34, f33, f32);
    }

    public final TrackerUploadRate copy(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return new TrackerUploadRate(z, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Float.valueOf(this.assemInitEventRate), Float.valueOf(this.onHostBindEventRate), Float.valueOf(this.bindProxyEventRate), Float.valueOf(this.assemAssembleContainerInitEventRate), Float.valueOf(this.hierarchyDataPerformanceRate), Float.valueOf(this.viewModelSubscribePerformanceEvent), Float.valueOf(this.viewModelCreateEvent), Float.valueOf(this.subscribeAssemCreateEvent), Float.valueOf(this.subscribeBindAbilityEvent), Float.valueOf(this.subscribeGetAbilityEvent), Float.valueOf(this.subscribeAssemDslEvent), Float.valueOf(this.subscribeAssemLifecycleEvent), Float.valueOf(this.subscribeAssembleEvent), Float.valueOf(this.coldStartTrackRate), Float.valueOf(this.assemInitializeHostEvent), Float.valueOf(this.vScopePerformanceEvent), Float.valueOf(this.providerBindEvent), Float.valueOf(this.providerProvideEvent)};
    }

    public final float getAssemAssembleContainerInitEventRate() {
        return this.assemAssembleContainerInitEventRate;
    }

    public final float getAssemInitEventRate() {
        return this.assemInitEventRate;
    }

    public final float getAssemInitializeHostEvent() {
        return this.assemInitializeHostEvent;
    }

    public final float getBindProxyEventRate() {
        return this.bindProxyEventRate;
    }

    public final float getColdStartTrackRate() {
        return this.coldStartTrackRate;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final float getHierarchyDataPerformanceRate() {
        return this.hierarchyDataPerformanceRate;
    }

    public final float getOnHostBindEventRate() {
        return this.onHostBindEventRate;
    }

    public final float getProviderBindEvent() {
        return this.providerBindEvent;
    }

    public final float getProviderProvideEvent() {
        return this.providerProvideEvent;
    }

    public final float getSubscribeAssemCreateEvent() {
        return this.subscribeAssemCreateEvent;
    }

    public final float getSubscribeAssemDslEvent() {
        return this.subscribeAssemDslEvent;
    }

    public final float getSubscribeAssemLifecycleEvent() {
        return this.subscribeAssemLifecycleEvent;
    }

    public final float getSubscribeAssembleEvent() {
        return this.subscribeAssembleEvent;
    }

    public final float getSubscribeBindAbilityEvent() {
        return this.subscribeBindAbilityEvent;
    }

    public final float getSubscribeGetAbilityEvent() {
        return this.subscribeGetAbilityEvent;
    }

    public final float getVScopePerformanceEvent() {
        return this.vScopePerformanceEvent;
    }

    public final float getViewModelCreateEvent() {
        return this.viewModelCreateEvent;
    }

    public final float getViewModelSubscribePerformanceEvent() {
        return this.viewModelSubscribePerformanceEvent;
    }

    public TrackerUploadRate(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.enable = z;
        this.assemInitEventRate = f;
        this.onHostBindEventRate = f2;
        this.bindProxyEventRate = f3;
        this.assemAssembleContainerInitEventRate = f4;
        this.hierarchyDataPerformanceRate = f5;
        this.viewModelSubscribePerformanceEvent = f6;
        this.viewModelCreateEvent = f7;
        this.subscribeAssemCreateEvent = f8;
        this.subscribeBindAbilityEvent = f9;
        this.subscribeGetAbilityEvent = f10;
        this.subscribeAssemDslEvent = f11;
        this.subscribeAssemLifecycleEvent = f12;
        this.subscribeAssembleEvent = f13;
        this.coldStartTrackRate = f14;
        this.assemInitializeHostEvent = f15;
        this.vScopePerformanceEvent = f16;
        this.providerBindEvent = f17;
        this.providerProvideEvent = f18;
    }

    public /* synthetic */ TrackerUploadRate(boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0E-6f : f, (i & 4) != 0 ? 5.0E-4f : f2, (i & 8) == 0 ? f3 : 5.0E-4f, (i & 16) != 0 ? 5.0E-5f : f4, (i & 32) != 0 ? 1.0E-5f : f5, (i & 64) != 0 ? 1.0E-6f : f6, (i & 128) != 0 ? 1.0E-8f : f7, (i & 256) != 0 ? 1.0E-6f : f8, (i & 512) == 0 ? f9 : 1.0E-5f, (i & 1024) != 0 ? 1.0E-6f : f10, (i & 2048) == 0 ? f11 : 1.0E-6f, (i & 4096) != 0 ? 1.0E-4f : f12, (i & FileUtils.BUFFER_SIZE) != 0 ? 5.0E-5f : f13, (i & 16384) != 0 ? 0.001f : f14, (32768 & i) != 0 ? 0.01f : f15, (65536 & i) != 0 ? 1.0E-4f : f16, (131072 & i) == 0 ? f17 : 0.001f, (i & 262144) != 0 ? 1.0E-4f : f18);
    }
}
