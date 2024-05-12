package X;

import android.os.Build;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageDisplayInfo;
import com.ss.android.ugc.aweme.image.model.ImageEncodeInfo;
import com.ss.android.ugc.aweme.image.model.ImageQualityInfo;
import com.ss.android.ugc.aweme.image.model.ImageResizeInfo;
import com.ss.android.ugc.aweme.image.model.ImageSourceInfo;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEVersionUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.HHu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43822HHu {
    public static final /* synthetic */ int LIZ = 0;

    public static JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("did", AppLog.getServerDeviceId());
        jSONObject.put("uid", C44172HVg.LJIJ.getCurrentUserID());
        jSONObject.put("os", 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Android ");
        LIZ2.append(Build.VERSION.RELEASE);
        jSONObject.put("system", X1D.LIZIZ(LIZ2));
        jSONObject.put("device", Build.MODEL);
        jSONObject.put("effect_version", EffectSDKBuildConfig.getAarVersion());
        jSONObject.put("ve_version", VEVersionUtil.getVESDKVersion());
        jSONObject.put("publish_type", 0);
        jSONObject.put("fast_import", 0);
        return jSONObject;
    }

    public static JSONArray LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        JSONArray jSONArray = new JSONArray();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source_count", imageList.size());
                ImageQualityInfo imageQualityInfo = singleImageData.getImageQualityInfo();
                if (imageQualityInfo != null) {
                    ImageSourceInfo imageSourceInfo = imageQualityInfo.getImageSourceInfo();
                    if (imageSourceInfo != null) {
                        String sourceBitDepth = imageSourceInfo.getSourceBitDepth();
                        if (sourceBitDepth == null) {
                            sourceBitDepth = "";
                        }
                        jSONObject.put("source_bit_depth", sourceBitDepth);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(imageSourceInfo.getSourceWidth());
                        LIZ2.append('x');
                        LIZ2.append(imageSourceInfo.getSourceHeight());
                        jSONObject.put("source_resolution", X1D.LIZIZ(LIZ2));
                        String sourceEncodeType = imageSourceInfo.getSourceEncodeType();
                        if (sourceEncodeType == null) {
                            sourceEncodeType = "";
                        }
                        jSONObject.put("source_encode_type", sourceEncodeType);
                        jSONObject.put("source_file_size", String.valueOf(imageSourceInfo.getSourceFileSize()));
                        String sourceColorFormat = imageSourceInfo.getSourceColorFormat();
                        if (sourceColorFormat == null) {
                            sourceColorFormat = "";
                        }
                        jSONObject.put("source_color_format", sourceColorFormat);
                        String sourceColorSpace = imageSourceInfo.getSourceColorSpace();
                        if (sourceColorSpace == null) {
                            sourceColorSpace = "";
                        }
                        jSONObject.put("source_color_space", sourceColorSpace);
                    }
                    ImageResizeInfo imageResizeInfo = imageQualityInfo.getImageResizeInfo();
                    if (imageResizeInfo != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(imageResizeInfo.getResizeWidth());
                        LIZ3.append('x');
                        LIZ3.append(imageResizeInfo.getResizeHeight());
                        jSONObject.put("resize_resolution", X1D.LIZIZ(LIZ3));
                        String resizeFormat = imageResizeInfo.getResizeFormat();
                        if (resizeFormat == null) {
                            resizeFormat = "";
                        }
                        jSONObject.put("resize_format", resizeFormat);
                        String resizeDecodeType = imageResizeInfo.getResizeDecodeType();
                        if (resizeDecodeType == null) {
                            resizeDecodeType = "";
                        }
                        jSONObject.put("resize_decode_type", resizeDecodeType);
                        String resizeMode = imageResizeInfo.getResizeMode();
                        if (resizeMode == null) {
                            resizeMode = "";
                        }
                        jSONObject.put("resize_mode", resizeMode);
                        jSONObject.put("resize_format", "raw");
                    }
                    ImageDisplayInfo imageDisplayInfo = imageQualityInfo.getImageDisplayInfo();
                    String str = "bt709";
                    if (imageDisplayInfo != null) {
                        String displayColorSpace = imageDisplayInfo.getDisplayColorSpace();
                        if (displayColorSpace == null) {
                            displayColorSpace = "bt709";
                        }
                        jSONObject.put("display_colorspace", displayColorSpace);
                        String displayFormat = imageDisplayInfo.getDisplayFormat();
                        if (displayFormat == null) {
                            displayFormat = "";
                        }
                        jSONObject.put("display_format", displayFormat);
                        String displayDepth = imageDisplayInfo.getDisplayDepth();
                        if (displayDepth == null) {
                            displayDepth = "";
                        }
                        jSONObject.put("display_depth", displayDepth);
                    }
                    ImageEncodeInfo imageEncodeInfo = imageQualityInfo.getImageEncodeInfo();
                    if (imageEncodeInfo != null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(imageEncodeInfo.getWidth());
                        LIZ4.append('x');
                        LIZ4.append(imageEncodeInfo.getHeight());
                        jSONObject.put("encode_resolution", X1D.LIZIZ(LIZ4));
                        String encodeType = imageEncodeInfo.getEncodeType();
                        if (encodeType == null) {
                            encodeType = "";
                        }
                        jSONObject.put("encode_type", encodeType);
                        jSONObject.put("encode_size", String.valueOf(imageEncodeInfo.getFileSize()));
                        String encodeDepth = imageEncodeInfo.getEncodeDepth();
                        if (encodeDepth == null) {
                            encodeDepth = "";
                        }
                        jSONObject.put("encode_depth", encodeDepth);
                        jSONObject.put("encode_format", imageEncodeInfo.getEncodeColorFormat());
                        String encodeColorSpace = imageEncodeInfo.getEncodeColorSpace();
                        if (encodeColorSpace != null) {
                            str = encodeColorSpace;
                        }
                        jSONObject.put("encode_colorspace", str);
                        String encodeApi = imageEncodeInfo.getEncodeApi();
                        if (encodeApi == null) {
                            encodeApi = "";
                        }
                        jSONObject.put("encode_api", encodeApi);
                        jSONObject.put("encode_isreencode", imageEncodeInfo.getIsreencode());
                    }
                }
                jSONObject.put("edit_enhance", videoPublishEditModel.getImageAlbumData().getAutoEnhanceOn() ? 1 : 0);
                jSONObject.put("edit_filter_id", singleImageData.getFilterInfo().getFilterId());
                String filterLabel = singleImageData.getFilterInfo().getFilterLabel();
                if (filterLabel == null) {
                    filterLabel = "";
                }
                jSONObject.put("edit_filter_name", filterLabel);
                ImageStickerInfo stickerInfo = singleImageData.getStickerInfo();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (StickerItemModel stickerItemModel : stickerInfo.getStickers()) {
                    if (stickerItemModel.isTextSticker()) {
                        try {
                            Object LJII = C78880UxY.LJJIJLIJ().LJII(stickerItemModel.extra, new HI1().getType());
                            o.LJIIIIZZ(LJII, "getGson().fromJson(it.ex…xtStickerData>() {}.type)");
                            String fontType = ((TextStickerData) LJII).getFontType();
                            if (fontType == null) {
                                fontType = "";
                            }
                            arrayList2.add(fontType);
                        } catch (Exception unused) {
                        }
                    } else {
                        String str2 = stickerItemModel.stickerId;
                        o.LJIIIIZZ(str2, "it.stickerId");
                        arrayList.add(str2);
                    }
                }
                jSONObject.put("edit_sticker_id", ORZ.LLD(arrayList, ",", null, null, null, 62));
                jSONObject.put("edit_text_id", ORZ.LLD(arrayList2, ",", null, null, null, 62));
                jSONObject.put("edit_crop_image", singleImageData.isCrop(videoPublishEditModel.getImageAlbumData().getSurfaceData(), new C43489H4z(C151535x7.LIZ)) ? 1 : 0);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
