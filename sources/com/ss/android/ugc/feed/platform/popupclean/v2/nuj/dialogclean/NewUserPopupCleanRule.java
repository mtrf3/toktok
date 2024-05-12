package com.ss.android.ugc.feed.platform.popupclean.v2.nuj.dialogclean;

import X.C1NE;
import X.C221108m2;
import X.C2ZU;
import X.C2ZV;
import X.C35843E4x;
import X.C54932LhA;
import X.C55652Lsm;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewUserPopupCleanRule {
    public static final int LIZ = C35843E4x.LIZ();
    public static final C55652Lsm LIZIZ = new C55652Lsm("NewUserPopupCleanRule");
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C54932LhA.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C2ZU.LJLIL);

    /* loaded from: classes2.dex */
    public static final class RuleGroup implements Serializable {

        @InterfaceC65349Pkn("bypass_active_days")
        public final Integer bypassActiveDay;

        @InterfaceC65349Pkn("group_keys")
        public final Integer groupId;

        @InterfaceC65349Pkn("max_count_in_each_session")
        public final Integer maxCountInSession;

        @InterfaceC65349Pkn("max_count_in_each_time_interval")
        public final Integer maxCountInTimeInterval;

        @InterfaceC65349Pkn("max_count_in_each_vv_interval")
        public final Integer maxCountInVVInterval;

        @InterfaceC65349Pkn("popup_ids")
        public final List<String> popupIds;

        @InterfaceC65349Pkn("required_min_device_session_counts")
        public final Integer sessionCount;

        @InterfaceC65349Pkn("required_time_interval")
        public final Float timeInterval;

        @InterfaceC65349Pkn("required_vv_interval")
        public final Integer vvInterval;

        /* JADX WARN: Multi-variable type inference failed */
        public RuleGroup() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RuleGroup copy$default(RuleGroup ruleGroup, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, Integer num7, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                num = ruleGroup.groupId;
            }
            if ((i & 2) != 0) {
                num2 = ruleGroup.sessionCount;
            }
            if ((i & 4) != 0) {
                num3 = ruleGroup.bypassActiveDay;
            }
            if ((i & 8) != 0) {
                num4 = ruleGroup.maxCountInSession;
            }
            if ((i & 16) != 0) {
                f = ruleGroup.timeInterval;
            }
            if ((i & 32) != 0) {
                num5 = ruleGroup.maxCountInTimeInterval;
            }
            if ((i & 64) != 0) {
                num6 = ruleGroup.vvInterval;
            }
            if ((i & 128) != 0) {
                num7 = ruleGroup.maxCountInVVInterval;
            }
            if ((i & 256) != 0) {
                list = ruleGroup.popupIds;
            }
            return ruleGroup.copy(num, num2, num3, num4, f, num5, num6, num7, list);
        }

        public final RuleGroup copy(Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, Integer num7, List<String> list) {
            return new RuleGroup(num, num2, num3, num4, f, num5, num6, num7, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RuleGroup)) {
                return false;
            }
            RuleGroup ruleGroup = (RuleGroup) obj;
            return o.LJ(this.groupId, ruleGroup.groupId) && o.LJ(this.sessionCount, ruleGroup.sessionCount) && o.LJ(this.bypassActiveDay, ruleGroup.bypassActiveDay) && o.LJ(this.maxCountInSession, ruleGroup.maxCountInSession) && o.LJ(this.timeInterval, ruleGroup.timeInterval) && o.LJ(this.maxCountInTimeInterval, ruleGroup.maxCountInTimeInterval) && o.LJ(this.vvInterval, ruleGroup.vvInterval) && o.LJ(this.maxCountInVVInterval, ruleGroup.maxCountInVVInterval) && o.LJ(this.popupIds, ruleGroup.popupIds);
        }

        public int hashCode() {
            Integer num = this.groupId;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.sessionCount;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.bypassActiveDay;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.maxCountInSession;
            int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Float f = this.timeInterval;
            int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
            Integer num5 = this.maxCountInTimeInterval;
            int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.vvInterval;
            int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.maxCountInVVInterval;
            int hashCode8 = (hashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
            List<String> list = this.popupIds;
            return hashCode8 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RuleGroup(groupId=");
            LIZ.append(this.groupId);
            LIZ.append(", sessionCount=");
            LIZ.append(this.sessionCount);
            LIZ.append(", bypassActiveDay=");
            LIZ.append(this.bypassActiveDay);
            LIZ.append(", maxCountInSession=");
            LIZ.append(this.maxCountInSession);
            LIZ.append(", timeInterval=");
            LIZ.append(this.timeInterval);
            LIZ.append(", maxCountInTimeInterval=");
            LIZ.append(this.maxCountInTimeInterval);
            LIZ.append(", vvInterval=");
            LIZ.append(this.vvInterval);
            LIZ.append(", maxCountInVVInterval=");
            LIZ.append(this.maxCountInVVInterval);
            LIZ.append(", popupIds=");
            return C1NE.LIZIZ(LIZ, this.popupIds, ')', LIZ);
        }

        public final Integer getBypassActiveDay() {
            return this.bypassActiveDay;
        }

        public final Integer getGroupId() {
            return this.groupId;
        }

        public final Integer getMaxCountInSession() {
            return this.maxCountInSession;
        }

        public final Integer getMaxCountInTimeInterval() {
            return this.maxCountInTimeInterval;
        }

        public final Integer getMaxCountInVVInterval() {
            return this.maxCountInVVInterval;
        }

        public final List<String> getPopupIds() {
            return this.popupIds;
        }

        public final Integer getSessionCount() {
            return this.sessionCount;
        }

        public final Float getTimeInterval() {
            return this.timeInterval;
        }

        public final Integer getVvInterval() {
            return this.vvInterval;
        }

        public RuleGroup(Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, Integer num7, List<String> list) {
            this.groupId = num;
            this.sessionCount = num2;
            this.bypassActiveDay = num3;
            this.maxCountInSession = num4;
            this.timeInterval = f;
            this.maxCountInTimeInterval = num5;
            this.vvInterval = num6;
            this.maxCountInVVInterval = num7;
            this.popupIds = list;
        }

        public /* synthetic */ RuleGroup(Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, Integer num7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6, (i & 128) != 0 ? null : num7, (i & 256) == 0 ? list : null);
        }
    }

    static {
        C221108m2.LIZIZ(C2ZV.LJLIL);
    }

    public static RuleGroup LIZ(String str) {
        int intValue;
        Integer num = (Integer) ((HashMap) LIZLLL.getValue()).get(str);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        C62822Ol8 c62822Ol8 = LIZJ;
        if (intValue >= ((List) c62822Ol8.getValue()).size()) {
            return null;
        }
        return (RuleGroup) ListProtector.get((List) c62822Ol8.getValue(), intValue);
    }
}
