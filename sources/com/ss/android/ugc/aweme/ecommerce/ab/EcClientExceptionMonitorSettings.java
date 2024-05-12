package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C15890jp;
import X.C47959Irz;
import X.C74221TAz;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcClientExceptionMonitorSettings {
    public static final MonitorDetailModel LIZ = new MonitorDetailModel(false, new LinkedHashMap());

    /* loaded from: classes2.dex */
    public static final class EventLimitedModel {

        @InterfaceC65349Pkn("server_sampling_rate")
        public final float serverSamplingRate;

        @InterfaceC65349Pkn("slardar_sampling_rate")
        public final float slardarSamplingRate;

        @InterfaceC65349Pkn("tea_sampling_rate")
        public final float teaSamplingRate;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventLimitedModel)) {
                return false;
            }
            EventLimitedModel eventLimitedModel = (EventLimitedModel) obj;
            return Float.compare(this.teaSamplingRate, eventLimitedModel.teaSamplingRate) == 0 && Float.compare(this.slardarSamplingRate, eventLimitedModel.slardarSamplingRate) == 0 && Float.compare(this.serverSamplingRate, eventLimitedModel.serverSamplingRate) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.serverSamplingRate) + C47959Irz.LIZIZ(this.slardarSamplingRate, Float.floatToIntBits(this.teaSamplingRate) * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EventLimitedModel(teaSamplingRate=");
            LIZ.append(this.teaSamplingRate);
            LIZ.append(", slardarSamplingRate=");
            LIZ.append(this.slardarSamplingRate);
            LIZ.append(", serverSamplingRate=");
            return C74221TAz.LIZLLL(LIZ, this.serverSamplingRate, ')', LIZ);
        }

        public EventLimitedModel(float f, float f2, float f3) {
            this.teaSamplingRate = f;
            this.slardarSamplingRate = f2;
            this.serverSamplingRate = f3;
        }
    }

    /* loaded from: classes2.dex */
    public static final class MonitorDetailModel {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("event_limited_list")
        public final Map<String, EventLimitedModel> eventLimitedList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonitorDetailModel)) {
                return false;
            }
            MonitorDetailModel monitorDetailModel = (MonitorDetailModel) obj;
            return this.enable == monitorDetailModel.enable && o.LJ(this.eventLimitedList, monitorDetailModel.eventLimitedList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.eventLimitedList.hashCode() + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MonitorDetailModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", eventLimitedList=");
            return C15890jp.LIZ(LIZ, this.eventLimitedList, ')', LIZ);
        }

        public MonitorDetailModel(boolean z, Map<String, EventLimitedModel> eventLimitedList) {
            o.LJIIIZ(eventLimitedList, "eventLimitedList");
            this.enable = z;
            this.eventLimitedList = eventLimitedList;
        }
    }
}
