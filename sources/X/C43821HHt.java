package X;

import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageEncodeInfo;
import com.ss.android.ugc.aweme.image.model.ImageQualityInfo;
import com.ss.android.ugc.aweme.image.model.ImageSourceInfo;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HHt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43821HHt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        ImportVideoInfo importVideoInfo;
        String str2;
        List list;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList) {
                C145995oB c145995oB = new C145995oB();
                int i6 = 0;
                if (H7R.LJJLI(videoPublishEditModel)) {
                    ImportVideoInfo importVideoInfo2 = null;
                    if (C44384HbQ.LJZI(videoPublishEditModel)) {
                        str = singleImageData.getSrcImageInfo().getPath();
                    } else {
                        ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.importInfoList;
                        if (arrayList != null && (importVideoInfo = (ImportVideoInfo) ORZ.LJLLLL(arrayList)) != null) {
                            str = importVideoInfo.getOriginImportPath();
                        } else {
                            str = null;
                        }
                    }
                    LIZ(c145995oB, str, "origin");
                    ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
                    if (synthesisData != null) {
                        str2 = synthesisData.getPath();
                    } else {
                        str2 = null;
                    }
                    LIZ(c145995oB, str2, "encode");
                    c145995oB.LIZ(C44384HbQ.LJLJI(videoPublishEditModel) ? 1 : 0, "is_edit");
                    c145995oB.LIZ(0, "use_crop");
                    if (H7R.LJFF(videoPublishEditModel) || videoPublishEditModel.autoEnhanceOn) {
                        i6 = 1;
                    }
                    c145995oB.LIZ(i6, "edit_enhance");
                    c145995oB.LIZ(C78857UxB.LJJJIL(videoPublishEditModel.getEditFilterId()) ? 1 : 0, "edit_filter_id");
                    ArrayList<ImportVideoInfo> arrayList2 = videoPublishEditModel.importInfoList;
                    if (arrayList2 != null) {
                        importVideoInfo2 = (ImportVideoInfo) ORZ.LJLLLL(arrayList2);
                    }
                    c145995oB.LIZ(LIZLLL(importVideoInfo2, singleImageData.getSrcImageInfo()), "fast_import");
                    InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
                    if (infoStickerModel == null || (list = infoStickerModel.stickers) == null) {
                        list = C61878OQg.INSTANCE;
                    }
                    LIZJ(c145995oB, list);
                } else {
                    ImageQualityInfo imageQualityInfo = singleImageData.getImageQualityInfo();
                    if (imageQualityInfo != null) {
                        ImageSourceInfo imageSourceInfo = imageQualityInfo.getImageSourceInfo();
                        if (imageSourceInfo != null) {
                            ImportVideoInfo originAlbumImageData = singleImageData.getOriginAlbumImageData();
                            if (originAlbumImageData != null) {
                                i3 = originAlbumImageData.getVideoWidth();
                            } else {
                                i3 = -1;
                            }
                            c145995oB.LIZ(i3, "origin_width");
                            ImportVideoInfo originAlbumImageData2 = singleImageData.getOriginAlbumImageData();
                            if (originAlbumImageData2 != null) {
                                i4 = originAlbumImageData2.getVideoHeight();
                            } else {
                                i4 = -1;
                            }
                            c145995oB.LIZ(i4, "origin_height");
                            c145995oB.LIZIZ(imageSourceInfo.getSourceFileSize(), "origin_fileSize");
                            c145995oB.LIZ(imageSourceInfo.getSourceDegree(), "origin_degree");
                            c145995oB.LJI("origin_encode_type", imageSourceInfo.getSourceEncodeType());
                            c145995oB.LJI("origin_color_space", imageSourceInfo.getSourceColorSpace());
                            c145995oB.LIZ(LIZLLL(singleImageData.getOriginAlbumImageData(), singleImageData.getSrcImageInfo()), "fast_import");
                        }
                        ImageEncodeInfo imageEncodeInfo = imageQualityInfo.getImageEncodeInfo();
                        if (imageEncodeInfo != null) {
                            c145995oB.LIZ(imageEncodeInfo.getWidth(), "encode_width");
                            c145995oB.LIZ(imageEncodeInfo.getHeight(), "encode_height");
                            c145995oB.LIZIZ(imageEncodeInfo.getFileSize(), "encode_fileSize");
                            c145995oB.LJI("encode_type", imageEncodeInfo.getEncodeType());
                            c145995oB.LIZ(imageEncodeInfo.getEncodeQuality(), "encode_image_quality");
                            c145995oB.LIZ(imageEncodeInfo.getIsreencode(), "encode_isreencode");
                            c145995oB.LJI("encode_color_space", imageEncodeInfo.getEncodeColorSpace());
                            c145995oB.LJI("encode_api", imageEncodeInfo.getEncodeApi());
                            c145995oB.LJI("encode_format", imageEncodeInfo.getEncodeColorFormat());
                            c145995oB.LIZLLL("encode_depth", imageEncodeInfo.getEncodeDepth());
                        }
                        if (singleImageData.isEdited() || videoPublishEditModel.getImageAlbumData().getAutoEnhanceOn()) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        c145995oB.LIZ(i, "is_edit");
                        c145995oB.LIZ(singleImageData.isManualCrop() ? 1 : 0, "use_crop");
                        c145995oB.LIZ(H7R.LJFF(videoPublishEditModel) ? 1 : 0, "edit_enhance");
                        if (singleImageData.getFilterInfo().getFilterId().length() > 0) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        c145995oB.LIZ(i2, "edit_filter_id");
                        List<StickerItemModel> stickers = singleImageData.getStickerInfo().getStickers();
                        if (stickers == null) {
                            stickers = C61878OQg.INSTANCE;
                        }
                        LIZJ(c145995oB, stickers);
                    }
                }
                c145995oB.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
                c145995oB.LIZ(!o.LJ(H7R.LJIIIIZZ(videoPublishEditModel), "upload") ? 1 : 0, "publish_type");
                C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
                if (currentUser != null) {
                    i5 = currentUser.LJFF();
                } else {
                    i5 = -1;
                }
                c145995oB.LIZ(i5, "follower_count");
                c145995oB.LIZ(videoPublishEditModel.isTemplateMv() ? 1 : 0, "use_cover_template");
                java.util.Map LIZ2 = C63942P7q.LIZ();
                if (LIZ2 == null) {
                    LIZ2 = C113554cx.LJJJLIIL();
                }
                c145995oB.LIZJ(LIZ2.get("te_camera_texture_size"), "te_camera_texture_size");
                c145995oB.LIZJ(LIZ2.get("te_record_video_resolution_width"), "te_record_video_resolution_width");
                c145995oB.LIZJ(LIZ2.get("te_record_video_resolution_height"), "te_record_video_resolution_height");
                FMX.LJIIL("image_album_quality", c145995oB.LIZ);
            }
        }
    }

    public static void LIZIZ(VideoPublishEditModel model, C145995oB c145995oB) {
        String str;
        o.LJIIIZ(c145995oB, "<this>");
        o.LJIIIZ(model, "model");
        c145995oB.LIZLLL("image_album_music_id", model.getMusicId());
        MusicObject musicObject = model.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            if (musicObject.isPgc) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            c145995oB.LIZLLL("image_album_music_sound_type", str);
            c145995oB.LIZ(1, "image_album_music_use_all");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("0,");
            LIZ2.append(musicObject.duration);
            c145995oB.LIZLLL("image_album_music_use_duration", X1D.LIZIZ(LIZ2));
        }
        c145995oB.LIZ((int) (model.musicVolume * 100), "image_album_music_volume");
    }

    public static void LIZJ(C145995oB c145995oB, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it.next();
            if (stickerItemModel.isTextSticker()) {
                try {
                    Object LJII = C78880UxY.LJJIJLIJ().LJII(stickerItemModel.extra, new HI2().getType());
                    o.LJIIIIZZ(LJII, "getGson().fromJson(it.ex…xtStickerData>() {}.type)");
                    String fontType = ((TextStickerData) LJII).getFontType();
                    if (fontType == null) {
                        fontType = "";
                    }
                    arrayList2.add(fontType);
                } catch (Exception unused) {
                }
            } else {
                String str = stickerItemModel.stickerId;
                o.LJIIIIZZ(str, "it.stickerId");
                arrayList.add(str);
            }
        }
        c145995oB.LIZ(!arrayList.isEmpty() ? 1 : 0, "edit_sticker_id");
        c145995oB.LIZ(!arrayList2.isEmpty() ? 1 : 0, "edit_text_id");
    }

    public static int LIZLLL(ImportVideoInfo importVideoInfo, SrcImageInfo srcImageInfo) {
        if (importVideoInfo == null || srcImageInfo == null) {
            return -1;
        }
        if (Math.min(importVideoInfo.getVideoWidth(), importVideoInfo.getVideoHeight()) == Math.min(srcImageInfo.getWidth(), srcImageInfo.getHeight()) && Math.max(importVideoInfo.getVideoWidth(), importVideoInfo.getVideoHeight()) == Math.max(srcImageInfo.getWidth(), srcImageInfo.getHeight())) {
            return 1;
        }
        return 0;
    }

    public static void LIZ(C145995oB c145995oB, String str, String str2) {
        Object LIZ2;
        String str3;
        if (str != null) {
            try {
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (str.length() != 0) {
                ParcelFileDescriptor openFileDescriptor = C60903NvH.LJ.getContentResolver().openFileDescriptor(C44694HgQ.LJIIIIZZ(str), "r");
                if (openFileDescriptor != null) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
                    String str4 = options.outMimeType;
                    if (str4 != null) {
                        str3 = s.LJLLI(str4, "/", str4);
                    } else {
                        str3 = "unknown";
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    LIZ3.append("_width");
                    c145995oB.LIZ(options.outWidth, X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str2);
                    LIZ4.append("_height");
                    c145995oB.LIZ(options.outHeight, X1D.LIZIZ(LIZ4));
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(str2);
                    LIZ5.append("_fileSize");
                    c145995oB.LIZIZ(openFileDescriptor.getStatSize() / 1024, X1D.LIZIZ(LIZ5));
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append(str2);
                    LIZ6.append("_image_quality");
                    c145995oB.LIZ(100, X1D.LIZIZ(LIZ6));
                    if (ujb.o.LJJJJ(str2, "encode", false)) {
                        c145995oB.LIZLLL("encode_type", str3);
                    } else {
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append(str2);
                        LIZ7.append("_encode_type");
                        c145995oB.LIZLLL(X1D.LIZIZ(LIZ7), str3);
                    }
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
                if (m10exceptionOrNullimpl != null) {
                    C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
                }
            }
        }
    }
}
