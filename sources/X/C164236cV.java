package X;

import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.g0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6cV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164236cV {
    public static final /* synthetic */ int LIZ = 0;

    public static final C145995oB LIZ(VideoPublishEditModel videoPublishEditModel) {
        int intValue;
        List<SingleImageData> imageList;
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "mModel");
        LIZ2.LJI("enter_from", "video_post_page");
        LIZ2.LJI("author_id", C44172HVg.LJIJ.getCurrentUserID());
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            intValue = imageList.size();
        } else {
            intValue = ((Number) g0.LJJIIJ(videoPublishEditModel).getSecond()).intValue();
        }
        LIZ2.LIZ(intValue, "pic_cnt");
        return LIZ2;
    }

    public static final void LIZJ(VideoPublishEditModel mModel) {
        o.LJIIIZ(mModel, "mModel");
        EditDescMobModel editDescMobModel = mModel.creativeModel.commonMobModel.editDescMobModel;
        if (!editDescMobModel.isMobExceedDescLimitToastPopUp) {
            editDescMobModel.isMobExceedDescLimitToastPopUp = true;
            GXR.LIZ("exceed_desc_limit_toast_pop_up", LIZ(mModel).LIZ);
        }
    }

    public static final void LIZLLL(VideoPublishEditModel mModel) {
        o.LJIIIZ(mModel, "mModel");
        EditDescMobModel editDescMobModel = mModel.creativeModel.commonMobModel.editDescMobModel;
        if (!editDescMobModel.isMobExceedTitleLimitToastPopUp) {
            editDescMobModel.isMobExceedTitleLimitToastPopUp = true;
            GXR.LIZ("exceed_title_limit_toast_pop_up", LIZ(mModel).LIZ);
        }
    }

    public static final void LIZIZ(VideoPublishEditModel mModel, String str, boolean z, InterfaceC88472Yns<? super C145995oB, ? extends C145995oB> interfaceC88472Yns) {
        Object second;
        List<SingleImageData> imageList;
        o.LJIIIZ(mModel, "mModel");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("shoot_way", mModel.mShootWay);
        c145995oB.LJI("content_source", H7R.LJIIIIZZ(mModel));
        c145995oB.LJI("content_type", H7R.LJIIIZ(mModel));
        c145995oB.LJI("creation_id", mModel.getCreationId());
        if (z) {
            ImageAlbumData imageAlbumData = mModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                second = Integer.valueOf(imageList.size());
            } else {
                second = null;
            }
        } else {
            second = g0.LJJIIJ(mModel).getSecond();
        }
        c145995oB.LIZJ(second, "pic_cnt");
        GXR.LIZ(str, interfaceC88472Yns.invoke(c145995oB).LIZ);
    }
}
