package com.ss.android.ugc.aweme.im.service.appsettings;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMTakoConfig {

    @InterfaceC65349Pkn("enable_pull_bot_message_almost_timeout")
    public final Boolean enablePullAlmostTimeout;

    @InterfaceC65349Pkn("enable_pull_bot_message_when_enter_chat")
    public final Boolean enablePullWhenEnter;

    @InterfaceC65349Pkn("enable_pull_bot_message_when_websocket_fail")
    public final Boolean enablePullWhenWsFail;

    @InterfaceC65349Pkn("bot_chat_message_content_tracker_max_length")
    public final Integer msgContentTrackerMax;

    @InterfaceC65349Pkn("polling_process_info_fallback_interval")
    public final Long pollingMaxTimeLimit;

    @InterfaceC65349Pkn("polling_process_info_interval")
    public final Long pollingProcessInfoInterval;

    @InterfaceC65349Pkn("typing_input_status_max_interval")
    public final Long typingExceedTime;

    @InterfaceC65349Pkn("typing_manual_pull_time_list")
    public final List<Long> typingManualPullTimeList;

    @InterfaceC65349Pkn("typing_tips_time_interval_range")
    public final List<Long> typingTipsTimeIntervalRange;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMTakoConfig)) {
            return false;
        }
        DMTakoConfig dMTakoConfig = (DMTakoConfig) obj;
        return o.LJ(this.typingExceedTime, dMTakoConfig.typingExceedTime) && o.LJ(this.typingManualPullTimeList, dMTakoConfig.typingManualPullTimeList) && o.LJ(this.enablePullWhenWsFail, dMTakoConfig.enablePullWhenWsFail) && o.LJ(this.enablePullWhenEnter, dMTakoConfig.enablePullWhenEnter) && o.LJ(this.enablePullAlmostTimeout, dMTakoConfig.enablePullAlmostTimeout) && o.LJ(this.typingTipsTimeIntervalRange, dMTakoConfig.typingTipsTimeIntervalRange) && o.LJ(this.msgContentTrackerMax, dMTakoConfig.msgContentTrackerMax) && o.LJ(this.pollingProcessInfoInterval, dMTakoConfig.pollingProcessInfoInterval) && o.LJ(this.pollingMaxTimeLimit, dMTakoConfig.pollingMaxTimeLimit);
    }

    public final int hashCode() {
        Long l = this.typingExceedTime;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<Long> list = this.typingManualPullTimeList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.enablePullWhenWsFail;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enablePullWhenEnter;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.enablePullAlmostTimeout;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Long> list2 = this.typingTipsTimeIntervalRange;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.msgContentTrackerMax;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.pollingProcessInfoInterval;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.pollingMaxTimeLimit;
        return hashCode8 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DMTakoConfig(typingExceedTime=");
        LIZ.append(this.typingExceedTime);
        LIZ.append(", typingManualPullTimeList=");
        LIZ.append(this.typingManualPullTimeList);
        LIZ.append(", enablePullWhenWsFail=");
        LIZ.append(this.enablePullWhenWsFail);
        LIZ.append(", enablePullWhenEnter=");
        LIZ.append(this.enablePullWhenEnter);
        LIZ.append(", enablePullAlmostTimeout=");
        LIZ.append(this.enablePullAlmostTimeout);
        LIZ.append(", typingTipsTimeIntervalRange=");
        LIZ.append(this.typingTipsTimeIntervalRange);
        LIZ.append(", msgContentTrackerMax=");
        LIZ.append(this.msgContentTrackerMax);
        LIZ.append(", pollingProcessInfoInterval=");
        LIZ.append(this.pollingProcessInfoInterval);
        LIZ.append(", pollingMaxTimeLimit=");
        return JBR.LJ(LIZ, this.pollingMaxTimeLimit, ')', LIZ);
    }

    public DMTakoConfig(Long l, List<Long> list, Boolean bool, Boolean bool2, Boolean bool3, List<Long> list2, Integer num, Long l2, Long l3) {
        this.typingExceedTime = l;
        this.typingManualPullTimeList = list;
        this.enablePullWhenWsFail = bool;
        this.enablePullWhenEnter = bool2;
        this.enablePullAlmostTimeout = bool3;
        this.typingTipsTimeIntervalRange = list2;
        this.msgContentTrackerMax = num;
        this.pollingProcessInfoInterval = l2;
        this.pollingMaxTimeLimit = l3;
    }
}
