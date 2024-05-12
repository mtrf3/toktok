package com.ss.android.ugc.aweme.services.external.ui;

import X.OSZ;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.common.AnchorTransData;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.common.ShareKitPanel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.model.CollectionInfoParcelableForShoot;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeDurationExtra;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class RecordConfig implements Serializable {
    public static final Companion Companion = new Companion();
    public AddYourRecordParam addYourRecordParam;
    public AnchorTransData autoSelectedAnchor;
    public List<AnchorTransData> autoSelectedAnchorList;
    public Boolean autoStartRecording;
    public String autoUseMusic;
    public String autoUseSticker;
    public String backUrl;
    public Integer cameraFacing;
    public Challenge challenge;
    public String challengeId;
    public List<? extends Challenge> challenges;
    public String clientId;
    public CommentVideoConfig commentVideoConfig;
    public String commerceData;
    public String creationId;
    public CreativeDurationExtra creativeDurationExtra;
    public Long decompressTime;
    public Integer defaultSubTabForUploadPage;
    public Integer defaultTab;
    public boolean doNotLoadMusic;
    public String donationId;
    public String duetModeType;
    public Integer duetVideoDuration;
    public String editEffectUID;
    public EffectConfig effectConfig;
    public Long effectDownloadDuration;
    public String enterFrom;
    public String enterMethod;
    public int enterTTEPPage;
    public HashMap<String, HashMap<String, String>> extraEventParams;
    public HashMap<String, String> extraLogParams;
    public Map<String, String> extraParams;
    public Effect firstSticker;
    public Boolean fromMain;
    public Boolean fromOtherPlatform;
    public Boolean fromSpecialPlus;
    public Boolean fromSystem;
    public String giphyGifIds;
    public OPSDK$GreenScreenKitConfig greenScreenKitConfig;
    public RecordPresetResource greenScreenKitPresetResource;
    public String groupId;
    public transient CreativeInitialModel initialModel;
    public String isFilterBusniessSticker;
    public Boolean isFormFlipShootIcon;
    public Boolean isInterceptBackground;
    public boolean isThroughAnchor;
    public Boolean keepChallenges;
    public boolean landingBack;
    public boolean landingIncludeDraft;
    public LibraryMaterialInfoSv libraryMaterialInfo;
    public LiveParams liveParams;
    public Long maxDuration;
    public OSZ<String, String> mentionUser;
    public MiniAppConfig miniAppConfig;
    public HashMap<String, String> missionConfig;
    public boolean musicDownloadComplete;
    public Long musicDownloadDuration;
    public Integer musicEnd;
    public String musicId;
    public MusicModel musicModel;
    public String musicOrigin;
    public String musicPath;
    public Integer musicStart;
    public String musicSticker;
    public Integer musicType;
    public Effect musicWithStickerEffect;
    public Effect mvSticker;
    public String mvStickerId;
    public boolean needAddRecentMusic;
    public boolean needLoadResourceAfterRecord;
    public boolean needMobShoot;
    public Boolean networkUnavailableMusic;
    public String openPlatformClientKey;
    public String openPlatformExtra;
    public Boolean permissionActivityRequired;
    public String postTrendsId;
    public String postTrendsType;
    public int preloadStringResource;
    public boolean prepareFilter;
    public Boolean presetSticker;
    public String previousPage;
    public String qaOrigin;
    public String qaOriginGroupId;
    public QaStructConfig qaStructConfig;
    public String questionCategory;
    public boolean recordFromFeed;
    public String recordParam;
    public RecordPresetResource recordPresetResource;
    public ReshootConfig reshootConfig;
    public int restoreType;
    public ReuseSoundAndEffectModel reuseSoundAndEffectModel;
    public String savedDraft;
    public SearchCreationExtraData searchExtraData;
    public CollectionInfoParcelableForShoot seriesCollectionInfo;
    public String shareId;
    public ShareKitPanel shareKitPanel;
    public BaseShareContext shareModel;
    public String sharedARHostId;
    public String sharedARSessionId;
    public ShootExtraData shootExtraData;
    public String shootFrom;
    public String shootway;
    public String shoutoutMode;
    public String shoutoutOrderID;
    public Boolean showCancelAfterPinProp;
    public Boolean showPreloadingDialog;
    public boolean showStickerPanel;
    public HashMap<String, String> starAtlasConfig;
    public Long startRecordTime;
    public String sticker;
    public Music stickerMusic;
    public String stickerWithMusicFilePath;
    public ArrayList<String> stickers;
    public StitchParams stitchParams;
    public Integer tabs;
    public Integer translationType;
    public Effect ttepPreviewEffect;
    public ArrayList<String> ttsVoiceIDs;
    public ArrayList<String> ttsVoiceRefIDs;
    public String ugcTemplateTag;
    public String unpublishedEffect;
    public Boolean uploadPageMultiSelect;
    public String vcVoiceEffectId;
    public String vcVoiceEffectName;
    public ArrayList<String> vcVoiceIDs;
    public ArrayList<String> vcVoiceRefIDs;
    public Long videoDownloadDuration;
    public Integer videoLength;
    public String voiceEffectId;
    public String voiceEffectName;

    public /* synthetic */ RecordConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getRestoreType$annotations() {
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        public RecordConfig config;

        public Builder() {
            this.config = new RecordConfig();
        }

        public final RecordConfig build() {
            return this.config;
        }

        public Builder(RecordConfig config) {
            o.LJIIIZ(config, "config");
            this.config = config;
        }

        public final Builder CommentVideoConfig(CommentVideoConfig commentVideoConfig) {
            o.LJIIIZ(commentVideoConfig, "commentVideoConfig");
            this.config.setCommentVideoConfig(commentVideoConfig);
            return this;
        }

        public final Builder addYoursStickerParam(AddYourRecordParam param) {
            o.LJIIIZ(param, "param");
            this.config.setAddYourRecordParam(param);
            return this;
        }

        public final Builder autoStartRecording(boolean z) {
            this.config.setAutoStartRecording(Boolean.valueOf(z));
            return this;
        }

        public final Builder autoUseMusic(String music) {
            o.LJIIIZ(music, "music");
            this.config.setAutoUseMusic(music);
            return this;
        }

        public final Builder autoUseSticker(String sticker) {
            o.LJIIIZ(sticker, "sticker");
            this.config.setAutoUseSticker(sticker);
            return this;
        }

        public final Builder backUrl(String str) {
            this.config.setBackUrl(str);
            return this;
        }

        public final Builder cameraFacing(int i) {
            this.config.setCameraFacing(Integer.valueOf(i));
            return this;
        }

        public final Builder challenge(Challenge challenge) {
            this.config.setChallenge(challenge);
            return this;
        }

        public final Builder challengeId(String str) {
            this.config.setChallengeId(str);
            return this;
        }

        public final Builder challenges(List<? extends Challenge> challenges) {
            o.LJIIIZ(challenges, "challenges");
            this.config.setChallenges(challenges);
            return this;
        }

        public final Builder clientId(String str) {
            this.config.setClientId(str);
            return this;
        }

        public final Builder commercialData(String str) {
            this.config.setCommerceData(str);
            return this;
        }

        public final Builder creationId(String str) {
            this.config.setCreationId(str);
            return this;
        }

        public final Builder creativeDurationExtra(CreativeDurationExtra data) {
            o.LJIIIZ(data, "data");
            this.config.setCreativeDurationExtra(data);
            return this;
        }

        public final Builder decompressTime(long j) {
            this.config.setDecompressTime(Long.valueOf(j));
            return this;
        }

        public final Builder defaultTab(int i) {
            this.config.setDefaultTab(Integer.valueOf(i));
            return this;
        }

        public final Builder doNotLoadMusic(boolean z) {
            this.config.setDoNotLoadMusic(z);
            return this;
        }

        public final Builder donationId(String str) {
            this.config.setDonationId(str);
            return this;
        }

        public final Builder duetModeType(String duetModeType) {
            o.LJIIIZ(duetModeType, "duetModeType");
            this.config.setDuetModeType(duetModeType);
            return this;
        }

        public final Builder editEffectUID(String id) {
            o.LJIIIZ(id, "id");
            this.config.setEditEffectUID(id);
            return this;
        }

        public final Builder effectConfig(EffectConfig effectConfig) {
            o.LJIIIZ(effectConfig, "effectConfig");
            this.config.setEffectConfig(effectConfig);
            return this;
        }

        public final Builder effectDownloadDuration(long j) {
            this.config.setEffectDownloadDuration(Long.valueOf(j));
            return this;
        }

        public final Builder enterFrom(String str) {
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder enterMethod(String str) {
            this.config.setEnterMethod(str);
            return this;
        }

        public final Builder extraEventParams(HashMap<String, HashMap<String, String>> params) {
            o.LJIIIZ(params, "params");
            this.config.setExtraEventParams(params);
            return this;
        }

        public final Builder extraLogParams(HashMap<String, String> hashMap) {
            this.config.setExtraLogParams(hashMap);
            return this;
        }

        public final Builder filterBuinessSticker(String str) {
            this.config.setFilterBusniessSticker(str);
            return this;
        }

        public final Builder firstSticker(Effect firstSticker) {
            o.LJIIIZ(firstSticker, "firstSticker");
            this.config.setFirstSticker(firstSticker);
            return this;
        }

        public final Builder fromDuetVideoDuration(Integer num) {
            RecordConfig recordConfig = this.config;
            if (num == null) {
                num = 0;
            }
            recordConfig.setDuetVideoDuration(num);
            return this;
        }

        public final Builder fromMain(boolean z) {
            this.config.setFromMain(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromOtherPlatform(boolean z) {
            this.config.setFromOtherPlatform(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromSpecialPlus(boolean z) {
            this.config.setFromSpecialPlus(Boolean.valueOf(z));
            return this;
        }

        public final Builder fromSystem(Boolean bool) {
            this.config.setFromSystem(bool);
            return this;
        }

        public final Builder giphyGifIds(String gifIds) {
            o.LJIIIZ(gifIds, "gifIds");
            this.config.setGiphyGifIds(gifIds);
            return this;
        }

        public final Builder groupId(String str) {
            this.config.setGroupId(str);
            return this;
        }

        public final Builder initialInputModel(CreativeInitialModel creativeInitialModel) {
            this.config.setInitialModel(creativeInitialModel);
            return this;
        }

        public final Builder interceptBackground(boolean z) {
            this.config.setInterceptBackground(Boolean.valueOf(z));
            return this;
        }

        public final Builder isFormFlipShootIcon(boolean z) {
            this.config.setFormFlipShootIcon(Boolean.valueOf(z));
            return this;
        }

        public final Builder isThroughAnchor(boolean z) {
            this.config.setThroughAnchor(z);
            return this;
        }

        public final Builder keepChallenge(boolean z) {
            this.config.setKeepChallenges(Boolean.valueOf(z));
            return this;
        }

        public final Builder landingBack(boolean z) {
            this.config.setLandingBack(z);
            return this;
        }

        public final Builder landingIncludeDraft(boolean z) {
            this.config.setLandingIncludeDraft(z);
            return this;
        }

        public final Builder libraryMaterialInfo(LibraryMaterialInfoSv libraryMaterialInfo) {
            o.LJIIIZ(libraryMaterialInfo, "libraryMaterialInfo");
            this.config.setLibraryMaterialInfo(libraryMaterialInfo);
            return this;
        }

        public final Builder liveParams(LiveParams liveParams) {
            this.config.setLiveParams(liveParams);
            return this;
        }

        public final Builder maxDuration(Long l) {
            this.config.setMaxDuration(l);
            return this;
        }

        public final Builder miniAppConfig(MiniAppConfig miniAppConfig) {
            o.LJIIIZ(miniAppConfig, "miniAppConfig");
            this.config.setMiniAppConfig(miniAppConfig);
            return this;
        }

        public final Builder missionConfig(HashMap<String, String> hashMap) {
            this.config.setMissionConfig(hashMap);
            return this;
        }

        public final Builder musicDownloadComplete(boolean z) {
            this.config.setMusicDownloadComplete(z);
            return this;
        }

        public final Builder musicDownloadDuration(long j) {
            this.config.setMusicDownloadDuration(Long.valueOf(j));
            return this;
        }

        public final Builder musicEnd(Integer num) {
            this.config.setMusicEnd(num);
            return this;
        }

        public final Builder musicId(String str) {
            this.config.setMusicId(str);
            return this;
        }

        public final Builder musicModel(MusicModel musicModel) {
            this.config.setMusicModel(musicModel);
            return this;
        }

        public final Builder musicOrigin(String musicOrigin) {
            o.LJIIIZ(musicOrigin, "musicOrigin");
            this.config.setMusicOrigin(musicOrigin);
            return this;
        }

        public final Builder musicPath(String musicPath) {
            o.LJIIIZ(musicPath, "musicPath");
            this.config.setMusicPath(musicPath);
            return this;
        }

        public final Builder musicStart(Integer num) {
            this.config.setMusicStart(num);
            return this;
        }

        public final Builder musicSticker(String stickerId) {
            o.LJIIIZ(stickerId, "stickerId");
            this.config.setMusicSticker(stickerId);
            return this;
        }

        public final Builder musicType(int i) {
            this.config.setMusicType(Integer.valueOf(i));
            return this;
        }

        public final Builder musicWithSticker(Effect effect) {
            this.config.setMusicWithStickerEffect(effect);
            return this;
        }

        public final Builder mvSticker(Effect mvSticker) {
            o.LJIIIZ(mvSticker, "mvSticker");
            this.config.setMvSticker(mvSticker);
            return this;
        }

        public final Builder mvStickerId(String str) {
            this.config.setMvStickerId(str);
            return this;
        }

        public final Builder needAddRecentMusic(boolean z) {
            this.config.setNeedAddRecentMusic(z);
            return this;
        }

        public final Builder needLoadResourceAfterRecord(boolean z) {
            this.config.setNeedLoadResourceAfterRecord(z);
            return this;
        }

        public final Builder needMobShoot(boolean z) {
            this.config.setNeedMobShoot(z);
            return this;
        }

        public final Builder permissionActivityRequired(boolean z) {
            this.config.setPermissionActivityRequired(Boolean.valueOf(z));
            return this;
        }

        public final Builder postTrendsId(String id) {
            o.LJIIIZ(id, "id");
            this.config.setPostTrendsId(id);
            return this;
        }

        public final Builder postTrendsType(String type) {
            o.LJIIIZ(type, "type");
            this.config.setPostTrendsType(type);
            return this;
        }

        public final Builder preloadingDialogMsg(int i) {
            this.config.setPreloadStringResource(i);
            return this;
        }

        public final Builder prepareFilter(boolean z) {
            this.config.setPrepareFilter(z);
            return this;
        }

        public final Builder previousPage(String str) {
            this.config.setPreviousPage(str);
            return this;
        }

        public final Builder qaOrigin(String str) {
            this.config.setQaOrigin(str);
            return this;
        }

        public final Builder qaOriginGroupId(String str) {
            this.config.setQaOriginGroupId(str);
            return this;
        }

        public final Builder qaVideoConfig(QaStructConfig qaStructConfig) {
            o.LJIIIZ(qaStructConfig, "qaStructConfig");
            this.config.setQaStructConfig(qaStructConfig);
            return this;
        }

        public final Builder questionCategory(String str) {
            this.config.setQuestionCategory(str);
            return this;
        }

        public final Builder recordFromFeed(boolean z) {
            this.config.setRecordFromFeed(z);
            return this;
        }

        public final Builder recordParam(String str) {
            this.config.setRecordParam(str);
            return this;
        }

        public final Builder recordPresetResource(RecordPresetResource recordPresetResource) {
            o.LJIIIZ(recordPresetResource, "recordPresetResource");
            this.config.setRecordPresetResource(recordPresetResource);
            return this;
        }

        public final Builder reshootConfig(ReshootConfig reshootConfig) {
            o.LJIIIZ(reshootConfig, "reshootConfig");
            this.config.setReshootConfig(reshootConfig);
            return this;
        }

        public final Builder restoreType(int i) {
            this.config.setRestoreType(i);
            return this;
        }

        public final Builder reuseSoundAndEffectModel(ReuseSoundAndEffectModel reuseSoundAndEffectModel) {
            o.LJIIIZ(reuseSoundAndEffectModel, "reuseSoundAndEffectModel");
            this.config.setReuseSoundAndEffectModel(reuseSoundAndEffectModel);
            return this;
        }

        public final Builder savedDraft(String draftId) {
            o.LJIIIZ(draftId, "draftId");
            this.config.setSavedDraft(draftId);
            return this;
        }

        public final Builder searchCreationExtra(SearchCreationExtraData data) {
            o.LJIIIZ(data, "data");
            this.config.setSearchExtraData(data);
            return this;
        }

        public final Builder seriesCollectionInfo(CollectionInfoParcelableForShoot info) {
            o.LJIIIZ(info, "info");
            this.config.setSeriesCollectionInfo(info);
            return this;
        }

        public final Builder setAutoSelectedAnchor(AnchorTransData anchorTransData) {
            this.config.setAutoSelectedAnchor(anchorTransData);
            return this;
        }

        public final Builder setAutoSelectedAnchorList(List<AnchorTransData> list) {
            this.config.setAutoSelectedAnchorList(list);
            return this;
        }

        public final Builder setEnterTTEPPageMode(int i) {
            this.config.setEnterTTEPPage(i);
            return this;
        }

        public final Builder setGreenScreenKitConfig(OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig) {
            this.config.setGreenScreenKitConfig(oPSDK$GreenScreenKitConfig);
            return this;
        }

        public final Builder setGreenScreenKitPresetResource(RecordPresetResource resource) {
            o.LJIIIZ(resource, "resource");
            this.config.setGreenScreenKitPresetResource(resource);
            return this;
        }

        public final Builder setOpenPlatformClientKey(String str) {
            this.config.setOpenPlatformClientKey(str);
            return this;
        }

        public final Builder setOpenPlatformExtra(String str) {
            this.config.setOpenPlatformExtra(str);
            return this;
        }

        public final Builder setTTEPPreviewEffect(Effect ttepPreviewEffect) {
            o.LJIIIZ(ttepPreviewEffect, "ttepPreviewEffect");
            this.config.setTtepPreviewEffect(ttepPreviewEffect);
            return this;
        }

        public final Builder shareId(String str) {
            this.config.setShareId(str);
            return this;
        }

        public final Builder shareKitPanel(ShareKitPanel shareKitPanel) {
            this.config.setShareKitPanel(shareKitPanel);
            return this;
        }

        public final Builder shareModel(BaseShareContext baseShareContext) {
            this.config.setShareModel(baseShareContext);
            return this;
        }

        public final Builder sharedARHostId(String str) {
            this.config.setSharedARHostId(str);
            return this;
        }

        public final Builder sharedARSessionId(String str) {
            this.config.setSharedARSessionId(str);
            return this;
        }

        public final Builder shootExtraData(ShootExtraData data) {
            o.LJIIIZ(data, "data");
            this.config.setShootExtraData(data);
            return this;
        }

        public final Builder shootFrom(String str) {
            this.config.setShootFrom(str);
            return this;
        }

        public final Builder shootWay(String str) {
            this.config.setShootway(str);
            return this;
        }

        public final Builder shoutoutMode(String str) {
            this.config.setShoutoutMode(str);
            return this;
        }

        public final Builder shoutoutOrderID(String str) {
            this.config.setShoutoutOrderID(str);
            return this;
        }

        public final Builder showCancelAfterPinProp(boolean z) {
            this.config.setShowCancelAfterPinProp(Boolean.valueOf(z));
            return this;
        }

        public final Builder showPreloadingDialog(boolean z) {
            this.config.setShowPreloadingDialog(Boolean.valueOf(z));
            return this;
        }

        public final Builder showStickerPanel(boolean z) {
            this.config.setShowStickerPanel(z);
            return this;
        }

        public final Builder starAtlasConfig(HashMap<String, String> hashMap) {
            this.config.setStarAtlasConfig(hashMap);
            return this;
        }

        public final Builder startRecordTime(long j) {
            this.config.setStartRecordTime(Long.valueOf(j));
            return this;
        }

        public final Builder sticker(String str) {
            this.config.setSticker(str);
            return this;
        }

        public final Builder stickerMusic(Music music) {
            this.config.setStickerMusic(music);
            return this;
        }

        public final Builder stickerParams(Map<String, String> map) {
            this.config.setExtraParams(map);
            return this;
        }

        public final Builder stickerWithMusicFilePath(String str) {
            this.config.setStickerWithMusicFilePath(str);
            return this;
        }

        public final Builder stickers(ArrayList<String> stickers) {
            o.LJIIIZ(stickers, "stickers");
            this.config.setStickers(stickers);
            return this;
        }

        public final Builder stitchParams(StitchParams stitchParams) {
            o.LJIIIZ(stitchParams, "stitchParams");
            this.config.setStitchParams(stitchParams);
            return this;
        }

        public final Builder tabs(String str) {
            if (str != null) {
                try {
                    this.config.setTabs(Integer.valueOf(CastIntegerProtector.parseInt(str)));
                } catch (Exception unused) {
                }
            }
            return this;
        }

        public final Builder targetSubtabForUploadPage(int i) {
            this.config.setDefaultSubTabForUploadPage(Integer.valueOf(i));
            return this;
        }

        public final Builder translationType(int i) {
            this.config.setTranslationType(Integer.valueOf(i));
            return this;
        }

        public final Builder ttsVoiceIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setTtsVoiceIDs(arrayList);
            return this;
        }

        public final Builder ttsVoiceRefIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setTtsVoiceRefIDs(arrayList);
            return this;
        }

        public final Builder ugcTemplateTag(String tag) {
            o.LJIIIZ(tag, "tag");
            this.config.setUgcTemplateTag(tag);
            return this;
        }

        public final Builder unavailableNetworkMusic(boolean z) {
            this.config.setNetworkUnavailableMusic(Boolean.valueOf(z));
            return this;
        }

        public final Builder unpublishedEffect(String effectId) {
            o.LJIIIZ(effectId, "effectId");
            this.config.setUnpublishedEffect(effectId);
            return this;
        }

        public final Builder uploadPageMultiSelect(boolean z) {
            this.config.setUploadPageMultiSelect(Boolean.valueOf(z));
            return this;
        }

        public final Builder usePresetSticker(Boolean bool) {
            this.config.setPresetSticker(bool);
            return this;
        }

        public final Builder vcVoiceEffectId(String id) {
            o.LJIIIZ(id, "id");
            this.config.setVcVoiceEffectId(id);
            return this;
        }

        public final Builder vcVoiceEffectName(String name) {
            o.LJIIIZ(name, "name");
            this.config.setVcVoiceEffectName(name);
            return this;
        }

        public final Builder vcVoiceIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setVcVoiceIDs(arrayList);
            return this;
        }

        public final Builder vcVoiceRefIDs(List<String> list) {
            ArrayList<String> arrayList;
            RecordConfig recordConfig = this.config;
            if (list != null) {
                arrayList = new ArrayList<>(list);
            } else {
                arrayList = null;
            }
            recordConfig.setVcVoiceRefIDs(arrayList);
            return this;
        }

        public final Builder videoDownloadDuration(long j) {
            this.config.setVideoDownloadDuration(Long.valueOf(j));
            return this;
        }

        public final Builder videoLength(Integer num) {
            RecordConfig recordConfig = this.config;
            if (num == null) {
                num = 0;
            }
            recordConfig.setVideoLength(num);
            return this;
        }

        public final Builder voiceEffectId(String id) {
            o.LJIIIZ(id, "id");
            this.config.setVoiceEffectId(id);
            return this;
        }

        public final Builder voiceEffectName(String name) {
            o.LJIIIZ(name, "name");
            this.config.setVoiceEffectName(name);
            return this;
        }

        public final Builder mentionUser(String userId, String userName) {
            o.LJIIIZ(userId, "userId");
            o.LJIIIZ(userName, "userName");
            this.config.setMentionUser(new OSZ<>(userId, userName));
            return this;
        }
    }

    public RecordConfig() {
        Boolean bool = Boolean.FALSE;
        this.keepChallenges = bool;
        this.networkUnavailableMusic = bool;
        this.translationType = 0;
        this.permissionActivityRequired = bool;
        this.prepareFilter = true;
        this.defaultTab = 0;
        this.defaultSubTabForUploadPage = -1;
        this.uploadPageMultiSelect = bool;
        this.musicType = 0;
        this.tabs = 0;
        this.reshootConfig = new ReshootConfig(false, null);
        this.videoLength = 0;
        this.duetVideoDuration = 0;
        this.openPlatformClientKey = "";
        this.openPlatformExtra = "";
        this.duetModeType = "";
        this.extraEventParams = new HashMap<>();
        this.postTrendsId = "";
        this.postTrendsType = CardStruct.IStatusCode.DEFAULT;
        this.ugcTemplateTag = "ugc_template_tag_default";
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final AddYourRecordParam getAddYourRecordParam() {
        return this.addYourRecordParam;
    }

    public final AnchorTransData getAutoSelectedAnchor() {
        return this.autoSelectedAnchor;
    }

    public final List<AnchorTransData> getAutoSelectedAnchorList() {
        return this.autoSelectedAnchorList;
    }

    public final Boolean getAutoStartRecording() {
        return this.autoStartRecording;
    }

    public final String getAutoUseMusic() {
        return this.autoUseMusic;
    }

    public final String getAutoUseSticker() {
        return this.autoUseSticker;
    }

    public final String getBackUrl() {
        return this.backUrl;
    }

    public final Integer getCameraFacing() {
        return this.cameraFacing;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final List<Challenge> getChallenges() {
        return this.challenges;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final CommentVideoConfig getCommentVideoConfig() {
        return this.commentVideoConfig;
    }

    public final String getCommerceData() {
        return this.commerceData;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final CreativeDurationExtra getCreativeDurationExtra() {
        return this.creativeDurationExtra;
    }

    public final Long getDecompressTime() {
        return this.decompressTime;
    }

    public final Integer getDefaultSubTabForUploadPage() {
        return this.defaultSubTabForUploadPage;
    }

    public final Integer getDefaultTab() {
        return this.defaultTab;
    }

    public final boolean getDoNotLoadMusic() {
        return this.doNotLoadMusic;
    }

    public final String getDonationId() {
        return this.donationId;
    }

    public final String getDuetModeType() {
        return this.duetModeType;
    }

    public final Integer getDuetVideoDuration() {
        return this.duetVideoDuration;
    }

    public final String getEditEffectUID() {
        return this.editEffectUID;
    }

    public final EffectConfig getEffectConfig() {
        return this.effectConfig;
    }

    public final Long getEffectDownloadDuration() {
        return this.effectDownloadDuration;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final int getEnterTTEPPage() {
        return this.enterTTEPPage;
    }

    public final HashMap<String, HashMap<String, String>> getExtraEventParams() {
        return this.extraEventParams;
    }

    public final HashMap<String, String> getExtraLogParams() {
        return this.extraLogParams;
    }

    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public final Effect getFirstSticker() {
        return this.firstSticker;
    }

    public final Boolean getFromMain() {
        return this.fromMain;
    }

    public final Boolean getFromOtherPlatform() {
        return this.fromOtherPlatform;
    }

    public final Boolean getFromSpecialPlus() {
        return this.fromSpecialPlus;
    }

    public final Boolean getFromSystem() {
        return this.fromSystem;
    }

    public final String getGiphyGifIds() {
        return this.giphyGifIds;
    }

    public final OPSDK$GreenScreenKitConfig getGreenScreenKitConfig() {
        return this.greenScreenKitConfig;
    }

    public final RecordPresetResource getGreenScreenKitPresetResource() {
        return this.greenScreenKitPresetResource;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final CreativeInitialModel getInitialModel() {
        return this.initialModel;
    }

    public final Boolean getKeepChallenges() {
        return this.keepChallenges;
    }

    public final boolean getLandingBack() {
        return this.landingBack;
    }

    public final boolean getLandingIncludeDraft() {
        return this.landingIncludeDraft;
    }

    public final LibraryMaterialInfoSv getLibraryMaterialInfo() {
        return this.libraryMaterialInfo;
    }

    public final LiveParams getLiveParams() {
        return this.liveParams;
    }

    public final Long getMaxDuration() {
        return this.maxDuration;
    }

    public final OSZ<String, String> getMentionUser() {
        return this.mentionUser;
    }

    public final MiniAppConfig getMiniAppConfig() {
        return this.miniAppConfig;
    }

    public final HashMap<String, String> getMissionConfig() {
        return this.missionConfig;
    }

    public final boolean getMusicDownloadComplete() {
        return this.musicDownloadComplete;
    }

    public final Long getMusicDownloadDuration() {
        return this.musicDownloadDuration;
    }

    public final Integer getMusicEnd() {
        return this.musicEnd;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final Integer getMusicStart() {
        return this.musicStart;
    }

    public final String getMusicSticker() {
        return this.musicSticker;
    }

    public final Integer getMusicType() {
        return this.musicType;
    }

    public final Effect getMusicWithStickerEffect() {
        return this.musicWithStickerEffect;
    }

    public final Effect getMvSticker() {
        return this.mvSticker;
    }

    public final String getMvStickerId() {
        return this.mvStickerId;
    }

    public final boolean getNeedAddRecentMusic() {
        return this.needAddRecentMusic;
    }

    public final boolean getNeedLoadResourceAfterRecord() {
        return this.needLoadResourceAfterRecord;
    }

    public final boolean getNeedMobShoot() {
        return this.needMobShoot;
    }

    public final Boolean getNetworkUnavailableMusic() {
        return this.networkUnavailableMusic;
    }

    public final String getOpenPlatformClientKey() {
        return this.openPlatformClientKey;
    }

    public final String getOpenPlatformExtra() {
        return this.openPlatformExtra;
    }

    public final Boolean getPermissionActivityRequired() {
        return this.permissionActivityRequired;
    }

    public final String getPostTrendsId() {
        return this.postTrendsId;
    }

    public final String getPostTrendsType() {
        return this.postTrendsType;
    }

    public final int getPreloadStringResource() {
        return this.preloadStringResource;
    }

    public final boolean getPrepareFilter() {
        return this.prepareFilter;
    }

    public final Boolean getPresetSticker() {
        return this.presetSticker;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getQaOrigin() {
        return this.qaOrigin;
    }

    public final String getQaOriginGroupId() {
        return this.qaOriginGroupId;
    }

    public final QaStructConfig getQaStructConfig() {
        return this.qaStructConfig;
    }

    public final String getQuestionCategory() {
        return this.questionCategory;
    }

    public final boolean getRecordFromFeed() {
        return this.recordFromFeed;
    }

    public final String getRecordParam() {
        return this.recordParam;
    }

    public final RecordPresetResource getRecordPresetResource() {
        return this.recordPresetResource;
    }

    public final ReshootConfig getReshootConfig() {
        return this.reshootConfig;
    }

    public final int getRestoreType() {
        return this.restoreType;
    }

    public final ReuseSoundAndEffectModel getReuseSoundAndEffectModel() {
        return this.reuseSoundAndEffectModel;
    }

    public final String getSavedDraft() {
        return this.savedDraft;
    }

    public final SearchCreationExtraData getSearchExtraData() {
        return this.searchExtraData;
    }

    public final CollectionInfoParcelableForShoot getSeriesCollectionInfo() {
        return this.seriesCollectionInfo;
    }

    public final String getShareId() {
        return this.shareId;
    }

    public final ShareKitPanel getShareKitPanel() {
        return this.shareKitPanel;
    }

    public final BaseShareContext getShareModel() {
        return this.shareModel;
    }

    public final String getSharedARHostId() {
        return this.sharedARHostId;
    }

    public final String getSharedARSessionId() {
        return this.sharedARSessionId;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getShootFrom() {
        return this.shootFrom;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final String getShoutoutMode() {
        return this.shoutoutMode;
    }

    public final String getShoutoutOrderID() {
        return this.shoutoutOrderID;
    }

    public final Boolean getShowCancelAfterPinProp() {
        return this.showCancelAfterPinProp;
    }

    public final Boolean getShowPreloadingDialog() {
        return this.showPreloadingDialog;
    }

    public final boolean getShowStickerPanel() {
        return this.showStickerPanel;
    }

    public final HashMap<String, String> getStarAtlasConfig() {
        return this.starAtlasConfig;
    }

    public final Long getStartRecordTime() {
        return this.startRecordTime;
    }

    public final String getSticker() {
        return this.sticker;
    }

    public final Music getStickerMusic() {
        return this.stickerMusic;
    }

    public final String getStickerWithMusicFilePath() {
        return this.stickerWithMusicFilePath;
    }

    public final ArrayList<String> getStickers() {
        return this.stickers;
    }

    public final StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public final Integer getTabs() {
        return this.tabs;
    }

    public final Integer getTranslationType() {
        return this.translationType;
    }

    public final Effect getTtepPreviewEffect() {
        return this.ttepPreviewEffect;
    }

    public final ArrayList<String> getTtsVoiceIDs() {
        return this.ttsVoiceIDs;
    }

    public final ArrayList<String> getTtsVoiceRefIDs() {
        return this.ttsVoiceRefIDs;
    }

    public final String getUgcTemplateTag() {
        return this.ugcTemplateTag;
    }

    public final String getUnpublishedEffect() {
        return this.unpublishedEffect;
    }

    public final Boolean getUploadPageMultiSelect() {
        return this.uploadPageMultiSelect;
    }

    public final String getVcVoiceEffectId() {
        return this.vcVoiceEffectId;
    }

    public final String getVcVoiceEffectName() {
        return this.vcVoiceEffectName;
    }

    public final ArrayList<String> getVcVoiceIDs() {
        return this.vcVoiceIDs;
    }

    public final ArrayList<String> getVcVoiceRefIDs() {
        return this.vcVoiceRefIDs;
    }

    public final Long getVideoDownloadDuration() {
        return this.videoDownloadDuration;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final String getVoiceEffectId() {
        return this.voiceEffectId;
    }

    public final String getVoiceEffectName() {
        return this.voiceEffectName;
    }

    public final String isFilterBusniessSticker() {
        return this.isFilterBusniessSticker;
    }

    public final Boolean isFormFlipShootIcon() {
        return this.isFormFlipShootIcon;
    }

    public final Boolean isInterceptBackground() {
        return this.isInterceptBackground;
    }

    public final boolean isThroughAnchor() {
        return this.isThroughAnchor;
    }

    public final void setAddYourRecordParam(AddYourRecordParam addYourRecordParam) {
        this.addYourRecordParam = addYourRecordParam;
    }

    public final void setAutoSelectedAnchor(AnchorTransData anchorTransData) {
        this.autoSelectedAnchor = anchorTransData;
    }

    public final void setAutoSelectedAnchorList(List<AnchorTransData> list) {
        this.autoSelectedAnchorList = list;
    }

    public final void setAutoStartRecording(Boolean bool) {
        this.autoStartRecording = bool;
    }

    public final void setAutoUseMusic(String str) {
        this.autoUseMusic = str;
    }

    public final void setAutoUseSticker(String str) {
        this.autoUseSticker = str;
    }

    public final void setBackUrl(String str) {
        this.backUrl = str;
    }

    public final void setCameraFacing(Integer num) {
        this.cameraFacing = num;
    }

    public final void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setChallenges(List<? extends Challenge> list) {
        this.challenges = list;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setCommentVideoConfig(CommentVideoConfig commentVideoConfig) {
        this.commentVideoConfig = commentVideoConfig;
    }

    public final void setCommerceData(String str) {
        this.commerceData = str;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setCreativeDurationExtra(CreativeDurationExtra creativeDurationExtra) {
        this.creativeDurationExtra = creativeDurationExtra;
    }

    public final void setDecompressTime(Long l) {
        this.decompressTime = l;
    }

    public final void setDefaultSubTabForUploadPage(Integer num) {
        this.defaultSubTabForUploadPage = num;
    }

    public final void setDefaultTab(Integer num) {
        this.defaultTab = num;
    }

    public final void setDoNotLoadMusic(boolean z) {
        this.doNotLoadMusic = z;
    }

    public final void setDonationId(String str) {
        this.donationId = str;
    }

    public final void setDuetModeType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.duetModeType = str;
    }

    public final void setDuetVideoDuration(Integer num) {
        this.duetVideoDuration = num;
    }

    public final void setEditEffectUID(String str) {
        this.editEffectUID = str;
    }

    public final void setEffectConfig(EffectConfig effectConfig) {
        this.effectConfig = effectConfig;
    }

    public final void setEffectDownloadDuration(Long l) {
        this.effectDownloadDuration = l;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterTTEPPage(int i) {
        this.enterTTEPPage = i;
    }

    public final void setExtraEventParams(HashMap<String, HashMap<String, String>> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.extraEventParams = hashMap;
    }

    public final void setExtraLogParams(HashMap<String, String> hashMap) {
        this.extraLogParams = hashMap;
    }

    public final void setExtraParams(Map<String, String> map) {
        this.extraParams = map;
    }

    public final void setFilterBusniessSticker(String str) {
        this.isFilterBusniessSticker = str;
    }

    public final void setFirstSticker(Effect effect) {
        this.firstSticker = effect;
    }

    public final void setFormFlipShootIcon(Boolean bool) {
        this.isFormFlipShootIcon = bool;
    }

    public final void setFromMain(Boolean bool) {
        this.fromMain = bool;
    }

    public final void setFromOtherPlatform(Boolean bool) {
        this.fromOtherPlatform = bool;
    }

    public final void setFromSpecialPlus(Boolean bool) {
        this.fromSpecialPlus = bool;
    }

    public final void setFromSystem(Boolean bool) {
        this.fromSystem = bool;
    }

    public final void setGiphyGifIds(String str) {
        this.giphyGifIds = str;
    }

    public final void setGreenScreenKitConfig(OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig) {
        this.greenScreenKitConfig = oPSDK$GreenScreenKitConfig;
    }

    public final void setGreenScreenKitPresetResource(RecordPresetResource recordPresetResource) {
        this.greenScreenKitPresetResource = recordPresetResource;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setInitialModel(CreativeInitialModel creativeInitialModel) {
        this.initialModel = creativeInitialModel;
    }

    public final void setInterceptBackground(Boolean bool) {
        this.isInterceptBackground = bool;
    }

    public final void setKeepChallenges(Boolean bool) {
        this.keepChallenges = bool;
    }

    public final void setLandingBack(boolean z) {
        this.landingBack = z;
    }

    public final void setLandingIncludeDraft(boolean z) {
        this.landingIncludeDraft = z;
    }

    public final void setLibraryMaterialInfo(LibraryMaterialInfoSv libraryMaterialInfoSv) {
        this.libraryMaterialInfo = libraryMaterialInfoSv;
    }

    public final void setLiveParams(LiveParams liveParams) {
        this.liveParams = liveParams;
    }

    public final void setMaxDuration(Long l) {
        this.maxDuration = l;
    }

    public final void setMentionUser(OSZ<String, String> osz) {
        this.mentionUser = osz;
    }

    public final void setMiniAppConfig(MiniAppConfig miniAppConfig) {
        this.miniAppConfig = miniAppConfig;
    }

    public final void setMissionConfig(HashMap<String, String> hashMap) {
        this.missionConfig = hashMap;
    }

    public final void setMusicDownloadComplete(boolean z) {
        this.musicDownloadComplete = z;
    }

    public final void setMusicDownloadDuration(Long l) {
        this.musicDownloadDuration = l;
    }

    public final void setMusicEnd(Integer num) {
        this.musicEnd = num;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicModel(MusicModel musicModel) {
        this.musicModel = musicModel;
    }

    public final void setMusicOrigin(String str) {
        this.musicOrigin = str;
    }

    public final void setMusicPath(String str) {
        this.musicPath = str;
    }

    public final void setMusicStart(Integer num) {
        this.musicStart = num;
    }

    public final void setMusicSticker(String str) {
        this.musicSticker = str;
    }

    public final void setMusicType(Integer num) {
        this.musicType = num;
    }

    public final void setMusicWithStickerEffect(Effect effect) {
        this.musicWithStickerEffect = effect;
    }

    public final void setMvSticker(Effect effect) {
        this.mvSticker = effect;
    }

    public final void setMvStickerId(String str) {
        this.mvStickerId = str;
    }

    public final void setNeedAddRecentMusic(boolean z) {
        this.needAddRecentMusic = z;
    }

    public final void setNeedLoadResourceAfterRecord(boolean z) {
        this.needLoadResourceAfterRecord = z;
    }

    public final void setNeedMobShoot(boolean z) {
        this.needMobShoot = z;
    }

    public final void setNetworkUnavailableMusic(Boolean bool) {
        this.networkUnavailableMusic = bool;
    }

    public final void setOpenPlatformClientKey(String str) {
        this.openPlatformClientKey = str;
    }

    public final void setOpenPlatformExtra(String str) {
        this.openPlatformExtra = str;
    }

    public final void setPermissionActivityRequired(Boolean bool) {
        this.permissionActivityRequired = bool;
    }

    public final void setPostTrendsId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.postTrendsId = str;
    }

    public final void setPostTrendsType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.postTrendsType = str;
    }

    public final void setPreloadStringResource(int i) {
        this.preloadStringResource = i;
    }

    public final void setPrepareFilter(boolean z) {
        this.prepareFilter = z;
    }

    public final void setPresetSticker(Boolean bool) {
        this.presetSticker = bool;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setQaOrigin(String str) {
        this.qaOrigin = str;
    }

    public final void setQaOriginGroupId(String str) {
        this.qaOriginGroupId = str;
    }

    public final void setQaStructConfig(QaStructConfig qaStructConfig) {
        this.qaStructConfig = qaStructConfig;
    }

    public final void setQuestionCategory(String str) {
        this.questionCategory = str;
    }

    public final void setRecordFromFeed(boolean z) {
        this.recordFromFeed = z;
    }

    public final void setRecordParam(String str) {
        this.recordParam = str;
    }

    public final void setRecordPresetResource(RecordPresetResource recordPresetResource) {
        this.recordPresetResource = recordPresetResource;
    }

    public final void setReshootConfig(ReshootConfig reshootConfig) {
        o.LJIIIZ(reshootConfig, "<set-?>");
        this.reshootConfig = reshootConfig;
    }

    public final void setRestoreType(int i) {
        this.restoreType = i;
    }

    public final void setReuseSoundAndEffectModel(ReuseSoundAndEffectModel reuseSoundAndEffectModel) {
        this.reuseSoundAndEffectModel = reuseSoundAndEffectModel;
    }

    public final void setSavedDraft(String str) {
        this.savedDraft = str;
    }

    public final void setSearchExtraData(SearchCreationExtraData searchCreationExtraData) {
        this.searchExtraData = searchCreationExtraData;
    }

    public final void setSeriesCollectionInfo(CollectionInfoParcelableForShoot collectionInfoParcelableForShoot) {
        this.seriesCollectionInfo = collectionInfoParcelableForShoot;
    }

    public final void setShareId(String str) {
        this.shareId = str;
    }

    public final void setShareKitPanel(ShareKitPanel shareKitPanel) {
        this.shareKitPanel = shareKitPanel;
    }

    public final void setShareModel(BaseShareContext baseShareContext) {
        this.shareModel = baseShareContext;
    }

    public final void setSharedARHostId(String str) {
        this.sharedARHostId = str;
    }

    public final void setSharedARSessionId(String str) {
        this.sharedARSessionId = str;
    }

    public final void setShootExtraData(ShootExtraData shootExtraData) {
        this.shootExtraData = shootExtraData;
    }

    public final void setShootFrom(String str) {
        this.shootFrom = str;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public final void setShoutoutMode(String str) {
        this.shoutoutMode = str;
    }

    public final void setShoutoutOrderID(String str) {
        this.shoutoutOrderID = str;
    }

    public final void setShowCancelAfterPinProp(Boolean bool) {
        this.showCancelAfterPinProp = bool;
    }

    public final void setShowPreloadingDialog(Boolean bool) {
        this.showPreloadingDialog = bool;
    }

    public final void setShowStickerPanel(boolean z) {
        this.showStickerPanel = z;
    }

    public final void setStarAtlasConfig(HashMap<String, String> hashMap) {
        this.starAtlasConfig = hashMap;
    }

    public final void setStartRecordTime(Long l) {
        this.startRecordTime = l;
    }

    public final void setSticker(String str) {
        this.sticker = str;
    }

    public final void setStickerMusic(Music music) {
        this.stickerMusic = music;
    }

    public final void setStickerWithMusicFilePath(String str) {
        this.stickerWithMusicFilePath = str;
    }

    public final void setStickers(ArrayList<String> arrayList) {
        this.stickers = arrayList;
    }

    public final void setStitchParams(StitchParams stitchParams) {
        this.stitchParams = stitchParams;
    }

    public final void setTabs(Integer num) {
        this.tabs = num;
    }

    public final void setThroughAnchor(boolean z) {
        this.isThroughAnchor = z;
    }

    public final void setTranslationType(Integer num) {
        this.translationType = num;
    }

    public final void setTtepPreviewEffect(Effect effect) {
        this.ttepPreviewEffect = effect;
    }

    public final void setTtsVoiceIDs(ArrayList<String> arrayList) {
        this.ttsVoiceIDs = arrayList;
    }

    public final void setTtsVoiceRefIDs(ArrayList<String> arrayList) {
        this.ttsVoiceRefIDs = arrayList;
    }

    public final void setUgcTemplateTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.ugcTemplateTag = str;
    }

    public final void setUnpublishedEffect(String str) {
        this.unpublishedEffect = str;
    }

    public final void setUploadPageMultiSelect(Boolean bool) {
        this.uploadPageMultiSelect = bool;
    }

    public final void setVcVoiceEffectId(String str) {
        this.vcVoiceEffectId = str;
    }

    public final void setVcVoiceEffectName(String str) {
        this.vcVoiceEffectName = str;
    }

    public final void setVcVoiceIDs(ArrayList<String> arrayList) {
        this.vcVoiceIDs = arrayList;
    }

    public final void setVcVoiceRefIDs(ArrayList<String> arrayList) {
        this.vcVoiceRefIDs = arrayList;
    }

    public final void setVideoDownloadDuration(Long l) {
        this.videoDownloadDuration = l;
    }

    public final void setVideoLength(Integer num) {
        this.videoLength = num;
    }

    public final void setVoiceEffectId(String str) {
        this.voiceEffectId = str;
    }

    public final void setVoiceEffectName(String str) {
        this.voiceEffectName = str;
    }
}
