package com.ss.android.ugc.aweme.search.cointask.core.config;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchCoinTaskConfigData {

    @InterfaceC65349Pkn("coin_banner_icon")
    public final String coinBannerIcon;

    @InterfaceC65349Pkn("task_countdown_time")
    public final Integer taskCountdownTime;

    @InterfaceC65349Pkn("task_toast_duration_time")
    public final Integer taskToastDurationTime;

    @InterfaceC65349Pkn("timer_stop_white_list_of_btm")
    public final List<String> timerStopWhiteListOfBTM;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchCoinTaskConfigData)) {
            return false;
        }
        SearchCoinTaskConfigData searchCoinTaskConfigData = (SearchCoinTaskConfigData) obj;
        return o.LJ(this.taskCountdownTime, searchCoinTaskConfigData.taskCountdownTime) && o.LJ(this.taskToastDurationTime, searchCoinTaskConfigData.taskToastDurationTime) && o.LJ(this.timerStopWhiteListOfBTM, searchCoinTaskConfigData.timerStopWhiteListOfBTM) && o.LJ(this.coinBannerIcon, searchCoinTaskConfigData.coinBannerIcon);
    }

    public final int hashCode() {
        Integer num = this.taskCountdownTime;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.taskToastDurationTime;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.timerStopWhiteListOfBTM;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.coinBannerIcon;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchCoinTaskConfigData(taskCountdownTime=");
        LIZ.append(this.taskCountdownTime);
        LIZ.append(", taskToastDurationTime=");
        LIZ.append(this.taskToastDurationTime);
        LIZ.append(", timerStopWhiteListOfBTM=");
        LIZ.append(this.timerStopWhiteListOfBTM);
        LIZ.append(", coinBannerIcon=");
        return q.LIZIZ(LIZ, this.coinBannerIcon, ')', LIZ);
    }

    public SearchCoinTaskConfigData(Integer num, Integer num2, List<String> list, String str) {
        this.taskCountdownTime = num;
        this.taskToastDurationTime = num2;
        this.timerStopWhiteListOfBTM = list;
        this.coinBannerIcon = str;
    }

    public SearchCoinTaskConfigData(Integer num, Integer num2, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i & 4) != 0 ? C61878OQg.INSTANCE : list, (i & 8) != 0 ? null : str);
    }
}
