package X;

import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149375td {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C149475tn.LJLIL);

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (C44384HbQ.LLJILLL(videoPublishEditModel)) {
            CommonMobParamModel commonMobParamModel = videoPublishEditModel.creativeModel.commonMobModel;
            if (commonMobParamModel.storyMusicDefaultType == null) {
                if (C78866UxK.LJJJLZIJ(videoPublishEditModel) && !o.LJ("slideshow_rec", videoPublishEditModel.getMusicOrigin())) {
                    str = "shoot_page_selected";
                } else if (C149555tv.LIZ(videoPublishEditModel) == 1) {
                    str = "with_default_music";
                } else {
                    str = "no_default_music";
                }
                commonMobParamModel.storyMusicDefaultType = str;
            }
            return videoPublishEditModel.creativeModel.commonMobModel.storyMusicDefaultType;
        }
        return null;
    }
}
