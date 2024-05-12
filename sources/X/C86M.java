package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.ImageBitrate;
import com.ss.android.ugc.aweme.experiment.ImageBitrateItem;
import com.ss.android.ugc.aweme.feed.model.MultiBitrateAdapterErrorCode;
import com.ss.android.ugc.aweme.feed.model.MultiImageUrlInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.Iterator;
import java.util.List;
import ujb.o;

/* renamed from: X.86M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86M {
    public static final /* synthetic */ int LIZ = 0;

    public static PhotoModeImageUrlModel LIZ(PhotoModeImageUrlModel photoModeImageUrlModel, Integer num) {
        int LIZJ;
        ImageBitrateItem imageBitrateItem;
        String str;
        Integer num2;
        Integer num3;
        OSZ osz;
        String name;
        ImageBitrateItem imageBitrateItem2;
        OSZ osz2;
        MultiImageUrlInfo multiImageUrlInfo;
        String str2;
        List<String> urlList;
        Integer num4;
        ImageBitrate imageBitrate = (ImageBitrate) C86O.LIZ.getValue();
        if (num != null) {
            LIZJ = num.intValue();
        } else {
            LIZJ = C1DG.LIZ().LIZJ();
        }
        Integer num5 = null;
        String str3 = "";
        if (imageBitrate == null) {
            osz = new OSZ("", Integer.valueOf(MultiBitrateAdapterErrorCode.SETTING_MULTI_BITRATE_CONFIG_ERROR.getCode()));
        } else {
            String defaultGear = imageBitrate.getDefaultGear();
            if (defaultGear != null) {
                str3 = defaultGear;
            }
            if (LIZJ <= 0) {
                osz = new OSZ(str3, Integer.valueOf(MultiBitrateAdapterErrorCode.INTERNET_SPEED_ERROR.getCode()));
            } else {
                List<ImageBitrateItem> gears = imageBitrate.getGears();
                if (gears != null) {
                    Iterator<ImageBitrateItem> it = gears.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            imageBitrateItem2 = it.next();
                            ImageBitrateItem imageBitrateItem3 = imageBitrateItem2;
                            if (LIZJ >= imageBitrateItem3.getNetworkLowerKbps() && LIZJ < imageBitrateItem3.getNetworkUpperKbps() && !TextUtils.isEmpty(imageBitrateItem3.getName())) {
                                break;
                            }
                        } else {
                            imageBitrateItem2 = null;
                            break;
                        }
                    }
                    imageBitrateItem = imageBitrateItem2;
                } else {
                    imageBitrateItem = null;
                }
                List<ImageBitrateItem> gears2 = imageBitrate.getGears();
                if (gears2 != null) {
                    gears2.isEmpty();
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("match gear: ");
                if (imageBitrateItem != null) {
                    str = imageBitrateItem.getName();
                } else {
                    str = null;
                }
                LIZ2.append(str);
                LIZ2.append(", (");
                if (imageBitrateItem != null) {
                    num2 = Integer.valueOf(imageBitrateItem.getNetworkLowerKbps());
                } else {
                    num2 = null;
                }
                LIZ2.append(num2);
                LIZ2.append(" ~ ");
                if (imageBitrateItem != null) {
                    num3 = Integer.valueOf(imageBitrateItem.getNetworkUpperKbps());
                } else {
                    num3 = null;
                }
                LIZ2.append(num3);
                LIZ2.append(')');
                X1D.LIZIZ(LIZ2);
                if (imageBitrateItem != null && (name = imageBitrateItem.getName()) != null) {
                    osz = new OSZ(name, Integer.valueOf(MultiBitrateAdapterErrorCode.DEFAULT_CODE.getCode()));
                } else {
                    osz = new OSZ(str3, Integer.valueOf(MultiBitrateAdapterErrorCode.SETTING_MULTI_BITRATE_CONFIG_MATCH_ERROR.getCode()));
                }
            }
        }
        String str4 = (String) osz.getFirst();
        if (o.LJJJJJL(str4)) {
            osz2 = new OSZ(osz.getSecond(), null);
        } else {
            List<MultiImageUrlInfo> bitrateImages = photoModeImageUrlModel.getBitrateImages();
            if (bitrateImages != null) {
                Iterator<MultiImageUrlInfo> it2 = bitrateImages.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        multiImageUrlInfo = it2.next();
                        if (kotlin.jvm.internal.o.LJ(multiImageUrlInfo.getName(), str4)) {
                            break;
                        }
                    } else {
                        multiImageUrlInfo = null;
                        break;
                    }
                }
                MultiImageUrlInfo multiImageUrlInfo2 = multiImageUrlInfo;
                if (multiImageUrlInfo2 != null) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ("match the gear config, ", str4, " -> ");
                    UrlModel image = multiImageUrlInfo2.getImage();
                    if (image != null && (urlList = image.getUrlList()) != null) {
                        str2 = (String) ORZ.LJLLLLLL(0, urlList);
                    } else {
                        str2 = null;
                    }
                    LIZIZ.append(str2);
                    X1D.LIZIZ(LIZIZ);
                    Object second = osz.getSecond();
                    photoModeImageUrlModel.setTargetMultiRateImageUrl(multiImageUrlInfo2.getImage());
                    photoModeImageUrlModel.setGearName(multiImageUrlInfo2.getName());
                    osz2 = new OSZ(second, photoModeImageUrlModel);
                }
            }
            List<MultiImageUrlInfo> bitrateImages2 = photoModeImageUrlModel.getBitrateImages();
            if (bitrateImages2 == null || bitrateImages2.isEmpty()) {
                osz2 = new OSZ(Integer.valueOf(MultiBitrateAdapterErrorCode.IMAGE_RESOURCE_EMPTY.getCode()), null);
            } else if (((Number) osz.getSecond()).intValue() == MultiBitrateAdapterErrorCode.INTERNET_SPEED_ERROR.getCode()) {
                osz2 = new OSZ(Integer.valueOf(MultiBitrateAdapterErrorCode.SETTING_DEFAULT_RESOURCE_MATCH_ERROR.getCode()), null);
            } else {
                int intValue = ((Number) osz.getSecond()).intValue();
                MultiBitrateAdapterErrorCode multiBitrateAdapterErrorCode = MultiBitrateAdapterErrorCode.SETTING_MULTI_BITRATE_CONFIG_MATCH_ERROR;
                if (intValue == multiBitrateAdapterErrorCode.getCode()) {
                    osz2 = new OSZ(Integer.valueOf(multiBitrateAdapterErrorCode.getCode()), null);
                } else {
                    osz2 = new OSZ(Integer.valueOf(MultiBitrateAdapterErrorCode.IMAGE_RESOURCE_MATCH_ERROR.getCode()), null);
                }
            }
        }
        PhotoModeImageUrlModel photoModeImageUrlModel2 = (PhotoModeImageUrlModel) osz2.getSecond();
        if (photoModeImageUrlModel2 != null) {
            photoModeImageUrlModel = photoModeImageUrlModel2;
        }
        photoModeImageUrlModel.setAdaptMultiRateErrCode(((Number) osz2.getFirst()).intValue());
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("original resolution : ");
        UrlModel displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark();
        if (displayImageNoWatermark != null) {
            num4 = Integer.valueOf(displayImageNoWatermark.getWidth());
        } else {
            num4 = null;
        }
        LIZ3.append(num4);
        LIZ3.append('x');
        UrlModel displayImageNoWatermark2 = photoModeImageUrlModel.getDisplayImageNoWatermark();
        if (displayImageNoWatermark2 != null) {
            num5 = Integer.valueOf(displayImageNoWatermark2.getHeight());
        }
        LIZ3.append(num5);
        X1D.LIZIZ(LIZ3);
        return photoModeImageUrlModel;
    }
}
