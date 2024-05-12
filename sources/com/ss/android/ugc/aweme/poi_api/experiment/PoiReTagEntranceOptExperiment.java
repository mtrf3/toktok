package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C78920UyC;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PoiReTagEntranceOptExperiment {
    public static final Config LIZ = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class Config implements Serializable {

        @InterfaceC65349Pkn("entrance_display_frequency")
        public final EntranceFrequency frequency;

        @InterfaceC65349Pkn("entrance_text_opt")
        public final Boolean isEntranceTextOpt;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, EntranceFrequency entranceFrequency, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                entranceFrequency = config.frequency;
            }
            if ((i & 2) != 0) {
                bool = config.isEntranceTextOpt;
            }
            return config.copy(entranceFrequency, bool);
        }

        public final Config copy(EntranceFrequency entranceFrequency, Boolean bool) {
            return new Config(entranceFrequency, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return o.LJ(this.frequency, config.frequency) && o.LJ(this.isEntranceTextOpt, config.isEntranceTextOpt);
        }

        public int hashCode() {
            EntranceFrequency entranceFrequency = this.frequency;
            int hashCode = (entranceFrequency == null ? 0 : entranceFrequency.hashCode()) * 31;
            Boolean bool = this.isEntranceTextOpt;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(frequency=");
            LIZ.append(this.frequency);
            LIZ.append(", isEntranceTextOpt=");
            return C78920UyC.LIZIZ(LIZ, this.isEntranceTextOpt, ')', LIZ);
        }

        public final EntranceFrequency getFrequency() {
            return this.frequency;
        }

        public final Boolean isEntranceTextOpt() {
            return this.isEntranceTextOpt;
        }

        public Config(EntranceFrequency entranceFrequency, Boolean bool) {
            this.frequency = entranceFrequency;
            this.isEntranceTextOpt = bool;
        }

        public /* synthetic */ Config(EntranceFrequency entranceFrequency, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entranceFrequency, (i & 2) != 0 ? null : bool);
        }
    }

    /* loaded from: classes7.dex */
    public static final class EntranceFrequency implements Serializable {

        @InterfaceC65349Pkn("close_times")
        public final Integer closeTimes;

        @InterfaceC65349Pkn("frequency_days")
        public final Integer frequencyDays;

        @InterfaceC65349Pkn("not_click_times")
        public final Integer notClickTimes;

        /* JADX WARN: Multi-variable type inference failed */
        public EntranceFrequency() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EntranceFrequency copy$default(EntranceFrequency entranceFrequency, Integer num, Integer num2, Integer num3, int i, Object obj) {
            if ((i & 1) != 0) {
                num = entranceFrequency.frequencyDays;
            }
            if ((i & 2) != 0) {
                num2 = entranceFrequency.closeTimes;
            }
            if ((i & 4) != 0) {
                num3 = entranceFrequency.notClickTimes;
            }
            return entranceFrequency.copy(num, num2, num3);
        }

        public final EntranceFrequency copy(Integer num, Integer num2, Integer num3) {
            return new EntranceFrequency(num, num2, num3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntranceFrequency)) {
                return false;
            }
            EntranceFrequency entranceFrequency = (EntranceFrequency) obj;
            return o.LJ(this.frequencyDays, entranceFrequency.frequencyDays) && o.LJ(this.closeTimes, entranceFrequency.closeTimes) && o.LJ(this.notClickTimes, entranceFrequency.notClickTimes);
        }

        public int hashCode() {
            Integer num = this.frequencyDays;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.closeTimes;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.notClickTimes;
            return hashCode2 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EntranceFrequency(frequencyDays=");
            LIZ.append(this.frequencyDays);
            LIZ.append(", closeTimes=");
            LIZ.append(this.closeTimes);
            LIZ.append(", notClickTimes=");
            return s0.LIZJ(LIZ, this.notClickTimes, ')', LIZ);
        }

        public final Integer getCloseTimes() {
            return this.closeTimes;
        }

        public final Integer getFrequencyDays() {
            return this.frequencyDays;
        }

        public final Integer getNotClickTimes() {
            return this.notClickTimes;
        }

        public EntranceFrequency(Integer num, Integer num2, Integer num3) {
            this.frequencyDays = num;
            this.closeTimes = num2;
            this.notClickTimes = num3;
        }

        public /* synthetic */ EntranceFrequency(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
        }
    }

    public static Config LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        Config config = LIZ;
        LJIIIZ.getClass();
        return (Config) FFL.LJIJ(false, "poi_retag_entrance_opt", 31744, Config.class, config);
    }

    public static boolean LIZIZ() {
        Config LIZ2 = LIZ();
        if (LIZ2 != null && LIZ2.getFrequency() != null) {
            return true;
        }
        return false;
    }
}
