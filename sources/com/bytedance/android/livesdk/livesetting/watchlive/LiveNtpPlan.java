package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C16880lQ;
import X.C1NE;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

@SettingsKey("live_ntp_plan")
/* loaded from: classes11.dex */
public final class LiveNtpPlan {

    @Group(isDefault = true, value = "default")
    public static final Plan DEFAULT;
    public static final LiveNtpPlan INSTANCE = new LiveNtpPlan();

    /* loaded from: classes11.dex */
    public static final class Plan {

        @InterfaceC65349Pkn("path_forbidden_list")
        public List<String> forbiddenList;

        @InterfaceC65349Pkn("use_im_fetch_enable")
        public final int useImFetchEnable;

        @InterfaceC65349Pkn("value_limit_current_time")
        public final long valueLimitByCurrentTime;

        @InterfaceC65349Pkn("value_limit_elapsed_time")
        public final long valueLimitByElapsedTime;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Plan() {
            /*
                r9 = this;
                r1 = 0
                r5 = 0
                r6 = 0
                r7 = 15
                r0 = r9
                r3 = r1
                r8 = r6
                r0.<init>(r1, r3, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.LiveNtpPlan.Plan.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) obj;
            return this.valueLimitByCurrentTime == plan.valueLimitByCurrentTime && this.valueLimitByElapsedTime == plan.valueLimitByElapsedTime && this.useImFetchEnable == plan.useImFetchEnable && o.LJ(this.forbiddenList, plan.forbiddenList);
        }

        public final int hashCode() {
            return this.forbiddenList.hashCode() + ((JBR.LIZJ(this.valueLimitByElapsedTime, C16880lQ.LLJIJIL(this.valueLimitByCurrentTime) * 31, 31) + this.useImFetchEnable) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Plan(valueLimitByCurrentTime=");
            LIZ.append(this.valueLimitByCurrentTime);
            LIZ.append(", valueLimitByElapsedTime=");
            LIZ.append(this.valueLimitByElapsedTime);
            LIZ.append(", useImFetchEnable=");
            LIZ.append(this.useImFetchEnable);
            LIZ.append(", forbiddenList=");
            return C1NE.LIZIZ(LIZ, this.forbiddenList, ')', LIZ);
        }

        public Plan(long j, long j2, int i, List<String> forbiddenList) {
            o.LJIIIZ(forbiddenList, "forbiddenList");
            this.valueLimitByCurrentTime = j;
            this.valueLimitByElapsedTime = j2;
            this.useImFetchEnable = i;
            this.forbiddenList = forbiddenList;
        }

        public /* synthetic */ Plan(long j, long j2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 120000L : j, (i2 & 2) == 0 ? j2 : 120000L, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j = 0;
        DEFAULT = new Plan(j, j, 0, null, 15, 0 == true ? 1 : 0);
    }

    public final Plan getConfig() {
        Plan plan = (Plan) SettingsManager.INSTANCE.getValueSafely(LiveNtpPlan.class);
        if (plan == null) {
            return DEFAULT;
        }
        return plan;
    }

    public final long getValueLimitByCurrent() {
        return getConfig().valueLimitByCurrentTime;
    }

    public final long getValueLimitByElapsed() {
        return getConfig().valueLimitByElapsedTime;
    }

    public final boolean isImFetchEnableValue() {
        if (getConfig().useImFetchEnable == 1) {
            return true;
        }
        return false;
    }

    public final Plan getDEFAULT() {
        return DEFAULT;
    }

    public final boolean containForbidden(String path) {
        o.LJIIIZ(path, "path");
        for (String str : getConfig().forbiddenList) {
            if (s.LJJJLZIJ(str, path, false) || s.LJJJLZIJ(path, str, false)) {
                return true;
            }
        }
        return false;
    }
}
