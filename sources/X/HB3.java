package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.creative.model.SearchCreateModel;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.publish.FollowUpPublishTrackerModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.models.RssArticle;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.LibraryContext;
import com.ss.android.ugc.aweme.shortvideo.RecordContext;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.ArticlePostModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HB3 {
    public static void LIZ(ShortVideoContext shortVideoContext) {
        String str;
        shortVideoContext.LJJIL(null);
        if (shortVideoContext.LJJJI()) {
            str = shortVideoContext.cameraComponentModel.duetContext.duetAudioPath;
        } else {
            str = null;
        }
        shortVideoContext.cameraComponentModel.mMusicPath = str;
        if (!TextUtils.isEmpty(str)) {
            CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
            cameraComponentModel.mWorkspace.LLILLL(cameraComponentModel.mMusicPath);
        } else {
            shortVideoContext.cameraComponentModel.mWorkspace.v();
        }
        LJI(shortVideoContext);
        shortVideoContext.LJJIJLIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
        shortVideoContext.mWavFormUrl = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ShortVideoContext LIZIZ(Bundle bundle) {
        C78983UzD.LJLJL = C78983UzD.LJLJJLL;
        CreativeInfo LJIJJ = C77412UZs.LJIJJ(bundle);
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0, LJIJJ.getCreationId(), LJIJJ.getVersion()));
        shortVideoContext.creativeInfo = LJIJJ;
        shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(LJIJJ);
        shortVideoContext.shootWay = bundle.getString("shoot_way");
        shortVideoContext.recordParam = bundle.getString("record_param");
        shortVideoContext.mShootFrom = bundle.getString("shoot_from");
        shortVideoContext.enterFrom = bundle.getString("enter_from");
        shortVideoContext.enterMethod = bundle.getString("enter_method");
        shortVideoContext.eventType = bundle.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE");
        shortVideoContext.sendToUserHead = (UrlModel) bundle.getSerializable("send_to_user_head");
        shortVideoContext.shareContext = (C43722HDy) bundle.getSerializable("open_platform_share_context");
        shortVideoContext.clientId = bundle.getString("channel", "");
        shortVideoContext.draftId = 0;
        shortVideoContext.cameraComponentModel.mMusicStart = bundle.getInt("music_start_time", 0);
        C44735Hh5 c44735Hh5 = C44172HVg.LJIIL;
        c44735Hh5.LIZ();
        shortVideoContext.cameraComponentModel.mVideoWidth = c44735Hh5.LIZ;
        C44735Hh5 c44735Hh52 = C44172HVg.LJIIL;
        c44735Hh52.LIZ();
        shortVideoContext.cameraComponentModel.mVideoHeight = c44735Hh52.LIZIZ;
        shortVideoContext.cameraComponentModel.enableFastCVLanczos = HBG.LIZ();
        HCA hca = new HCA();
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mDurings = hca;
        cameraComponentModel.mTotalRecordingTime = 0L;
        shortVideoContext.cameraComponentModel.mHardEncode = C44739Hh9.LIZ() ? 1 : 0;
        shortVideoContext.cameraComponentModel.mUseBeautyFace = C78886Uxe.LJFF().LIZIZ();
        if (bundle.getParcelable("stitch_params") != null) {
            shortVideoContext.LJIJJLI((StitchParams) bundle.getParcelable("stitch_params"));
        } else {
            shortVideoContext.LIZ();
        }
        FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
        followUpPublishTrackerModel.followUpFirstItemId = C78983UzD.LJLJLLL;
        followUpPublishTrackerModel.followUpItemIdGroups = C78983UzD.LJLL;
        followUpPublishTrackerModel.enterRecordFromFeed = bundle.getBoolean("enter_record_from_feed", false);
        if (bundle.getBoolean("change_avatar", false)) {
            ChangeAvatarModel changeAvatarModel = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel.isFromChangeAvatar = true;
            changeAvatarModel.publishEnterMethod = bundle.getString("enter_method", "");
            shortVideoContext.creativeModel.changeAvatarModel.isFromAiVatar = bundle.getBoolean("is_aivatar", false);
            ChangeAvatarModel changeAvatarModel2 = shortVideoContext.creativeModel.changeAvatarModel;
            String string = bundle.getString("path_mode", "");
            changeAvatarModel2.getClass();
            o.LJIIIZ(string, "<set-?>");
            changeAvatarModel2.aiVatarMode = string;
            String string2 = bundle.getString("origin_avatar_uri", "");
            String string3 = bundle.getString("origin_no_crop_avatar_path", "");
            String string4 = bundle.getString("cover_avatar_path", "");
            String string5 = bundle.getString("realEnterMethod", "");
            ChangeAvatarModel changeAvatarModel3 = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel3.getClass();
            o.LJIIIZ(string3, "<set-?>");
            changeAvatarModel3.originPath = string3;
            shortVideoContext.creativeModel.changeAvatarModel.avatarStruct.setOriginAvatarUri(string2);
            ChangeAvatarModel changeAvatarModel4 = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel4.getClass();
            o.LJIIIZ(string4, "<set-?>");
            changeAvatarModel4.coverPath = string4;
            ChangeAvatarModel changeAvatarModel5 = shortVideoContext.creativeModel.changeAvatarModel;
            changeAvatarModel5.getClass();
            o.LJIIIZ(string5, "<set-?>");
            changeAvatarModel5.realEnterMethod = string5;
        }
        if (bundle.getSerializable("on_this_day_day") != null) {
            OnThisDayData onThisDayData = (OnThisDayData) bundle.getSerializable("on_this_day_day");
            shortVideoContext.creativeModel.onThisDayData.setCreateTime(onThisDayData.getCreateTime());
            shortVideoContext.creativeModel.onThisDayData.setFromOnThisDay(onThisDayData.isFromOnThisDay());
            shortVideoContext.creativeModel.onThisDayData.setPastMemoryKey(onThisDayData.getPastMemoryKey());
            shortVideoContext.creativeModel.onThisDayData.setForwardType(onThisDayData.getForwardType());
        }
        if (bundle.containsKey("extra_search_creation_data")) {
            SearchCreationExtraData searchCreationExtraData = (SearchCreationExtraData) bundle.getParcelable("extra_search_creation_data");
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            SearchCreateModel LJJLIIJ = V16.LJJLIIJ(searchCreationExtraData);
            creativeModel.getClass();
            creativeModel.searchCreateModel = LJJLIIJ;
        }
        if (shortVideoContext.LJJI()) {
            AVMusic aVMusic = new AVMusic();
            aVMusic.setMusicId(bundle.getString("music_id"));
            shortVideoContext.creativeModel.musicBuzModel.music = MusicBeanUtilKt.extractMusicObject(aVMusic);
        }
        LJII(bundle, shortVideoContext);
        RssArticle rssArticle = (RssArticle) bundle.getParcelable("extra_rss_article");
        if (rssArticle != null) {
            shortVideoContext.creativeModel.initialModel.defaultPostContentModel = new DefaultPostContentModel(rssArticle.title, rssArticle.description, new ArrayList(Arrays.asList(bundle.getParcelable("article_anchor"))));
            shortVideoContext.creativeModel.initialModel.articlePostModel = new ArticlePostModel(rssArticle.rssGuid, rssArticle.rssUrl);
        }
        return shortVideoContext;
    }

    public static ShortVideoContext LIZLLL(Bundle bundle) {
        if (C1DG.LJIIIIZZ()) {
            CreativeInfo LJIJJ = C77412UZs.LJIJJ(bundle);
            ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0, LJIJJ.getCreationId(), LJIJJ.getVersion()));
            shortVideoContext.creativeModel = C78996UzQ.LJIILLIIL(bundle);
            shortVideoContext.avetParameter = AVETParameterKt.generateAVETParam(bundle);
            shortVideoContext.creativeInfo = LJIJJ;
            shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(LJIJJ);
            shortVideoContext.shootWay = bundle.getString("shoot_way");
            shortVideoContext.recordParam = bundle.getString("record_param");
            shortVideoContext.mShootFrom = bundle.getString("shoot_from");
            shortVideoContext.enterFrom = bundle.getString("enter_from");
            shortVideoContext.draftId = 0;
            shortVideoContext.shootMode = bundle.getInt("shoot_mode", 0);
            String string = bundle.getString("path");
            shortVideoContext.cameraComponentModel.mMusicPath = string;
            if (!TextUtils.isEmpty(string)) {
                CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                cameraComponentModel.mWorkspace.LLILLL(cameraComponentModel.mMusicPath);
            }
            shortVideoContext.LIZ();
            UrlModel musicModelAudioTrack = C44172HVg.LJI.getMusicModelAudioTrack(bundle.getSerializable("music_model"));
            if (musicModelAudioTrack != null) {
                shortVideoContext.mWavFormUrl = musicModelAudioTrack;
            }
            shortVideoContext.cameraComponentModel.mCurrentDurationMode = C78253UnR.LJ();
            if (shortVideoContext.shootMode != 12) {
                shortVideoContext.cameraComponentModel.isMuted = shortVideoContext.LJJJI();
            }
            LJI(shortVideoContext);
            int i = bundle.getInt("music_start", 0);
            CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
            cameraComponentModel2.mMusicStart = i;
            shortVideoContext.LJJIJLIJ((int) cameraComponentModel2.mMaxDuration);
            C44735Hh5 c44735Hh5 = C44172HVg.LJIIL;
            c44735Hh5.LIZ();
            shortVideoContext.cameraComponentModel.mVideoWidth = c44735Hh5.LIZ;
            C44735Hh5 c44735Hh52 = C44172HVg.LJIIL;
            c44735Hh52.LIZ();
            shortVideoContext.cameraComponentModel.mVideoHeight = c44735Hh52.LIZIZ;
            shortVideoContext.cameraComponentModel.enableFastCVLanczos = HBG.LIZ();
            HCA hca = new HCA();
            CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
            cameraComponentModel3.mDurings = hca;
            cameraComponentModel3.mTotalRecordingTime = 0L;
            boolean LIZ = C44739Hh9.LIZ();
            shortVideoContext.cameraComponentModel.mHardEncode = LIZ ? 1 : 0;
            shortVideoContext.cameraComponentModel.mUseBeautyFace = C78886Uxe.LJFF().LIZIZ();
            shortVideoContext.filterBusinessSticker = bundle.getString("filter_business_sticker");
            shortVideoContext.putPresetStickerAtFirst = bundle.getBoolean("use_preset_sticker_at_first", shortVideoContext.putPresetStickerAtFirst);
            if (TextUtils.isEmpty(shortVideoContext.presetEffectId)) {
                shortVideoContext.presetEffectId = bundle.getString("sticker_id");
            }
            if (bundle.containsKey("extra_mention_uid") && bundle.containsKey("extra_mention_user_name")) {
                shortVideoContext.mentionUserModel = ExtraMentionUserModel.Companion.newInstance(bundle.getString("extra_mention_uid"), bundle.getString("extra_mention_user_name"));
            }
            shortVideoContext.isFromNormalRecord = true;
            shortVideoContext.effectMetaInfo = bundle.getString("effect_meta_info");
            shortVideoContext.effectImage = bundle.getString("effect_image");
            C43587H8t.LIZ(bundle, new HB1(shortVideoContext));
            if (bundle.getParcelable("mission") != null) {
                shortVideoContext.creativeModel.commerceModel.setMission((Mission) bundle.getParcelable("mission"));
            }
            LJIIIIZZ(bundle, shortVideoContext);
            return shortVideoContext;
        }
        return LJ(bundle, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9) {
        /*
            boolean r0 = r9.LJJIJIIJIL()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r9.LJJJI()
            r2 = 0
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r9.cameraComponentModel
            com.ss.android.ugc.aweme.shortvideo.DuetContext r0 = r0.duetContext
            java.lang.String r1 = r0.duetAudioPath
            java.lang.String r8 = r0.duetVideoPath
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            com.ss.android.ugc.aweme.property.AVPreferences r3 = r0.LJJIL()
            r0 = 1
            boolean r0 = r3.getDurationMode(r0)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r0 = r0.shortVideoConfig()
            long r4 = r0.maxCreatorDuetOrStitchVideoTime()
        L35:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r6 = -1
            if (r0 != 0) goto L4b
            if (r8 == 0) goto L43
            int[] r2 = X.C43495H5f.LIZIZ(r8)
        L43:
            r0 = 0
            if (r2 != 0) goto L48
            int[] r2 = new int[r0]
        L48:
            int r0 = r2.length
            if (r0 != 0) goto L98
        L4b:
            r2 = -1
        L4d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L95
            X.HEa r0 = X.C78934UyQ.LJLIL
            com.ss.android.ugc.aweme.port.in.IAnotherMusicService r0 = r0.getMusicService()
            int r0 = r0.getMusicDuration(r1)
            long r0 = (long) r0
        L5e:
            long r2 = java.lang.Math.max(r2, r0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L80
        L66:
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r9.cameraComponentModel
            r0.mMaxDuration = r4
        L6a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "maxduration is "
            r2.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r9.cameraComponentModel
            long r0 = r0.mMaxDuration
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            X.H78.LJI(r0)
            return
        L80:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r0 = r0.shortVideoConfig()
            long r0 = r0.maxCreatorDuetOrStitchVideoTime()
            long r4 = java.lang.Math.min(r0, r2)
            goto L66
        L95:
            r0 = -1
            goto L5e
        L98:
            r0 = 3
            r0 = r2[r0]
            long r2 = (long) r0
            goto L4d
        L9d:
            r4 = 15000(0x3a98, double:7.411E-320)
            goto L35
        La0:
            boolean r0 = r9.LJJIJIL()
            if (r0 == 0) goto Lae
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r9.cameraComponentModel
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r0 = r0.mWorkspace
            java.lang.String r2 = r0.getMusicPath()
        Lae:
            int r0 = r9.shootMode
            long r1 = X.C73974T1m.LJFF(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r9.cameraComponentModel
            r0.mMaxDuration = r1
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB3.LJI(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a94  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.shortvideo.ShortVideoContext LJ(android.os.Bundle r28, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r29) {
        /*
            Method dump skipped, instructions count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HB3.LJ(android.os.Bundle, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):com.ss.android.ugc.aweme.shortvideo.ShortVideoContext");
    }

    public static void LJFF(Context context, ShortVideoContext shortVideoContext) {
        if (shortVideoContext.LJJIJIL()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!C170626mo.LIZJ(context, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                shortVideoContext.LJJIJLIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
                return;
            }
            try {
                if (C170626mo.LIZ(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                    LJIIJ(mediaMetadataRetriever, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath());
                } else {
                    mediaMetadataRetriever.setDataSource(context, UriProtector.parse(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath()));
                }
                shortVideoContext.LJJIJLIJ(CastIntegerProtector.parseInt(mediaMetadataRetriever.extractMetadata(9)));
                return;
            } catch (Exception unused) {
                shortVideoContext.LJJIJLIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
                return;
            }
        }
        shortVideoContext.LJJIJLIJ((int) shortVideoContext.cameraComponentModel.mMaxDuration);
    }

    public static void LJII(Bundle bundle, ShortVideoContext shortVideoContext) {
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = (DuetAndStitchRouterConfig) bundle.getParcelable("duet_and_stitch_router_config");
        if (duetAndStitchRouterConfig != null) {
            shortVideoContext.creativeModel.initialModel.duetAndStitchRouterConfig = duetAndStitchRouterConfig;
        }
    }

    public static void LJIIIIZZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initMusicData called, get music from MusicBuzModel");
            LIZ.append(extractAVMusic.getMusicId());
            H78.LIZIZ("MusicRefactor", X1D.LIZIZ(LIZ));
            return;
        }
        AVMusic aVMusic = (AVMusic) bundle.getSerializable("aweme_music");
        if (aVMusic != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initMusicData called, get music from EXTRA_AWEME_MUSIC");
            LIZ2.append(aVMusic.getMusicId());
            H78.LIZIZ("MusicRefactor", X1D.LIZIZ(LIZ2));
            MusicBeanUtilKt.updateAVMusic(shortVideoContext.creativeModel.musicBuzModel, aVMusic);
            return;
        }
        MusicModel musicModel = (MusicModel) bundle.getSerializable("music_model");
        if (musicModel != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("initMusicData called, get music from EXTRA_MUSIC_MODEL");
            LIZ3.append(musicModel.getMusicId());
            H78.LIZIZ("MusicRefactor", X1D.LIZIZ(LIZ3));
            MusicBeanUtilKt.updateAVMusic(shortVideoContext.creativeModel.musicBuzModel, C44172HVg.LJI.transformMusicModel(musicModel));
            return;
        }
        H78.LIZIZ("MusicRefactor", "initMusicData called, no music found");
    }

    public static void LJIIIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("original_segments");
        int i = bundle.getInt("original_music_start", 0);
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mRetakeDuration = 0L;
        cameraComponentModel.mRetakeTime = 0L;
        cameraComponentModel.isRetakeMode = false;
        cameraComponentModel.retakeVideoContext = null;
        HCA hca = new HCA(parcelableArrayList);
        shortVideoContext.cameraComponentModel.mDurings = hca;
        long calculateRealTime = TimeSpeedModelExtension.calculateRealTime(hca);
        CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
        cameraComponentModel2.mTotalRecordingTime = calculateRealTime;
        cameraComponentModel2.mWorkspace.LJLIL.s(C5YW.LIZIZ().LJIJ(shortVideoContext.creativeInfo, "", true));
        HB7.LIZ(shortVideoContext.cameraComponentModel.mWorkspace, (VideoPublishEditModel) bundle.getSerializable("video_edit_model"));
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        shortVideoContext.musicBeforeRetake = extractAVMusic;
        if (extractAVMusic != null) {
            String str = extractAVMusic.path;
            shortVideoContext.cameraComponentModel.mWorkspace.LLILLL(str);
            CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
            cameraComponentModel3.mMusicPath = str;
            cameraComponentModel3.mMusicStart = i;
        } else {
            LIZ(shortVideoContext);
        }
        if (bundle.containsKey("stitch_params")) {
            shortVideoContext.LJIJJLI((StitchParams) bundle.getParcelable("stitch_params"));
        } else {
            shortVideoContext.LIZ();
        }
        LJII(bundle, shortVideoContext);
    }

    public static void LJIIJ(MediaMetadataRetriever mediaMetadataRetriever, String str) {
        if (str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    mediaMetadataRetriever.setDataSource(fileInputStream.getFD(), 0L, 576460752303423487L);
                    fileInputStream.close();
                    return;
                } finally {
                }
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        throw new IllegalArgumentException("path == null");
    }

    public static void LJIIJJI(Bundle bundle, ShortVideoContext shortVideoContext) {
        shortVideoContext.creativeModel = C78996UzQ.LJIILLIIL(bundle);
        RetakeVideoContext retakeVideoContext = (RetakeVideoContext) bundle.getParcelable("retake_video");
        long j = retakeVideoContext.duration;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        cameraComponentModel.mRetakeDuration = j;
        cameraComponentModel.mRetakeTime = 0L;
        cameraComponentModel.isRetakeMode = true;
        if (retakeVideoContext.multiEditVideoRecordData != null) {
            shortVideoContext.cameraComponentModel.mDurings = new HCA(retakeVideoContext.multiEditVideoRecordData.editSegments);
        }
        shortVideoContext.LJII().clear();
        Workspace workspace = shortVideoContext.cameraComponentModel.mWorkspace;
        workspace.LJLIL.s(retakeVideoContext.retakeDir);
        shortVideoContext.creativeModel.libraryModel.retakeFromLibrary = retakeVideoContext.isFromLibrary;
        shortVideoContext.cameraComponentModel.retakeVideoContext = retakeVideoContext;
        StitchParams stitchParams = retakeVideoContext.stitchParams;
        if (stitchParams != null) {
            shortVideoContext.LJIJJLI(stitchParams);
        } else {
            shortVideoContext.LIZ();
        }
        MultiEditVideoRecordData multiEditVideoRecordData = retakeVideoContext.multiEditVideoRecordData.curMultiEditVideoRecordData;
        String str = multiEditVideoRecordData.musicPath;
        boolean isPlaySingleSegmentMusic = multiEditVideoRecordData.isPlaySingleSegmentMusic();
        if (str != null && (isPlaySingleSegmentMusic || !retakeVideoContext.disableBGM)) {
            int i = retakeVideoContext.multiEditVideoRecordData.curMultiEditVideoRecordData.musicTrimIn;
            CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
            cameraComponentModel2.mMusicStart = i;
            cameraComponentModel2.mWorkspace.LLILLL(str);
            shortVideoContext.cameraComponentModel.mMusicPath = str;
            shortVideoContext.LJJIL(retakeVideoContext.musicOrigin);
            return;
        }
        LIZ(shortVideoContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ShortVideoContext LIZJ(Bundle bundle, Context context, RecordScene recordScene) {
        String str;
        boolean z;
        CreativeInfo creativeInfo;
        String str2;
        RecordScene recordScene2 = recordScene;
        int i = bundle.getInt("restore", 0);
        if (i != 0) {
            boolean z2 = true;
            if (i != 1) {
                if (i != 2) {
                    return LIZLLL(bundle);
                }
                if (recordScene2 == null) {
                    recordScene2 = HB4.LIZIZ();
                }
                if (recordScene2.isSegmentsNotValid()) {
                    creativeInfo = new CreativeInfo();
                } else {
                    creativeInfo = recordScene2.creativeInfo;
                }
                ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(2, creativeInfo.getCreationId(), creativeInfo.getVersion()));
                shortVideoContext.avetParameter = AVETParameterKt.generateAVETParam(bundle);
                String str3 = recordScene2.shootWay;
                if (str3 != null && !str3.isEmpty()) {
                    shortVideoContext.shootWay = str3;
                } else {
                    shortVideoContext.shootWay = bundle.getString("shoot_way");
                }
                shortVideoContext.mShootFrom = bundle.getString("shoot_from");
                shortVideoContext.recordParam = bundle.getString("record_param");
                shortVideoContext.draftId = 0;
                shortVideoContext.publishStage = 50;
                UrlModel musicModelAudioTrack = C44172HVg.LJI.getMusicModelAudioTrack(bundle.getSerializable("music_model"));
                if (musicModelAudioTrack != null) {
                    shortVideoContext.mWavFormUrl = musicModelAudioTrack;
                }
                if (bundle.containsKey("extra_bind_mv_id")) {
                    shortVideoContext.mBindMovieId = bundle.getString("extra_bind_mv_id");
                }
                C44735Hh5 c44735Hh5 = C44172HVg.LJIIL;
                c44735Hh5.LIZ();
                shortVideoContext.cameraComponentModel.mVideoWidth = c44735Hh5.LIZ;
                C44735Hh5 c44735Hh52 = C44172HVg.LJIIL;
                c44735Hh52.LIZ();
                shortVideoContext.cameraComponentModel.mVideoHeight = c44735Hh52.LIZIZ;
                shortVideoContext.cameraComponentModel.enableFastCVLanczos = HBG.LIZ();
                AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
                if (C43119Gw7.LIZ() && !C1DG.LJIIIIZZ()) {
                    AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().getClass();
                    C53578L1a.LIZ.getClass();
                    C53578L1a.LIZ();
                }
                C41658GWo.LIZLLL().getClass();
                if (bundle.containsKey("stitch_params")) {
                    shortVideoContext.LJIJJLI((StitchParams) bundle.getParcelable("stitch_params"));
                } else {
                    shortVideoContext.LIZ();
                }
                LJII(bundle, shortVideoContext);
                shortVideoContext.cameraComponentModel.mCurrentDurationMode = C60903NvH.LJIIJJI().LJJIL().getDurationMode(true);
                if (recordScene2.isSegmentsNotValid()) {
                    shortVideoContext.LIZLLL().setCreationId(UUID.randomUUID().toString());
                    shortVideoContext.creativeInfo = creativeInfo;
                    shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(creativeInfo);
                    HCA hca = new HCA();
                    CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                    cameraComponentModel.mDurings = hca;
                    cameraComponentModel.mTotalRecordingTime = 0L;
                    boolean LIZ = C44739Hh9.LIZ();
                    CameraComponentModel cameraComponentModel2 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel2.mHardEncode = LIZ ? 1 : 0;
                    cameraComponentModel2.mUseBeautyFace = true;
                    if (shortVideoContext.LJJIJIL() && C170626mo.LIZJ(context, shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath())) {
                        str2 = shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath();
                    } else {
                        str2 = null;
                    }
                    shortVideoContext.cameraComponentModel.mMaxDuration = C73974T1m.LJFF(shortVideoContext.shootMode, str2);
                    LJFF(context, shortVideoContext);
                } else {
                    shortVideoContext.LIZLLL().setCreationId(recordScene2.getCreationId());
                    shortVideoContext.creativeInfo = creativeInfo;
                    shortVideoContext.cameraComponentModel.mWorkspace = HU5.LIZ(creativeInfo);
                    HCA hca2 = new HCA(recordScene2.videoSegments);
                    shortVideoContext.cameraComponentModel.mDurings = hca2;
                    long calculateRealTime = TimeSpeedModelExtension.calculateRealTime(hca2);
                    CameraComponentModel cameraComponentModel3 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel3.mTotalRecordingTime = calculateRealTime;
                    String str4 = recordScene2.musicPath;
                    cameraComponentModel3.mMusicPath = str4;
                    if (!TextUtils.isEmpty(str4)) {
                        shortVideoContext.cameraComponentModel.mWorkspace.LLILLL(recordScene2.musicPath);
                        if (WJR.LIZ().enableMicButton) {
                            shortVideoContext.cameraComponentModel.isMuted = recordScene2.recordIsMuted;
                        }
                    }
                    int i2 = recordScene2.musicStart;
                    CameraComponentModel cameraComponentModel4 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel4.mMusicStart = i2;
                    cameraComponentModel4.mHardEncode = recordScene2.hardEncode;
                    if (recordScene2.faceBeauty <= 0) {
                        z2 = false;
                    }
                    cameraComponentModel4.mUseBeautyFace = z2;
                    cameraComponentModel4.mMaxDuration = recordScene2.maxDuration;
                    MicDataModel micDataModel = shortVideoContext.creativeModel.micDataModel;
                    micDataModel.recordOriginalSoundWithBGM = recordScene2.recordOriginalSoundWithBGM;
                    micDataModel.enableMicWithBgm = WJR.LIZ().enableMicButton;
                    LJFF(context, shortVideoContext);
                    shortVideoContext.mWavFormUrl = recordScene2.audioTrack;
                    I9T.LJI(recordScene2.musicModel, false, shortVideoContext.creativeModel.musicBuzModel);
                    shortVideoContext.sharedARModel = recordScene2.sharedARModel;
                    shortVideoContext.stitchContext.stitchParams = recordScene2.stitchParams;
                    LibraryContext libraryContext = shortVideoContext.libraryContext;
                    ArrayList<TimeSpeedModelExtension> segments = recordScene2.videoSegments;
                    libraryContext.getClass();
                    o.LJIIIZ(segments, "segments");
                    ArrayList arrayList = new ArrayList();
                    Iterator<TimeSpeedModelExtension> it = segments.iterator();
                    while (it.hasNext()) {
                        TimeSpeedModelExtension next = it.next();
                        if (C76917UGr.LJJJJ(next)) {
                            arrayList.add(next);
                        }
                    }
                    libraryContext.libraryMaterialCount = arrayList.size();
                    shortVideoContext.cameraComponentModel.extractFramesModel = recordScene2.extractFramesModel;
                    RecordContext recordContext = new RecordContext(StrArray.from(recordScene2.filterLabels), StrArray.from(recordScene2.filterIds), StrArray.from(recordScene2.filterValues), new StrArray(), new StrArray(), new StrArray(), new StrArray(), 128);
                    CameraComponentModel cameraComponentModel5 = shortVideoContext.cameraComponentModel;
                    cameraComponentModel5.recordContext = recordContext;
                    cameraComponentModel5.veCherEffectParam = recordScene2.cherEffectParam;
                    cameraComponentModel5.videoRecordMetadata = recordScene2.videoRecordMetadata;
                    shortVideoContext.commentVideoModel = recordScene2.commentVideoModel;
                    shortVideoContext.shootedShootMode = recordScene2.shootedShootMode;
                    C41658GWo.LIZLLL().LIZIZ(recordScene2.getChallengeFromStr());
                    shortVideoContext.recordBGMDelay = recordScene2.recordBGMDelay;
                    shortVideoContext.loudnessBalanceParam = recordScene2.loudnessBalanceParam;
                    if (C69162nY.LIZ()) {
                        MobileEffectsModel2 mobileEffectsModel2 = recordScene2.mobileEffectsModel2;
                        if (mobileEffectsModel2 != null) {
                            CreativeModel creativeModel = shortVideoContext.creativeModel;
                            creativeModel.getClass();
                            creativeModel.mobileEffectsModel2 = mobileEffectsModel2;
                        }
                    } else {
                        MobileEffectsModel mobileEffectsModel = recordScene2.mobileEffectsModel;
                        if (mobileEffectsModel != null) {
                            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
                            creativeModel2.getClass();
                            creativeModel2.mobileEffectsModel = mobileEffectsModel;
                        }
                    }
                }
                C78983UzD.LJLJL = recordScene2.fromItemId;
                FollowUpPublishTrackerModel followUpPublishTrackerModel = shortVideoContext.creativeModel.followUpPublishTrackerModel;
                followUpPublishTrackerModel.followUpFirstItemId = recordScene2.followUpFirstItemId;
                followUpPublishTrackerModel.followUpItemIdGroups = recordScene2.followUpItemIdGroups;
                followUpPublishTrackerModel.enterRecordFromFeed = recordScene2.enterRecordFromFeed;
                return shortVideoContext;
            }
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) bundle.getSerializable("video_edit_model");
            ShortVideoContext shortVideoContext2 = new ShortVideoContext(new CameraComponentModel(1, videoPublishEditModel.creativeInfo.getCreationId(), videoPublishEditModel.creativeInfo.getVersion()));
            CreativeModel LJIILLIIL = C78996UzQ.LJIILLIIL(bundle);
            shortVideoContext2.creativeModel = LJIILLIIL;
            Iterator it2 = ((ArrayList) C41389GMf.LIZ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC41390GMg) it2.next()).LIZJ(LJIILLIIL);
            }
            int i3 = bundle.getInt("retake_shoot_mode", -1);
            shortVideoContext2.avetParameter = AVETParameterKt.generateAVETParam(bundle);
            shortVideoContext2.shootWay = bundle.getString("shoot_way");
            shortVideoContext2.recordParam = bundle.getString("record_param");
            shortVideoContext2.mShootFrom = bundle.getString("shoot_from");
            shortVideoContext2.creativeInfo = videoPublishEditModel.creativeInfo;
            shortVideoContext2.creativeModel.musicBuzModel.reuseOriginalSoundId = bundle.getString("reuse_original_sound_id");
            shortVideoContext2.creativeModel.musicBuzModel.reuseOriginalSoundUrls = (UrlModel) bundle.getSerializable("reuse_original_sound_url");
            shortVideoContext2.creativeModel.musicBuzModel.reuseOriginalSoundLength = bundle.getInt("reuse_original_sound_length", 0);
            if (!TextUtils.isEmpty(shortVideoContext2.LJIILLIIL())) {
                shortVideoContext2.creativeModel.musicBuzModel.isReuseOriginalSound = true;
            }
            Workspace workspace = (Workspace) bundle.getParcelable("workspace");
            shortVideoContext2.cameraComponentModel.mWorkspace = workspace;
            HB7.LIZ(workspace, videoPublishEditModel);
            shortVideoContext2.draftToEditFrom = bundle.getInt("draft_to_edit_from", 0);
            if (InterfaceC45115HnD.LIZ.contains(videoPublishEditModel.getMusicOrigin()) && i3 != 1) {
                I9T.LJI(null, false, shortVideoContext2.creativeModel.musicBuzModel);
                shortVideoContext2.cameraComponentModel.mWorkspace.v();
                videoPublishEditModel.setMusicOrigin(null);
            } else if (shortVideoContext2.cameraComponentModel.mWorkspace.getMusicPath() != null && C170626mo.LIZJ(context, shortVideoContext2.cameraComponentModel.mWorkspace.getMusicPath())) {
                shortVideoContext2.cameraComponentModel.mMusicPath = shortVideoContext2.cameraComponentModel.mWorkspace.getMusicPath();
            }
            if (bundle.containsKey("extra_bind_mv_id")) {
                shortVideoContext2.mBindMovieId = bundle.getString("extra_bind_mv_id");
            }
            int[] recordVideoSize = videoPublishEditModel.getRecordVideoSize();
            if (videoPublishEditModel.getLibraryMaterialCount() > 0) {
                shortVideoContext2.libraryContext.libraryMaterialCount = videoPublishEditModel.getLibraryMaterialCount();
                shortVideoContext2.cameraComponentModel.mVideoWidth = C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoWidth();
                shortVideoContext2.cameraComponentModel.mVideoHeight = C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoHeight();
            } else if (recordVideoSize.length < 2) {
                shortVideoContext2.cameraComponentModel.mVideoWidth = C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoWidth();
                shortVideoContext2.cameraComponentModel.mVideoHeight = C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoHeight();
            } else {
                int i4 = recordVideoSize[0];
                if (i4 == 0) {
                    i4 = C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoWidth();
                }
                shortVideoContext2.cameraComponentModel.mVideoWidth = i4;
                int i5 = recordVideoSize[1];
                if (i5 == 0) {
                    i5 = C60903NvH.LJIIJJI().LJJIJIIJIL().getVideoHeight();
                }
                shortVideoContext2.cameraComponentModel.mVideoHeight = i5;
            }
            shortVideoContext2.cameraComponentModel.enableFastCVLanczos = HBG.LIZ();
            shortVideoContext2.shootMode = videoPublishEditModel.mShootMode;
            shortVideoContext2.shootedShootMode = videoPublishEditModel.mShootedShootMode;
            CreativeFlowData creativeFlowData = videoPublishEditModel.creativeFlowData;
            if (creativeFlowData != null) {
                shortVideoContext2.creativeFlowData = creativeFlowData;
                str = null;
                creativeFlowData.setEditorProModel(null);
                shortVideoContext2.creativeFlowData.getNleEditModel().resetModel();
            } else {
                str = null;
            }
            boolean z3 = videoPublishEditModel.mDurationMode;
            CameraComponentModel cameraComponentModel6 = shortVideoContext2.cameraComponentModel;
            cameraComponentModel6.mCurrentDurationMode = z3;
            cameraComponentModel6.isMuted = videoPublishEditModel.isMuted;
            shortVideoContext2.draftId = videoPublishEditModel.draftId;
            shortVideoContext2.newDraftId = videoPublishEditModel.newDraftId;
            shortVideoContext2.LIZLLL().setDraftId(videoPublishEditModel.draftId);
            shortVideoContext2.LIZLLL().setNewDraftId(videoPublishEditModel.newDraftId);
            shortVideoContext2.LIZLLL().setCreationId(videoPublishEditModel.getCreationId());
            DuetExtraInfo duetExtraInfo = (DuetExtraInfo) bundle.getParcelable(DuetExtraInfo.class.getName());
            if (duetExtraInfo != null) {
                DuetContext duetContext = shortVideoContext2.cameraComponentModel.duetContext;
                duetContext.duetVideoPath = duetExtraInfo.getDuetVideoPath();
                duetContext.duetAudioPath = duetExtraInfo.getDuetAudioPath();
                duetContext.duetVideoWidth = duetExtraInfo.getDuetVideoWidth();
                duetContext.duetVideoHeight = duetExtraInfo.getDuetVideoHeight();
                duetContext.duetLayoutMode = duetExtraInfo.getDuetLayoutMode();
                duetContext.layoutDirection = duetExtraInfo.getDuetLayoutDirection();
                duetContext.duetFromAwemeId = bundle.getString("duet_from");
                duetContext.duetLayout = bundle.getString("extra_duet_layout");
                C44735Hh5 c44735Hh53 = C44172HVg.LJIIL;
                c44735Hh53.LIZ();
                shortVideoContext2.cameraComponentModel.mVideoWidth = c44735Hh53.LIZ;
                C44735Hh5 c44735Hh54 = C44172HVg.LJIIL;
                c44735Hh54.LIZ();
                shortVideoContext2.cameraComponentModel.mVideoHeight = c44735Hh54.LIZIZ;
            }
            shortVideoContext2.cameraComponentModel.recordContext = new RecordContext(StrArray.from(videoPublishEditModel.mRecordFilterLabels), StrArray.from(videoPublishEditModel.mRecordFilterIds), StrArray.from(videoPublishEditModel.mRecordFilterValues), new StrArray(), new StrArray(), new StrArray(), (StrArray) str, 192);
            if (bundle.containsKey("stitch_params")) {
                shortVideoContext2.LJIJJLI((StitchParams) bundle.getParcelable("stitch_params"));
            } else {
                shortVideoContext2.LIZ();
            }
            LJII(bundle, shortVideoContext2);
            RecordScene recordScene3 = C41658GWo.LIZLLL().LJII;
            if (recordScene3 == null || recordScene3.isSegmentsNotValid()) {
                HCA hca3 = new HCA();
                CameraComponentModel cameraComponentModel7 = shortVideoContext2.cameraComponentModel;
                cameraComponentModel7.mDurings = hca3;
                cameraComponentModel7.mTotalRecordingTime = 0L;
                boolean LIZ2 = C44739Hh9.LIZ();
                CameraComponentModel cameraComponentModel8 = shortVideoContext2.cameraComponentModel;
                cameraComponentModel8.mHardEncode = LIZ2 ? 1 : 0;
                cameraComponentModel8.mUseBeautyFace = true;
                if (shortVideoContext2.LJJIJIL() && C170626mo.LIZJ(context, shortVideoContext2.cameraComponentModel.mWorkspace.getMusicPath())) {
                    str = shortVideoContext2.cameraComponentModel.mWorkspace.getMusicPath();
                }
                long LJFF = C73974T1m.LJFF(i3, str);
                shortVideoContext2.cameraComponentModel.mMaxDuration = LJFF;
                shortVideoContext2.LJJIJLIJ((int) LJFF);
            } else {
                HCA hca4 = new HCA(recordScene3.videoSegments);
                shortVideoContext2.cameraComponentModel.mDurings = hca4;
                long calculateRealTime2 = TimeSpeedModelExtension.calculateRealTime(hca4);
                CameraComponentModel cameraComponentModel9 = shortVideoContext2.cameraComponentModel;
                cameraComponentModel9.mTotalRecordingTime = calculateRealTime2;
                cameraComponentModel9.mMusicStart = recordScene3.musicStart;
                cameraComponentModel9.musicEndTime = recordScene3.musicEnd;
                cameraComponentModel9.mHardEncode = recordScene3.hardEncode;
                if (recordScene3.faceBeauty > 0) {
                    z = true;
                } else {
                    z = false;
                }
                cameraComponentModel9.mUseBeautyFace = z;
                cameraComponentModel9.mMaxDuration = recordScene3.maxDuration;
                LJFF(context, shortVideoContext2);
                shortVideoContext2.mWavFormUrl = recordScene3.audioTrack;
            }
            shortVideoContext2.title = videoPublishEditModel.title;
            shortVideoContext2.chain = videoPublishEditModel.getChain();
            shortVideoContext2.disableDeleteChain = videoPublishEditModel.isDisableDeleteChain();
            shortVideoContext2.structList = videoPublishEditModel.getStructList();
            shortVideoContext2.isPrivate = videoPublishEditModel.isPrivate;
            shortVideoContext2.excludeUserList = videoPublishEditModel.excludeUserList;
            shortVideoContext2.allowRecommend = videoPublishEditModel.allowRecommend;
            if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
                String[] split = videoPublishEditModel.pic2VideoSource.split(",");
                if (split.length > 0) {
                    shortVideoContext2.pic2VideoSourceList.addAll(Arrays.asList(split));
                }
            }
            shortVideoContext2.pic2VideoSource = 0;
            shortVideoContext2.mIsFromDraft = true;
            shortVideoContext2.draftFromShoot = true;
            C43587H8t.LIZJ(H83.LIZ(videoPublishEditModel), new HB1(shortVideoContext2), EnumC43590H8w.DRAFT, EnumC43590H8w.RECORD);
            ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
            CameraComponentModel cameraComponentModel10 = shortVideoContext2.cameraComponentModel;
            cameraComponentModel10.extractFramesModel = extractFramesModel;
            shortVideoContext2.draftEditTransferModel = videoPublishEditModel.draftEditTransferModel;
            cameraComponentModel10.videoRecordMetadata = videoPublishEditModel.metadataMap;
            shortVideoContext2.commentVideoModel = videoPublishEditModel.commentVideoModel;
            shortVideoContext2.qaStruct = videoPublishEditModel.qaStruct;
            shortVideoContext2.qaStickerModel = videoPublishEditModel.qaStickerModel;
            shortVideoContext2.libraryContext.libraryMaterialInfo = videoPublishEditModel.libraryMaterialInfo;
            if (bundle.containsKey("extra_ve_cher_effect_param")) {
                shortVideoContext2.cameraComponentModel.veCherEffectParam = (ClientCherEffectParam) bundle.getParcelable("extra_ve_cher_effect_param");
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    LJIIIZ(bundle, shortVideoContext2);
                }
            } else {
                LJIIJJI(bundle, shortVideoContext2);
            }
            shortVideoContext2.publishStage = videoPublishEditModel.publishStage;
            shortVideoContext2.isPhotoMvMode = H7R.LJJJLZIJ(videoPublishEditModel);
            shortVideoContext2.mIsPhotoMvModeMusic = videoPublishEditModel.isPhotoMvMusic;
            shortVideoContext2.recordBGMDelay = videoPublishEditModel.recordBgmDelay;
            shortVideoContext2.isWestWindowExistStr = videoPublishEditModel.isWestWindowExistStr;
            shortVideoContext2.loudnessBalanceParam = videoPublishEditModel.loudnessBalanceParam;
            return shortVideoContext2;
        }
        return LIZLLL(bundle);
    }
}
