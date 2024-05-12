package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.5Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135005Ro {
    public static final /* synthetic */ int LIZ = 0;

    public static C145995oB LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
        c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_tab_name", H7R.LJJ(videoPublishEditModel));
        return c145995oB;
    }

    public static void LJII(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        C145995oB LIZIZ = LIZIZ(editModel);
        LIZIZ.LJI("creation_id", editModel.getCreationId());
        LIZIZ.LJI("shoot_way", editModel.mShootWay);
        LIZIZ.LIZ(editModel.getHasClippedEffect() ? 1 : 0, "is_edit_effect_duration");
        int i = editModel.draftId;
        if (i != 0) {
            LIZIZ.LIZ(i, "draft_id");
        }
        if (!TextUtils.isEmpty(editModel.newDraftId)) {
            LIZIZ.LIZLLL("new_draft_id", editModel.newDraftId);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<EffectPointModel> it = editModel.getEffectList().iterator();
        while (it.hasNext()) {
            EffectPointModel next = it.next();
            if (!TextUtils.isEmpty(next.getName())) {
                sb.append(next.getName());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            String nameList = sb.substring(0, sb.length() - 1);
            o.LJIIIIZZ(nameList, "nameList");
            LIZIZ.LIZLLL("effect_name", nameList);
        }
        String editEffectListStr = editModel.getEditEffectListStr();
        o.LJIIIIZZ(editEffectListStr, "editModel.editEffectListStr");
        LIZIZ.LIZLLL("effect_list", editEffectListStr);
        String editEffectSelectionStr = editModel.getEditEffectSelectionStr();
        o.LJIIIIZZ(editEffectSelectionStr, "editModel.editEffectSelectionStr");
        LIZIZ.LIZLLL("effect_selected_from", editEffectSelectionStr);
        String editEffectIndexStr = editModel.getEditEffectIndexStr();
        o.LJIIIIZZ(editEffectIndexStr, "editModel.editEffectIndexStr");
        LIZIZ.LIZLLL("effect_index", editEffectIndexStr);
        C60903NvH.LJIIJJI().LJJIIZI().LIZIZ("effect_confirm", LIZIZ.LIZ);
    }

    public static void LJIIIZ(VideoPublishEditModel editModel, String event) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(event, "event");
        C145995oB LIZIZ = LIZIZ(editModel);
        LIZIZ.LIZ(0, "is_editor_pro");
        LIZIZ.LJI("creation_tool", "effect");
        GXR.LIZ(event, LIZIZ.LIZ);
    }

    public static void LJ(VideoPublishEditModel editModel, String str, boolean z) {
        String str2;
        o.LJIIIZ(editModel, "editModel");
        C145995oB LIZIZ = LIZIZ(editModel);
        if (str == null) {
            str = "";
        }
        LIZIZ.LJI("tab_name", str);
        if (z) {
            str2 = "play";
        } else {
            str2 = "pause";
        }
        LIZIZ.LJI("to_status", str2);
        LIZIZ.LIZ(0, "is_editor_pro");
        GXR.LIZ("click_effect_play", LIZIZ.LIZ);
    }

    public static C145995oB LIZ(int i, int i2, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        C145995oB c145995oB = new C145995oB();
        Q8U.LIZJ(c145995oB, "effect_id", str, videoPublishEditModel, "creation_id");
        c145995oB.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LIZ(i, "is_editor_pro");
        c145995oB.LIZ(i2, "effect_source");
        c145995oB.LJI("effect_designer_uid", str2);
        return c145995oB;
    }

    public static void LIZLLL(int i, VideoPublishEditModel editModel, String str, boolean z, boolean z2) {
        String str2;
        o.LJIIIZ(editModel, "editModel");
        C145995oB LIZIZ = LIZIZ(editModel);
        if (str == null) {
            str = "";
        }
        LIZIZ.LJI("tab_name", str);
        LIZIZ.LIZ(i, "effect_cnt");
        int i2 = editModel.draftId;
        if (i2 != 0) {
            LIZIZ.LIZ(i2, "draft_id");
        }
        if (!TextUtils.isEmpty(editModel.newDraftId)) {
            LIZIZ.LIZLLL("new_draft_id", editModel.newDraftId);
        }
        if (z) {
            if (z2) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZIZ.LIZLLL("is_red_dot", str2);
        }
        LIZIZ.LIZ(0, "is_editor_pro");
        GXR.LIZ("click_effect_tab", LIZIZ.LIZ);
    }

    public static void LJFF(VideoPublishEditModel editModel, EffectModel effectModel, String str, int i, boolean z, boolean z2) {
        String str2;
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectModel, "effectModel");
        IInternalAVService LIZ2 = AVServiceImpl.LIZ();
        LIZ2.setLastStickerId(effectModel.key, 7);
        LIZ2.setLastStickerId(effectModel.resourceId, 6);
        C145995oB LIZIZ = LIZIZ(editModel);
        if (str == null) {
            str = "";
        }
        LIZIZ.LJI("tab_name", str);
        LIZIZ.LIZ(1003, "scene_id");
        LIZIZ.LJI("effect_name", effectModel.name);
        LIZIZ.LJI("effect_id", effectModel.key);
        LIZIZ.LIZ(i + 1, "index");
        LIZIZ.LIZ(effectModel.isGoToCapCutEffect ? 1 : 0, "is_capcut");
        LIZIZ.LIZ(z ? 1 : 0, "is_editor_pro");
        LIZIZ.LIZ(z2 ? 1 : 0, "is_multi_track");
        if (z) {
            str2 = "editor_pro";
        } else {
            str2 = "effect_entrance";
        }
        LIZIZ.LJI("entrance", str2);
        int i2 = editModel.draftId;
        if (i2 != 0) {
            LIZIZ.LIZ(i2, "draft_id");
        }
        if (!TextUtils.isEmpty(editModel.newDraftId)) {
            LIZIZ.LIZLLL("new_draft_id", editModel.newDraftId);
        }
        LIZIZ.LIZ(effectModel.source, "effect_source");
        LIZIZ.LIZLLL("effect_designer_uid", effectModel.designerId);
        GXR.LIZ("effect_click", LIZIZ.LIZ);
    }

    public static void LIZJ(VideoPublishEditModel editModel, String str, String tabKey, int i, String status, long j, Integer num, String str2) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(tabKey, "tabKey");
        o.LJIIIZ(status, "status");
        C145995oB LIZIZ = LIZIZ(editModel);
        LIZIZ.LJI("effect_id", str);
        LIZIZ.LJI("tab_name", tabKey);
        LIZIZ.LJI("status", status);
        LIZIZ.LIZ(0, "is_editor_pro");
        LIZIZ.LIZIZ(j, "duration");
        LIZIZ.LIZ(i + 1, "index");
        LIZIZ.LIZJ(num, "effect_source");
        if (str2 != null) {
            LIZIZ.LIZLLL("effect_designer_uid", str2);
        }
        GXR.LIZ("effect_apply_popup", LIZIZ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.5oB] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static void LJIIIIZZ(VideoPublishEditModel editModel, String effectId, String str, int i, boolean z, boolean z2, String fromLocation, Integer num, String str2, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        ?? r6 = z;
        if ((i2 & 16) != 0) {
            r6 = 0;
        }
        ?? r7 = z2;
        if ((i2 & 32) != 0) {
            r7 = 0;
        }
        if ((i2 & 64) != 0) {
            fromLocation = "other";
        }
        if ((i2 & 128) != 0) {
            num = null;
        }
        if ((i2 & 256) != 0) {
            str2 = null;
        }
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(fromLocation, "fromLocation");
        ?? LIZIZ = LIZIZ(editModel);
        LIZIZ.LJI("effect_id", effectId);
        if (str == null) {
            str = "";
        }
        LIZIZ.LJI("tab_name", str);
        int i3 = i + 1;
        LIZIZ.LIZ(i3, "index");
        LIZIZ.LIZ(r6, "is_editor_pro");
        LIZIZ.LIZ(r7, "is_multi_track");
        LIZIZ.LJI("from_location", fromLocation);
        LIZIZ.LIZ(i3, "impr_position");
        if (num != null) {
            num.intValue();
            LIZIZ.LIZ(num.intValue(), "effect_source");
        }
        LIZIZ.LIZLLL("effect_designer_uid", str2);
        GXR.LIZ("effect_show", LIZIZ.LIZ);
    }
}
