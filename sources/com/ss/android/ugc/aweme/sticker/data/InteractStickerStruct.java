package com.ss.android.ugc.aweme.sticker.data;

import X.InterfaceC137125Zs;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes3.dex */
public class InteractStickerStruct implements Serializable, InterfaceC137125Zs {

    @InterfaceC65349Pkn("add_yours_sticker")
    public AddYoursStickerStruct addYoursStickerStruct;
    public String attr;

    @InterfaceC65349Pkn("hashtag_info")
    public HashtagStruct hashtagInfo;
    public int index;

    @InterfaceC65349Pkn("auto_video_caption_info")
    public CaptionStruct mCaptionStruct;

    @InterfaceC65349Pkn("countdown_info")
    public CountDownStickerStruct mCountDownStickerStruct;

    @InterfaceC65349Pkn("question_info")
    public QaStruct mQaStruct;

    @InterfaceC65349Pkn("text_info")
    public String mTextStruct;

    @InterfaceC65349Pkn("material_index")
    public int materialIndex;

    @InterfaceC65349Pkn("mention_info")
    public MentionStruct mentionInfo;

    @InterfaceC65349Pkn("nature_classification_sticker_info")
    public NatureClassificationStickerStruct natureClassificationStickerStruct;

    @InterfaceC65349Pkn("is_non_global")
    public boolean noGlobal;

    @InterfaceC65349Pkn("poi_info")
    public PoiStickerStruct poiStickerStruct;

    @InterfaceC65349Pkn("vote_info")
    public PollStruct pollStruct;

    @InterfaceC65349Pkn("text_sticker_info")
    public TextStickerInfo textStickerInfo;

    @InterfaceC65349Pkn("track_info")
    public String trackList;
    public List<NormalTrackTimeStamp> trackTimeStampCache;
    public int type;

    @InterfaceC65349Pkn("video_share_info")
    public VideoShareInfoStruct videoShareInfoStruct;

    public int hashCode() {
        return this.index * 31;
    }

    public AddYoursStickerStruct getAddYoursStickerStruct() {
        return this.addYoursStickerStruct;
    }

    public String getAttr() {
        return this.attr;
    }

    public CaptionStruct getCaptionStruct() {
        return this.mCaptionStruct;
    }

    public CountDownStickerStruct getCountDownStickerStruct() {
        return this.mCountDownStickerStruct;
    }

    public HashtagStruct getHashtagInfo() {
        return this.hashtagInfo;
    }

    public int getIndex() {
        return this.index;
    }

    public int getMaterialIndex() {
        return this.materialIndex;
    }

    public MentionStruct getMentionInfo() {
        return this.mentionInfo;
    }

    public NatureClassificationStickerStruct getNatureClassificationStickerStruct() {
        return this.natureClassificationStickerStruct;
    }

    public boolean getNoGlobal() {
        return this.noGlobal;
    }

    public PoiStickerStruct getPoiStickerStruct() {
        return this.poiStickerStruct;
    }

    public PollStruct getPollStruct() {
        return this.pollStruct;
    }

    public QaStruct getQaStruct() {
        return this.mQaStruct;
    }

    public TextStickerInfo getTextInfo() {
        return this.textStickerInfo;
    }

    public String getTextStruct() {
        return this.mTextStruct;
    }

    public String getTrackList() {
        return this.trackList;
    }

    public List<NormalTrackTimeStamp> getTrackTimeStampCache() {
        return this.trackTimeStampCache;
    }

    public int getType() {
        return this.type;
    }

