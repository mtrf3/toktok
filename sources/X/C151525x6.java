package X;

import Y.ACallableS2S1202000_2;
import Y.ACallableS54S0300000_2;
import Y.AgS120S0100000_2;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSurfaceData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151525x6 {
    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        AVChallenge recordChallenge;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        C78934UyQ.LJLIL.LIZLLL().getClass();
        C62002c0.LIZ.getClass();
        if (!C62002c0.LIZ() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isDuet() || videoPublishEditModel.isShoutout() || C1DG.LJIIIIZZ() || o.LJ(videoPublishEditModel.mShootWay, "mission")) {
            return true;
        }
        if ((o.LJ(videoPublishEditModel.mShootWay, "challenge") && (recordChallenge = videoPublishEditModel.creativeModel.commerceModel.getRecordChallenge()) != null && recordChallenge.isCommerce) || o.LJ(videoPublishEditModel.mShootWay, "tcm_upload") || videoPublishEditModel.qaStruct != null || videoPublishEditModel.isCommentReply() || C6H4.LJFF(videoPublishEditModel.creativeModel.stickerModel) || videoPublishEditModel.isCurrentAutoCutMode() || C78685UuP.LJJJZ(videoPublishEditModel.creativeModel.paidContentModel.getCollectionId())) {
            return true;
        }
        return false;
    }

    public static final void LJI(ImageSurfaceData imageSurfaceData) {
        o.LJIIIZ(imageSurfaceData, "<this>");
        imageSurfaceData.setSurfaceViewHeight(C151105wQ.LIZ);
        imageSurfaceData.setSurfaceViewWidth(C151105wQ.LIZIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r4.height > (X.C151435wx.LIZIZ().getMaxImageSideMultiples() * X.C151105wQ.LIZ())) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZJ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "mediaModel"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "newPath"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.exists()
            r0 = 1
            if (r1 == 0) goto L17
            return r0
        L17:
            int r2 = r4.width
            int r1 = X.C151105wQ.LIZ()
            com.ss.android.ugc.aweme.image.experiment.PhotoModePerformanceOptiData r0 = X.C151435wx.LIZIZ()
            int r0 = r0.getMaxImageSideMultiples()
            int r0 = r0 * r1
            if (r2 > r0) goto L39
            int r2 = r4.height
            int r1 = X.C151105wQ.LIZ()
            com.ss.android.ugc.aweme.image.experiment.PhotoModePerformanceOptiData r0 = X.C151435wx.LIZIZ()
            int r0 = r0.getMaxImageSideMultiples()
            int r0 = r0 * r1
            if (r2 <= r0) goto L6d
        L39:
            java.lang.String r3 = r4.fileLocalUriPath
            int r0 = X.C151105wQ.LIZ()
            int r2 = r0 * 2
            int r0 = X.C151105wQ.LIZ()
            int r1 = r0 * 2
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r3 = X.C44729Hgz.LJI(r3, r2, r1, r0)
            if (r3 == 0) goto L6d
            java.io.File r2 = new java.io.File
            r2.<init>(r5)
            r1 = 70
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r2 = X.C42299Git.LJFF(r3, r2, r1, r0)
            boolean r0 = X.C40980G6m.LIZ()
            if (r0 == 0) goto L6c
            java.lang.String r1 = r4.fileLocalUriPath
            java.lang.String r0 = "mediaModel.fileLocalUriPath"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.C43134GwM.LIZLLL(r1, r5)
        L6c:
            return r2
        L6d:
            java.lang.String r0 = r4.fileLocalUriPath
            boolean r0 = X.C44694HgQ.LIZJ(r0, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151525x6.LIZJ(com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, java.lang.String):boolean");
    }

    public static final StickerItemModel LJFF(TextStickerData textStickerData, int i) {
        o.LJIIIZ(textStickerData, "<this>");
        StickerItemModel stickerItemModel = new StickerItemModel(KMP.LJ("text_sticker_", i), null, GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), textStickerData), i, false, 0, 1000, 2);
        stickerItemModel.isImageStickerLayer = true;
        return stickerItemModel;
    }

    public static Bitmap LIZIZ(String path, int i, int i2) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        o.LJIIIZ(path, "path");
        o.LJIIIZ(config, "config");
        if (C44687HgJ.LIZIZ(path)) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            o.LJIIIIZZ(createBitmap, "createBitmap(width, height, config)");
            if (C151605xE.LIZ(createBitmap, path, 1)) {
                return createBitmap;
            }
        }
        return null;
    }

    public static final void LIZ(java.util.Map<SingleImageData, Integer> needCompileImages, ImageAlbumData imageAlbumData, CreativeInfo creativeInfo, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(needCompileImages, "needCompileImages");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        C10K.LIZJ(new ACallableS54S0300000_2(creativeInfo, needCompileImages, imageAlbumData, 3)).LJ(new AgS120S0100000_2(interfaceC65784Pro, 34), C10K.LJIIIIZZ, null);
    }

    public static C10H LJ(String path, int i, int i2, InterfaceC88472Yns interfaceC88472Yns, int i3) {
        Bitmap.Config config;
        int i4 = i;
        int i5 = i2;
        if ((i3 & 2) != 0) {
            i4 = C151105wQ.LIZ();
        }
        if ((i3 & 4) != 0) {
            i5 = C151105wQ.LIZ();
        }
        if ((i3 & 8) != 0) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = null;
        }
        o.LJIIIZ(path, "path");
        o.LJIIIZ(config, "config");
        C10H c10h = new C10H();
        C10K.LIZIZ(new ACallableS2S1202000_2(path, i4, i5, config, interfaceC88472Yns, 2), C10K.LJI, c10h.LIZIZ());
        return c10h;
    }
}
