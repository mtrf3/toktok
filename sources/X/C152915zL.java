package X;

import Y.ACallableS105S0100000_2;
import Y.AgS120S0100000_2;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5zL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152915zL {
    public static final Bitmap LIZ(VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        SingleImageData singleImageData = (SingleImageData) ListProtector.get(videoPublishEditModel.getImageAlbumData().getImageList(), videoPublishEditModel.getCoverPublishModel().getImageCurrentIndex());
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        o.LJIIIIZZ(imageAlbumData, "this.imageAlbumData");
        Bitmap LIZIZ = new RunnableC151315wl(singleImageData, imageAlbumData, null, null, null, null, 60).LIZIZ();
        if (videoPublishEditModel.getCoverPublishModel().getEffectTextModel().getHasCoverText() && LIZIZ != null) {
            return OUR.LIZJ(videoPublishEditModel, LIZIZ);
        }
        return LIZIZ;
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(videoPublishEditModel, "<this>");
        C10K.LIZJ(new ACallableS105S0100000_2(videoPublishEditModel, 36)).LJ(new AgS120S0100000_2(interfaceC88472Yns, 35), C10K.LJIIIIZZ, null);
    }
}
