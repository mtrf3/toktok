package com.ss.android.ugc.aweme.specialplus;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SpecialPlusConfig {

    @InterfaceC65349Pkn("version")
    public int version;

    @InterfaceC65349Pkn("valid_time")
    public SpecialPlusTimePeriod[] validTime = new SpecialPlusTimePeriod[0];

    @InterfaceC65349Pkn("plus_icon")
    public SpecialPlusMedia plusIcon = new SpecialPlusMedia();

    @InterfaceC65349Pkn("resource_type")
    public String resourceType = "";

    @InterfaceC65349Pkn("condition")
    public SpecialPlusLabels labels = new SpecialPlusLabels();

    @InterfaceC65349Pkn("tips")
    public SpecialPlusTips tips = new SpecialPlusTips();

    @InterfaceC65349Pkn("app_version")
    public String appVersion = "";

    @InterfaceC65349Pkn("cool_down_period_in_hours")
    public float cool_down_period_in_hours = 4.0f;

    @InterfaceC65349Pkn("appearance_period_in_hours")
    public float appearance_period_in_hours = 24.0f;

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final float getAppearance_period_in_hours() {
        return this.appearance_period_in_hours;
    }

    public final float getCool_down_period_in_hours() {
        return this.cool_down_period_in_hours;
    }

    public final SpecialPlusLabels getLabels() {
        return this.labels;
    }

    public final SpecialPlusMedia getPlusIcon() {
        return this.plusIcon;
    }

    public final String getResourceType() {
        return this.resourceType;
    }

    public final SpecialPlusTips getTips() {
        return this.tips;
    }

    public final SpecialPlusTimePeriod[] getValidTime() {
        return this.validTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAppVersion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setAppearance_period_in_hours(float f) {
        this.appearance_period_in_hours = f;
    }

    public final void setCool_down_period_in_hours(float f) {
        this.cool_down_period_in_hours = f;
    }

    public final void setLabels(SpecialPlusLabels specialPlusLabels) {
        o.LJIIIZ(specialPlusLabels, "<set-?>");
        this.labels = specialPlusLabels;
    }

    public final void setPlusIcon(SpecialPlusMedia specialPlusMedia) {
        o.LJIIIZ(specialPlusMedia, "<set-?>");
        this.plusIcon = specialPlusMedia;
    }

    public final void setResourceType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.resourceType = str;
    }

    public final void setTips(SpecialPlusTips specialPlusTips) {
        o.LJIIIZ(specialPlusTips, "<set-?>");
        this.tips = specialPlusTips;
    }

    public final void setValidTime(SpecialPlusTimePeriod[] specialPlusTimePeriodArr) {
        o.LJIIIZ(specialPlusTimePeriodArr, "<set-?>");
        this.validTime = specialPlusTimePeriodArr;
    }

    public final void setVersion(int i) {
        this.version = i;
    }
}
