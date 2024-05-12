package com.ss.android.ttve.nativePort;

import X.C65429Pm5;
import X.C72415SbT;
import X.C72416SbU;
import X.C84105Wzd;
import X.EnumC81218VuA;
import X.P4Q;
import X.X05;
import X.X0D;
import X.X0F;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.algorithm.VEBachQRCodeResult;
import com.ss.android.vesdk.algorithm.VEBachSceneRecognitionResult;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.utils.BitmapLoader;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
public final class TEVideoUtils {
    public static long getFrameInterval;

    /* loaded from: classes16.dex */
    public interface AVInterleaveCheckListener {
        void onInfo(int i, boolean z, long j);
    }

    /* loaded from: classes16.dex */
    public interface CompileProbeListener {
        void onCompileProbeResult(int i, int i2, float f, int i3, int i4, int i5, int i6, float f2);
    }

    /* loaded from: classes16.dex */
    public interface CompileProbeListener2 {
        void onCompileProbeResult2(int i, int i2, float f, float f2, int i3, int i4, int i5, int i6, float f3);
    }

    /* loaded from: classes16.dex */
    public interface DetectQRCodeListener {
        void onDetectQRCodeResult(int i, boolean z);
    }

    /* loaded from: classes16.dex */
    public interface ExecuteCommandAndDumpInfoListener {
        void updateFFmpegInfo(String str);
    }

    /* loaded from: classes16.dex */
    public interface ExecuteCommandListener {
        void onProgressChanged(int i);
    }

    public static native int nativeAVInterleaveCheckExecute(long j, int i);

    public static native long nativeAVInterleaveCheckInit(String str, long j, AVInterleaveCheckListener aVInterleaveCheckListener);

    public static native boolean nativeApplyLensNightEnhance(int i, int i2, int i3, int i4, String str, String str2, byte[][] bArr, byte[] bArr2);

    public static native void nativeCancelCompileProbe();

    public static native int nativeCheckAudioFile(String str);

    public static native int nativeCheckMVResourceIntegrity(String str);

    public static native int nativeCheckMp3File(String str);

    public static native void nativeClearCacheDiskDir(boolean z);

    public static native int nativeClearWavSeg(String str, int i, int i2);

    public static native int nativeCompileProbe(String str, String str2, int i, int i2, long j, long j2, int i3, int i4, int i5, long j3, double d, CompileProbeListener compileProbeListener, CompileProbeListener2 compileProbeListener2, int i6);

    public static native int nativeConcat(String[] strArr, String str, int i);

