package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CaptionAppearance implements Serializable {

    @InterfaceC65349Pkn("bg_color")
    public String bgColor;

    @InterfaceC65349Pkn("bg_corner_radius")
    public Float bgCornerRadius;

    @InterfaceC65349Pkn("caption_text_color")
    public String captionTextColor;

    @InterfaceC65349Pkn("caption_text_size")
    public Integer captionTextSize;

    @InterfaceC65349Pkn("caption_text_stroke_color")
    public String captionTextStrokeColor;

    @InterfaceC65349Pkn("caption_text_stroke_width")
    public Float captionTextStrokeWidth;

    @InterfaceC65349Pkn("expansion_direction")
    public Integer expansionDirection;

    @InterfaceC65349Pkn("instruction_text_color")
    public String instructionTextColor;

    @InterfaceC65349Pkn("instruction_text_size")
    public Integer instructionTextSize;

    @InterfaceC65349Pkn("instruction_text_stroke_color")
    public String instructionTextStrokeColor;

    @InterfaceC65349Pkn("instruction_text_stroke_width")
    public Float instructionTextStrokeWidth;

    @InterfaceC65349Pkn("should_show_caption_off")
    public Boolean shouldShowCaptionOff;

    @InterfaceC65349Pkn("should_show_caption_on")
    public Boolean shouldShowCaptionOn;

    @InterfaceC65349Pkn("should_show_control_when_collapsed")
    public Boolean shouldShowControlWhenCollapsed;

    @InterfaceC65349Pkn("should_show_control_when_expanded")
    public Boolean shouldShowControlWhenExpanded;

    @InterfaceC65349Pkn("should_show_instruction_text")
    public Boolean shouldShowInstructionText;

    @InterfaceC65349Pkn("text_label_alignment")
    public Integer textLabelAlignment;

    @InterfaceC65349Pkn("text_label_inset_info")
    public CaptionInsetInfo textLabelInsetInfo;

    @InterfaceC65349Pkn("tooltip_hide_enabled")
    public Boolean tooltipHideEnabled;

    public CaptionAppearance() {
    }

    public static /* synthetic */ CaptionAppearance copy$default(CaptionAppearance captionAppearance, String str, Float f, Integer num, CaptionInsetInfo captionInsetInfo, Integer num2, String str2, Float f2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, String str4, Float f3, String str5, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6, int i, Object obj) {
        String str6 = str;
        Float f4 = f;
        String str7 = str3;
        Float f5 = f2;
        String str8 = str2;
        Integer num5 = num2;
        Integer num6 = num;
        CaptionInsetInfo captionInsetInfo2 = captionInsetInfo;
        Float f6 = f3;
        String str9 = str4;
        Integer num7 = num3;
        Boolean bool7 = bool3;
        Boolean bool8 = bool;
        Boolean bool9 = bool2;
        Boolean bool10 = bool6;
        Boolean bool11 = bool5;
        Boolean bool12 = bool4;
        String str10 = str5;
        Integer num8 = num4;
        if ((i & 1) != 0) {
            str6 = captionAppearance.bgColor;
        }
        if ((i & 2) != 0) {
            f4 = captionAppearance.bgCornerRadius;
        }
        if ((i & 4) != 0) {
            num6 = captionAppearance.textLabelAlignment;
        }
        if ((i & 8) != 0) {
            captionInsetInfo2 = captionAppearance.textLabelInsetInfo;
        }
        if ((i & 16) != 0) {
            num5 = captionAppearance.captionTextSize;
        }
        if ((i & 32) != 0) {
            str8 = captionAppearance.captionTextColor;
        }
        if ((i & 64) != 0) {
            f5 = captionAppearance.captionTextStrokeWidth;
        }
        if ((i & 128) != 0) {
            str7 = captionAppearance.captionTextStrokeColor;
        }
        if ((i & 256) != 0) {
            bool8 = captionAppearance.shouldShowCaptionOn;
        }
        if ((i & 512) != 0) {
            bool9 = captionAppearance.shouldShowCaptionOff;
        }
        if ((i & 1024) != 0) {
            bool7 = captionAppearance.shouldShowInstructionText;
        }
        if ((i & 2048) != 0) {
            num7 = captionAppearance.instructionTextSize;
        }
        if ((i & 4096) != 0) {
            str9 = captionAppearance.instructionTextColor;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            f6 = captionAppearance.instructionTextStrokeWidth;
        }
        if ((i & 16384) != 0) {
            str10 = captionAppearance.instructionTextStrokeColor;
        }
        if ((32768 & i) != 0) {
            num8 = captionAppearance.expansionDirection;
        }
        if ((65536 & i) != 0) {
            bool12 = captionAppearance.shouldShowControlWhenCollapsed;
        }
        if ((131072 & i) != 0) {
            bool11 = captionAppearance.shouldShowControlWhenExpanded;
        }
        if ((i & 262144) != 0) {
            bool10 = captionAppearance.tooltipHideEnabled;
        }
        Float f7 = f5;
        return captionAppearance.copy(str6, f4, num6, captionInsetInfo2, num5, str8, f7, str7, bool8, bool9, bool7, num7, str9, f6, str10, num8, bool12, bool11, bool10);
    }

    public final CaptionAppearance copy(String str, Float f, Integer num, CaptionInsetInfo captionInsetInfo, Integer num2, String str2, Float f2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, String str4, Float f3, String str5, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6) {
        return new CaptionAppearance(str, f, num, captionInsetInfo, num2, str2, f2, str3, bool, bool2, bool3, num3, str4, f3, str5, num4, bool4, bool5, bool6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionAppearance)) {
            return false;
        }
        CaptionAppearance captionAppearance = (CaptionAppearance) obj;
        return o.LJ(this.bgColor, captionAppearance.bgColor) && o.LJ(this.bgCornerRadius, captionAppearance.bgCornerRadius) && o.LJ(this.textLabelAlignment, captionAppearance.textLabelAlignment) && o.LJ(this.textLabelInsetInfo, captionAppearance.textLabelInsetInfo) && o.LJ(this.captionTextSize, captionAppearance.captionTextSize) && o.LJ(this.captionTextColor, captionAppearance.captionTextColor) && o.LJ(this.captionTextStrokeWidth, captionAppearance.captionTextStrokeWidth) && o.LJ(this.captionTextStrokeColor, captionAppearance.captionTextStrokeColor) && o.LJ(this.shouldShowCaptionOn, captionAppearance.shouldShowCaptionOn) && o.LJ(this.shouldShowCaptionOff, captionAppearance.shouldShowCaptionOff) && o.LJ(this.shouldShowInstructionText, captionAppearance.shouldShowInstructionText) && o.LJ(this.instructionTextSize, captionAppearance.instructionTextSize) && o.LJ(this.instructionTextColor, captionAppearance.instructionTextColor) && o.LJ(this.instructionTextStrokeWidth, captionAppearance.instructionTextStrokeWidth) && o.LJ(this.instructionTextStrokeColor, captionAppearance.instructionTextStrokeColor) && o.LJ(this.expansionDirection, captionAppearance.expansionDirection) && o.LJ(this.shouldShowControlWhenCollapsed, captionAppearance.shouldShowControlWhenCollapsed) && o.LJ(this.shouldShowControlWhenExpanded, captionAppearance.shouldShowControlWhenExpanded) && o.LJ(this.tooltipHideEnabled, captionAppearance.tooltipHideEnabled);
    }

    public int hashCode() {
        String str = this.bgColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.bgCornerRadius;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.textLabelAlignment;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        CaptionInsetInfo captionInsetInfo = this.textLabelInsetInfo;
        int hashCode4 = (hashCode3 + (captionInsetInfo == null ? 0 : captionInsetInfo.hashCode())) * 31;
        Integer num2 = this.captionTextSize;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.captionTextColor;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f2 = this.captionTextStrokeWidth;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str3 = this.captionTextStrokeColor;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.shouldShowCaptionOn;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldShowCaptionOff;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shouldShowInstructionText;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.instructionTextSize;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.instructionTextColor;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f3 = this.instructionTextStrokeWidth;
        int hashCode14 = (hashCode13 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str5 = this.instructionTextStrokeColor;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.expansionDirection;
        int hashCode16 = (hashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool4 = this.shouldShowControlWhenCollapsed;
        int hashCode17 = (hashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.shouldShowControlWhenExpanded;
        int hashCode18 = (hashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.tooltipHideEnabled;
        return hashCode18 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public String toString() {
        return "\n * bg_color: " + this.bgColor + " \n * bg_corner_radius: " + this.bgCornerRadius + " \n * text_label_alignment: " + this.textLabelAlignment + " \n * text_label_inset_info: " + this.textLabelInsetInfo + " \n * caption_text_size: " + this.captionTextSize + " \n * caption_text_color: " + this.captionTextColor + " \n * caption_text_stroke_width: " + this.captionTextStrokeWidth + " \n * caption_text_stroke_color: " + this.captionTextStrokeColor + " \n * should_show_caption_on: " + this.shouldShowCaptionOn + " \n * should_show_caption_off: " + this.shouldShowCaptionOff + " \n * should_show_instruction_text: " + this.shouldShowInstructionText + " \n * instruction_text_size: " + this.instructionTextSize + " \n * instruction_text_color: " + this.instructionTextColor + " \n * instruction_text_stroke_width: " + this.instructionTextStrokeWidth + " \n * instruction_text_stroke_color: " + this.instructionTextStrokeColor + " \n * expansion_direction: " + this.expansionDirection + " \n * should_show_control_when_collapsed: " + this.shouldShowControlWhenCollapsed + " \n * should_show_control_when_expanded: " + this.shouldShowControlWhenExpanded + " \n * tooltip_hide_enabled: " + this.tooltipHideEnabled + " \n";
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final Float getBgCornerRadius() {
        return this.bgCornerRadius;
    }

    public final String getCaptionTextColor() {
        return this.captionTextColor;
    }

    public final Integer getCaptionTextSize() {
        return this.captionTextSize;
    }

    public final String getCaptionTextStrokeColor() {
        return this.captionTextStrokeColor;
    }

    public final Float getCaptionTextStrokeWidth() {
        return this.captionTextStrokeWidth;
    }

    public final Integer getExpansionDirection() {
        return this.expansionDirection;
    }

    public final String getInstructionTextColor() {
        return this.instructionTextColor;
    }

    public final Integer getInstructionTextSize() {
        return this.instructionTextSize;
    }

    public final String getInstructionTextStrokeColor() {
        return this.instructionTextStrokeColor;
    }

    public final Float getInstructionTextStrokeWidth() {
        return this.instructionTextStrokeWidth;
    }

    public final Boolean getShouldShowCaptionOff() {
        return this.shouldShowCaptionOff;
    }

    public final Boolean getShouldShowCaptionOn() {
        return this.shouldShowCaptionOn;
    }

    public final Boolean getShouldShowControlWhenCollapsed() {
        return this.shouldShowControlWhenCollapsed;
    }

    public final Boolean getShouldShowControlWhenExpanded() {
        return this.shouldShowControlWhenExpanded;
    }

    public final Boolean getShouldShowInstructionText() {
        return this.shouldShowInstructionText;
    }

    public final Integer getTextLabelAlignment() {
        return this.textLabelAlignment;
    }

    public final CaptionInsetInfo getTextLabelInsetInfo() {
        return this.textLabelInsetInfo;
    }

    public final Boolean getTooltipHideEnabled() {
        return this.tooltipHideEnabled;
    }

    public CaptionAppearance(String str, Float f, Integer num, CaptionInsetInfo captionInsetInfo, Integer num2, String str2, Float f2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, String str4, Float f3, String str5, Integer num4, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.bgColor = str;
        this.bgCornerRadius = f;
        this.textLabelAlignment = num;
        this.textLabelInsetInfo = captionInsetInfo;
        this.captionTextSize = num2;
        this.captionTextColor = str2;
        this.captionTextStrokeWidth = f2;
        this.captionTextStrokeColor = str3;
        this.shouldShowCaptionOn = bool;
        this.shouldShowCaptionOff = bool2;
        this.shouldShowInstructionText = bool3;
        this.instructionTextSize = num3;
        this.instructionTextColor = str4;
        this.instructionTextStrokeWidth = f3;
        this.instructionTextStrokeColor = str5;
        this.expansionDirection = num4;
        this.shouldShowControlWhenCollapsed = bool4;
        this.shouldShowControlWhenExpanded = bool5;
        this.tooltipHideEnabled = bool6;
    }
}
