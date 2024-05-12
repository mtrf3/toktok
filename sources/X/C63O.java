package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.63O, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63O {
    public static final void LIZ(C63W stickerMobType, VideoPublishEditModel publishEditModel, boolean z) {
        String str;
        String str2;
        o.LJIIIZ(stickerMobType, "stickerMobType");
        o.LJIIIZ(publishEditModel, "publishEditModel");
        switch (C63V.LIZ[stickerMobType.ordinal()]) {
            case 1:
                str = "click_poll_on_sticker_panel";
                break;
            case 2:
                str = "click_comment_on_sticker_panel";
                break;
            case 3:
                str = "click_custom_on_sticker_panel";
                break;
            case 4:
                str = "click_donation_on_sticker_panel";
                break;
            case 5:
                str = "click_hashtag_on_sticker_panel";
                break;
            case 6:
                str = "click_info_on_sticker_panel";
                break;
            case 7:
                str = "click_live_countdown_on_sticker_panel";
                break;
            case 8:
                str = "click_mention_on_sticker_panel";
                break;
            case 9:
                str = "click_qa_on_sticker_panel";
                break;
            default:
                throw new C162476Zf();
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", publishEditModel.getCreationId());
        c145995oB.LJI("shoot_way", publishEditModel.mShootWay);
        c145995oB.LJI("content_type", H7R.LJIIIZ(publishEditModel));
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(publishEditModel));
        c145995oB.LJI("enter_from", "video_edit_page");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LJI("is_new_sticker_framework", str2);
        FMX.LJIIL(str, c145995oB.LIZ);
    }
}
