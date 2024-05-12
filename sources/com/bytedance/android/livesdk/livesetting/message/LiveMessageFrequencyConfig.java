package com.bytedance.android.livesdk.livesetting.message;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveMessageFrequencyConfig {

    @InterfaceC65349Pkn("all_message_frequency")
    public AllMessageFrequency allMessageFrequency;

    @InterfaceC65349Pkn("frequency_enable")
    public boolean frequencyEnable;

    @InterfaceC65349Pkn("frequency_method")
    public Map<String, ? extends LiveMessageFrequency> frequencyMethod;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveMessageFrequencyConfig() {
        this(false, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final AllMessageFrequency getAllMessageFrequency() {
        return this.allMessageFrequency;
    }

    public final boolean getFrequencyEnable() {
        return this.frequencyEnable;
    }

    public final Map<String, LiveMessageFrequency> getFrequencyMethod() {
        return this.frequencyMethod;
    }

    public final void setAllMessageFrequency(AllMessageFrequency allMessageFrequency) {
        o.LJIIIZ(allMessageFrequency, "<set-?>");
        this.allMessageFrequency = allMessageFrequency;
    }

    public final void setFrequencyEnable(boolean z) {
        this.frequencyEnable = z;
    }

    public final void setFrequencyMethod(Map<String, ? extends LiveMessageFrequency> map) {
        o.LJIIIZ(map, "<set-?>");
        this.frequencyMethod = map;
    }

    public LiveMessageFrequencyConfig(boolean z, AllMessageFrequency allMessageFrequency, Map<String, ? extends LiveMessageFrequency> frequencyMethod) {
        o.LJIIIZ(allMessageFrequency, "allMessageFrequency");
        o.LJIIIZ(frequencyMethod, "frequencyMethod");
        this.frequencyEnable = z;
        this.allMessageFrequency = allMessageFrequency;
        this.frequencyMethod = frequencyMethod;
    }

    public /* synthetic */ LiveMessageFrequencyConfig(boolean z, AllMessageFrequency allMessageFrequency, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new AllMessageFrequency(false, false, 3, null) : allMessageFrequency, (i & 4) != 0 ? C113554cx.LJJJLIIL() : map);
    }
}
