package com.ss.ttlivestreamer.core.codec;

import X.X1D;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.codec.MediaCodecUtils;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class MediaCodecUtils {
    public static final int[] DECODER_COLOR_FORMATS;
    public static final int[] ENCODER_COLOR_FORMATS;
    public static final List<String> H264_HW_EXCEPTION_MODELS;
    public static final int[] TEXTURE_COLOR_FORMATS;
    public static final String ByteVC1Mime = "video/hevc";
    public static final String[] BlkList = {"OMX.google.", "OMX.android.", "OMX.Nvidia.", "OMX.Intel.", "OMX.TI.DUCATI1.VIDEO.H264E", "c2.google.", "c2.android."};
    public static final JSONArray OMX_INFO = new JSONArray();
    public static JSONArray DEFINED_OMX = new JSONArray();

    /* loaded from: classes12.dex */
    public static class HardwareEncoderSelector {
        public final List<MediaCodecInfo> codecInfos = new ArrayList();
        public final String codecType;

        /* loaded from: classes12.dex */
        public interface CodecInfoHandler {
            boolean initEncoderWithCodecInfo(MediaCodecInfo mediaCodecInfo);
        }

        private void sortMediaCodecInfo() {
            Collections.sort(this.codecInfos, new Comparator() { // from class: X.P3F
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$sortMediaCodecInfo$0;
                    lambda$sortMediaCodecInfo$0 = MediaCodecUtils.HardwareEncoderSelector.this.lambda$sortMediaCodecInfo$0((MediaCodecInfo) obj, (MediaCodecInfo) obj2);
                    return lambda$sortMediaCodecInfo$0;
                }
            });
        }

        private void initMediaCodecInfoList() {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                    String name = codecInfoAt.getName();
                    if ((name.toLowerCase().startsWith("omx.") || name.toLowerCase().startsWith("c2.")) && !MediaCodecUtils.codecNameInBlkList(name) && MediaCodecUtils.codecSupportsType(codecInfoAt, this.codecType)) {
                        this.codecInfos.add(codecInfoAt);
                    }
                }
            }
            sortMediaCodecInfo();
        }

        public HardwareEncoderSelector(String str) {
            this.codecType = str;
            initMediaCodecInfoList();
        }

        private int getMediaCodecInfoPriority(MediaCodecInfo mediaCodecInfo) {
            String lowerCase = mediaCodecInfo.getName().toLowerCase();
            String[] strArr = {"OMX.qcom.".toLowerCase(), "OMX.hisi.".toLowerCase(), "OMX.MTK.".toLowerCase(), "OMX.Exynos.".toLowerCase()};
            int i = 0;
            do {
                String str = strArr[i];
                if (lowerCase.startsWith(str)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str);
                    LIZ.append("video.encoder.avc");
                    if (!lowerCase.equals(X1D.LIZIZ(LIZ))) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(str);
                        LIZ2.append("video.encoder.hevc");
                        if (lowerCase.equals(X1D.LIZIZ(LIZ2))) {
                            return 45;
                        }
                        return 40;
                    }
                    return 45;
                }
                i++;
            } while (i < 4);
            String[] strArr2 = {"c2.qti.".toLowerCase(), "c2.hisi.".toLowerCase(), "c2.mtk.".toLowerCase(), "c2.exynos.".toLowerCase()};
            int i2 = 0;
            do {
                String str2 = strArr2[i2];
                if (lowerCase.startsWith(str2)) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    LIZ3.append("avc.encoder");
                    if (!lowerCase.equals(X1D.LIZIZ(LIZ3))) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(str2);
                        LIZ4.append("hevc.encoder");
                        if (lowerCase.equals(X1D.LIZIZ(LIZ4))) {
                            return 35;
                        }
                        return 30;
                    }
                    return 35;
                }
                i2++;
            } while (i2 < 4);
            if (lowerCase.toLowerCase().startsWith("omx.")) {
                return 20;
            }
            if (!lowerCase.toLowerCase().startsWith("c2.")) {
                return 0;
            }
            return 10;
        }

        public boolean selectEncoder(CodecInfoHandler codecInfoHandler) {
            while (!this.codecInfos.isEmpty()) {
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) ListProtector.get(this.codecInfos, 0);
                JSONObject json = MediaCodecUtils.toJSON(mediaCodecInfo);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Try encoder ");
                LIZ.append(json);
                AVLog.iow("MediaCodecUtils", X1D.LIZIZ(LIZ));
                if (codecInfoHandler.initEncoderWithCodecInfo(mediaCodecInfo)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Selected encoder ");
                    LIZ2.append(json);
                    AVLog.iow("MediaCodecUtils", X1D.LIZIZ(LIZ2));
                    return true;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Remove encoder ");
                LIZ3.append(json);
                AVLog.ioe("MediaCodecUtils", X1D.LIZIZ(LIZ3), null);
                ListProtector.remove(this.codecInfos, 0);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int lambda$sortMediaCodecInfo$0(MediaCodecInfo mediaCodecInfo, MediaCodecInfo mediaCodecInfo2) {
            return getMediaCodecInfoPriority(mediaCodecInfo2) - getMediaCodecInfoPriority(mediaCodecInfo);
        }
    }

    static {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt != null && codecInfoAt.isEncoder() && !codecInfoAt.getName().startsWith("OMX.google.") && (codecSupportsType(codecInfoAt, "video/avc") || codecSupportsType(codecInfoAt, ByteVC1Mime) || codecSupportsType(codecInfoAt, "audio/mp4a-latm"))) {
                OMX_INFO.put(toJSON(codecInfoAt));
            }
        }
        H264_HW_EXCEPTION_MODELS = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
        DECODER_COLOR_FORMATS = new int[]{19, 21, 2141391872, 2141391873, 2141391874, 2141391875, 2141391876};
        ENCODER_COLOR_FORMATS = new int[]{19, 21, 2141391872, 2141391876};
        TEXTURE_COLOR_FORMATS = new int[]{2130708361};
    }

    public static JSONArray getOmxInfo() {
        return OMX_INFO;
    }

    public static boolean codecNameInBlkList(String str) {
        for (String str2 : BlkList) {
            if (str.toLowerCase().startsWith(str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static MediaCodecInfo findCodecForType(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return getMediaCodecInfo21(str);
    }

    public static MediaCodecInfo getMediaCodecInfo(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (checkMediaCodecInfo(str, codecInfoAt)) {
                return codecInfoAt;
            }
        }
        return null;
    }

    public static MediaCodecInfo getMediaCodecInfo21(String str) {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos != null && codecInfos.length != 0) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (checkMediaCodecInfo(str, mediaCodecInfo)) {
                    return mediaCodecInfo;
                }
            }
        }
        return null;
    }

    public static boolean hasCodecForType(String str) {
        if (str != null && !str.isEmpty()) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                    String lowerCase = codecInfoAt.getName().toLowerCase();
                    if (!TextUtils.isEmpty(lowerCase) && !codecNameInBlkList(lowerCase) && codecSupportsType(codecInfoAt, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo) {
        boolean z;
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        String name = mediaCodecInfo.getName();
        if (name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.MTK.") || name.startsWith("OMX.hisi.") || name.startsWith("OMX.rk.") || ((name.startsWith("c2.qti.") && Build.VERSION.SDK_INT >= 29) || (name.startsWith("c2.mtk.") && Build.VERSION.SDK_INT >= 29))) {
            z = true;
        } else {
            z = false;
        }
        for (int i = 0; i < DEFINED_OMX.length(); i++) {
            try {
                if (!z) {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(DEFINED_OMX, i);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "prefix");
                    int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "version");
                    if (!name.startsWith(string) || Build.VERSION.SDK_INT < i2) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static void setDefinedOMX(JSONArray jSONArray) {
        DEFINED_OMX = jSONArray;
    }

    public static JSONObject toJSON(MediaCodecInfo mediaCodecInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codecName", mediaCodecInfo.getName());
            if (Build.VERSION.SDK_INT >= 29) {
                jSONObject.put("hardware", mediaCodecInfo.isHardwareAccelerated());
                jSONObject.put("softwareOnly", mediaCodecInfo.isSoftwareOnly());
                jSONObject.put("isVendor", mediaCodecInfo.isVendor());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static boolean checkMediaCodecInfo(String str, MediaCodecInfo mediaCodecInfo) {
        if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
            String name = mediaCodecInfo.getName();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MediaCodecInfo ");
            LIZ.append(toJSON(mediaCodecInfo));
            AVLog.d("MediaCodecUtils", X1D.LIZIZ(LIZ));
            if (TextUtils.isEmpty(name) || codecNameInBlkList(name) || !codecSupportsType(mediaCodecInfo, str)) {
                return false;
            }
            if (!isHardwareSupportedInCurrentSdk(mediaCodecInfo, str)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("skip codec ");
                LIZ2.append(toJSON(mediaCodecInfo));
                AVLog.ioi("MediaCodecUtils", X1D.LIZIZ(LIZ2));
                return false;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("find codec ");
            LIZ3.append(toJSON(mediaCodecInfo));
            AVLog.ioi("MediaCodecUtils", X1D.LIZIZ(LIZ3));
            return true;
        }
        return false;
    }

    public static boolean codecSupportsType(MediaCodecInfo mediaCodecInfo, String str) {
        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, String str) {
        if (str.equalsIgnoreCase("audio/mp4a-latm") && !mediaCodecInfo.getName().startsWith("OMX.google.")) {
            return true;
        }
        if (str.equalsIgnoreCase("video/avc") || str.equalsIgnoreCase(ByteVC1Mime)) {
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo);
        }
        return false;
    }

    public static Integer selectColorFormat(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities, String str) {
        if (iArr == ENCODER_COLOR_FORMATS && str.startsWith("OMX.hisi.")) {
            return 21;
        }
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}
