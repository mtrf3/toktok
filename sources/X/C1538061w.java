package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.61w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1538061w {
    public static int LIZ;

    public static C188727au LIZIZ(VideoPublishEditModel mModel, String str) {
        o.LJIIIZ(mModel, "mModel");
        C188727au c188727au = new C188727au();
        c188727au.LJI("creation_id", mModel.getCreationId());
        c188727au.LJI("shoot_way", mModel.mShootWay);
        c188727au.LJI("music_id", mModel.replaceMusicModel.getMid());
        c188727au.LJI("replace_music_id", str);
        c188727au.LJI("enter_from", "video_edit_page");
        c188727au.LJI("enter_method", mModel.shootEnterMethod);
        c188727au.LJI("item_id", mModel.replaceMusicModel.getAid());
        return c188727au;
    }

    public static void LIZ(VideoPublishEditModel mModel, String str, Integer num) {
        int i;
        o.LJIIIZ(mModel, "mModel");
        C188727au c188727au = new C188727au();
        c188727au.LJI("creation_id", mModel.getCreationId());
        c188727au.LJI("group_id", mModel.replaceMusicModel.getAid());
        c188727au.LJI("shoot_way", mModel.mShootWay);
        c188727au.LJI("content_source", "upload");
        c188727au.LIZLLL(LIZ, "is_long_video");
        c188727au.LJI("music_id", mModel.replaceMusicModel.getMid());
        c188727au.LJI("replace_music_content_type", H8F.LJ(mModel));
        c188727au.LJI("replace_music_id", str);
        int i2 = 1;
        int i3 = 0;
        if (mModel.veAudioRecorderParam != null) {
            i = 1;
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "video_has_original_sound");
        if (mModel.creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene()) {
            c188727au.LJI("enter_from", "promote");
        } else {
            c188727au.LJI("enter_from", "video_edit_page");
        }
        if (C44384HbQ.LJLLLLLL(mModel)) {
            if (num != null) {
                if (num.intValue() <= 0) {
                    i2 = 0;
                }
                i3 = i2;
            }
            c188727au.LIZLLL(i3, "is_similar_music");
        }
        FMX.LJIIL("publish_replace_music", c188727au.LIZ);
    }
}
