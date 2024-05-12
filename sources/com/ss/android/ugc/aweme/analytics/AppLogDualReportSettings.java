package com.ss.android.ugc.aweme.analytics;

import X.C113554cx;
import X.C12400eC;
import X.C15890jp;
import X.C221108m2;
import X.C40503Fv1;
import X.C47959Irz;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AppLogDualReportSettings {
    public static final AppLogDualReportSettings LIZ = new AppLogDualReportSettings();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C40503Fv1.LJLIL);

    /* loaded from: classes7.dex */
    public static final class EventConfig {

        @InterfaceC65349Pkn("categories")
        public final Map<String, String> categories;

        @InterfaceC65349Pkn("extra")
        public final Map<String, String> extra;

        @InterfaceC65349Pkn("metrics")
        public final Map<String, String> metrics;

        @InterfaceC65349Pkn("sample_rate")
        public final float sampleRate;

        @InterfaceC65349Pkn("slardar_event")
        public final String slardarEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public EventConfig() {
            this(null, 0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventConfig)) {
                return false;
            }
            EventConfig eventConfig = (EventConfig) obj;
            return o.LJ(this.slardarEvent, eventConfig.slardarEvent) && Float.compare(this.sampleRate, eventConfig.sampleRate) == 0 && o.LJ(this.categories, eventConfig.categories) && o.LJ(this.metrics, eventConfig.metrics) && o.LJ(this.extra, eventConfig.extra);
        }

        public final int hashCode() {
            int hashCode;
            String str = this.slardarEvent;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.extra.hashCode() + C12400eC.LIZ(this.metrics, C12400eC.LIZ(this.categories, C47959Irz.LIZIZ(this.sampleRate, hashCode * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EventConfig(slardarEvent=");
            LIZ.append(this.slardarEvent);
            LIZ.append(", sampleRate=");
            LIZ.append(this.sampleRate);
            LIZ.append(", categories=");
            LIZ.append(this.categories);
            LIZ.append(", metrics=");
            LIZ.append(this.metrics);
            LIZ.append(", extra=");
            return C15890jp.LIZ(LIZ, this.extra, ')', LIZ);
        }

        public EventConfig(String str, float f, Map<String, String> categories, Map<String, String> metrics, Map<String, String> extra) {
            o.LJIIIZ(categories, "categories");
            o.LJIIIZ(metrics, "metrics");
            o.LJIIIZ(extra, "extra");
            this.slardarEvent = str;
            this.sampleRate = f;
            this.categories = categories;
            this.metrics = metrics;
            this.extra = extra;
        }

        public /* synthetic */ EventConfig(String str, float f, Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0.05f : f, (i & 4) != 0 ? C113554cx.LJJJLIIL() : map, (i & 8) != 0 ? C113554cx.LJJJLIIL() : map2, (i & 16) != 0 ? C113554cx.LJJJLIIL() : map3);
        }
    }
}
