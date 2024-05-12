package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6Uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161226Uk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZLLL(Object model) {
        ShortVideoContext shortVideoContext;
        o.LJIIIZ(model, "model");
        Object obj = null;
        if (model instanceof ShortVideoContext) {
            shortVideoContext = (ShortVideoContext) model;
        } else {
            shortVideoContext = null;
        }
        if (model instanceof VideoPublishEditModel) {
            obj = model;
        }
        C145995oB c145995oB = new C145995oB();
        if (shortVideoContext != null) {
            c145995oB.LIZLLL("enter_from", "video_shoot_page");
            c145995oB.LIZLLL("shoot_way", shortVideoContext.shootWay);
            c145995oB.LIZLLL("creation_id", shortVideoContext.LJI());
            c145995oB.LIZLLL("content_type", "video");
            c145995oB.LIZLLL("content_source", "shoot");
        } else if (obj != null) {
            c145995oB.LIZLLL("enter_from", "video_edit_page");
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) model;
            c145995oB.LIZLLL("shoot_way", videoPublishEditModel.mShootWay);
            c145995oB.LIZLLL("creation_id", videoPublishEditModel.getCreationId());
            c145995oB.LIZLLL("content_type", H7R.LJIIIZ(videoPublishEditModel));
            c145995oB.LIZLLL("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        }
        GXR.LIZ("click_add_yours_entrance", c145995oB.LIZ);
    }

    public static /* synthetic */ void LIZJ(CreativeModel creativeModel, C145995oB c145995oB) {
        LIZIZ(creativeModel, new AddYoursStickerModel(null, null, null, null, null, null, false, false, false, null, null, null, 4095, null), c145995oB);
    }

    public static C145995oB LIZ(C145995oB c145995oB, String str, Object obj) {
        if (obj == null) {
            return c145995oB;
        }
        if (obj instanceof String) {
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() == 0 || ujb.o.LJJJJJL(charSequence)) {
                return c145995oB;
            }
            c145995oB.getClass();
            c145995oB.LJI(str, (String) obj);
            return c145995oB;
        }
        if (obj instanceof Integer) {
            c145995oB.LIZ(((Number) obj).intValue(), str);
            return c145995oB;
        }
        if (obj instanceof Long) {
            c145995oB.LIZIZ(((Number) obj).longValue(), str);
            return c145995oB;
        }
        c145995oB.LIZJ(obj, str);
        return c145995oB;
    }

    public static void LIZIZ(CreativeModel creativeModel, AddYoursStickerModel addYoursStickerModel, C145995oB eventMapBuilder) {
        String str;
        String str2;
        Long l;
        Integer isOperationSet;
        o.LJIIIZ(creativeModel, "creativeModel");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) ORZ.LJLLLL(creativeModel.stickerModel.addYoursStickerExtras);
        AddYoursStickerModel addYoursStickerModel2 = (AddYoursStickerModel) ORZ.LJLLLL(creativeModel.stickerModel.addYoursStickerModels);
        if (addYoursStickerModel != null && addYoursStickerModel.getId() != 0) {
            addYoursStickerModel2 = addYoursStickerModel;
        }
        if (addYoursStickerModel2 == null || addYoursStickerModel == null) {
            eventMapBuilder.LIZLLL("is_add_yours", CardStruct.IStatusCode.DEFAULT);
            return;
        }
        LIZ(eventMapBuilder, "add_yours_enter_method", addYoursStickerModel2.getAddYoursEnterMethod());
        eventMapBuilder.getClass();
        eventMapBuilder.LJI("is_add_yours", "1");
        if (addYoursStickerModel2.getTopicID() == null) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        eventMapBuilder.LJI("is_initiator", str);
        boolean z = false;
        if (addYoursStickerExtras != null && o.LJ(addYoursStickerExtras.getViewerInvited(), Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        eventMapBuilder.LJI("is_invited", str2);
        LIZ(eventMapBuilder, "add_yours_title", addYoursStickerModel2.getTopicText());
        String str3 = null;
        if (addYoursStickerExtras != null) {
            l = addYoursStickerExtras.getFromItemId();
        } else {
            l = null;
        }
        LIZ(eventMapBuilder, "from_group_id", l);
        LIZ(eventMapBuilder, "add_yours_id", addYoursStickerModel2.getTopicID());
        if (addYoursStickerExtras != null) {
            str3 = addYoursStickerExtras.getFollowStatus();
        }
        LIZ(eventMapBuilder, "follow_status", str3);
        LIZ(eventMapBuilder, "is_operation_set", addYoursStickerModel2.isOperationSet());
        if (!creativeModel.stickerModel.isFromFollowAddYours && (((isOperationSet = addYoursStickerModel2.isOperationSet()) == null || isOperationSet.intValue() == 0) && !o.LJ(addYoursStickerModel2.getTopicTextFromRecommendTopicList(), addYoursStickerModel2.getTopicText()))) {
            z = true;
        }
        if (z) {
            eventMapBuilder.LIZLLL("is_first_author", "1");
        } else {
            eventMapBuilder.LIZLLL("is_first_author", CardStruct.IStatusCode.DEFAULT);
        }
    }
}
