package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GL7 extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ VideoPublishEditModel LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GL7(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel, Bundle bundle, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = videoPublishEditModel;
        this.LJLJI = bundle;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            ActivityC45651qj activity = this.LJLIL;
            VideoPublishEditModel model = this.LJLILLLLZI;
            Bundle bundle = this.LJLJI;
            InterfaceC88472Yns<Boolean, C76800UCe> openEditResult = this.LJLJJI;
            o.LJIIIZ(activity, "activity");
            o.LJIIIZ(model, "model");
            o.LJIIIZ(bundle, "bundle");
            o.LJIIIZ(openEditResult, "openEditResult");
            model.creativeModel.changeAvatarModel.isFromChangeAvatar = true;
            String string = bundle.getString("origin_avatar_uri", "");
            o.LJIIIIZZ(string, "bundle.getString(POST_TO_STORY_OLD_AVATAR_URI, \"\")");
            String string2 = bundle.getString("origin_no_crop_avatar_path", "");
            o.LJIIIIZZ(string2, "bundle.getString(POST_TO…_NO_CROP_AVATAR_PATH, \"\")");
            String string3 = bundle.getString("realEnterMethod", "");
            o.LJIIIIZZ(string3, "bundle.getString(POST_TO…RY_REAL_ENTER_METHOD, \"\")");
            boolean z = bundle.getBoolean("is_aivatar", false);
            String string4 = bundle.getString("path_mode", "");
            o.LJIIIIZZ(string4, "bundle.getString(PROFILE_AIGC_PATH_MODE, \"\")");
            ChangeAvatarModel changeAvatarModel = model.creativeModel.changeAvatarModel;
            changeAvatarModel.isFromAiVatar = z;
            changeAvatarModel.aiVatarMode = string4;
            changeAvatarModel.originPath = string2;
            changeAvatarModel.avatarStruct.setOriginAvatarUri(string);
            ChangeAvatarModel changeAvatarModel2 = model.creativeModel.changeAvatarModel;
            changeAvatarModel2.isSingletonRecover = true;
            changeAvatarModel2.firstEnterEdit = false;
            changeAvatarModel2.realEnterMethod = string3;
            model.mShootWay = "profile_photo";
            Intent LJFF = C43543H7b.LJFF(1, model, false);
            LJFF.putExtra("shoot_way", model.mShootWay);
            LJFF.putExtra("NLE", model.nleData);
            LJFF.putExtra("fromDraft", 1);
            LJFF.putExtra("edit_publish_session_end_together", true);
            LJFF.putExtra("extra_auto_caption_setting", model.allowAutoCaptionSetting);
            LJFF.putExtra("auto_selected_anchor", model.autoAttachedAnchor);
            LJFF.putExtra("open_platform_extra", model.openPlatformExtra);
            LJFF.putExtra("open_platform_client_key", model.openPlatformClientKey);
            LJFF.putExtra("extra_apply_voice_to_all_text", model.getApplyVoiceToAllTextSwitch());
            LJFF.putExtra("extra_has_multi_audio_loudness_normalization", model.hasMultiAudioLoudnessNormalization);
            LJFF.addFlags(603979776);
            openEditResult.invoke(Boolean.TRUE);
            HZV.LIZ().LJJ(activity, LJFF);
        } else {
            this.LJLJJI.invoke(Boolean.FALSE);
        }
        return C76800UCe.LIZ;
    }
}
