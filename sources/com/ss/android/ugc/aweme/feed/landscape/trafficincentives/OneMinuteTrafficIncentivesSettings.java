package com.ss.android.ugc.aweme.feed.landscape.trafficincentives;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OneMinuteTrafficIncentivesSettings {
    public static final OneMinuteTrafficIncentivesSettings LIZ = new OneMinuteTrafficIncentivesSettings();
    public static final OneMinuteTrafficProfileConfig LIZIZ = new OneMinuteTrafficProfileConfig(Boolean.FALSE, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 62, 0 == true ? 1 : 0);

    /* loaded from: classes5.dex */
    public static final class OneMinuteTrafficProfileConfig {

        @InterfaceC65349Pkn("eligible")
        public final Boolean eligible;

        @InterfaceC65349Pkn(alternate = {"h5_url"}, value = "H5_url")
        public final String h5Url;

        @InterfaceC65349Pkn("max_close_times")
        public final Integer maxCloseTimes;

        @InterfaceC65349Pkn("max_enter_times")
        public final Integer maxEnterTimes;

        @InterfaceC65349Pkn("max_show_times")
        public final Integer maxShowTimes;

        @InterfaceC65349Pkn("time_interval_for_auto_dismiss")
        public final Integer timeIntervalForAutoDismiss;

        /* JADX WARN: Multi-variable type inference failed */
        public OneMinuteTrafficProfileConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OneMinuteTrafficProfileConfig)) {
                return false;
            }
            OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfig = (OneMinuteTrafficProfileConfig) obj;
            return o.LJ(this.eligible, oneMinuteTrafficProfileConfig.eligible) && o.LJ(this.h5Url, oneMinuteTrafficProfileConfig.h5Url) && o.LJ(this.maxShowTimes, oneMinuteTrafficProfileConfig.maxShowTimes) && o.LJ(this.maxEnterTimes, oneMinuteTrafficProfileConfig.maxEnterTimes) && o.LJ(this.maxCloseTimes, oneMinuteTrafficProfileConfig.maxCloseTimes) && o.LJ(this.timeIntervalForAutoDismiss, oneMinuteTrafficProfileConfig.timeIntervalForAutoDismiss);
        }

        public final int hashCode() {
            Boolean bool = this.eligible;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.h5Url;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.maxShowTimes;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxEnterTimes;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.maxCloseTimes;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.timeIntervalForAutoDismiss;
            return hashCode5 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OneMinuteTrafficProfileConfig(eligible=");
            LIZ.append(this.eligible);
            LIZ.append(", h5Url=");
            LIZ.append(this.h5Url);
            LIZ.append(", maxShowTimes=");
            LIZ.append(this.maxShowTimes);
            LIZ.append(", maxEnterTimes=");
            LIZ.append(this.maxEnterTimes);
            LIZ.append(", maxCloseTimes=");
            LIZ.append(this.maxCloseTimes);
            LIZ.append(", timeIntervalForAutoDismiss=");
            return s0.LIZJ(LIZ, this.timeIntervalForAutoDismiss, ')', LIZ);
        }

        public OneMinuteTrafficProfileConfig(Boolean bool, String str, Integer num, Integer num2, Integer num3, Integer num4) {
            this.eligible = bool;
            this.h5Url = str;
            this.maxShowTimes = num;
            this.maxEnterTimes = num2;
            this.maxCloseTimes = num3;
            this.timeIntervalForAutoDismiss = num4;
        }

        public /* synthetic */ OneMinuteTrafficProfileConfig(Boolean bool, String str, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) == 0 ? num4 : null);
        }
    }
}