    public static native int nativeConcatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4);

    public static native int nativeConverBitmapToRGBA(Bitmap bitmap, String str);

    public static native int nativeConverRGBAToIMG(String str, String str2, int i, int i2);

    public static native int nativeConvertJpegToMp4(String str, String str2, int i, boolean z);

    public static native long nativeCreateCurveSpeedUtils(float[] fArr, float[] fArr2);

    public static native long nativeCreateGetFrameHandler(String str);

    public static native long nativeCreateRTAudioWaveformMgr(int i, int i2, float f, int i3);

    public static native void nativeCurveSpeedDestroy(long j);

    public static native int nativeDecryptVideo(String str, String str2, String str3);

    public static native int nativeDeleteRTAudioWaveformMgr(long j);

    public static native int nativeDetachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeDetachAudioFromVideosCallback(String str, Object obj, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3);

    public static native int nativeDetectAudioMetrics(String str, String str2, String str3, Object obj);

    public static native VEBachQRCodeResult nativeDetectScanPicture(Bitmap bitmap, String str, String str2, DetectQRCodeListener detectQRCodeListener);

    public static native int nativeExecuteFFmpegCommand(String str, ExecuteCommandListener executeCommandListener);

    public static native int nativeExecuteFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener);

    public static native int nativeExtractVideo(String str, String str2);

    public static native VEFaceDetectCropResult nativeFaceDetectScanPicture(Bitmap bitmap, boolean z, String str, String str2, String str3);

    public static native boolean nativeFileEncrypted(String str);

    public static native int nativeFindAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3);

    public static native String nativeFindBestRemuxSuffix(String str);

    public static native int nativeGenerateMuteWav(String str, int i, int i2, int i3);

    public static native int nativeGetAVFileInfoFromXml(String str, int[] iArr);

    public static native Object nativeGetAudioAlgorithmResult(String str, String str2, int i, int i2);

    public static native int nativeGetAudioFileInfo(String str, int[] iArr);

    public static native int nativeGetAudioFileInfoForAllTracks(String str, int[][] iArr);

    public static native double nativeGetAudioVolume(byte[] bArr, int i, int i2, int i3);

    public static native VEMusicWaveBean nativeGetAudioWaveData(String str, int i, int i2, int i3, int i4, int i5);

    public static native double nativeGetAveCurveSpeed(long j);

    public static native double nativeGetCurveSpeedWithSeqDelta(long j, long j2);

    public static native void nativeGetDstBitmapSize(long j, int i, int i2, int[] iArr);

    public static native int nativeGetFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z);

    public static native Object nativeGetFileInfo(String str, int[] iArr);

    public static native int nativeGetFileType(String str);

    public static native int nativeGetFrameWithHandler(long j, Bitmap bitmap, int i, int i2, int i3, boolean z);

    public static native String nativeGetInfostickerConvertTotemplate(String str);

    public static native String nativeGetMD5FileName(String str, String str2);

    public static native Object nativeGetMVAlgorithmConfigs(String str, String[] strArr, int i);

    public static native String nativeGetMVAlgorithmConfigsWithMultiImage(String str, String[] strArr, int i);

    public static native int nativeGetMetaData(String str, ArrayList<String> arrayList);

    public static native String nativeGetMimeType(String str);

    public static native int nativeGetMusicDefaultAlgorithm(String str, String str2);

    public static native VEMusicWaveBean nativeGetResampleMusicWaveData(float[] fArr, int i, int i2);

    public static native int nativeGetTargetBitmapSize(String str, int i, int i2, int[] iArr);

    public static native Object nativeGetVEFileInfo(String str);

    public static native int nativeGetVideoFrame(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3, boolean z2);

    public static native int nativeGetVideoFrame2(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    public static native int nativeGetVideoFrame3(String str, int[] iArr, int i, int i2, boolean z, Object obj);

    public static native int nativeGetVideoFrameData(String str, int i, int i2, int i3, int i4, int i5, Object obj);

    public static native int nativeGetVideoFrameMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj);

    public static native int nativeGetVideoFrameWithBitmap(String str, Bitmap bitmap, int i, int i2, int i3, boolean z);

    public static native int nativeGetVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4);

    public static native int nativeInitAREffect();

    public static native long nativeInitResampleContext(int i, int i2, int i3, int i4);

    public static native int nativeIsByteVC110Bit(byte[] bArr);

    public static native int nativeIsCanImport(String str);

    public static native int nativeIsCanImportFd(int i, long j, long j2);

    public static native int nativeIsCanTransCode(String str, int i, int i2);

    public static native int nativeIsCanTransCodeWithResult(String str, int i, int i2, String[] strArr);

    public static native boolean nativeIsFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z);

    public static native boolean nativeIsLivePhotoForJPEGFile(String str, String str2, boolean z);

    public static native boolean nativeIsSamiAutomationValid(double d, String str);

    public static native boolean nativeIsSupportGLES3();

    public static native long nativeLoadModel(int i, String str);

    public static native long nativeMapSeqDeltaToTrimDelta(long j, long j2);

    public static native long nativeMapTrimDeltaToSeqDelta(long j, long j2);

    public static native int nativeMixAudio(ArrayList<String> arrayList, String str, Object obj);

    public static native int nativeMux(String str, String str2, String str3);

    public static native byte[][] nativeObjectScanPicture(Bitmap bitmap, int i, int i2);

    public static native int nativePcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    public static native int nativeProcessAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2);

    public static native int nativeRTAudioWaveformFinish(long j);

    public static native int nativeRTAudioWaveformGetPoints(long j, float[] fArr, int i, int i2);

    public static native int nativeRTAudioWaveformProcess(long j, float[][] fArr, int i, int i2);

    public static native int nativeRTAudioWaveformReset(long j);

    public static native int nativeRegisterDecoderForEffect();

    public static native void nativeReleaseGetFrameHandler(long j);

    public static native int nativeReleaseGetFramesReader();

    public static native void nativeReleaseResampleContext(long j);

    public static native void nativeResetModel(long j);

    public static native int nativeResizeImage(String str, String str2, int i, int i2, int i3, int i4, boolean z);

    public static native int nativeResizeRGBAImage(String str, int i, int i2, String str2, int i3, int i4, int i5, int i6);

    public static native int nativeReverseAllIFrameVideoAndMuxAudio(String str, String str2, String str3);

    public static native int nativeReverseAllIFrameVideoAndMuxAudio2(String str, String str2, String str3, TEReverseCallback tEReverseCallback);

    public static native int nativeReverseAllIVideo(String str, String str2);

    public static native int nativeReverseAllIVideo2(String str, String str2, TEReverseCallback tEReverseCallback);

    public static native int nativeSaveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4);

    public static native VEBachQRCodeResult nativeScanPicture(Bitmap bitmap, String str, boolean z, long j, int i, int i2);

    public static native VEBachSceneRecognitionResult nativeSceneRecognitionScanPicture(Bitmap bitmap, int i, String str, String str2, String str3);

    public static native int nativeSetCurveSpeedData(long j, float[] fArr, float[] fArr2);

    public static native void nativeSetFrameCacheDiskDir(String str);

    public static native int nativeSetMetaData(String str, String str2, Map<String, String> map);

    public static native void nativeSetPageMode(int i);

    public static native void nativeSetSeqDuration(long j, long j2);

    public static native int nativeSplitVideo(String str, String[] strArr, int[] iArr, boolean z);

    public static native int nativeTransCodecAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5);

    public static native int nativeTrimFile(String str, String str2, int[] iArr, int[] iArr2);

    public static native double nativeVoiceActivityDetection(byte[] bArr, long j, int i, int i2);

    public static native int nativeconvertVideo2Gif(String str, String str2, String str3, int i, float f, int i2, int i3, int i4, int i5, String str4, ExecuteCommandListener executeCommandListener);

    public static native int nativeconvertVideo2Webp(int i, int i2, String str, int i3, int i4, int i5, String str2, ExecuteCommandListener executeCommandListener);

    public static native int nativecropAudio(String str, String str2, long j, long j2);

    public static native int nativecutVideo(String str, String str2, String str3, String str4);

    public static native int nativegeneratePalettegen(String str, int i, int i2, String str2);

    public static native int nativereverseAudio(String str, String str2);

    public static native int nativetransCodeAudio(String str, String str2, int i, int i2, int i3, String str3);

    public static native int remuxVideo(String str, String str2);

    static {
        TENativeLibsLoader.loadLibrary();
        getFrameInterval = 1000L;
    }

    public static int initAREffect() {
        return nativeInitAREffect();
    }

    public static boolean isSupportGLES3() {
        return nativeIsSupportGLES3();
    }

    public static int registerDecoderForEffect() {
        return nativeRegisterDecoderForEffect();
    }

    public static int releaseGetFramesReader() {
        return nativeReleaseGetFramesReader();
    }

    public static int checkAudioFile(String str) {
        return nativeCheckAudioFile(str);
    }

    public static int checkMVResourceIntegrity(String str) {
        return nativeCheckMVResourceIntegrity(str);
    }

    public static int checkMp3File(String str) {
        return nativeCheckMp3File(str);
    }

    public static void clearCacheDiskDir(boolean z) {
        nativeClearCacheDiskDir(z);
    }

    public static long createGetFrameHandler(String str) {
        return nativeCreateGetFrameHandler(str);
    }

    public static int deleteRTAudioWaveformMgr(long j) {
        return nativeDeleteRTAudioWaveformMgr(j);
    }

    public static boolean fileEncrypted(String str) {
        return nativeFileEncrypted(str);
    }

    public static String findBestRemuxSuffix(String str) {
        if (str.length() > 0) {
            String nativeFindBestRemuxSuffix = nativeFindBestRemuxSuffix(str);
            if (nativeFindBestRemuxSuffix.length() > 0) {
                return nativeFindBestRemuxSuffix;
            }
            throw new VEException(-205, "This file does not support re-packaging for the time being!");
        }
        throw new VEException(-100, "Please check the input parameters!");
    }

    public static int getFileType(String str) {
        return nativeGetFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return nativeGetInfostickerConvertTotemplate(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<String, String> getMetaData(String str) {
        ArrayList arrayList = new ArrayList();
        if (nativeGetMetaData(str, arrayList) != 0) {
            P4Q.LIZJ("TEVideoUtils", "failed to get MetaData");
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < arrayList.size() / 2; i++) {
            int i2 = i * 2;
            hashMap.put(ListProtector.get(arrayList, i2), ListProtector.get(arrayList, i2 + 1));
        }
        return hashMap;
    }

    public static String getMimeType(String str) {
        return nativeGetMimeType(str);
    }

    public static Object getVEVideoFileInfo(String str) {
        return nativeGetVEFileInfo(str);
    }

    public static int isByteVC110Bit(byte[] bArr) {
        return nativeIsByteVC110Bit(bArr);
    }

    public static int isCanImport(String str) {
        if (TextUtils.isEmpty(str)) {
            return -100;
        }
        return nativeIsCanImport(str);
    }

    public static void releaseGetFrameHandler(long j) {
        nativeReleaseGetFrameHandler(j);
    }

    public static void releaseResampleContext(long j) {
        nativeReleaseResampleContext(j);
    }

    public static void resetModel(long j) {
        nativeResetModel(j);
    }

    public static int rtAudioWaveformFinish(long j) {
        return nativeRTAudioWaveformFinish(j);
    }

    public static int rtAudioWaveformReset(long j) {
        return nativeRTAudioWaveformReset(j);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x009d: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:49:? (LINE:16777373), block:B:43:0x009d */
    public static VEBachQRCodeResult scanPicture(X05 x05) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap copy;
        x05.getClass();
        Bitmap bitmap3 = null;
        try {
            try {
                bitmap = BitmapLoader.loadBitmap(x05.LIZ, 0, 0);
                if (bitmap != null) {
                    try {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width * height > 4000000) {
                            float sqrt = (float) (1.0d / Math.sqrt((width * height) / 4000000));
                            Matrix matrix = new Matrix();
                            matrix.postScale(sqrt, sqrt);
                            copy = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                        } else {
                            copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        }
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        } else {
                            bitmap3 = bitmap;
                        }
                        if (bitmap3 != null && !bitmap3.isRecycled()) {
                            bitmap3.recycle();
                        }
                    } catch (Exception e) {
                        e = e;
                        P4Q.LIZJ("TEVideoUtils", e.getMessage());
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        return null;
                    } catch (OutOfMemoryError unused) {
                        P4Q.LIZJ("TEVideoUtils", "bitmap OutOfMemoryError");
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        return null;
                    }
                } else {
                    copy = null;
                }
                VEBachQRCodeResult nativeScanPicture = nativeScanPicture(copy, null, true, 0L, 0, 0);
                if (copy != null && !copy.isRecycled()) {
                    copy.recycle();
                }
                return nativeScanPicture;
            } catch (Throwable th) {
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            bitmap = null;
        } catch (OutOfMemoryError unused2) {
            bitmap = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void setFrameCacheDiskDir(String str) {
        nativeSetFrameCacheDiskDir(str);
    }

    public static List<C72416SbU> scanPicture(X0F x0f) {
        x0f.getClass();
        Bitmap loadBitmapCompat = BitmapLoader.loadBitmapCompat(VERuntime.getInstance().getContext().getContentResolver(), x0f.LIZ, 0, 0);
        int algorithmType = x0f.getAlgorithmType();
        ArrayList arrayList = new ArrayList();
        if (algorithmType == 12) {
            X0D x0d = (X0D) x0f;
            nativeObjectScanPicture(loadBitmapCompat, x0d.LIZIZ, x0d.LJ);
        } else {
            if (algorithmType == 11) {
                VEBachQRCodeResult nativeScanPicture = nativeScanPicture(loadBitmapCompat, null, true, 0L, 0, 0);
                if (nativeScanPicture != null) {
                    arrayList.add(nativeScanPicture);
                }
                return arrayList;
            }
            if (algorithmType == 15) {
                throw null;
            }
        }
        return arrayList;
    }

    public static VEFaceDetectCropResult scanPicture(C72415SbT c72415SbT) {
        c72415SbT.getClass();
        if (VERuntime.getInstance().getContext() == null) {
            P4Q.LIZJ("TEVideoUtils", "VEFaceDetectCropResult.scanPicture VERuntime context == null, return result null");
            return null;
        }
        return nativeFaceDetectScanPicture(BitmapLoader.loadBitmapCompat(VERuntime.getInstance().getContext().getContentResolver(), c72415SbT.LIZ, 0, 0), c72415SbT.LIZIZ, c72415SbT.LIZJ, c72415SbT.LIZLLL, c72415SbT.LJ);
    }

    public static int AVInterleaveCheckExecute(long j, int i) {
        if (-1 == j) {
            return -112;
        }
        return nativeAVInterleaveCheckExecute(j, i);
    }

    public static int ConverBitmapToRGBA(Bitmap bitmap, String str) {
        return nativeConverBitmapToRGBA(bitmap, str);
    }

    public static int concat(String[] strArr, String str) {
        return nativeConcat(strArr, str, 0);
    }

    public static long createCurveSpeedUtils(float[] fArr, float[] fArr2) {
        return nativeCreateCurveSpeedUtils(fArr, fArr2);
    }

    public static int executeFFmpegCommand(String str, ExecuteCommandListener executeCommandListener) {
        return nativeExecuteFFmpegCommand(str, executeCommandListener);
    }

    public static int extractVideo(String str, String str2) {
        return nativeExtractVideo(str, str2);
    }

    public static int getAVFileInfoFromXml(String str, int[] iArr) {
        return nativeGetAVFileInfoFromXml(str, iArr);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        return nativeGetAudioFileInfo(str, iArr);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return nativeGetAudioFileInfoForAllTracks(str, iArr);
    }

    public static String getMD5FileName(String str, String str2) {
        return nativeGetMD5FileName(str, str2);
    }

    public static Object getMVAlgorithmConfigs(String str, List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        return nativeGetMVAlgorithmConfigs(str, strArr, size);
    }

    public static String getMVAlgorithmConfigsWithMultiImage(String str, List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        list.toArray(strArr);
        return nativeGetMVAlgorithmConfigsWithMultiImage(str, strArr, size);
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        return nativeGetMusicDefaultAlgorithm(str, str2);
    }

    public static Object getVideoFileInfo(String str, int[] iArr) {
        return nativeGetFileInfo(str, iArr);
    }

    public static boolean isSamiAutomationValid(double d, String str) {
        return nativeIsSamiAutomationValid(d, str);
    }

    public static long loadModel(int i, String str) {
        return nativeLoadModel(i, str);
    }

    public static int reverseAllIVideo(String str, String str2) {
        return nativeReverseAllIVideo(str, str2);
    }

    public static int reverseAudio(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return nativereverseAudio(str, str2);
    }

    public static long AVInterleaveCheckInit(String str, long j, AVInterleaveCheckListener aVInterleaveCheckListener) {
        return nativeAVInterleaveCheckInit(str, j, aVInterleaveCheckListener);
    }

    public static int clearWavSeg(String str, int i, int i2) {
        return nativeClearWavSeg(str, i, i2);
    }

    public static int concat(String[] strArr, String str, int i) {
        return nativeConcat(strArr, str, i);
    }

    public static int decryptVideo(String str, String str2, String str3) {
        return nativeDecryptVideo(str, str2, str3);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00ae: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:52:? (LINE:50331822), block:B:46:0x00ae */
    public static VEBachQRCodeResult detectAndScanPicture(C84105Wzd c84105Wzd, X05 x05, DetectQRCodeListener detectQRCodeListener) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap copy;
        c84105Wzd.getClass();
        VEBachQRCodeResult vEBachQRCodeResult = null;
        try {
            try {
                bitmap = BitmapLoader.loadBitmap(c84105Wzd.LIZ, 0, 0);
                if (bitmap != null) {
                    try {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        if (width * height > 4000000) {
                            float sqrt = (float) (1.0d / Math.sqrt((width * height) / 4000000));
                            Matrix matrix = new Matrix();
                            matrix.postScale(sqrt, sqrt);
                            copy = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                        } else {
                            copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                        }
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        } else if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                    } catch (Exception e) {
                        e = e;
                        P4Q.LIZJ("TEVideoUtils", e.getMessage());
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        return null;
                    } catch (OutOfMemoryError unused) {
                        P4Q.LIZJ("TEVideoUtils", "bitmap OutOfMemoryError");
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        return null;
                    }
                } else {
                    copy = null;
                }
                if (c84105Wzd.getAlgorithmType() == 13) {
                    x05.getClass();
                    vEBachQRCodeResult = nativeDetectScanPicture(copy, null, null, detectQRCodeListener);
                } else {
                    P4Q.LIZ("detectAndScanPicture", "AlgorithmType type error");
                }
                if (copy != null && !copy.isRecycled()) {
                    copy.recycle();
                }
                if (vEBachQRCodeResult == null) {
                    P4Q.LIZ("detectAndScanPicture", "picture qrcode detect ret is null");
                }
                return vEBachQRCodeResult;
            } catch (Throwable th) {
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.recycle();
                    throw th;
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            bitmap = null;
        } catch (OutOfMemoryError unused2) {
            bitmap = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int executeFFmpegCommandAndDumpInfo(String str, ExecuteCommandListener executeCommandListener, ExecuteCommandAndDumpInfoListener executeCommandAndDumpInfoListener) {
        return nativeExecuteFFmpegCommandAndDumpInfo(str, executeCommandListener, executeCommandAndDumpInfoListener);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        return nativeGetResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanImportFd(int i, long j, long j2) {
        if (i <= 0) {
            return -100;
        }
        return nativeIsCanImportFd(i, j, j2);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        return nativeIsCanTransCode(str, i, i2);
    }

    public static boolean isFrameCanDrop(ByteBuffer byteBuffer, int i, boolean z) {
        return nativeIsFrameCanDrop(byteBuffer, i, z);
    }

    public static boolean isLivePhotoForJPEGFile(String str, String str2, boolean z) {
        return nativeIsLivePhotoForJPEGFile(str, str2, z);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, Object obj) {
        return nativeMixAudio(arrayList, str, obj);
    }

    public static int mux(String str, String str2, String str3) {
        return nativeMux(str, str2, str3);
    }

    public static int reverseAllIVideo(String str, String str2, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIVideo2(str, str2, tEReverseCallback);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3) {
        return nativeReverseAllIFrameVideoAndMuxAudio(str, str2, str3);
    }

    public static int ConverRGBAToIMG(String str, String str2, int i, int i2) {
        return nativeConverRGBAToIMG(str, str2, i, i2);
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        return nativeConvertJpegToMp4(str, str2, i, z);
    }

    public static long createRTAudioWaveformMgr(int i, int i2, float f, int i3) {
        return nativeCreateRTAudioWaveformMgr(i, i2, f, i3);
    }

    public static int cropAudio(String str, String str2, long j, long j2) {
        return nativecropAudio(str, str2, j, j2);
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        return nativecutVideo(str, str2, str3, str4);
    }

    public static int detectAudioMetrics(String str, String str2, String str3, Object obj) {
        return nativeDetectAudioMetrics(str, str2, str3, obj);
    }

    public static int generateMuteWav(String str, int i, int i2, int i3) {
        return nativeGenerateMuteWav(str, i, i2, i3);
    }

    public static int generatePalettegen(String str, int i, int i2, String str2) {
        return nativegeneratePalettegen(str, i, i2, str2);
    }

    public static Object getAudioAlgorithmResult(String str, String str2, int i, int i2) {
        return nativeGetAudioAlgorithmResult(str, str2, i, i2);
    }

    public static double getAudioVolume(byte[] bArr, int i, int i2, int i3) {
        return nativeGetAudioVolume(bArr, i, i2, i3);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList, boolean z) {
        return nativeGetFileAudio(str, str2, arrayList, z);
    }

    public static long initResampleContext(int i, int i2, int i3, int i4) {
        return nativeInitResampleContext(i, i2, i3, i4);
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        return nativeIsCanTransCodeWithResult(str, i, i2, strArr);
    }

    public static int reverseAllIVideoAndMuxAudio(String str, String str2, String str3, TEReverseCallback tEReverseCallback) {
        return nativeReverseAllIFrameVideoAndMuxAudio2(str, str2, str3, tEReverseCallback);
    }

    public static int rtAudioWaveformGetPoints(long j, float[] fArr, int i, int i2) {
        return nativeRTAudioWaveformGetPoints(j, fArr, i, i2);
    }

    public static int rtAudioWaveformProcess(long j, float[][] fArr, int i, int i2) {
        return nativeRTAudioWaveformProcess(j, fArr, i, i2);
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return nativeSplitVideo(str, strArr, iArr, z);
    }

    public static int trimVideoFile(String str, int[] iArr, String str2, int[] iArr2) {
        return nativeTrimFile(str, str2, iArr, iArr2);
    }

    public static double voiceActivityDetection(byte[] bArr, long j, int i, int i2) {
        return nativeVoiceActivityDetection(bArr, j, i, i2);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return nativeFindAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static Bitmap getFrameWithHandler(long j, int i, int i2, int i3, boolean z) {
        int[] iArr = new int[2];
        nativeGetDstBitmapSize(j, i2, i3, iArr);
        Bitmap createBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        if (createBitmap == null) {
            return null;
        }
        if (nativeGetFrameWithHandler(j, createBitmap, i, iArr[0], iArr[1], z) != 0) {
            if (!createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            return null;
        }
        return createBitmap;
    }

    public static Bitmap getVideoFrame(String str, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        Bitmap createBitmap;
        int[] iArr = new int[2];
        if (nativeGetTargetBitmapSize(str, i2, i3, iArr) != 0 || (i4 = iArr[0]) <= 0 || (i5 = iArr[1]) <= 0 || (createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888)) == null || nativeGetVideoFrameWithBitmap(str, createBitmap, i, i2, i3, z) != 0) {
            return null;
        }
        return createBitmap;
    }

    public static int pcmResampleFilter(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        return nativePcmResampleFilter(j, bArr, bArr2, i, i2);
    }

    public static VEMusicWaveBean getAudioWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        return nativeGetAudioWaveData(str, i, i2, i3, i4, i5);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame2(str, iArr, i, i2, z, obj);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, Object obj) {
        return nativeGetVideoFrame3(str, iArr, i, i2, z, obj);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3, String str3) {
        return nativetransCodeAudio(str, str2, i, i2, i3, str3);
    }

    public static byte[] applyLensNightEnhance(int i, int i2, int i3, int i4, String str, String str2, byte[][] bArr) {
        if (i <= 0 || i2 <= 0 || i4 < bArr.length) {
            return null;
        }
        byte[] bArr2 = new byte[((i * i2) * 3) / 2];
        if (!nativeApplyLensNightEnhance(i, i2, i3, i4, str, str2, bArr, bArr2)) {
            return null;
        }
        return bArr2;
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, EnumC81218VuA enumC81218VuA, Object obj) {
        return nativeGetVideoFrameData(str, i, i2, i3, i4, enumC81218VuA.getValue(), obj);
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2) {
        return nativeProcessAudioTuning(strArr, iArr, iArr2, f, f2, str, str2);
    }

    public static int resizeImage(String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        return nativeResizeImage(str, str2, i, i2, i3, i4, z);
    }

    public static int transCodeAudioFile(String str, int i, int i2, String str2, int i3, int i4, int i5) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return nativeTransCodecAudioFile(str, i, i2, str2, i3, i4, i5);
    }

    public static int convertVideo2Webp(int i, int i2, String str, int i3, int i4, int i5, String str2, ExecuteCommandListener executeCommandListener) {
        return nativeconvertVideo2Webp(i, i2, str, i3, i4, i5, str2, executeCommandListener);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, Object obj, int i3, boolean z2) {
        return nativeGetVideoFrame(str, iArr, i, i2, z, obj, i3, z2);
    }

    public static int getVideoThumb(String str, int i, Object obj, boolean z, int i2, int i3, long j, int i4) {
        return nativeGetVideoThumb(str, i, obj, z, i2, i3, j, i4);
    }

    public static int resizeRGBAImage(String str, int i, int i2, String str2, int i3, int i4, int i5, int i6) {
        return nativeResizeRGBAImage(str, i, i2, str2, i3, i4, i5, i6);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, int i3, int i4) {
        return nativeSaveVideoFrames(str, iArr, i, i2, z, str2, i3, i4);
    }

    public static int getVideoFramesMore(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, Object obj) {
        return nativeGetVideoFrameMore(str, iArr, i, i2, z, z2, i3, z3, obj);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || strArr.length == 0 || jArr.length != strArr.length || strArr.length != strArr2.length || strArr.length != jArr2.length) {
            P4Q.LIZJ("TEVideoUtils", "ConmatRecordFrag parameter error!");
            return -100;
        }
        File file = new File(str3.substring(0, str3.lastIndexOf("/")));
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("create video output dir failed. Output Video Directory: ");
            LIZ.append(str3);
            P4Q.LIZJ("TEVideoUtils", X1D.LIZIZ(LIZ));
            return -114;
        }
        File file2 = new File(str4.substring(0, str4.lastIndexOf("/")));
        if (!file2.exists() && !file2.mkdirs()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create audio output dir failed. Output audio Directory: ");
            LIZ2.append(str4);
            P4Q.LIZJ("TEVideoUtils", X1D.LIZIZ(LIZ2));
            return -114;
        }
        return nativeConcatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int convertVideo2Gif(String str, String str2, String str3, int i, float f, int i2, int i3, int i4, int i5, String str4, ExecuteCommandListener executeCommandListener) {
        return nativeconvertVideo2Gif(str, str2, str3, i, f, i2, i3, i4, i5, str4, executeCommandListener);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3, int i4) {
        return nativeDetachAudioFromVideos(str, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3, i4, C65429Pm5.LJFF("ve_enable_fix_detach_wav_format", true));
    }

    public static int detachAudioFromVideosCallback(String str, Object obj, String[] strArr, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return nativeDetachAudioFromVideosCallback(str, obj, strArr, jArr, jArr2, jArr3, jArr4, j, j2, fArr, i, i2, i3);
    }
}
