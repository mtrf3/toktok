package X;

import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HAp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43635HAp {
    public static final void LIZ(ShortVideoContext shortVideoContext, EditEffectAnchorManager editEffectAnchorManager, String svcId, C6UV c6uv, String enterFrom) {
        String str;
        String str2;
        String str3;
        String str4;
        C6QO c6qo;
        Parcelable parcelable;
        String str5;
        List<C6QO> LLIIJLIL;
        String str6;
        String str7;
        String uid;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(svcId, "svcId");
        o.LJIIIZ(enterFrom, "enterFrom");
        CommentVideoModel commentVideoModel = shortVideoContext.commentVideoModel;
        if (commentVideoModel == null || (str = commentVideoModel.getEnterMethod()) == null) {
            str = shortVideoContext.enterAlbumMethod;
        }
        String str8 = "";
        if (str == null) {
            str = "";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("content_source", shortVideoContext.LIZLLL().getContentSource());
        c145995oB.LJI("content_type", shortVideoContext.LIZLLL().getContentType());
        AddYoursStickerModel addYoursStickerModel = null;
        if (!CommentUtils.needMob(shortVideoContext)) {
            str2 = "";
        } else if (commentVideoModel != null) {
            str2 = commentVideoModel.getCommentId();
        } else {
            str2 = null;
        }
        c145995oB.LJI("reply_comment_id", str2);
        if (!CommentUtils.needMob(shortVideoContext)) {
            str3 = "";
        } else if (commentVideoModel != null) {
            str3 = commentVideoModel.getUserId();
        } else {
            str3 = null;
        }
        c145995oB.LJI("reply_user_id", str3);
        c145995oB.LJI("enter_from", enterFrom);
        c145995oB.LJI("group_id", C78983UzD.LJJIJL());
        User user = shortVideoContext.duetFromUser;
        if (user != null && (uid = user.getUid()) != null) {
            str8 = uid;
        }
        c145995oB.LJI("author_id", str8);
        c145995oB.LJI("from_group_id", C78983UzD.LJJIJL());
        c145995oB.LJI("enter_method", str);
        c145995oB.LJI("is_westwindow_exist", shortVideoContext.isWestWindowExistStr);
        c145995oB.LJI("shoot_enter_from", shortVideoContext.enterFrom);
        c145995oB.LJI("shoot_enter_method", shortVideoContext.enterMethod);
        int i = shortVideoContext.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        String str9 = shortVideoContext.newDraftId;
        o.LJIIIIZZ(str9, "shortVideoContext.newDraftId");
        if (str9.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", shortVideoContext.newDraftId);
        }
        if (o.LJ("anchor_combine_tts", shortVideoContext.shootWay)) {
            TTSVoiceModel tTSVoiceModel = shortVideoContext.ttsVoiceModel;
            if (tTSVoiceModel != null) {
                str7 = tTSVoiceModel.getEffectId();
            } else {
                str7 = null;
            }
            c145995oB.LIZLLL("tone_list", str7);
        }
        c145995oB.LIZLLL("shoot_page", "video_shoot_page");
        c145995oB.LIZLLL("shoot_tab_name", shortVideoContext.LJIJI());
        C78880UxY.LJIJ(c145995oB);
        String str10 = shortVideoContext.publishRetainType;
        if (str10 == null) {
            str10 = "NULL";
        }
        c145995oB.LIZLLL("publish_retain_type", str10);
        String str11 = shortVideoContext.creativeModel.initialModel.profileParametersModel.guideWording;
        if (!TextUtils.isEmpty(str11)) {
            c145995oB.LIZLLL("wording", str11);
        }
        if (editEffectAnchorManager != null && editEffectAnchorManager.isTemplate()) {
            List<EditEffectAnchorInfo> data = editEffectAnchorManager.getData();
            ArrayList arrayList = new ArrayList(C32I.LJJL(data, 10));
            Iterator<EditEffectAnchorInfo> it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getEffectId());
            }
            c145995oB.LIZLLL("effect_template_list", ORZ.LLD(arrayList, ",", null, null, null, 62));
        }
        StreamVoiceConversionModel streamVoiceConversionModel = shortVideoContext.creativeModel.streamVoiceConversionModel;
        o.LJIIIZ(streamVoiceConversionModel, "<this>");
        if (streamVoiceConversionModel.vcShootingEffectId.length() > 0 && o.LJ(streamVoiceConversionModel.vcShootingEffectId, streamVoiceConversionModel.vcVoiceId)) {
            str4 = "vc_page";
        } else if (streamVoiceConversionModel.vcShootingEffectId.length() > 0) {
            str4 = streamVoiceConversionModel.vcShootingEffectIdFrom;
        } else {
            str4 = null;
        }
        if (C78685UuP.LJJJZ(str4)) {
            c145995oB.LIZ(1, "is_voice_effect");
            c145995oB.LIZLLL("voice_modify_id", shortVideoContext.creativeModel.streamVoiceConversionModel.vcShootingEffectId);
            c145995oB.LIZLLL("voice_effect_selected_from", str4);
        }
        if (o.LJ(shortVideoContext.shootWay, "ec_write_review")) {
            RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
            if (recordPageOptionalConfig != null) {
                str6 = recordPageOptionalConfig.previousPage;
            } else {
                str6 = null;
            }
            c145995oB.LIZLLL("previous_page", str6);
        }
        if (c6uv != null && (LLIIJLIL = c6uv.LLIIJLIL(EnumC157656Gr.ADD_YOURS)) != null) {
            c6qo = (C6QO) ORZ.LJLLLL(LLIIJLIL);
        } else {
            c6qo = null;
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
        if (c6qo != null) {
            parcelable = c6qo.LIZ();
        } else {
            parcelable = null;
        }
        if (parcelable instanceof AddYoursStickerModel) {
            addYoursStickerModel = (AddYoursStickerModel) parcelable;
        }
        C161226Uk.LIZIZ(creativeModel, addYoursStickerModel, c145995oB);
        if (C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false)) {
            str5 = "on";
        } else {
            str5 = "off";
        }
        c145995oB.LIZLLL("auto_meme_mode", str5);
        FMX.LJIIL("click_upload_entrance", c145995oB.LIZ);
    }
}