    public VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.videoShareInfoStruct;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
        if (this.type != interactStickerStruct.type || this.index != interactStickerStruct.index) {
            return false;
        }
        String str = this.trackList;
        if (str == null ? interactStickerStruct.trackList != null : !str.equals(interactStickerStruct.trackList)) {
            return false;
        }
        PollStruct pollStruct = this.pollStruct;
        if (pollStruct == null ? interactStickerStruct.pollStruct != null : !pollStruct.equals(interactStickerStruct.pollStruct)) {
            return false;
        }
        NatureClassificationStickerStruct natureClassificationStickerStruct = this.natureClassificationStickerStruct;
        if (natureClassificationStickerStruct == null ? interactStickerStruct.natureClassificationStickerStruct != null : !natureClassificationStickerStruct.equals(interactStickerStruct.natureClassificationStickerStruct)) {
            return false;
        }
        HashtagStruct hashtagStruct = this.hashtagInfo;
        if (hashtagStruct == null ? interactStickerStruct.hashtagInfo != null : !hashtagStruct.equals(interactStickerStruct.hashtagInfo)) {
            return false;
        }
        MentionStruct mentionStruct = this.mentionInfo;
        if (mentionStruct == null ? interactStickerStruct.mentionInfo != null : !mentionStruct.equals(interactStickerStruct.mentionInfo)) {
            return false;
        }
        String str2 = this.mTextStruct;
        if (str2 == null ? interactStickerStruct.mTextStruct != null : !str2.equals(interactStickerStruct.mTextStruct)) {
            return false;
        }
        CountDownStickerStruct countDownStickerStruct = this.mCountDownStickerStruct;
        if (countDownStickerStruct == null ? interactStickerStruct.mCountDownStickerStruct != null : !countDownStickerStruct.equals(interactStickerStruct.mCountDownStickerStruct)) {
            return false;
        }
        QaStruct qaStruct = this.mQaStruct;
        if (qaStruct == null ? interactStickerStruct.mQaStruct != null : !qaStruct.equals(interactStickerStruct.mQaStruct)) {
            return false;
        }
        VideoShareInfoStruct videoShareInfoStruct = this.videoShareInfoStruct;
        if (videoShareInfoStruct == null ? interactStickerStruct.videoShareInfoStruct != null : !videoShareInfoStruct.equals(interactStickerStruct.videoShareInfoStruct)) {
            return false;
        }
        TextStickerInfo textStickerInfo = this.textStickerInfo;
        if (textStickerInfo == null ? interactStickerStruct.textStickerInfo != null : !textStickerInfo.equals(interactStickerStruct.textStickerInfo)) {
            return false;
        }
        PoiStickerStruct poiStickerStruct = this.poiStickerStruct;
        if (poiStickerStruct == null ? interactStickerStruct.poiStickerStruct != null : !poiStickerStruct.equals(interactStickerStruct.poiStickerStruct)) {
            return false;
        }
        AddYoursStickerStruct addYoursStickerStruct = this.addYoursStickerStruct;
        if (addYoursStickerStruct == null ? interactStickerStruct.addYoursStickerStruct != null : !addYoursStickerStruct.equals(interactStickerStruct.addYoursStickerStruct)) {
            return false;
        }
        String str3 = this.attr;
        String str4 = interactStickerStruct.attr;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public void setAddYoursStickerStruct(AddYoursStickerStruct addYoursStickerStruct) {
        this.addYoursStickerStruct = addYoursStickerStruct;
    }

    public void setAttr(String str) {
        this.attr = str;
    }

    public void setCaptionStruct(CaptionStruct captionStruct) {
        this.mCaptionStruct = captionStruct;
    }

    public void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.mCountDownStickerStruct = countDownStickerStruct;
    }

    public void setHashtagInfo(HashtagStruct hashtagStruct) {
        this.hashtagInfo = hashtagStruct;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setMaterialIndex(int i) {
        this.materialIndex = i;
    }

    public void setMentionInfo(MentionStruct mentionStruct) {
        this.mentionInfo = mentionStruct;
    }

    public void setNatureClassificationStickerStruct(NatureClassificationStickerStruct natureClassificationStickerStruct) {
        this.natureClassificationStickerStruct = natureClassificationStickerStruct;
    }

    public void setNoGlobal(boolean z) {
        this.noGlobal = z;
    }

    public void setPoiStickerStruct(PoiStickerStruct poiStickerStruct) {
        this.poiStickerStruct = poiStickerStruct;
    }

    public void setPollStruct(PollStruct pollStruct) {
        this.pollStruct = pollStruct;
    }

    public void setQaStruct(QaStruct qaStruct) {
        this.mQaStruct = qaStruct;
    }

    public void setTextInfo(TextStickerInfo textStickerInfo) {
        this.textStickerInfo = textStickerInfo;
    }

    public void setTextStruct(String str) {
        this.mTextStruct = str;
    }

    public void setTrackList(String str) {
        this.trackList = str;
    }

    public void setTrackTimeStampCache(List<NormalTrackTimeStamp> list) {
        this.trackTimeStampCache = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVideoShareInfoStruct(VideoShareInfoStruct videoShareInfoStruct) {
        this.videoShareInfoStruct = videoShareInfoStruct;
    }
}
