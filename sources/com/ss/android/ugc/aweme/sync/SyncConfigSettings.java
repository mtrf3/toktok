package com.ss.android.ugc.aweme.sync;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SyncConfigSettings {
    public static final SyncSdkConfigModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new SyncSdkConfigModel(bool, bool, bool, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 56, 0 == true ? 1 : 0);
    }

    /* loaded from: classes7.dex */
    public static final class SyncSdkConfigModel {

        @InterfaceC65349Pkn("biz_enable_info")
        public final m bizEnableInfo;

        @InterfaceC65349Pkn("enable")
        public final Boolean enable;

        @InterfaceC65349Pkn("monitor_sampling")
        public final Integer monitorSampling;

        @InterfaceC65349Pkn("sync_connect_fallback_ts")
        public final Long syncConnectFallbackTs;

        @InterfaceC65349Pkn("sync_connect_opt")
        public final Boolean syncConnectOpt;

        @InterfaceC65349Pkn("use_shared_ws")
        public final Boolean useSharedWs;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SyncSdkConfigModel)) {
                return false;
            }
            SyncSdkConfigModel syncSdkConfigModel = (SyncSdkConfigModel) obj;
            return o.LJ(this.enable, syncSdkConfigModel.enable) && o.LJ(this.useSharedWs, syncSdkConfigModel.useSharedWs) && o.LJ(this.syncConnectOpt, syncSdkConfigModel.syncConnectOpt) && o.LJ(this.syncConnectFallbackTs, syncSdkConfigModel.syncConnectFallbackTs) && o.LJ(this.monitorSampling, syncSdkConfigModel.monitorSampling) && o.LJ(this.bizEnableInfo, syncSdkConfigModel.bizEnableInfo);
        }

        public final int hashCode() {
            Boolean bool = this.enable;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.useSharedWs;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.syncConnectOpt;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Long l = this.syncConnectFallbackTs;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num = this.monitorSampling;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            m mVar = this.bizEnableInfo;
            return hashCode5 + (mVar != null ? mVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SyncSdkConfigModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", useSharedWs=");
            LIZ.append(this.useSharedWs);
            LIZ.append(", syncConnectOpt=");
            LIZ.append(this.syncConnectOpt);
            LIZ.append(", syncConnectFallbackTs=");
            LIZ.append(this.syncConnectFallbackTs);
            LIZ.append(", monitorSampling=");
            LIZ.append(this.monitorSampling);
            LIZ.append(", bizEnableInfo=");
            LIZ.append(this.bizEnableInfo);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public SyncSdkConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num, m mVar) {
            this.enable = bool;
            this.useSharedWs = bool2;
            this.syncConnectOpt = bool3;
            this.syncConnectFallbackTs = l;
            this.monitorSampling = num;
            this.bizEnableInfo = mVar;
        }

        public /* synthetic */ SyncSdkConfigModel(Boolean bool, Boolean bool2, Boolean bool3, Long l, Integer num, m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, bool2, bool3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num, (i & 32) == 0 ? mVar : null);
        }
    }
}
