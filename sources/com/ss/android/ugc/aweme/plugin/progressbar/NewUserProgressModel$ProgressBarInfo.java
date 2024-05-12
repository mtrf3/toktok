package com.ss.android.ugc.aweme.plugin.progressbar;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewUserProgressModel$ProgressBarInfo {

    @InterfaceC65349Pkn("is_default_color")
    public Boolean isDefaultColor;

    @InterfaceC65349Pkn("is_dismissible")
    public Boolean isProgressBarDismissable;

    @InterfaceC65349Pkn("show_until")
    public final Long showUntil;

    @InterfaceC65349Pkn("stages")
    public List<NewUserProgressModel$Stage> stages;

    @InterfaceC65349Pkn("style")
    public Integer style;

    @InterfaceC65349Pkn("swipe_up_text")
    public NewUserProgressModel$SwipeUpText swipeUpText;

    @InterfaceC65349Pkn("text_button_keep")
    public String textButtonKeep;

    @InterfaceC65349Pkn("text_button_turn_off")
    public String textButtonTurnOff;

    @InterfaceC65349Pkn("text_progress_complete")
    public String textProgressComplete;

    @InterfaceC65349Pkn("text_remove_body")
    public String textRemoveBody;

    @InterfaceC65349Pkn("text_remove_title")
    public String textRemoveTitle;

    @InterfaceC65349Pkn("text_skip_video_reminder")
    public String textSkipVideoReminder;

    @InterfaceC65349Pkn("text_tap_body")
    public String textTapBody;

    @InterfaceC65349Pkn("text_tap_title")
    public String textTapTitle;

    @InterfaceC65349Pkn("video_skip_duration")
    public Integer videoSkipDuration;

    /* JADX WARN: Multi-variable type inference failed */
    public NewUserProgressModel$ProgressBarInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserProgressModel$ProgressBarInfo)) {
            return false;
        }
        NewUserProgressModel$ProgressBarInfo newUserProgressModel$ProgressBarInfo = (NewUserProgressModel$ProgressBarInfo) obj;
        return o.LJ(this.isProgressBarDismissable, newUserProgressModel$ProgressBarInfo.isProgressBarDismissable) && o.LJ(this.isDefaultColor, newUserProgressModel$ProgressBarInfo.isDefaultColor) && o.LJ(this.textProgressComplete, newUserProgressModel$ProgressBarInfo.textProgressComplete) && o.LJ(this.textTapTitle, newUserProgressModel$ProgressBarInfo.textTapTitle) && o.LJ(this.textTapBody, newUserProgressModel$ProgressBarInfo.textTapBody) && o.LJ(this.textRemoveTitle, newUserProgressModel$ProgressBarInfo.textRemoveTitle) && o.LJ(this.textRemoveBody, newUserProgressModel$ProgressBarInfo.textRemoveBody) && o.LJ(this.textButtonKeep, newUserProgressModel$ProgressBarInfo.textButtonKeep) && o.LJ(this.textButtonTurnOff, newUserProgressModel$ProgressBarInfo.textButtonTurnOff) && o.LJ(this.style, newUserProgressModel$ProgressBarInfo.style) && o.LJ(this.textSkipVideoReminder, newUserProgressModel$ProgressBarInfo.textSkipVideoReminder) && o.LJ(this.videoSkipDuration, newUserProgressModel$ProgressBarInfo.videoSkipDuration) && o.LJ(this.stages, newUserProgressModel$ProgressBarInfo.stages) && o.LJ(this.swipeUpText, newUserProgressModel$ProgressBarInfo.swipeUpText) && o.LJ(this.showUntil, newUserProgressModel$ProgressBarInfo.showUntil);
    }

    public final int hashCode() {
        Boolean bool = this.isProgressBarDismissable;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isDefaultColor;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.textProgressComplete;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textTapTitle;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textTapBody;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textRemoveTitle;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textRemoveBody;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.textButtonKeep;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.textButtonTurnOff;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.style;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.textSkipVideoReminder;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.videoSkipDuration;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<NewUserProgressModel$Stage> list = this.stages;
        int hashCode13 = (hashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        NewUserProgressModel$SwipeUpText newUserProgressModel$SwipeUpText = this.swipeUpText;
        int hashCode14 = (hashCode13 + (newUserProgressModel$SwipeUpText == null ? 0 : newUserProgressModel$SwipeUpText.hashCode())) * 31;
        Long l = this.showUntil;
        return hashCode14 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressBarInfo(isProgressBarDismissable=" + this.isProgressBarDismissable + ", isDefaultColor=" + this.isDefaultColor + ", textProgressComplete=" + this.textProgressComplete + ", textTapTitle=" + this.textTapTitle + ", textTapBody=" + this.textTapBody + ", textRemoveTitle=" + this.textRemoveTitle + ", textRemoveBody=" + this.textRemoveBody + ", textButtonKeep=" + this.textButtonKeep + ", textButtonTurnOff=" + this.textButtonTurnOff + ", style=" + this.style + ", textSkipVideoReminder=" + this.textSkipVideoReminder + ", videoSkipDuration=" + this.videoSkipDuration + ", stages=" + this.stages + ", swipeUpText=" + this.swipeUpText + ", showUntil=" + this.showUntil + ')';
    }

    public NewUserProgressModel$ProgressBarInfo(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2, List<NewUserProgressModel$Stage> list, NewUserProgressModel$SwipeUpText newUserProgressModel$SwipeUpText, Long l) {
        this.isProgressBarDismissable = bool;
        this.isDefaultColor = bool2;
        this.textProgressComplete = str;
        this.textTapTitle = str2;
        this.textTapBody = str3;
        this.textRemoveTitle = str4;
        this.textRemoveBody = str5;
        this.textButtonKeep = str6;
        this.textButtonTurnOff = str7;
        this.style = num;
        this.textSkipVideoReminder = str8;
        this.videoSkipDuration = num2;
        this.stages = list;
        this.swipeUpText = newUserProgressModel$SwipeUpText;
        this.showUntil = l;
    }

    public /* synthetic */ NewUserProgressModel$ProgressBarInfo(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Integer num2, List list, NewUserProgressModel$SwipeUpText newUserProgressModel$SwipeUpText, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? null : num, (i & 1024) == 0 ? str8 : "", (i & 2048) != 0 ? 0 : num2, (i & 4096) != 0 ? null : list, (i & FileUtils.BUFFER_SIZE) != 0 ? null : newUserProgressModel$SwipeUpText, (i & 16384) == 0 ? l : null);
    }
}
