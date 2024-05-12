package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.List;

/* renamed from: X.6H6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6H6 {
    public static final /* synthetic */ int LIZ = 0;

    public static C145995oB LIZ(ShortVideoContext shortVideoContext, VideoPublishEditModel videoPublishEditModel) {
        StickerNewEngineModel stickerNewEngineModel;
        List<AddYoursStickerModel> list;
        AddYoursStickerModel addYoursStickerModel;
        Integer isOperationSet;
        int i;
        StickerNewEngineModel stickerNewEngineModel2;
        List<AddYoursStickerModel> list2;
        AddYoursStickerModel addYoursStickerModel2;
        Integer isOperationSet2;
        C145995oB c145995oB = new C145995oB();
        int i2 = 0;
        String str = "";
        if (videoPublishEditModel != null) {
            c145995oB.LIZLLL("enter_from", "video_edit_page");
            String str2 = videoPublishEditModel.mShootWay;
            if (str2 == null) {
                str2 = "";
            }
            c145995oB.LIZLLL("shoot_way", str2);
            String creationId = videoPublishEditModel.getCreationId();
            if (creationId == null) {
                creationId = "";
            }
            c145995oB.LIZLLL("creation_id", creationId);
            c145995oB.LIZLLL("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
            c145995oB.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel));
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel != null && (stickerNewEngineModel2 = creativeModel.stickerModel) != null && (list2 = stickerNewEngineModel2.addYoursStickerModels) != null && (addYoursStickerModel2 = (AddYoursStickerModel) ORZ.LJLLLL(list2)) != null && (isOperationSet2 = addYoursStickerModel2.isOperationSet()) != null) {
                i = isOperationSet2.intValue();
            } else {
                i = 0;
            }
            c145995oB.LIZ(i, "is_operation_set");
        }
        if (shortVideoContext != null) {
            c145995oB.LIZLLL("enter_from", "video_shoot_page");
            String str3 = shortVideoContext.shootWay;
            if (str3 == null) {
                str3 = "";
            }
            c145995oB.LIZLLL("shoot_way", str3);
            String LJI = shortVideoContext.LJI();
            if (LJI != null) {
                str = LJI;
            }
            c145995oB.LIZLLL("creation_id", str);
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            if (creativeModel2 != null && (stickerNewEngineModel = creativeModel2.stickerModel) != null && (list = stickerNewEngineModel.addYoursStickerModels) != null && (addYoursStickerModel = (AddYoursStickerModel) ORZ.LJLLLL(list)) != null && (isOperationSet = addYoursStickerModel.isOperationSet()) != null) {
                i2 = isOperationSet.intValue();
            }
            c145995oB.LIZ(i2, "is_operation_set");
        }
        return c145995oB;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r6, java.lang.String r7) {
        /*
            r3 = 0
            X.5oB r2 = LIZ(r3, r5)
            if (r6 == 0) goto L69
            X.6Gr r0 = r6.getStickerType()
        Lb:
            r4 = -1
            if (r0 != 0) goto L5b
        Le:
            java.lang.String r1 = ""
        L10:
            java.lang.String r0 = "prop_id"
            r2.LIZLLL(r0, r1)
            java.lang.String r0 = "method"
            r2.LIZLLL(r0, r7)
            if (r5 == 0) goto L59
            java.lang.String r1 = r5.mShootWay
        L1e:
            java.lang.String r0 = "shoot_entrance"
            r2.LIZLLL(r0, r1)
            java.lang.String r0 = "sticker_type"
            r2.LIZ(r4, r0)
            if (r5 == 0) goto L47
            int r0 = r5.draftId
            if (r0 != 0) goto L49
        L2e:
            java.lang.String r0 = r5.newDraftId
        L30:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3f
            if (r5 == 0) goto L3a
            java.lang.String r3 = r5.newDraftId
        L3a:
            java.lang.String r0 = "new_draft_id"
            r2.LIZLLL(r0, r3)
        L3f:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "prop_time_set"
            X.FMX.LJIIL(r0, r1)
            return
        L47:
            r1 = r3
            goto L4f
        L49:
            int r0 = r5.draftId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L4f:
            java.lang.String r0 = "draft_id"
            r2.LIZJ(r1, r0)
            if (r5 == 0) goto L57
            goto L2e
        L57:
            r0 = r3
            goto L30
        L59:
            r1 = r3
            goto L1e
        L5b:
            int[] r1 = X.C6H9.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r1 = "text_sticker"
            goto L10
        L69:
            r0 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6H6.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel, java.lang.String):void");
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, StickerModel stickerModel) {
        Object obj;
        EnumC157656Gr stickerType;
        C145995oB LIZ2 = LIZ(shortVideoContext, videoPublishEditModel);
        if (stickerModel != null && (stickerType = stickerModel.getStickerType()) != null) {
            obj = Integer.valueOf(stickerType.getType());
        } else {
            obj = "";
        }
        LIZ2.LIZJ(obj, "sticker_type");
        FMX.LJIIL("prop_adjust", LIZ2.LIZ);
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, StickerModel stickerModel) {
        Object obj;
        EnumC157656Gr stickerType;
        EnumC157656Gr stickerType2;
        C145995oB LIZ2 = LIZ(shortVideoContext, videoPublishEditModel);
        if (stickerModel != null && (stickerType2 = stickerModel.getStickerType()) != null) {
            obj = Integer.valueOf(stickerType2.getType());
        } else {
            obj = "";
        }
        LIZ2.LIZJ(obj, "sticker_type");
        CreativeModel creativeModel = null;
        if (videoPublishEditModel != null) {
            creativeModel = videoPublishEditModel.creativeModel;
        }
        if (shortVideoContext != null) {
            creativeModel = shortVideoContext.creativeModel;
        }
        if (stickerModel != null && (stickerType = stickerModel.getStickerType()) != null && C6H9.LIZ[stickerType.ordinal()] == 1 && creativeModel != null) {
            C161226Uk.LIZIZ(creativeModel, new AddYoursStickerModel(null, null, null, null, null, null, false, false, false, null, null, null, 4095, null), LIZ2);
        }
        FMX.LJIIL("prop_delete", LIZ2.LIZ);
    }
}
