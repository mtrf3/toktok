package com.ss.android.ugc.feed.platform.popupclean;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$PopupRule implements Serializable {

    @InterfaceC65349Pkn("including_any_scene")
    public final Boolean includingAnyScene;

    @InterfaceC65349Pkn("max_count_in_each_session")
    public final Integer maxCountInEachSession;

    @InterfaceC65349Pkn("max_show_count")
    public final Integer maxShowCount;

    @InterfaceC65349Pkn("required_min_active_days")
    public final Integer minActiveDays;

    @InterfaceC65349Pkn("required_min_device_install_days")
    public final Integer minInstallDays;

    @InterfaceC65349Pkn("online_control")
    public final PopupRuleData$OnlineControl onlineControl;

    @InterfaceC65349Pkn("scenes")
    public final List<String> scenes;

    @InterfaceC65349Pkn("required_min_device_session_counts")
    public final Integer sessionCounts;

    @InterfaceC65349Pkn("vv_control")
    public final PopupRuleData$VVControl vvControl;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopupRuleData$PopupRule copy$default(PopupRuleData$PopupRule popupRuleData$PopupRule, Integer num, List list, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, PopupRuleData$OnlineControl popupRuleData$OnlineControl, PopupRuleData$VVControl popupRuleData$VVControl, int i, Object obj) {
        if ((i & 1) != 0) {
            num = popupRuleData$PopupRule.maxShowCount;
        }
        if ((i & 2) != 0) {
            list = popupRuleData$PopupRule.scenes;
        }
        if ((i & 4) != 0) {
            bool = popupRuleData$PopupRule.includingAnyScene;
        }
        if ((i & 8) != 0) {
            num2 = popupRuleData$PopupRule.minInstallDays;
        }
        if ((i & 16) != 0) {
            num3 = popupRuleData$PopupRule.minActiveDays;
        }
        if ((i & 32) != 0) {
            num4 = popupRuleData$PopupRule.sessionCounts;
        }
        if ((i & 64) != 0) {
            num5 = popupRuleData$PopupRule.maxCountInEachSession;
        }
        if ((i & 128) != 0) {
            popupRuleData$OnlineControl = popupRuleData$PopupRule.onlineControl;
        }
        if ((i & 256) != 0) {
            popupRuleData$VVControl = popupRuleData$PopupRule.vvControl;
        }
        return popupRuleData$PopupRule.copy(num, list, bool, num2, num3, num4, num5, popupRuleData$OnlineControl, popupRuleData$VVControl);
    }

    public final PopupRuleData$PopupRule copy(Integer num, List<String> list, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, PopupRuleData$OnlineControl popupRuleData$OnlineControl, PopupRuleData$VVControl popupRuleData$VVControl) {
        return new PopupRuleData$PopupRule(num, list, bool, num2, num3, num4, num5, popupRuleData$OnlineControl, popupRuleData$VVControl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupRuleData$PopupRule)) {
            return false;
        }
        PopupRuleData$PopupRule popupRuleData$PopupRule = (PopupRuleData$PopupRule) obj;
        return o.LJ(this.maxShowCount, popupRuleData$PopupRule.maxShowCount) && o.LJ(this.scenes, popupRuleData$PopupRule.scenes) && o.LJ(this.includingAnyScene, popupRuleData$PopupRule.includingAnyScene) && o.LJ(this.minInstallDays, popupRuleData$PopupRule.minInstallDays) && o.LJ(this.minActiveDays, popupRuleData$PopupRule.minActiveDays) && o.LJ(this.sessionCounts, popupRuleData$PopupRule.sessionCounts) && o.LJ(this.maxCountInEachSession, popupRuleData$PopupRule.maxCountInEachSession) && o.LJ(this.onlineControl, popupRuleData$PopupRule.onlineControl) && o.LJ(this.vvControl, popupRuleData$PopupRule.vvControl);
    }

    public int hashCode() {
        Integer num = this.maxShowCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.scenes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.includingAnyScene;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.minInstallDays;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minActiveDays;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sessionCounts;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.maxCountInEachSession;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        PopupRuleData$OnlineControl popupRuleData$OnlineControl = this.onlineControl;
        int hashCode8 = (hashCode7 + (popupRuleData$OnlineControl == null ? 0 : popupRuleData$OnlineControl.hashCode())) * 31;
        PopupRuleData$VVControl popupRuleData$VVControl = this.vvControl;
        return hashCode8 + (popupRuleData$VVControl != null ? popupRuleData$VVControl.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopupRule(maxShowCount=");
        LIZ.append(this.maxShowCount);
        LIZ.append(", scenes=");
        LIZ.append(this.scenes);
        LIZ.append(", includingAnyScene=");
        LIZ.append(this.includingAnyScene);
        LIZ.append(", minInstallDays=");
        LIZ.append(this.minInstallDays);
        LIZ.append(", minActiveDays=");
        LIZ.append(this.minActiveDays);
        LIZ.append(", sessionCounts=");
        LIZ.append(this.sessionCounts);
        LIZ.append(", maxCountInEachSession=");
        LIZ.append(this.maxCountInEachSession);
        LIZ.append(", onlineControl=");
        LIZ.append(this.onlineControl);
        LIZ.append(", vvControl=");
        LIZ.append(this.vvControl);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Boolean getIncludingAnyScene() {
        return this.includingAnyScene;
    }

    public final Integer getMaxCountInEachSession() {
        return this.maxCountInEachSession;
    }

    public final Integer getMaxShowCount() {
        return this.maxShowCount;
    }

    public final Integer getMinActiveDays() {
        return this.minActiveDays;
    }

    public final Integer getMinInstallDays() {
        return this.minInstallDays;
    }

    public final PopupRuleData$OnlineControl getOnlineControl() {
        return this.onlineControl;
    }

    public final List<String> getScenes() {
        return this.scenes;
    }

    public final Integer getSessionCounts() {
        return this.sessionCounts;
    }

    public final PopupRuleData$VVControl getVvControl() {
        return this.vvControl;
    }

    public PopupRuleData$PopupRule(Integer num, List<String> list, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, PopupRuleData$OnlineControl popupRuleData$OnlineControl, PopupRuleData$VVControl popupRuleData$VVControl) {
        this.maxShowCount = num;
        this.scenes = list;
        this.includingAnyScene = bool;
        this.minInstallDays = num2;
        this.minActiveDays = num3;
        this.sessionCounts = num4;
        this.maxCountInEachSession = num5;
        this.onlineControl = popupRuleData$OnlineControl;
        this.vvControl = popupRuleData$VVControl;
    }

    public /* synthetic */ PopupRuleData$PopupRule(Integer num, List list, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, PopupRuleData$OnlineControl popupRuleData$OnlineControl, PopupRuleData$VVControl popupRuleData$VVControl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, list, bool, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : num5, (i & 128) != 0 ? null : popupRuleData$OnlineControl, (i & 256) == 0 ? popupRuleData$VVControl : null);
    }
}
