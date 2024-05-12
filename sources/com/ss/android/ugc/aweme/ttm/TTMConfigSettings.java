package com.ss.android.ugc.aweme.ttm;

import X.C221108m2;
import X.C62822Ol8;
import X.C66235Pz5;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class TTMConfigSettings {
    public static final TTMConfigSettings LIZ = new TTMConfigSettings();
    public static final TTMConfig LIZIZ;
    public static final C62822Ol8 LIZJ;

    /* loaded from: classes12.dex */
    public static final class TTMConfig {

        @InterfaceC65349Pkn("ttm_crash_dump_enable")
        public final Boolean crashDumpEnable;

        @InterfaceC65349Pkn("global_enable")
        public final Boolean globalEnable;

        @InterfaceC65349Pkn("ttm_multi_inst_default_size")
        public final Integer multiInstCacheDefaultSize;

        @InterfaceC65349Pkn("ttm_multi_inst_enable")
        public final Boolean multiInstCacheEnable;

        @InterfaceC65349Pkn("ttm_multi_inst_max_size")
        public final Integer multiInstCacheMaxSize;

        @InterfaceC65349Pkn("ttm_report_enable")
        public final Boolean reportEnable;

        @InterfaceC65349Pkn("ttm_time_static_config")
        public final Integer timeStaticConfig;

        @InterfaceC65349Pkn("ttm_enable")
        public final Boolean ttmEnable;

        /* JADX WARN: Multi-variable type inference failed */
        public TTMConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TTMConfig)) {
                return false;
            }
            TTMConfig tTMConfig = (TTMConfig) obj;
            return o.LJ(this.globalEnable, tTMConfig.globalEnable) && o.LJ(this.ttmEnable, tTMConfig.ttmEnable) && o.LJ(this.timeStaticConfig, tTMConfig.timeStaticConfig) && o.LJ(this.reportEnable, tTMConfig.reportEnable) && o.LJ(this.crashDumpEnable, tTMConfig.crashDumpEnable) && o.LJ(this.multiInstCacheEnable, tTMConfig.multiInstCacheEnable) && o.LJ(this.multiInstCacheMaxSize, tTMConfig.multiInstCacheMaxSize) && o.LJ(this.multiInstCacheDefaultSize, tTMConfig.multiInstCacheDefaultSize);
        }

        public final int hashCode() {
            Boolean bool = this.globalEnable;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.ttmEnable;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Integer num = this.timeStaticConfig;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool3 = this.reportEnable;
            int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.crashDumpEnable;
            int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.multiInstCacheEnable;
            int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Integer num2 = this.multiInstCacheMaxSize;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.multiInstCacheDefaultSize;
            return hashCode7 + (num3 != null ? num3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TTMConfig(globalEnable=");
            LIZ.append(this.globalEnable);
            LIZ.append(", ttmEnable=");
            LIZ.append(this.ttmEnable);
            LIZ.append(", timeStaticConfig=");
            LIZ.append(this.timeStaticConfig);
            LIZ.append(", reportEnable=");
            LIZ.append(this.reportEnable);
            LIZ.append(", crashDumpEnable=");
            LIZ.append(this.crashDumpEnable);
            LIZ.append(", multiInstCacheEnable=");
            LIZ.append(this.multiInstCacheEnable);
            LIZ.append(", multiInstCacheMaxSize=");
            LIZ.append(this.multiInstCacheMaxSize);
            LIZ.append(", multiInstCacheDefaultSize=");
            return s0.LIZJ(LIZ, this.multiInstCacheDefaultSize, ')', LIZ);
        }

        public TTMConfig(Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, Integer num3) {
            this.globalEnable = bool;
            this.ttmEnable = bool2;
            this.timeStaticConfig = num;
            this.reportEnable = bool3;
            this.crashDumpEnable = bool4;
            this.multiInstCacheEnable = bool5;
            this.multiInstCacheMaxSize = num2;
            this.multiInstCacheDefaultSize = num3;
        }

        public /* synthetic */ TTMConfig(Boolean bool, Boolean bool2, Integer num, Boolean bool3, Boolean bool4, Boolean bool5, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? num3 : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Boolean bool = Boolean.TRUE;
        LIZIZ = new TTMConfig(bool, bool, 0, null, bool, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 232, null == true ? 1 : 0);
        LIZJ = C221108m2.LIZIZ(C66235Pz5.LJLIL);
    }

    public static TTMConfig LIZ() {
        return (TTMConfig) LIZJ.getValue();
    }
}
