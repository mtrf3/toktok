package X;

import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8V {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(ShortVideoContext shortVideoContext) {
        String str;
        String awemeUserId;
        HQ7 accountService;
        Object obj;
        String str2;
        HashMap<String, HashMap<String, String>> extraEventParams;
        HashMap<String, String> hashMap;
        HashMap<String, String> extraLogParams;
        String str3;
        String id;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        H8W.LIZIZ = -1L;
        String str4 = "";
        H8W.LIZJ = "";
        H8W.LIZIZ = System.currentTimeMillis();
        if (o.LJ("push", shortVideoContext.shootWay)) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", shortVideoContext.LJI());
            c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB.LJI("enter_from", shortVideoContext.shootWay);
            c145995oB.LJI("enter_method", "");
            c145995oB.LJI("prop_id", shortVideoContext.presetEffectId);
            FMX.LJIIL("shoot", c145995oB.LIZ);
            return;
        }
        if (o.LJ("comment_reply", shortVideoContext.shootWay) || o.LJ("question_and_answer", shortVideoContext.shootWay) || o.LJ("sticker_comment_reply", shortVideoContext.shootWay)) {
            if (!CommentUtils.isDataValid(shortVideoContext.commentVideoModel)) {
                return;
            }
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("creation_id", shortVideoContext.LJI());
            c145995oB2.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB2.LJI("enter_method", shortVideoContext.commentVideoModel.getEnterMethod());
            c145995oB2.LJI("enter_from", shortVideoContext.commentVideoModel.getEnterFrom());
            c145995oB2.LJI("reply_comment_id", shortVideoContext.commentVideoModel.getCommentId());
            c145995oB2.LJI("reply_user_id", shortVideoContext.commentVideoModel.getUserId());
            if (o.LJ("comment_reply", shortVideoContext.shootWay)) {
                CommentVideoModel commentVideoModel = shortVideoContext.commentVideoModel;
                String str5 = null;
                if (commentVideoModel != null) {
                    str = commentVideoModel.getAwemeUserId();
                } else {
                    str = null;
                }
                InterfaceC43728HEe LJIIJJI = C60903NvH.LJIIJJI();
                if (LJIIJJI != null && (accountService = LJIIJJI.getAccountService()) != null) {
                    str5 = accountService.getCurrentUserID();
                }
                if (o.LJ(str, str5)) {
                    c145995oB2.LIZ(0, "is_others_video");
                } else {
                    CommentVideoModel commentVideoModel2 = shortVideoContext.commentVideoModel;
                    if (commentVideoModel2 != null && (awemeUserId = commentVideoModel2.getAwemeUserId()) != null && awemeUserId.length() != 0) {
                        c145995oB2.LIZ(1, "is_others_video");
                    }
                }
            }
            c145995oB2.LIZLLL("shoot_enter_from", shortVideoContext.commentVideoModel.getEnterFrom());
            FMX.LJIIL("shoot", c145995oB2.LIZ);
            return;
        }
        if (o.LJ("answer", shortVideoContext.shootWay) || o.LJ("question", shortVideoContext.shootWay)) {
            C145995oB c145995oB3 = new C145995oB();
            c145995oB3.LJI("creation_id", shortVideoContext.LJI());
            c145995oB3.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB3.LJI("enter_from", shortVideoContext.enterFrom);
            c145995oB3.LJI("enter_method", shortVideoContext.enterMethod);
            c145995oB3.LJI("qa_type", shortVideoContext.shootWay);
            QaStruct qaStruct = shortVideoContext.qaStruct;
            if (qaStruct == null) {
                obj = "";
            } else {
                obj = Long.valueOf(qaStruct.getQuestionId());
            }
            c145995oB3.LIZJ(obj, "question_id");
            QaStruct qaStruct2 = shortVideoContext.qaStruct;
            if (qaStruct2 == null || (str2 = qaStruct2.getUserSelectedCategory()) == null) {
                str2 = "";
            }
            c145995oB3.LJI("question_category_by_user", str2);
            String qaOrigin = shortVideoContext.creativeFlowData.getQaOrigin();
            if (qaOrigin == null) {
                qaOrigin = "";
            }
            c145995oB3.LJI("qa_origin", qaOrigin);
            String qaOriginGroupId = shortVideoContext.creativeFlowData.getQaOriginGroupId();
            if (qaOriginGroupId == null) {
                qaOriginGroupId = "";
            }
            c145995oB3.LJI("qa_origin_group_id", qaOriginGroupId);
            String questionCategory = shortVideoContext.creativeFlowData.getQuestionCategory();
            if (questionCategory == null) {
                questionCategory = "";
            }
            c145995oB3.LJI("question_category", questionCategory);
            String LJJIJL = C78983UzD.LJJIJL();
            if (LJJIJL == null) {
                LJJIJL = "";
            }
            c145995oB3.LJI("from_group_id", LJJIJL);
            String str6 = C78983UzD.LJLJJI;
            if (str6 == null) {
                str6 = "";
            }
            c145995oB3.LJI("last_group_id", str6);
            String str7 = C78983UzD.LJLJJL;
            if (str7 != null) {
                str4 = str7;
            }
            c145995oB3.LJI("last_gid_from", str4);
            if (o.LJ(shortVideoContext.enterFrom, "homepage_nearby")) {
                c145995oB3.LIZLLL("shoot_enter_from", "homepage_nearby");
            }
            QaStruct qaStruct3 = shortVideoContext.qaStruct;
            if (qaStruct3 != null && (extraEventParams = qaStruct3.getExtraEventParams()) != null && (hashMap = extraEventParams.get("shoot")) != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    c145995oB3.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
            FMX.LJIIL("shoot", c145995oB3.LIZ);
            return;
        }
        if (o.LJ("story", shortVideoContext.shootWay)) {
            C145995oB c145995oB4 = new C145995oB();
            c145995oB4.LJI("creation_id", shortVideoContext.LJI());
            c145995oB4.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB4.LJI("shoot_entrance", "story");
            c145995oB4.LJI("shoot_page", "video_shoot_page");
            c145995oB4.LJI("enter_method", shortVideoContext.enterMethod);
            c145995oB4.LJI("shoot_enter_method", shortVideoContext.enterMethod);
            c145995oB4.LJI("enter_from", shortVideoContext.enterFrom);
            c145995oB4.LJI("is_westwindow_exist", shortVideoContext.isWestWindowExistStr);
            if (o.LJ("direct_shoot", shortVideoContext.shootWay)) {
                c145995oB4.LIZLLL("is_story_enhanced_entrance", C79004UzY.LJJJJLL(shortVideoContext.creativeModel.commonMobModel.isStoryEnhancedEntrance));
            }
            FMX.LJIIL("shoot", c145995oB4.LIZ);
            return;
        }
        if (o.LJ("library", shortVideoContext.shootWay)) {
            C145995oB c145995oB5 = new C145995oB();
            c145995oB5.LJI("creation_id", shortVideoContext.LJI());
            c145995oB5.LJI("shoot_way", shortVideoContext.shootWay);
            if (o.LJ(shortVideoContext.enterFrom, "library_detail_page")) {
                str3 = shortVideoContext.enterFrom;
            } else {
                str3 = "anchor_panel";
            }
            c145995oB5.LJI("enter_method", str3);
            c145995oB5.LJI("enter_from", shortVideoContext.enterFrom);
            LibraryMaterialInfoSv libraryMaterialInfoSv = shortVideoContext.libraryContext.libraryMaterialInfo;
            if (libraryMaterialInfoSv != null && (id = libraryMaterialInfoSv.getId()) != null) {
                str4 = id;
            }
            c145995oB5.LJI("library_material_id", str4);
            FMX.LJIIL("shoot", c145995oB5.LIZ);
            return;
        }
        if (o.LJ("self_shoot", shortVideoContext.shootWay)) {
            C145995oB c145995oB6 = new C145995oB();
            c145995oB6.LJI("creation_id", shortVideoContext.LJI());
            c145995oB6.LJI("shoot_way", shortVideoContext.shootWay);
            c145995oB6.LJI("enter_method", shortVideoContext.enterMethod);
            c145995oB6.LJI("enter_from", shortVideoContext.enterFrom);
            FMX.LJIIL("shoot", c145995oB6.LIZ);
            return;
        }
        if (!o.LJ("schema", shortVideoContext.shootWay) || (extraLogParams = shortVideoContext.creativeFlowData.getExtraLogParams()) == null) {
            return;
        }
        String str8 = extraLogParams.get("has_tracker_shoot_event");
        if (!C78685UuP.LJJJZ(str8) || Boolean.parseBoolean(str8) || !o.LJ("music_card", extraLogParams.get("search_enter_position"))) {
            return;
        }
        C145995oB c145995oB7 = new C145995oB();
        c145995oB7.LJI("creation_id", shortVideoContext.LJI());
        String str9 = extraLogParams.get("search_result_id");
        if (str9 != null) {
            str4 = str9;
        }
        c145995oB7.LJI("music_id", str4);
        c145995oB7.LJI("shoot_way", "single_song");
        c145995oB7.LJI("shoot_entrance", "single_song");
        c145995oB7.LJI("enter_from", "general_search");
        c145995oB7.LJFF(extraLogParams);
        FMX.LJIIL("shoot", c145995oB7.LIZ);
    }

    public static void LIZ(String str, ShortVideoContext shortVideoContext) {
        Object obj;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", shortVideoContext.LJI());
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("shoot_page", "video_shoot_page");
        c145995oB.LJI("is_westwindow_exist", shortVideoContext.isWestWindowExistStr);
        c145995oB.LJI("shoot_enter_method", shortVideoContext.enterMethod);
        c145995oB.LJI("exit_method", str);
        if (H8W.LIZIZ >= 0) {
            obj = Long.valueOf(System.currentTimeMillis() - H8W.LIZIZ);
        } else {
            obj = "-1";
        }
        c145995oB.LIZJ(obj, "shoot_exit_duration");
        c145995oB.LJI("furthest_page", H8W.LIZJ);
        FMX.LJIIL("shoot_exit", c145995oB.LIZ);
    }
}
