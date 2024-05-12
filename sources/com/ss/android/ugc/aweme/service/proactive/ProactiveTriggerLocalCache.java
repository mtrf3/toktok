package com.ss.android.ugc.aweme.service.proactive;

import X.InterfaceC65349Pkn;
import X.ORV;
import X.UC7;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ProactiveTriggerLocalCache {

    @InterfaceC65349Pkn("dau_expiration_offset_end_millis")
    public final Long dauOffsetEndMillis;

    @InterfaceC65349Pkn("dau_expiration_offset_start_millis")
    public final Long dauOffsetStartMillis;

    @InterfaceC65349Pkn("day_limit_login_panel")
    public final Integer dayLimitLoginPanel;

    @InterfaceC65349Pkn("dynamic_title_login")
    public final String dynamicTitleLogin;

    @InterfaceC65349Pkn("dynamic_title_signup")
    public final String dynamicTitleSignup;

    @InterfaceC65349Pkn("is_first_time")
    public final Boolean isFirstTime;

    @InterfaceC65349Pkn("login_trigger")
    public final ORV<Long> loginTriggerRecords;

    @InterfaceC65349Pkn("min_hours_interval_login_panel")
    public final Integer minHoursIntervalLoginPanel;

    @InterfaceC65349Pkn("user_vv")
    public final ORV<Long> userVVRecords;

    @InterfaceC65349Pkn("v2_triggered")
    public final Boolean v2ShouldTrigger;

    @InterfaceC65349Pkn("v2_vv_trigger_threshold")
    public final Integer v2VVTriggerThreshold;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProactiveTriggerLocalCache)) {
            return false;
        }
        ProactiveTriggerLocalCache proactiveTriggerLocalCache = (ProactiveTriggerLocalCache) obj;
        return o.LJ(this.loginTriggerRecords, proactiveTriggerLocalCache.loginTriggerRecords) && o.LJ(this.userVVRecords, proactiveTriggerLocalCache.userVVRecords) && o.LJ(this.isFirstTime, proactiveTriggerLocalCache.isFirstTime) && o.LJ(this.dynamicTitleLogin, proactiveTriggerLocalCache.dynamicTitleLogin) && o.LJ(this.dynamicTitleSignup, proactiveTriggerLocalCache.dynamicTitleSignup) && o.LJ(this.v2ShouldTrigger, proactiveTriggerLocalCache.v2ShouldTrigger) && o.LJ(this.v2VVTriggerThreshold, proactiveTriggerLocalCache.v2VVTriggerThreshold) && o.LJ(this.dauOffsetStartMillis, proactiveTriggerLocalCache.dauOffsetStartMillis) && o.LJ(this.dauOffsetEndMillis, proactiveTriggerLocalCache.dauOffsetEndMillis) && o.LJ(this.minHoursIntervalLoginPanel, proactiveTriggerLocalCache.minHoursIntervalLoginPanel) && o.LJ(this.dayLimitLoginPanel, proactiveTriggerLocalCache.dayLimitLoginPanel);
    }

    public final int hashCode() {
        ORV<Long> orv = this.loginTriggerRecords;
        int hashCode = (orv == null ? 0 : orv.hashCode()) * 31;
        ORV<Long> orv2 = this.userVVRecords;
        int hashCode2 = (hashCode + (orv2 == null ? 0 : orv2.hashCode())) * 31;
        Boolean bool = this.isFirstTime;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.dynamicTitleLogin;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dynamicTitleSignup;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.v2ShouldTrigger;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.v2VVTriggerThreshold;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.dauOffsetStartMillis;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.dauOffsetEndMillis;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.minHoursIntervalLoginPanel;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dayLimitLoginPanel;
        return hashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProactiveTriggerLocalCache(loginTriggerRecords=");
        sb.append(this.loginTriggerRecords);
        sb.append(", userVVRecords=");
        sb.append(this.userVVRecords);
        sb.append(", isFirstTime=");
        sb.append(this.isFirstTime);
        sb.append(", dynamicTitleLogin=");
        sb.append(this.dynamicTitleLogin);
        sb.append(", dynamicTitleSignup=");
        sb.append(this.dynamicTitleSignup);
        sb.append(", v2ShouldTrigger=");
        sb.append(this.v2ShouldTrigger);
        sb.append(", v2VVTriggerThreshold=");
        sb.append(this.v2VVTriggerThreshold);
        sb.append(", dauOffsetStartMillis=");
        sb.append(this.dauOffsetStartMillis);
        sb.append(", dauOffsetEndMillis=");
        sb.append(this.dauOffsetEndMillis);
        sb.append(", minHoursIntervalLoginPanel=");
        sb.append(this.minHoursIntervalLoginPanel);
        sb.append(", dayLimitLoginPanel=");
        return UC7.LIZ(sb, this.dayLimitLoginPanel, ')');
    }

    public ProactiveTriggerLocalCache(ORV<Long> orv, ORV<Long> orv2, Boolean bool, String str, String str2, Boolean bool2, Integer num, Long l, Long l2, Integer num2, Integer num3) {
        this.loginTriggerRecords = orv;
        this.userVVRecords = orv2;
        this.isFirstTime = bool;
        this.dynamicTitleLogin = str;
        this.dynamicTitleSignup = str2;
        this.v2ShouldTrigger = bool2;
        this.v2VVTriggerThreshold = num;
        this.dauOffsetStartMillis = l;
        this.dauOffsetEndMillis = l2;
        this.minHoursIntervalLoginPanel = num2;
        this.dayLimitLoginPanel = num3;
    }
}
