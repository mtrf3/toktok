package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class FeedBottomTip extends C95U {

    @InterfaceC65349Pkn("background_colors")
    public final List<String> backgroundColor;

    @InterfaceC65349Pkn("delay_seconds")
    public final float delaySeconds;

    @InterfaceC65349Pkn("event_params")
    public final Map<String, String> eventParams;

    @InterfaceC65349Pkn("gradient_type")
    public final int gradientType;

    @InterfaceC65349Pkn("hashtag_ids")
    public final List<String> hashtagIds;

    @InterfaceC65349Pkn("left_icon")
    public final String leftIcon;

    @InterfaceC65349Pkn("right_icon")
    public final String rightIcon;

    @InterfaceC65349Pkn("tip_text")
    public final TipText tipText;

    @InterfaceC65349Pkn("video_ids")
    public final List<String> videoIds;

    public final Object[] LIZIZ() {
        return new Object[]{this.tipText, this.eventParams, Float.valueOf(this.delaySeconds), this.leftIcon, this.rightIcon, this.hashtagIds, this.videoIds, this.backgroundColor, Integer.valueOf(this.gradientType)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedBottomTip) {
            return C78966Uyw.LJIIIZ(((FeedBottomTip) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("FeedBottomTip:%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public FeedBottomTip(TipText tipText, Map<String, String> map, float f, String str, String str2, List<String> list, List<String> list2, List<String> list3, int i) {
        this.tipText = tipText;
        this.eventParams = map;
        this.delaySeconds = f;
        this.leftIcon = str;
        this.rightIcon = str2;
        this.hashtagIds = list;
        this.videoIds = list2;
        this.backgroundColor = list3;
        this.gradientType = i;
    }
}
