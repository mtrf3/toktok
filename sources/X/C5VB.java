package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5VB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VB {
    public static boolean LIZ;
    public static MvCreateVideoData LIZIZ;

    public static void LIZ(VideoPublishEditModel editModel, boolean z) {
        o.LJIIIZ(editModel, "editModel");
        if (z) {
            LIZ = true;
            editModel.isPhotoMvMode = false;
            editModel.isPhotoMvMode1080p = false;
            editModel.isPhotoMvMusic = false;
            LIZIZ = editModel.mvCreateVideoData;
            editModel.mvCreateVideoData = null;
            editModel.getAvetParameter().setContentType("video");
            return;
        }
        LIZ = false;
        editModel.isPhotoMvMode = true;
        editModel.isPhotoMvMode1080p = true;
        editModel.isPhotoMvMusic = true;
        editModel.mvCreateVideoData = LIZIZ;
        LIZIZ = null;
        editModel.getAvetParameter().setContentType("slideshow");
    }
}
