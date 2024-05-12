package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Bubble extends C95U {

    @InterfaceC65349Pkn("bubble_id")
    public String bubbleId;

    @InterfaceC65349Pkn("bubble_type")
    public int bubbleType;

    @InterfaceC65349Pkn("highlight_content")
    public String highlightContent;

    @InterfaceC65349Pkn("long_content")
    public String longContent;

    @InterfaceC65349Pkn("short_content")
    public String shortContent;

    @InterfaceC65349Pkn("show_again_time")
    public int showAgainTime;

    @InterfaceC65349Pkn("show_again_time_x")
    public int showAgainTimeX;

    @InterfaceC65349Pkn("show_again_time_y")
    public int showAgainTimeY;

    @InterfaceC65349Pkn("show_duration")
    public Integer showDuration;

    @InterfaceC65349Pkn("show_interval")
    public int showInterval;

    @InterfaceC65349Pkn("show_time_vv")
    public int showTimeVV;

    @InterfaceC65349Pkn("task_key")
    public String taskKey;

    @InterfaceC65349Pkn("total_times")
    public int totalTimes;

    public final Object[] LIZIZ() {
        return new Object[]{Integer.valueOf(this.bubbleType), this.bubbleId, this.shortContent, this.longContent, this.highlightContent, Integer.valueOf(this.showTimeVV), Integer.valueOf(this.showAgainTimeX), Integer.valueOf(this.showAgainTimeY), Integer.valueOf(this.showAgainTime), Integer.valueOf(this.totalTimes), Integer.valueOf(this.showInterval), this.taskKey, this.showDuration};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bubble) {
            return C78966Uyw.LJIIIZ(((Bubble) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Bubble:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public Bubble(int i, String bubbleId, String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, String str4, Integer num) {
        o.LJIIIZ(bubbleId, "bubbleId");
        this.bubbleType = i;
        this.bubbleId = bubbleId;
        this.shortContent = str;
        this.longContent = str2;
        this.highlightContent = str3;
        this.showTimeVV = i2;
        this.showAgainTimeX = i3;
        this.showAgainTimeY = i4;
        this.showAgainTime = i5;
        this.totalTimes = i6;
        this.showInterval = i7;
        this.taskKey = str4;
        this.showDuration = num;
    }
}
