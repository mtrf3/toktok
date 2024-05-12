package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UgcTemplateAlbumConfig {
    public AnchorCommonStruct anchor;
    public List<AnchorTransData> anchors;
    public List<? extends AVChallenge> challenges;
    public boolean isFromPUgc;
    public int musicEnd;
    public MusicModel musicModel;
    public String musicPath;
    public int musicRelativeStart;
    public UgcTemplateSlot musicSlot;
    public int musicStart;
    public String openPlatformExtra;
    public Integer reporterType;
    public int slotIndex;
    public String templateId;
    public String templateMD5;
    public String templateUrl;
    public String ugcTemplateTag;
    public CreativeInfo creativeInfo = new CreativeInfo(null, 0, null, 7, null);
    public String shootWay = "ugc_template";
    public final String enterFrom = "template_preview_page";
    public ArrayList<Float> clipDurations = new ArrayList<>();
    public ArrayList<UgcTemplateSlot> slotList = new ArrayList<>();

    public final AnchorCommonStruct getAnchor() {
        return this.anchor;
    }

    public final List<AnchorTransData> getAnchors() {
        return this.anchors;
    }

    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    public final ArrayList<Float> getClipDurations() {
        return this.clipDurations;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final int getMusicEnd() {
        return this.musicEnd;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getMusicRelativeStart() {
        return this.musicRelativeStart;
    }

    public final UgcTemplateSlot getMusicSlot() {
        return this.musicSlot;
    }

    public final int getMusicStart() {
        return this.musicStart;
    }

    public final String getOpenPlatformExtra() {
        return this.openPlatformExtra;
    }

    public final Integer getReporterType() {
        return this.reporterType;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final ArrayList<UgcTemplateSlot> getSlotList() {
        return this.slotList;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final String getTemplateMD5() {
        return this.templateMD5;
    }

    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    public final String getUgcTemplateTag() {
        return this.ugcTemplateTag;
    }

    public final boolean isFromPUgc() {
        return this.isFromPUgc;
    }

    public final void setAnchor(AnchorCommonStruct anchorCommonStruct) {
        this.anchor = anchorCommonStruct;
    }

    public final void setAnchors(List<AnchorTransData> list) {
        this.anchors = list;
    }

    public final void setChallenges(List<? extends AVChallenge> list) {
        this.challenges = list;
    }

    public final void setClipDurations(ArrayList<Float> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.clipDurations = arrayList;
    }

    public final void setCreativeInfo(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "<set-?>");
        this.creativeInfo = creativeInfo;
    }

    public final void setFromPUgc(boolean z) {
        this.isFromPUgc = z;
    }

    public final void setMusicEnd(int i) {
        this.musicEnd = i;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicRelativeStart(int i) {
        this.musicRelativeStart = i;
    }

    public final void setMusicSlot(UgcTemplateSlot ugcTemplateSlot) {
        this.musicSlot = ugcTemplateSlot;
    }

    public final void setMusicStart(int i) {
        this.musicStart = i;
    }

    public final void setOpenPlatformExtra(String str) {
        this.openPlatformExtra = str;
    }

    public final void setReporterType(Integer num) {
        this.reporterType = num;
    }

    public final void setShootWay(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.shootWay = str;
    }

    public final void setSlotIndex(int i) {
        this.slotIndex = i;
    }

    public final void setSlotList(ArrayList<UgcTemplateSlot> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.slotList = arrayList;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setTemplateMD5(String str) {
        this.templateMD5 = str;
    }

    public final void setTemplateUrl(String str) {
        this.templateUrl = str;
    }

    public final void setUgcTemplateTag(String str) {
        this.ugcTemplateTag = str;
    }
}
