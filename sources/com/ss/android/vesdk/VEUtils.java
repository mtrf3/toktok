package com.ss.android.vesdk;

import X.C06460Ne;
import X.C0EH;
import X.C16880lQ;
import X.C1B6;
import X.C63867P4t;
import X.C63868P4u;
import X.C63870P4w;
import X.C65429Pm5;
import X.C72085SQv;
import X.C72415SbT;
import X.C72416SbU;
import X.C87292YNs;
import X.C87293YNt;
import X.C87294YNu;
import X.C87295YNv;
import X.C87296YNw;
import X.C87297YNx;
import X.C87298YNy;
import X.C87299YNz;
import X.EnumC46481IMb;
import X.EnumC81218VuA;
import X.HOQ;
import X.P4Q;
import X.P5A;
import X.P5D;
import X.Q7K;
import X.V0N;
import X.X05;
import X.X0F;
import X.X1D;
import X.YE1;
import X.YO0;
import X.YO1;
import X.YO3;
import X.YO4;
import X.YO5;
import X.YO6;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEAudioMetricsCallback;
import com.ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import com.ss.android.vesdk.utils.BitmapLoader;
import defpackage.b0;
import defpackage.i0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jp3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class VEUtils {
    public static YO5 dumpInfoCallback;

    public static boolean clearResizeImageWithEffectCache() {
        return TEEffectUtils.nativeResizeImageWithEffect2(null, null, true);
    }

    public static String getVideoEncodeTypeByID(int i) {
        return i != 2 ? i != 5 ? i != 13 ? i != 28 ? i != 140 ? i != 168 ? i != 174 ? "unknown" : "bytevc1" : "vp9" : "vp8" : "h264" : "mpeg4" : "h263" : "mpeg2";
    }

    public static int initAREffect() {
        return TEVideoUtils.nativeInitAREffect();
    }

    public static boolean isSupportGLES3() {
        return TEVideoUtils.nativeIsSupportGLES3();
    }

    public static boolean isSupportHDRCapability() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("eglGetDisplay() returned error 0x");
            LIZ.append(EGL14.eglGetError());
            P4Q.LJII("VEUtils", X1D.LIZIZ(LIZ));
            return false;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            EGL14.eglTerminate(eglGetDisplay);
            String[] strArr = {"EGL_KHR_gl_colorspace", "EGL_EXT_gl_colorspace_bt2020_pq"};
            int i = 0;
            while (eglQueryString.contains(strArr[i])) {
                i++;
                if (i >= 2) {
                    P4Q.LJFF("VEUtils", "This device supports the HDR capability");
                    return true;
                }
            }
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("eglInitialize() returned error 0x");
        LIZ2.append(EGL14.eglGetError());
        P4Q.LJII("VEUtils", X1D.LIZIZ(LIZ2));
        throw new RuntimeException("eglInitialize failed");
    }

    public static int registerDecoderForEffect() {
        return TEVideoUtils.nativeRegisterDecoderForEffect();
    }

    public static int releaseGetFramesReader() {
        return TEVideoUtils.nativeReleaseGetFramesReader();
    }

    public static void setVEExecFFmpegAndDumpInfoCommandCallback(YO5 yo5) {
    }

    /* loaded from: classes14.dex */
    public static class VEAudioFileInfo {
        public int bitRate;
        public int channelSize;
        public int duration;
        public int sampleFormat;
        public int sampleRate;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VEAudioFileInfo{sampleRate=");
            LIZ.append(this.sampleRate);
            LIZ.append(", channelSize=");
            LIZ.append(this.channelSize);
            LIZ.append(", sampleFormat=");
            LIZ.append(this.sampleFormat);
            LIZ.append(", duration=");
            LIZ.append(this.duration);
            LIZ.append(", bitRate=");
            return b0.LIZJ(LIZ, this.bitRate, '}', LIZ);
        }
    }

    /* loaded from: classes8.dex */
    public static class VEVideoFileInfo {
        public boolean bHDR;
        public int bitDepth;
        public int bitrate;
        public int codec;
        public int duration;
        public float floatFPS;
        public String formatName;
        public int fps;
        public int height;
        public int keyFrameCount;
        public int maxDuration;
        public int rotation;
        public int width;
        public int HDRType = -1;
        public int Color_Space = -1;
        public int Color_Primary = -1;
        public int Color_Range = -1;
        public int isSupportImport = -1;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("width = ");
            LIZ.append(this.width);
            LIZ.append(", height = ");
            LIZ.append(this.height);
            LIZ.append(", rotation = ");
            LIZ.append(this.rotation);
            LIZ.append(", duration = ");
            LIZ.append(this.duration);
            LIZ.append(", bitrate = ");
            LIZ.append(this.bitrate);
            LIZ.append(", fps = ");
            LIZ.append(this.fps);
            LIZ.append(", codec = ");
            LIZ.append(this.codec);
            LIZ.append(", keyFrameCount = ");
            LIZ.append(this.keyFrameCount);
            LIZ.append(", maxDuration = ");
            LIZ.append(this.maxDuration);
            LIZ.append(", formatName = ");
            LIZ.append(this.formatName);
            LIZ.append(", HDRType = ");
            LIZ.append(this.HDRType);
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes3.dex */
    public enum CompatibleMode {
        Legacy,
        Skip_invalid,
        Fill_silence;

        public static CompatibleMode valueOf(String str) {
            return (CompatibleMode) V0N.LJJJ(CompatibleMode.class, str);
        }
    }

    /* loaded from: classes2.dex */
    public enum ImgType {
        Img_png,
        Img_jpeg,
        Img_webp;

        public static ImgType valueOf(String str) {
            return (ImgType) V0N.LJJJ(ImgType.class, str);
        }
    }

    /* loaded from: classes3.dex */
    public enum Resolution {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_4K;

        public static Resolution valueOf(String str) {
            return (Resolution) V0N.LJJJ(Resolution.class, str);
        }
    }

    public static int checkAudioFile(String str) {
        return TEVideoUtils.nativeCheckAudioFile(str);
    }

    public static int checkMVResourceIntegrity(String str) {
        return TEVideoUtils.nativeCheckMVResourceIntegrity(str);
    }

    public static int checkMp3File(String str) {
        return TEVideoUtils.nativeCheckMp3File(str);
    }

    public static void clearCacheDiskDir(boolean z) {
        TEVideoUtils.nativeClearCacheDiskDir(z);
    }

    public static boolean fileEncrypted(String str) {
        return TEVideoUtils.nativeFileEncrypted(str);
    }

    public static String findBestRemuxSuffix(String str) {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static C87292YNs getAVFileInfoFromXml(String str) {
        int nativeGetAVFileInfoFromXml = TEVideoUtils.nativeGetAVFileInfoFromXml(str, new int[38]);
        if (nativeGetAVFileInfoFromXml == 0) {
            C87292YNs c87292YNs = new C87292YNs();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            c87292YNs.LIZ.getClass();
            int i = 0;
            do {
                c87292YNs.LIZIZ[i] = new YO0();
                c87292YNs.LIZIZ[i].getClass();
                c87292YNs.LIZIZ[i].getClass();
                c87292YNs.LIZIZ[i].getClass();
                c87292YNs.LIZIZ[i].getClass();
                i++;
            } while (i < 4);
            return c87292YNs;
        }
        Q7K.LJ("getAVFileInfoFromXml error with code=", nativeGetAVFileInfoFromXml, "VEUtils");
        return null;
    }

    public static VEAudioFileInfo getAudioFileInfo(String str) {
        int[] iArr = new int[16];
        int nativeGetAudioFileInfo = TEVideoUtils.nativeGetAudioFileInfo(str, iArr);
        if (nativeGetAudioFileInfo == 0) {
            VEAudioFileInfo vEAudioFileInfo = new VEAudioFileInfo();
            vEAudioFileInfo.sampleRate = iArr[0];
            vEAudioFileInfo.channelSize = iArr[1];
            vEAudioFileInfo.sampleFormat = iArr[2];
            vEAudioFileInfo.duration = iArr[3];
            vEAudioFileInfo.bitRate = iArr[4];
            return vEAudioFileInfo;
        }
        Q7K.LJ("getAudioFileInfo error with code=", nativeGetAudioFileInfo, "VEUtils");
        return null;
    }

    public static List<VEAudioFileInfo> getAudioFileInfoForAllTracks(String str) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 4);
        int nativeGetAudioFileInfoForAllTracks = TEVideoUtils.nativeGetAudioFileInfoForAllTracks(str, iArr);
        if (nativeGetAudioFileInfoForAllTracks >= 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < nativeGetAudioFileInfoForAllTracks; i++) {
                VEAudioFileInfo vEAudioFileInfo = new VEAudioFileInfo();
                int[] iArr2 = iArr[i];
                vEAudioFileInfo.sampleRate = iArr2[0];
                vEAudioFileInfo.channelSize = iArr2[1];
                vEAudioFileInfo.sampleFormat = iArr2[2];
                vEAudioFileInfo.duration = iArr2[3];
                arrayList.add(vEAudioFileInfo);
            }
            return arrayList;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAudioFileInfoForAllTracks error with code=");
        LIZ.append(nativeGetAudioFileInfoForAllTracks);
        P4Q.LIZJ("VEUtils", X1D.LIZIZ(LIZ));
        return new ArrayList(0);
    }

    public static int getFileType(String str) {
        return TEVideoUtils.nativeGetFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return TEVideoUtils.nativeGetInfostickerConvertTotemplate(str);
    }

    public static HashMap<String, String> getMetaData(String str) {
        return TEVideoUtils.getMetaData(str);
    }

    public static String getMimeType(String str) {
        return TEVideoUtils.nativeGetMimeType(str);
    }

    public static String getSafeString(String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return str.replace("%n", "%_n");
        }
        return str;
    }

    public static String getScriptSegmentPreload(String str) {
        return TEEffectUtils.nativeGetScriptSegmentPreload(str);
    }

    public static VEVideoFileInfo getVEVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.nativeGetVEFileInfo(str);
        if (vEVideoFileInfo == null) {
            P4Q.LIZJ("VEUtils", "getVEVideoFileInfo error!!!");
            return null;
        }
        return vEVideoFileInfo;
    }

    public static VEVideoFileInfo getVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.nativeGetFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            P4Q.LIZJ("VEUtils", "getVideoFileInfo error!!!");
            return null;
        }
        return vEVideoFileInfo;
    }

    public static long getVideoReverseSize(String str) {
        if (getVideoFileInfo(str) == null) {
            return -1L;
        }
        return ((r0.duration / 1000) * 5000) / 1024;
    }

    public static int isByteVC110Bit(String str) {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                if (TextUtils.equals(trackFormat.getString("mime"), "video/hevc") && trackFormat.containsKey("csd-0")) {
                    ByteBuffer byteBuffer = trackFormat.getByteBuffer("csd-0");
                    byte[] bArr = new byte[byteBuffer.capacity()];
                    byteBuffer.get(bArr);
                    mediaExtractor.release();
                    return TEVideoUtils.nativeIsByteVC110Bit(bArr);
                }
            }
            mediaExtractor.release();
            return -200;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return -200;
        }
    }

    public static int isCanImport(String str) {
        C63867P4t.LIZLLL("iesve_veutils_if_video_support_import", null);
        return TEVideoUtils.isCanImport(str);
    }

    public static String ms2TimeFormat(int i) {
        Locale locale = Locale.ENGLISH;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = i;
        return C16880lQ.LLLZI(locale, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(j))), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(timeUnit.toSeconds(j)))});
    }

    public static VEBachQRCodeResult scanPicture(X05 x05) {
        return TEVideoUtils.scanPicture(x05);
    }

    public static void setFrameCacheDiskDir(String str) {
        TEVideoUtils.nativeSetFrameCacheDiskDir(str);
    }

    public static int setGlobalAllowedPaths(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return -1;
        }
        return TEEffectUtils.nativeSetGlobalAllowedPaths(strArr);
    }

    public static VEFaceDetectCropResult scanPicture(C72415SbT c72415SbT) {
        return TEVideoUtils.scanPicture(c72415SbT);
    }

    public static List<C72416SbU> scanPicture(X0F x0f) {
        return TEVideoUtils.scanPicture(x0f);
    }

    public static int ConvertBitmapToRGBA(Bitmap bitmap, String str) {
        return TEVideoUtils.nativeConverBitmapToRGBA(bitmap, str);
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int convertVideo2Gif(HOQ hoq, YO1 yo1) {
        int execFFmpegCommand;
        int i;
        String LLLZI;
        if (hoq.LIZ.contains(" ")) {
            hoq.LIZ = hoq.LIZ.replace(" ", "\\ ");
        }
        boolean LJFF = C65429Pm5.LJFF("ve_disable_ffmpeg_command", false);
        if (LJFF) {
            execFFmpegCommand = TEVideoUtils.nativegeneratePalettegen(hoq.LIZ, hoq.LIZJ, hoq.LIZLLL, null);
        } else {
            execFFmpegCommand = execFFmpegCommand(C16880lQ.LLLZI(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{hoq.LIZ, Integer.valueOf(hoq.LIZJ), Integer.valueOf(hoq.LIZLLL), null}), null);
        }
        if (execFFmpegCommand != 0) {
            return execFFmpegCommand;
        }
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(hoq.LIZ);
        if (videoFileInfo == null) {
            return -1;
        }
        int i2 = videoFileInfo.width;
        TEImageFactory.ImageInfo imageInfo = TEImageFactory.getImageInfo(null, null);
        float f = i2 / 540.0f;
        if (imageInfo != null && imageInfo.getWidth() > 0) {
            i = imageInfo.getWidth();
        } else {
            i = 278;
        }
        int i3 = (int) (i * f);
        if (TextUtils.isEmpty(null)) {
            LLLZI = C16880lQ.LLLZI(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{hoq.LIZ, null, Float.valueOf(0.4f), Integer.valueOf(hoq.LIZJ), Integer.valueOf(hoq.LIZLLL), hoq.LIZIZ});
        } else {
            LLLZI = C16880lQ.LLLZI(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{hoq.LIZ, null, null, Integer.valueOf(i3), Float.valueOf(0.4f), Integer.valueOf(hoq.LIZJ), 0, 0, Integer.valueOf(hoq.LIZLLL), hoq.LIZIZ});
        }
        if (LJFF) {
            int nativeconvertVideo2Gif = TEVideoUtils.nativeconvertVideo2Gif(hoq.LIZ, null, null, i3, 0.4f, hoq.LIZJ, 0, 0, hoq.LIZLLL, hoq.LIZIZ, new C87294YNu(yo1));
            C16880lQ.LLLZZIL(new File((String) null));
            return nativeconvertVideo2Gif;
        }
        int execFFmpegCommand2 = execFFmpegCommand(LLLZI, yo1);
        C16880lQ.LLLZZIL(new File((String) null));
        return execFFmpegCommand2;
    }

    public static int convertVideo2Webp(HOQ hoq, YO1 yo1) {
        StringBuilder sb = new StringBuilder("ffmpeg");
        if (hoq.LIZ.contains(" ")) {
            hoq.LIZ = hoq.LIZ.replace(" ", "\\ ");
        }
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.nativeconvertVideo2Webp(hoq.LJFF, hoq.LJI, hoq.LIZ, hoq.LIZLLL, hoq.LJ, hoq.LIZJ, hoq.LIZIZ, new C87295YNv(yo1));
        }
        if (hoq.LJFF > 0 || hoq.LJI > 0) {
            sb.append(" -accurate_seek -ss ");
            sb.append(ms2TimeFormat(hoq.LJFF));
            sb.append(" -t ");
            sb.append(ms2TimeFormat(hoq.LJI));
        }
        sb.append(" -y -i ");
        sb.append(hoq.LIZ);
        sb.append(" -vf scale=");
        sb.append(hoq.LIZLLL);
        sb.append(":");
        sb.append(hoq.LJ);
        sb.append(" -r ");
        sb.append(hoq.LIZJ);
        sb.append(" -loop 0 ");
        sb.append(hoq.LIZIZ);
        return execFFmpegCommand(sb.toString(), yo1);
    }

    public static int execFFmpegCommand(String str, YO1 yo1) {
        return TEVideoUtils.nativeExecuteFFmpegCommand(str, new C87296YNw(yo1));
    }

    public static int extractVideo(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("extractVideo... inFile:");
        LIZ.append(getSafeString(str));
        LIZ.append(", outFile:");
        LIZ.append(getSafeString(str2));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        int isCanImport = isCanImport(str);
        if (isCanImport != 0) {
            P4Q.LJII("VEUtils", "input file is not supported!");
            return isCanImport;
        }
        return TEVideoUtils.nativeExtractVideo(str, str2);
    }

    public static int extractVideoByCommand(String str, String str2) {
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.nativeExtractVideo(str, str2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("extractVideoByCommand... inFile:");
        LIZ.append(getSafeString(str));
        LIZ.append(", outFile:");
        LIZ.append(getSafeString(str2));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        int isCanImport = isCanImport(str);
        if (isCanImport != 0) {
            P4Q.LJII("VEUtils", "input file is not supported!");
            return isCanImport;
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ffmpeg -i ");
        LIZ2.append(str);
        LIZ2.append(" -vcodec copy -an ");
        LIZ2.append(str2);
        return execFFmpegCommand(X1D.LIZIZ(LIZ2), null);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        C63867P4t.LIZLLL("iesve_veutils_get_audio_info", null);
        int nativeGetAudioFileInfo = TEVideoUtils.nativeGetAudioFileInfo(str, iArr);
        if (str.endsWith(".aac")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
            if (extractMetadata != null && extractMetadata.startsWith("audio/aac")) {
                P4Q.LJII("VEUtils", "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                iArr[3] = CastIntegerProtector.parseInt(mediaMetadataRetriever.extractMetadata(9));
            }
            mediaMetadataRetriever.release();
        }
        return nativeGetAudioFileInfo;
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return TEVideoUtils.nativeGetAudioFileInfoForAllTracks(str, iArr);
    }

    public static String getFileBestStreamAudio(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int nativeGetFileAudio = TEVideoUtils.nativeGetFileAudio(str, str2, arrayList, true);
        if (nativeGetFileAudio != 0) {
            Q7K.LJ("getFileBestStreamAudio error ", nativeGetFileAudio, "VEUtils");
            return null;
        }
        if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                P4Q.LJII("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) ListProtector.get(arrayList, 0);
        }
        P4Q.LIZJ("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
        return null;
    }

    public static String getMD5FileName(String str, String str2) {
        return TEVideoUtils.nativeGetMD5FileName(str, str2);
    }

    public static VEMVAlgorithmConfig getMVAlgorithmConfigs(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return null;
        }
        return (VEMVAlgorithmConfig) TEVideoUtils.getMVAlgorithmConfigs(str, list);
    }

    public static String getMVAlgorithmConfigsWithMultiImage(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return null;
        }
        return TEVideoUtils.getMVAlgorithmConfigsWithMultiImage(str, list);
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        if (str == null || str2 == null || "".equals(str2)) {
            P4Q.LIZJ("VEUtils", "getMusicDefaultAlgorithm failed path is wrong");
            return -100;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getMusicDefaultAlgorithm musicPath: ");
        LIZ.append(str);
        LIZ.append(" algorithmPath: ");
        LIZ.append(str2);
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        return TEVideoUtils.nativeGetMusicDefaultAlgorithm(str, str2);
    }

    public static int getQREncodedData(String str, YO4 yo4) {
        return TEEffectUtils.getQREncodedData(str, null, new C87298YNy());
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        C63867P4t.LIZLLL("iesve_veutils_get_video_info", null);
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.nativeGetFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            P4Q.LIZJ("VEUtils", "getVideoFileInfo2 error!!!");
            return -1;
        }
        switch (Math.min(iArr.length, 12)) {
            case 12:
                iArr[11] = vEVideoFileInfo.bitDepth;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                iArr[10] = vEVideoFileInfo.maxDuration;
            case 10:
                iArr[9] = vEVideoFileInfo.keyFrameCount;
            case 9:
                iArr[8] = vEVideoFileInfo.codec;
            case 8:
                iArr[7] = vEVideoFileInfo.fps;
            case 7:
                iArr[6] = vEVideoFileInfo.bitrate;
            case 4:
            case 5:
            case 6:
                iArr[3] = vEVideoFileInfo.duration;
            case 3:
                iArr[2] = vEVideoFileInfo.rotation;
            case 2:
                iArr[1] = vEVideoFileInfo.height;
            case 1:
                iArr[0] = vEVideoFileInfo.width;
                break;
        }
        return 0;
    }

    public static boolean isSamiAutomationValid(double d, String str) {
        return TEVideoUtils.nativeIsSamiAutomationValid(d, str);
    }

    public static int remuxVideo(String str, String str2) {
        return TEVideoUtils.remuxVideo(str, str2);
    }

    public static boolean resizeImageWithEffect(Bitmap bitmap, Bitmap bitmap2) {
        return TEEffectUtils.nativeResizeImageWithEffect2(bitmap, bitmap2, false);
    }

    public static int reverseAudio(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.reverseAudio(str, str2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ffmpeg -i ");
        LIZ.append(str);
        LIZ.append(" -af areverse ");
        LIZ.append(str2);
        return execFFmpegCommand(X1D.LIZIZ(LIZ), null);
    }

    public static int reverseAudioSafe(String str, String str2) {
        String str3 = str;
        if (str3.contains(" ")) {
            str3 = str3.replace(" ", "\\ ");
        }
        String LJFF = i0.LJFF(str3, ".wav");
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false) && TEVideoUtils.nativetransCodeAudio(str3, str3, -1, -1, -1, "") == 0) {
            return TEVideoUtils.reverseAudio(str3, str2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ffmpeg -i ");
        LIZ.append(str3);
        LIZ.append(" ");
        LIZ.append(LJFF);
        int execFFmpegCommand = execFFmpegCommand(X1D.LIZIZ(LIZ), null);
        if (execFFmpegCommand == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ffmpeg -i ");
            LIZ2.append(LJFF);
            LIZ2.append(" -af areverse ");
            LIZ2.append(str2);
            return execFFmpegCommand(X1D.LIZIZ(LIZ2), null);
        }
        return execFFmpegCommand;
    }

    public static int ConvertRGBAToPNG(String str, String str2, Resolution resolution) {
        return ConvertRGBAToIMG(str, str2, resolution, ImgType.Img_png);
    }

    public static int concatRecordData(VERecordData vERecordData, String str, String str2) {
        int size = vERecordData.getSegmentData().size();
        if (size <= 0) {
            P4Q.LIZJ("VEUtils", "frag count is 0");
            return -100;
        }
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        int i = 0;
        do {
            strArr[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mVideo;
            jArr2[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mVideoLength;
            strArr2[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mAudio;
            jArr[i] = ((VERecordData.VERecordSegmentData) ListProtector.get(vERecordData.getSegmentData(), i)).mAudioLength;
            i++;
        } while (i < size);
        vERecordData.concatVideo = str;
        vERecordData.concatAudio = str2;
        return TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordData.isUseMusic(), 0, null, null, vERecordData.concatVideo, vERecordData.concatAudio);
    }

    public static int decryptVideo(String str, String str2, String str3) {
        return TEVideoUtils.nativeDecryptVideo(str, str2, str3);
    }

    public static int execFFmpegCommandAndDumpInfo(String str, YO1 yo1, YO5 yo5) {
        return TEVideoUtils.nativeExecuteFFmpegCommandAndDumpInfo(str, new C87293YNt(yo1), new C87297YNx());
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList) {
        return TEVideoUtils.nativeGetFileAudio(str, str2, arrayList, false);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2) {
        return getMusicWaveData(str, i, i2, 10, 0, 0);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int getVideoFrames(String str, int[] iArr, P5A p5a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrames... ");
        LIZ.append(getSafeString(str));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(p5a);
        C63867P4t.LIZLLL("iesve_veutils_extract_video_frames", null);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, 0, 0, false, tEVideoUtilsCallback, ROTATE_DEGREE.ROTATE_NONE.ordinal(), false);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        int nativeIsCanTransCode = TEVideoUtils.nativeIsCanTransCode(str, i, i2);
        if (nativeIsCanTransCode != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isCanTransCode not supported!  path=");
            LIZ.append(getSafeString(str));
            P4Q.LJII("VEUtils", X1D.LIZIZ(LIZ));
        }
        return nativeIsCanTransCode;
    }

    public static boolean isLivePhotoForJPEGFile(String str, String str2, boolean z) {
        if (z) {
            if (str2 == null) {
                return false;
            }
        } else if (str2 == null) {
            str2 = "";
        }
        return TEVideoUtils.nativeIsLivePhotoForJPEGFile(str, str2, z);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, VEMixAudioListener vEMixAudioListener) {
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(vEMixAudioListener);
        int nativeMixAudio = TEVideoUtils.nativeMixAudio(arrayList, str, tEAudioUtilsCallback);
        C63868P4u.LJ(4, nativeMixAudio, "te_composition_audio_ret");
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        return nativeMixAudio;
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return -100;
        }
        C63867P4t.LIZLLL("iesve_veutils_combine_audio_and_video_start", null);
        int nativeMux = TEVideoUtils.nativeMux(str, str2, str3);
        C63870P4w c63870P4w = new C63870P4w();
        if (nativeMux == 0) {
            str4 = "succ";
        } else {
            str4 = "fail";
        }
        c63870P4w.LIZJ("iesve_veutils_combine_audio_and_video_finish_result", str4);
        c63870P4w.LIZJ("iesve_veutils_combine_audio_and_video_finish_reason", "");
        C63867P4t.LIZLLL("iesve_veutils_combine_audio_and_video_finish", c63870P4w);
        return nativeMux;
    }

    public static void saveBitmapToPath(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        saveBitmapToPath(bitmap, str, compressFormat, 100);
    }

    public static int setMetaData(String str, String str2, Map<String, String> map) {
        if (str.isEmpty() || str2.isEmpty() || map.isEmpty()) {
            P4Q.LIZJ("VEUtils", "path is null or metadata is null");
            return -1;
        }
        return TEVideoUtils.nativeSetMetaData(str, str2, map);
    }

    public static int ConvertRGBAToIMG(String str, String str2, Resolution resolution, ImgType imgType) {
        return TEVideoUtils.nativeConverRGBAToIMG(str, str2, resolution.ordinal(), imgType.ordinal());
    }

    public static VESize calcTargetRes(int[] iArr, int[] iArr2, ROTATE_DEGREE[] rotate_degreeArr, int i) {
        int min;
        int i2;
        int i3;
        VESize vESize = new VESize(-1, -1);
        if (iArr2 != null && iArr != null && rotate_degreeArr != null) {
            int length = iArr.length;
            if (length < 1) {
                return vESize;
            }
            float f = 0.0f;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            do {
                int i7 = iArr2[i4];
                int i8 = iArr[i4];
                ROTATE_DEGREE rotate_degree = rotate_degreeArr[i4];
                if (rotate_degree == ROTATE_DEGREE.ROTATE_90 || rotate_degree == ROTATE_DEGREE.ROTATE_270) {
                    i8 = i7;
                    i7 = i8;
                }
                f = Math.max(f, i7 / i8);
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, i7);
                i4++;
            } while (i4 < length);
            if (length != 1) {
                f = Math.min(f, 1.7777778f);
            }
            if (f >= 1.0f) {
                i2 = Math.min(i5, i);
                min = (int) (i2 * f);
            } else {
                min = Math.min(i6, i);
                i2 = (int) (min / f);
            }
            if (C65429Pm5.LJFF("ve_enable_render_encode_resolution_align4", false)) {
                i3 = 4;
            } else {
                i3 = 16;
            }
            int i9 = -i3;
            vESize.width = ((i2 + i3) - 1) & i9;
            vESize.height = ((min + i3) - 1) & i9;
        }
        return vESize;
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return TEVideoUtils.nativeConvertJpegToMp4(str, str2, i, z);
    }

    public static int cropAudio(String str, String str2, long j, long j2) {
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.nativecropAudio(str, str2, j, j2);
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(str);
        sb.append(" -ss ");
        sb.append(j / 1000);
        sb.append(" -t ");
        sb.append(j2 / 1000);
        sb.append(" -c copy ");
        sb.append(str2);
        P4Q.LJFF("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int curVideo(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        if (arrayList.size() != arrayList2.size() || arrayList.size() != arrayList3.size() || arrayList2.size() != arrayList3.size()) {
            return -100;
        }
        boolean LJFF = C65429Pm5.LJFF("ve_disable_ffmpeg_command", false);
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(str);
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(" -ss ");
            sb.append((String) ListProtector.get(arrayList2, i2));
            sb.append(" -t ");
            sb.append((String) ListProtector.get(arrayList3, i2));
            sb.append(" -acodec copy -vcodec copy ");
            sb.append((String) ListProtector.get(arrayList, i2));
            if (LJFF) {
                i = TEVideoUtils.nativecutVideo(str, (String) ListProtector.get(arrayList, i2), (String) ListProtector.get(arrayList2, i2), (String) ListProtector.get(arrayList3, i2));
            }
        }
        if (LJFF) {
            return i;
        }
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.nativecutVideo(str, str2, str3, str4);
        }
        YE1.LIZLLL(sb, str, " -ss ", str3, " -t ");
        sb.append(str4);
        sb.append(" -acodec copy -vcodec copy ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int detectAudioMetrics(String str, String str2, String str3, YO6 yo6) {
        TEAudioMetricsCallback tEAudioMetricsCallback = new TEAudioMetricsCallback();
        tEAudioMetricsCallback.setListener(yo6);
        return TEVideoUtils.nativeDetectAudioMetrics(str, str2, str3, tEAudioMetricsCallback);
    }

    public static void dumpNV21(String str, int i, int i2, byte[] bArr) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
            byteArrayOutputStream.close();
        } catch (FileNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        } catch (IOException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public static int getQREncodedData(String str, int i, int i2, YO3 yo3) {
        return TEEffectUtils.getQREncodedData(str, i, i2, null, new C87299YNz());
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        int nativeIsCanTransCodeWithResult = TEVideoUtils.nativeIsCanTransCodeWithResult(str, i, i2, strArr);
        if (nativeIsCanTransCodeWithResult != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("isCanTransCodeWithResult not supported!  path=");
            LIZ.append(getSafeString(str));
            P4Q.LJII("VEUtils", X1D.LIZIZ(LIZ));
        }
        return nativeIsCanTransCodeWithResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0078, code lost:
    
        if (r3 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void saveBitmapToPath(android.graphics.Bitmap r6, java.lang.String r7, android.graphics.Bitmap.CompressFormat r8, int r9) {
        /*
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r5 = "Bitmap "
            r1.append(r5)
            r1.append(r7)
            java.lang.String r0 = "saving"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r4 = "VEUtils"
            X.P4Q.LJFF(r4, r0)
            r3 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L8d
            r2.<init>(r7)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L8d
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L77
            r0.<init>(r2)     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L77
            r6.compress(r8, r9, r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r0.flush()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L53
            r0.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L33:
            r2.close()     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r7)
            java.lang.String r0 = " saved!"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.P4Q.LJFF(r4, r0)
            return
        L50:
            r1 = move-exception
            r3 = r0
            goto L7a
        L53:
            r1 = move-exception
            r3 = r0
            goto L5a
        L56:
            r1 = move-exception
            goto L5a
        L58:
            r1 = move-exception
            r2 = r3
        L5a:
            java.lang.String r0 = "Error when saving bitmap..."
            X.P4Q.LIZJ(r4, r0)     // Catch: java.lang.Throwable -> L77
            X.C16880lQ.LLLLIIL(r1)     // Catch: java.lang.Throwable -> L77
            if (r3 == 0) goto L6c
            r3.close()     // Catch: java.io.IOException -> L68
            goto L6c
        L68:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L6c:
            if (r2 == 0) goto L76
            r2.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L76:
            return
        L77:
            r1 = move-exception
            if (r3 == 0) goto L82
        L7a:
            r3.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L82:
            if (r2 == 0) goto L8e
            r2.close()     // Catch: java.io.IOException -> L88
            goto L8e
        L88:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L8e
        L8d:
            r1 = move-exception
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEUtils.saveBitmapToPath(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int):void");
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return TEVideoUtils.nativeSplitVideo(str, strArr, iArr, z);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i, i2, -1);
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static int concatJpegWithMp4(String str, String str2, String str3, int i, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || i < 33) {
            return -100;
        }
        int convertJpegToMp4 = convertJpegToMp4(str, str3, i, z);
        if (convertJpegToMp4 != 0) {
            Q7K.LJ("concatJpegWithMp4 error, convert failed ", convertJpegToMp4, "VEUtils");
            return convertJpegToMp4;
        }
        int concat = TEVideoUtils.concat(new String[]{str3, str2}, str3);
        if (concat != 0) {
            Q7K.LJ("concatJpegWithMp4 error, concatVideo failed ", concat, "VEUtils");
        }
        return concat;
    }

    public static VERTAudioWaveformMgr createRTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        return new VERTAudioWaveformMgr(i, i2, i3, f, i4);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return TEVideoUtils.nativeFindAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static VEMVAudioAlgorithmResult getAudioBeatAlgorithmResult(String str, String str2, int i, int i2, int i3) {
        StringBuilder LIZJ = C06460Ne.LIZJ("getAudioBeatAlgorithmResult trimIn ", i, ", trimOut ", i2, ", mvTime ");
        LIZJ.append(i3);
        P4Q.LIZJ("VEUtils", X1D.LIZIZ(LIZJ));
        VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult = (VEMVAudioAlgorithmResult) TEVideoUtils.nativeGetAudioAlgorithmResult(str, str2, i, i2);
        vEMVAudioAlgorithmResult.resizeBeatTrackingNum(i2 - i, i3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAudioBeatAlgorithmResult time = ");
        LIZ.append(Arrays.toString(vEMVAudioAlgorithmResult.bitsTime));
        P4Q.LIZ("VEUtils", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getAudioBeatAlgorithmResult value = ");
        LIZ2.append(Arrays.toString(vEMVAudioAlgorithmResult.bitsValue));
        P4Q.LIZ("VEUtils", X1D.LIZIZ(LIZ2));
        return vEMVAudioAlgorithmResult;
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3) {
        return getAudioFromRecordData(str, vERecordData, i, i2, i3, CompatibleMode.Legacy);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4) {
        return getMusicWaveData(str, i, i2, 10, i3, i4);
    }

    public static Bitmap getVideoFrame(String str, int i, int i2, int i3, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrameWithBitmap...");
        LIZ.append(str);
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        return TEVideoUtils.getVideoFrame(str, i, i2, i3, z);
    }

    public static int saveCompressedImage(String str, String str2, int i, int i2, int i3) {
        boolean z;
        String LJFF;
        Bitmap.CompressFormat compressFormat;
        if (i > 0 && i2 > 0) {
            z = false;
        } else {
            z = true;
        }
        Bitmap loadBitmap = BitmapLoader.loadBitmap(str, i, i2, BitmapLoader.ImageRotation.INVALID, true, true, z);
        if (loadBitmap != null) {
            if (i3 == 0) {
                LJFF = i0.LJFF(str2, "0.png");
                compressFormat = Bitmap.CompressFormat.PNG;
            } else if (i3 == 1) {
                LJFF = i0.LJFF(str2, "0.jpeg");
                compressFormat = Bitmap.CompressFormat.JPEG;
            } else {
                P4Q.LIZJ("VEUtils", "Target format is wrongly configured, generate compressed image failed!");
                return 1;
            }
            saveBitmapToPath(loadBitmap, LJFF, compressFormat);
            return 0;
        }
        P4Q.LIZJ("VEUtils", "Bitmap is empty, generate compressed image failed!");
        return 1;
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3) {
        String str3 = str;
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.nativetransCodeAudio(str3, str2, i, i2, i3, "");
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str3.contains(" ")) {
            str3 = str3.replace(" ", "\\ ");
        }
        sb.append(str3);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ");
        LIZ.append(str2);
        sb.append(X1D.LIZIZ(LIZ));
        P4Q.LJFF("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3, CompatibleMode compatibleMode) {
        if (vERecordData == null || vERecordData.getSegmentData().size() <= 0) {
            P4Q.LIZJ("VEUtils", "Get AudioFromRecordData parameter error!");
            return -100;
        }
        int size = vERecordData.getSegmentData().size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        long[] jArr4 = new long[size];
        float[] fArr = new float[size];
        long j = 0;
        int i4 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
            if (vERecordSegmentData.mEnable) {
                strArr[i4] = vERecordSegmentData.mAudio;
                jArr[i4] = (int) (vERecordSegmentData.getCutTrimIn() / 1000);
                jArr2[i4] = (int) (vERecordSegmentData.getCutTrimOut() / 1000);
                float f = vERecordSegmentData.mSpeed;
                fArr[i4] = f;
                jArr3[i4] = (int) (((float) jArr[i4]) * f);
                long j2 = (int) (((float) jArr2[i4]) * f);
                jArr4[i4] = j2;
                j = (j2 - jArr3[i4]) + j;
                i4++;
            }
        }
        if (i4 == 0) {
            P4Q.LIZJ("VEUtils", "getAudioFromRecordData There are no valid clips!");
            return -100;
        }
        return detachAudioFromVideos(str, (String[]) Arrays.copyOf(strArr, i4), Arrays.copyOf(jArr3, i4), Arrays.copyOf(jArr4, i4), 0L, j, Arrays.copyOf(fArr, i4), i, i2, i3, compatibleMode);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            i = C72085SQv.LJLIL;
        }
        VEMusicWaveBean nativeGetAudioWaveData = TEVideoUtils.nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
        if (nativeGetAudioWaveData == null || nativeGetAudioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return nativeGetAudioWaveData;
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, P5A p5a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrames... ");
        LIZ.append(getSafeString(str));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        return getVideoFrames(str, iArr, i, i2, z, p5a, ROTATE_DEGREE.ROTATE_NONE);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, P5A p5a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrames2...");
        C0EH.LIZLLL(LIZ, getSafeString(str), ", widht: ", i, ", height: ");
        LIZ.append(i2);
        LIZ.append(", isRough: ");
        LIZ.append(z);
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(p5a);
        C63867P4t.LIZLLL("iesve_veutils_extract_video_frames", null);
        return TEVideoUtils.nativeGetVideoFrame2(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, P5A p5a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrames3... ");
        LIZ.append(getSafeString(str));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(p5a);
        C63867P4t.LIZLLL("iesve_veutils_extract_video_frames", null);
        return TEVideoUtils.nativeGetVideoFrame3(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFramesByHWCodec(String str, int[] iArr, int i, int i2, boolean z, P5A p5a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFramesByHWCodec... ");
        LIZ.append(getSafeString(str));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(p5a);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, i, i2, z, tEVideoUtilsCallback, 0, true);
    }

    public static int getVideoThumb(VERecordData vERecordData, int i, int i2, int i3, boolean z, P5A p5a) {
        ROTATE_DEGREE rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
        String str = "";
        int i4 = 0;
        int i5 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
            if (vERecordSegmentData.mEnable) {
                str = vERecordSegmentData.mVideo;
                rotate_degree = vERecordSegmentData.mRotate;
                int cutTrimOut = (int) ((vERecordSegmentData.getCutTrimOut() - vERecordSegmentData.getCutTrimIn()) / 1000);
                i5 = Math.min(cutTrimOut, (i - i4) + ((int) (vERecordSegmentData.getCutTrimIn() / 1000)));
                if (i >= i4 && i <= i4 + cutTrimOut) {
                    break;
                }
                i4 += cutTrimOut;
            }
        }
        if (TextUtils.isEmpty(str) || i5 < 0) {
            P4Q.LIZJ("VEUtils", "Timestamp is not in the valid time range!");
            return -100;
        }
        return getVideoFrames(str, new int[]{i5}, i2, i3, z, p5a, rotate_degree);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3, String str3) {
        if (C65429Pm5.LJFF("ve_disable_ffmpeg_command", false)) {
            return TEVideoUtils.nativetransCodeAudio(str, str2, i, i2, i3, str3);
        }
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(str);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        sb.append(" -acodec ");
        sb.append(str3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ");
        LIZ.append(str2);
        sb.append(X1D.LIZIZ(LIZ));
        P4Q.LJFF("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int transCodeAudio(String str, String str2, float f, int i, int i2, int i3) {
        return detachAudioFromVideos(str, new String[]{str2}, new long[]{-1}, new long[]{-1}, new long[]{-1}, new long[]{-1}, -1L, -1L, new float[]{f}, i, i2, i3, CompatibleMode.Legacy);
    }

    public static int transCodeAudio(String str, int i, int i2, String str2, int i3, int i4) {
        int transCodeAudioFile = TEVideoUtils.transCodeAudioFile(str, i, i2, str2, i3, i4, -1);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", transCodeAudioFile);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c.LIZ("vesdk_editor_get_audio_frame", "performance", jSONObject);
        return transCodeAudioFile;
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, EnumC81218VuA enumC81218VuA, P5D p5d) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setFrameDataListener(p5d);
        return TEVideoUtils.getVideoFrameData(str, i, i2, i3, i4, enumC81218VuA, tEVideoUtilsCallback);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, P5A p5a, ROTATE_DEGREE rotate_degree) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrames... ");
        LIZ.append(getSafeString(str));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(p5a);
        C63867P4t.LIZLLL("iesve_veutils_extract_video_frames", null);
        return TEVideoUtils.nativeGetVideoFrame(str, iArr, i, i2, z, tEVideoUtilsCallback, rotate_degree.ordinal(), false);
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2) {
        return TEVideoUtils.nativeProcessAudioTuning(strArr, iArr, iArr2, f, f2, str, str2);
    }

    public static int resizeImage(String str, String str2, int i, int i2, ImgType imgType, int i3, boolean z) {
        return TEVideoUtils.nativeResizeImage(str, str2, i, i2, imgType.ordinal(), i3, z);
    }

    public static int concatRecordFrag(String[] strArr, String[] strArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        long[] jArr = new long[strArr.length];
        Arrays.fill(jArr, -1L);
        long[] jArr2 = new long[strArr2.length];
        Arrays.fill(jArr2, -1L);
        return concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int getVideoThumb(String str, int i, P5A p5a, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(p5a);
        C63867P4t.LIZLLL("iesve_veutils_extract_video_thumb", null);
        return TEVideoUtils.nativeGetVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }

    public static int resizeRGBAImage(String str, int i, int i2, String str2, int i3, int i4, ImgType imgType, int i5) {
        return TEVideoUtils.nativeResizeRGBAImage(str, i, i2, str2, i3, i4, imgType.ordinal(), i5);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3) {
        int nativeSaveVideoFrames = TEVideoUtils.nativeSaveVideoFrames(str, iArr, i, i2, z, i0.LJFF(str2, str3), i3, 70);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", nativeSaveVideoFrames);
            jSONObject.put("has_effect", 0);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c.LIZ("vesdk_editor_get_frame", "performance", jSONObject);
        return nativeSaveVideoFrames;
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, P5A p5a) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getVideoFrames... ");
        LIZ.append(getSafeString(str));
        P4Q.LJFF("VEUtils", X1D.LIZIZ(LIZ));
        return TEVideoUtils.nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, p5a);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3, int i4) {
        int nativeSaveVideoFrames = TEVideoUtils.nativeSaveVideoFrames(str, iArr, i, i2, z, i0.LJFF(str2, str3), i3, i4);
        if (nativeSaveVideoFrames != 0 && TEVideoUtils.nativeGetFileType(str) == EnumC46481IMb.type_Image.getValue()) {
            nativeSaveVideoFrames = saveCompressedImage(str, i0.LJFF(str2, str3), i, i2, i3);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", nativeSaveVideoFrames);
            jSONObject.put("has_effect", 0);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c.LIZ("vesdk_editor_get_frame", "performance", jSONObject);
        return nativeSaveVideoFrames;
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        for (String str5 : strArr) {
            if (!C1B6.LIZIZ(str5)) {
                return -114;
            }
        }
        for (String str6 : strArr2) {
            if (!C1B6.LIZIZ(str6)) {
                return -114;
            }
        }
        return TEVideoUtils.concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return detachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, CompatibleMode.Legacy);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, CompatibleMode compatibleMode) {
        long[] jArr3 = new long[jArr.length];
        long[] jArr4 = new long[jArr.length];
        Arrays.fill(jArr3, -1L);
        Arrays.fill(jArr4, -1L);
        return detachAudioFromVideos(str, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3, compatibleMode);
    }

    public static int detachAudioFromVideosCallback(String str, VEDetachAudioStreamListener vEDetachAudioStreamListener, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        long[] jArr3 = new long[jArr.length];
        long[] jArr4 = new long[jArr.length];
        Arrays.fill(jArr3, -1L);
        Arrays.fill(jArr4, -1L);
        return detachAudioFromVideosCallback(str, vEDetachAudioStreamListener, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3, CompatibleMode compatibleMode) {
        int detachAudioFromVideos = TEVideoUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3, compatibleMode.ordinal());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", detachAudioFromVideos);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c.LIZ("vesdk_editor_get_audio_frame", "performance", jSONObject);
        return detachAudioFromVideos;
    }

    public static int detachAudioFromVideosCallback(String str, VEDetachAudioStreamListener vEDetachAudioStreamListener, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3) {
        int nativeDetachAudioFromVideosCallback = TEVideoUtils.nativeDetachAudioFromVideosCallback(str, vEDetachAudioStreamListener, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", nativeDetachAudioFromVideosCallback);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c.LIZ("vesdk_editor_get_audio_frame", "performance", jSONObject);
        return nativeDetachAudioFromVideosCallback;
    }
}
