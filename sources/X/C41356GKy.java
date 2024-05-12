package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GKy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41356GKy {
    public final ActivityC45651qj LIZ;
    public final boolean LIZIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZJ;
    public final C41357GKz LIZLLL;
    public final ShortVideoContext LJ;
    public final C64962gm LJFF;

    public final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        C60903NvH.LJIIJJI().getPublishService().LJJIZ(videoPublishEditModel, "enter Story publish!");
        C44384HbQ.LLJ(videoPublishEditModel);
        C42562Gn8.LIZIZ.LIZ(videoPublishEditModel.getCreationId());
        if (!C151975xp.LIZ(videoPublishEditModel)) {
            videoPublishEditModel.isPrivate = 0;
            videoPublishEditModel.commentSetting = 0;
        }
        videoPublishEditModel.setTitle(null);
        videoPublishEditModel.setStructList(null);
        videoPublishEditModel.challenges = null;
        videoPublishEditModel.resetCompileProbeResult();
        videoPublishEditModel.resetStrategiesResult();
        videoPublishEditModel.commerceData = null;
        videoPublishEditModel.allowAutoCaptionSetting = 0;
        videoPublishEditModel.autoCaptionLang = null;
        videoPublishEditModel.allowDownloadSetting = 0;
        videoPublishEditModel.microAppId = null;
        videoPublishEditModel.microAppModel = null;
        videoPublishEditModel.setChain(null);
        videoPublishEditModel.setDisableDeleteChain(false);
        videoPublishEditModel.geofencingSetting = null;
        videoPublishEditModel.excludeUserList = null;
        videoPublishEditModel.allowRecommend = 0;
        videoPublishEditModel.setDraftMusicIllegal(false);
        videoPublishEditModel.playlist_id = null;
        videoPublishEditModel.playlist_name = null;
        videoPublishEditModel.mVideoCoverStartTm = 0.0f;
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            audioRecorderParam.setAudioRecordIndex(-1);
        }
        CoverPublishModel coverPublishModel = new CoverPublishModel(null, 0.0f, 0.0f, 0.0f, null, false, 0.0f, 0, false, null, null, 0, 0.0f, 0.0f, 16383, null);
        coverPublishModel.setNeedExpandCompiledSize(videoPublishEditModel.getCoverPublishModel().getNeedExpandCompiledSize());
        videoPublishEditModel.setCoverPublishModel(coverPublishModel);
        C41384GMa.LJII(new C41353GKv(videoPublishEditModel, new C41350GKs(this, videoPublishEditModel)));
    }

    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        ChangeAvatarModel changeAvatarModel = videoPublishEditModel.creativeModel.changeAvatarModel;
        changeAvatarModel.isFromChangeAvatar = true;
        C41357GKz c41357GKz = this.LIZLLL;
        changeAvatarModel.isFromAiVatar = c41357GKz.LJLJJLL;
        String str = c41357GKz.LJLJLJ;
        o.LJIIIZ(str, "<set-?>");
        changeAvatarModel.aiVatarMode = str;
        videoPublishEditModel.creativeModel.changeAvatarModel.avatarStruct.setOriginAvatarUri(this.LIZLLL.LJLILLLLZI);
        videoPublishEditModel.creativeModel.changeAvatarModel.avatarStruct.setNewAvatarUri(this.LIZLLL.LJLIL);
        ChangeAvatarModel changeAvatarModel2 = videoPublishEditModel.creativeModel.changeAvatarModel;
        C41357GKz c41357GKz2 = this.LIZLLL;
        changeAvatarModel2.publishEnterMethod = c41357GKz2.LJLJL;
        videoPublishEditModel.setVideoCoverPath(c41357GKz2.LJLJJL);
    }

    public C41356GKy(ActivityC45651qj activity, Bundle bundle, boolean z, C41394GMk c41394GMk) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        this.LIZ = activity;
        this.LIZIZ = z;
        this.LIZJ = c41394GMk;
        String string = bundle.getString("new_avatar_uri", "");
        o.LJIIIIZZ(string, "getString(POST_TO_STORY_NEW_AVATAR_URI, \"\")");
        String string2 = bundle.getString("origin_avatar_uri", "");
        o.LJIIIIZZ(string2, "getString(POST_TO_STORY_OLD_AVATAR_URI, \"\")");
        String string3 = bundle.getString("origin_no_crop_avatar_path", "");
        o.LJIIIIZZ(string3, "getString(POST_TO_STORY_NO_CROP_AVATAR_PATH, \"\")");
        String string4 = bundle.getString("origin_avatar_url", "");
        o.LJIIIIZZ(string4, "getString(POST_TO_STORY_CANVAS_AVATAR_URL, \"\")");
        String string5 = bundle.getString("cover_avatar_path", "");
        o.LJIIIIZZ(string5, "getString(POST_TO_STORY_COVER_AVATAR_PATH, \"\")");
        boolean z2 = bundle.getBoolean("is_aivatar", false);
        String string6 = bundle.getString("enter_method", "");
        o.LJIIIIZZ(string6, "getString(IntentConstants.EXTRA_ENTER_METHOD, \"\")");
        String string7 = bundle.getString("path_mode", "");
        o.LJIIIIZZ(string7, "getString(PROFILE_AIGC_PATH_MODE, \"\")");
        this.LIZLLL = new C41357GKz(string, string2, string3, string4, string5, string6, string7, z2);
        this.LJ = HB3.LIZIZ(bundle);
        this.LJFF = C48841JEv.LIZ(C78613UtF.LIZJ);
    }
}
