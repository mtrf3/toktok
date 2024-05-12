package com.ss.android.ugc.aweme.sticker;

import X.HBK;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class StickerInfo implements Serializable {
    public static final HBK Companion = new HBK();
    public static final long serialVersionUID = 1;

    @InterfaceC65349Pkn("effect_intensity")
    public String effectIntensity;

    @InterfaceC65349Pkn("grade_key")
    public String gradeKey;

    @InterfaceC65349Pkn("is_default_prop")
    public String hasDefaultProp;

    @InterfaceC65349Pkn("prop_impr_position")
    public String imprPosition;

    @InterfaceC65349Pkn("is_audio_graph_output")
    public boolean isAudioGraphOutput;

    @InterfaceC65349Pkn("is_auto_use_prop")
    public Boolean isAutoUseProp;

    @InterfaceC65349Pkn("is_commerce_sticker")
    public boolean isCommerceSticker;

    @InterfaceC65349Pkn("is_effect_passed_moderation")
    public boolean isEffectPassedModeration;

    @InterfaceC65349Pkn("is_game_type_sticker")
    public boolean isGameTypeSticker;

    @InterfaceC65349Pkn("is_mobile_effect")
    public boolean isMobileEffect;

    @InterfaceC65349Pkn("is_music_beat")
    public boolean isMusicBeatSticker;

    @InterfaceC65349Pkn("is_original_sticker")
    public boolean isOriginalSticker;

    @InterfaceC65349Pkn("is_stackable_effect")
    public boolean isStackableEffect;

    @InterfaceC65349Pkn("is_text_type_sticker")
    public boolean isTextTypeSticker;

    @InterfaceC65349Pkn("prop_parent_id")
    public String mParentStickerId;

    @InterfaceC65349Pkn("mention_user")
    public String mentionUserInfo;

    @InterfaceC65349Pkn("mention_user_list")
    public List<String> mentionUserInfoList;
    public boolean needFilter;

    @InterfaceC65349Pkn("prop_search_params")
    public String propSearchParams;

    @InterfaceC65349Pkn("prop_source")
    public String propSource;

    @InterfaceC65349Pkn("prop_tab_id")
    public String propTabId;

    @InterfaceC65349Pkn("rec_id")
    public String recId;

    @InterfaceC65349Pkn("stackable_item_list")
    public String selectedEffectIds;

    @InterfaceC65349Pkn("source")
    public Integer source;

    @InterfaceC65349Pkn("prop_tab_order")
    public String tabOrder;

    @InterfaceC65349Pkn("tab_type")
    public String tabType;

    @InterfaceC65349Pkn("welfare_activity_id")
    public String welfareActivityId;

    public final String getGradeKey() {
        String str = this.gradeKey;
        if (str == null || str.length() == 0) {
            return "";
        }
        return this.gradeKey;
    }

    public final boolean hasImprPosition() {
        boolean z;
        String str = this.imprPosition;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean hasTabOrder() {
        boolean z;
        String str = this.tabOrder;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public StickerInfo() {
        this.needFilter = true;
        this.recId = CardStruct.IStatusCode.DEFAULT;
        this.effectIntensity = "";
        this.hasDefaultProp = "";
        this.isAutoUseProp = Boolean.FALSE;
        this.tabType = "";
        this.isEffectPassedModeration = true;
    }

    public final String getEffectIntensity() {
        return this.effectIntensity;
    }

    public final String getHasDefaultProp() {
        return this.hasDefaultProp;
    }

    public final String getImprPosition() {
        return this.imprPosition;
    }

    public final String getMParentStickerId() {
        return this.mParentStickerId;
    }

    public final String getMentionUserInfo() {
        return this.mentionUserInfo;
    }

    public final List<String> getMentionUserInfoList() {
        return this.mentionUserInfoList;
    }

    public final boolean getNeedFilter() {
        return this.needFilter;
    }

    public final String getPropSearchParams() {
        return this.propSearchParams;
    }

    public final String getPropSource() {
        return this.propSource;
    }

    public final String getPropTabId() {
        return this.propTabId;
    }

    public final String getRecId() {
        return this.recId;
    }

    public final String getSelectedEffectIds() {
        return this.selectedEffectIds;
    }

    public final Integer getSource() {
        return this.source;
    }

    public final String getTabOrder() {
        return this.tabOrder;
    }

    public final String getTabType() {
        return this.tabType;
    }

    public final String getWelfareActivityId() {
        return this.welfareActivityId;
    }

    public final boolean isAudioGraphOutput() {
        return this.isAudioGraphOutput;
    }

    public final Boolean isAutoUseProp() {
        return this.isAutoUseProp;
    }

    public final boolean isCommerceSticker() {
        return this.isCommerceSticker;
    }

    public final boolean isEffectPassedModeration() {
        return this.isEffectPassedModeration;
    }

    public final boolean isGameTypeSticker() {
        return this.isGameTypeSticker;
    }

    public final boolean isMobileEffect() {
        return this.isMobileEffect;
    }

    public final boolean isMusicBeatSticker() {
        return this.isMusicBeatSticker;
    }

    public final boolean isOriginalSticker() {
        return this.isOriginalSticker;
    }

    public final boolean isStackableEffect() {
        return this.isStackableEffect;
    }

    public final boolean isTextTypeSticker() {
        return this.isTextTypeSticker;
    }

    public final void setAudioGraphOutput(boolean z) {
        this.isAudioGraphOutput = z;
    }

    public final void setAutoUseProp(Boolean bool) {
        this.isAutoUseProp = bool;
    }

    public final void setCommerceSticker(boolean z) {
        this.isCommerceSticker = z;
    }

    public final void setEffectIntensity(String str) {
        this.effectIntensity = str;
    }

    public final void setEffectPassedModeration(boolean z) {
        this.isEffectPassedModeration = z;
    }

    public final void setGameTypeSticker(boolean z) {
        this.isGameTypeSticker = z;
    }

    public final void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public final void setHasDefaultProp(String str) {
        this.hasDefaultProp = str;
    }

    public final void setImprPosition(String str) {
        this.imprPosition = str;
    }

    public final void setMParentStickerId(String str) {
        this.mParentStickerId = str;
    }

    public final void setMentionUserInfo(String str) {
        this.mentionUserInfo = str;
    }

    public final void setMentionUserInfoList(List<String> list) {
        this.mentionUserInfoList = list;
    }

    public final void setMobileEffect(boolean z) {
        this.isMobileEffect = z;
    }

    public final void setMusicBeatSticker(boolean z) {
        this.isMusicBeatSticker = z;
    }

    public final void setNeedFilter(boolean z) {
        this.needFilter = z;
    }

    public final void setOriginalSticker(boolean z) {
        this.isOriginalSticker = z;
    }

    public final void setPropSearchParams(String str) {
        this.propSearchParams = str;
    }

    public final void setPropSource(String str) {
        this.propSource = str;
    }

    public final void setPropTabId(String str) {
        this.propTabId = str;
    }

    public final void setRecId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.recId = str;
    }

    public final void setSelectedEffectIds(String str) {
        this.selectedEffectIds = str;
    }

    public final void setSource(Integer num) {
        this.source = num;
    }

    public final void setStackableEffect(boolean z) {
        this.isStackableEffect = z;
    }

    public final void setTabOrder(String str) {
        this.tabOrder = str;
    }

    public final void setTabType(String str) {
        this.tabType = str;
    }

    public final void setTextTypeSticker(boolean z) {
        this.isTextTypeSticker = z;
    }

    public final void setWelfareActivityId(String str) {
        this.welfareActivityId = str;
    }

    public StickerInfo(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3) {
        this();
        this.propSource = str;
        this.gradeKey = str2;
        this.recId = str3 == null ? CardStruct.IStatusCode.DEFAULT : str3;
        this.isMobileEffect = z;
        this.isEffectPassedModeration = z3;
        this.isStackableEffect = z2;
        this.source = num;
    }

    public /* synthetic */ StickerInfo(String str, String str2, String str3, boolean z, boolean z2, Integer num, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? true : z3);
    }
}
