package Y;

import X.C145995oB;
import X.C59127NIl;
import X.C5KN;
import X.C60903NvH;
import X.FMX;
import X.GXR;
import X.HZV;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public class AObjectS88S0101000_7 implements InterfaceC88471Ynr {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS88S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS88S0101000_7 aObjectS88S0101000_7, Object obj, Object obj2) {
        switch (aObjectS88S0101000_7.i1) {
            case 0:
                C59127NIl c59127NIl = (C59127NIl) obj;
                c59127NIl.LJ((Aweme) aObjectS88S0101000_7.l0);
                return c59127NIl;
            case 1:
                Aweme aweme = (Aweme) aObjectS88S0101000_7.l0;
                C59127NIl c59127NIl2 = (C59127NIl) obj;
                if (((Boolean) obj2).booleanValue()) {
                    c59127NIl2.LJ(aweme);
                } else {
                    c59127NIl2.LIZIZ(aweme);
                }
                return c59127NIl2;
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS88S0101000_7.l0;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel != null) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("enter_from", "video_post_page");
                    c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
                    c145995oB.LJI("prop_list", videoPublishEditModel.getStickers());
                    c145995oB.LJI("from_prop_id", videoPublishEditModel.fromPropId);
                    int i = videoPublishEditModel.draftId;
                    if (i != 0) {
                        c145995oB.LIZ(i, "draft_id");
                    }
                    if (!TextUtils.isEmpty(videoPublishEditModel.newDraftId)) {
                        c145995oB.LIZLLL("new_draft_id", videoPublishEditModel.newDraftId);
                    }
                    if (videoPublishEditModel.mDraftToEditFrom == 0) {
                        c145995oB.LIZLLL("draft_way", "general_draft_list");
                    }
                    GXR.LIZ("click_draft_edit_cancel", c145995oB.LIZ);
                    C5KN.LIZ();
                    if (!bool.booleanValue() && bool2.booleanValue()) {
                        Intent intent = new Intent();
                        if (videoPublishContainerScene.LLLLJI().LJJJJJL == 0) {
                            intent.setFlags(536870912);
                            HZV.LIZ().LIZ(videoPublishContainerScene.requireActivity(), intent, false, videoPublishContainerScene.LLILZLL.creativeModel.draftInfoModel.isConvertToNormalDraft);
                        }
                    }
                    if (bool.booleanValue()) {
                        C60903NvH.LJIIJJI().LJJJI().LJIIIZ(videoPublishContainerScene.LLILZLL.isDraftMusicIllegal());
                        videoPublishContainerScene.a("cancel draft box edit");
                        C145995oB c145995oB2 = new C145995oB();
                        c145995oB2.LJI("creation_id", videoPublishContainerScene.LLILZLL.getCreationId());
                        c145995oB2.LJI("shoot_way", videoPublishContainerScene.LLILZLL.mShootWay);
                        int i2 = videoPublishContainerScene.LLILZLL.draftId;
                        if (i2 != 0) {
                            c145995oB2.LIZ(i2, "draft_id");
                        }
                        if (!TextUtils.isEmpty(videoPublishContainerScene.LLILZLL.newDraftId)) {
                            c145995oB2.LIZLLL("new_draft_id", videoPublishContainerScene.LLILZLL.newDraftId);
                        }
                        FMX.LJIIL("video_post_page_cancel", c145995oB2.LIZ);
                    }
                    C60903NvH.LJIIJJI().getPublishService().LJJIJL();
                }
                return null;
        }
    }

    public static final Object invoke$1(AObjectS88S0101000_7 aObjectS88S0101000_7, Object obj, Object obj2) {
        String str;
        switch (aObjectS88S0101000_7.i1) {
            case 0:
                return ((InterfaceC65784Pro) aObjectS88S0101000_7.l0).invoke();
            default:
                VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS88S0101000_7.l0;
                Boolean bool = (Boolean) obj2;
                videoPublishContainerScene.LLILZLL.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = bool.booleanValue() ? 1 : 0;
                C145995oB c145995oB = new C145995oB();
                VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
                if (videoPublishEditModel != null) {
                    str = videoPublishEditModel.getCreationId();
                } else {
                    str = "mModel is null";
                }
                c145995oB.LJI("creation_id", str);
                c145995oB.LJI("content_type", videoPublishContainerScene.LLLLIILLL());
                c145995oB.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
                c145995oB.LIZ(bool.booleanValue() ? 1 : 0, "action_type");
                FMX.LJIIL("aigc_toggle", c145995oB.LIZ);
                return null;
        }
    }
}
