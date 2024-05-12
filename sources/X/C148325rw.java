package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148325rw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, VideoPublishEditModel editModel, String str) {
        String str2;
        o.LJIIIZ(editModel, "editModel");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", editModel.mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(editModel));
        c145995oB.LJI("content_type", H7R.LJIIIZ(editModel));
        c145995oB.LJI("creation_id", editModel.getCreationId());
        if (!H7R.LJJJJL(editModel)) {
            str2 = "photo";
        } else {
            str2 = "video";
        }
        c145995oB.LJI("to_mode", str2);
        c145995oB.LJI("mix_type", "photo");
        c145995oB.LIZ(1, "is_multi_content");
        c145995oB.LIZ(i, "pic_cnt");
        c145995oB.LJI("click_method", str);
        GXR.LIZ("click_switch_btn", c145995oB.LIZ);
    }
}
