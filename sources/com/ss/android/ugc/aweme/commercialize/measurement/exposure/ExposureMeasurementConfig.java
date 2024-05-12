package com.ss.android.ugc.aweme.commercialize.measurement.exposure;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ExposureMeasurementConfig extends F9E {

    @InterfaceC65349Pkn("exposure_all")
    public final boolean exposureAll;

    @InterfaceC65349Pkn("exposure_event_types")
    public final List<String> exposureEventTypes;

    public ExposureMeasurementConfig() {
        this(false, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.exposureAll), this.exposureEventTypes};
    }

    public ExposureMeasurementConfig(boolean z, List<String> exposureEventTypes) {
        o.LJIIIZ(exposureEventTypes, "exposureEventTypes");
        this.exposureAll = z;
        this.exposureEventTypes = exposureEventTypes;
    }

    public ExposureMeasurementConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
