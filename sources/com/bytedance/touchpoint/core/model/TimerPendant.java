package com.bytedance.touchpoint.core.model;

import X.C78966Uyw;
import X.C95U;
import X.InterfaceC65349Pkn;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TimerPendant extends C95U {

    @InterfaceC65349Pkn("activity_id")
    public String activityId;

    @InterfaceC65349Pkn("award_cycle_interval")
    public Integer awardCycleInterval;

    @InterfaceC65349Pkn("award_end_frame")
    public Integer awardEndFrame;

    @InterfaceC65349Pkn("award_text_bg_colors")
    public List<String> awardTextBGColor;

    @InterfaceC65349Pkn("award_transition_frame")
    public Integer awardTransitionFrame;

    @InterfaceC65349Pkn("bar_color")
    public List<String> barColor;

    @InterfaceC65349Pkn("bg_color")
    public List<String> bgColor;

    @InterfaceC65349Pkn("bottom_text_show")
    public Boolean bottomTexShow;

    @InterfaceC65349Pkn("bottom_text")
    public String bottomText;

    @InterfaceC65349Pkn("animation_lottie_name")
    public String breathLottieName;

    @InterfaceC65349Pkn("closable")
    public Boolean canBeClosed;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("timer_lottie_file_md5")
    public String lottieFileMd5;

    @InterfaceC65349Pkn("timer_lottie_file_zip")
    public String lottieFileZip;

    @InterfaceC65349Pkn("lottie_name")
    public String lottieName;

    @InterfaceC65349Pkn("need_login_gate")
    public boolean needLoginGate;

    @InterfaceC65349Pkn("award_lottie_name")
    public String rewardLottieName;

    @InterfaceC65349Pkn("award_text")
    public String rewardText;

    @InterfaceC65349Pkn("shrink_after")
    public int shrinkAfter;

    @InterfaceC65349Pkn("shrink_lottie_name")
    public String shrinkLottieName;

    @InterfaceC65349Pkn("text_bg_color")
    public String textBGColor;

    @InterfaceC65349Pkn("text_bg_colors")
    public List<String> textBGColors;

    @InterfaceC65349Pkn("timer_jump_link")
    public String timerJumpLink;

    public final Object[] LIZIZ() {
        return new Object[]{this.activityId, this.timerJumpLink, this.lottieFileZip, this.lottieFileMd5, this.bgColor, this.barColor, this.lottieName, Integer.valueOf(this.shrinkAfter), this.shrinkLottieName, this.breathLottieName, this.rewardLottieName, this.awardTransitionFrame, this.awardEndFrame, this.awardCycleInterval, this.rewardText, this.canBeClosed, this.textBGColors, this.awardTextBGColor, this.bottomTexShow, this.bottomText, this.textBGColor, Boolean.valueOf(this.needLoginGate), this.extra};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimerPendant) {
            return C78966Uyw.LJIIIZ(((TimerPendant) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("TimerPendant:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public TimerPendant(String activityId, String timerJumpLink, String lottieFileZip, String lottieFileMd5, List<String> bgColor, List<String> barColor, String lottieName, int i, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, Boolean bool, List<String> list, List<String> list2, Boolean bool2, String str5, String str6, boolean z, String str7) {
        o.LJIIIZ(activityId, "activityId");
        o.LJIIIZ(timerJumpLink, "timerJumpLink");
        o.LJIIIZ(lottieFileZip, "lottieFileZip");
        o.LJIIIZ(lottieFileMd5, "lottieFileMd5");
        o.LJIIIZ(bgColor, "bgColor");
        o.LJIIIZ(barColor, "barColor");
        o.LJIIIZ(lottieName, "lottieName");
        this.activityId = activityId;
        this.timerJumpLink = timerJumpLink;
        this.lottieFileZip = lottieFileZip;
        this.lottieFileMd5 = lottieFileMd5;
        this.bgColor = bgColor;
        this.barColor = barColor;
        this.lottieName = lottieName;
        this.shrinkAfter = i;
        this.shrinkLottieName = str;
        this.breathLottieName = str2;
        this.rewardLottieName = str3;
        this.awardTransitionFrame = num;
        this.awardEndFrame = num2;
        this.awardCycleInterval = num3;
        this.rewardText = str4;
        this.canBeClosed = bool;
        this.textBGColors = list;
        this.awardTextBGColor = list2;
        this.bottomTexShow = bool2;
        this.bottomText = str5;
        this.textBGColor = str6;
        this.needLoginGate = z;
        this.extra = str7;
    }

    public /* synthetic */ TimerPendant(String str, String str2, String str3, String str4, List list, List list2, String str5, int i, String str6, String str7, String str8, Integer num, Integer num2, Integer num3, String str9, Boolean bool, List list3, List list4, Boolean bool2, String str10, String str11, boolean z, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, list2, str5, i, str6, str7, str8, num, num2, num3, str9, bool, list3, list4, bool2, str10, str11, (i2 & 2097152) != 0 ? false : z, str12);
    }
}
