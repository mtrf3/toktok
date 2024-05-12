package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.algorithm.VEAudioAlgorithmParam;
import com.ss.android.vesdk.algorithm.VEBaseAlgorithmParam;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.utils.TEArrayUtils;
import java.util.List;

/* renamed from: X.WzR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84093WzR {
    public static final String LIZ = C16880lQ.LJLLJ(C84093WzR.class);

    public static TEBundle LIZ(VETrackParams vETrackParams) {
        boolean z;
        TEBundle obtain = TEBundle.obtain();
        EnumC82648Wc8 enumC82648Wc8 = vETrackParams.trackPriority;
        if (enumC82648Wc8 != EnumC82648Wc8.DEFAULT) {
            if (enumC82648Wc8 == EnumC82648Wc8.HOST) {
                z = true;
            } else {
                z = false;
            }
            obtain.setBool("IsHostTrack", z);
        }
        int i = vETrackParams.layer;
        if (i > -1) {
            obtain.setInt("Layer", i);
        }
        List<String> list = vETrackParams.paths;
        if (list != null) {
            obtain.setStringArray("Paths", TEArrayUtils.toStringArray(list));
        }
        List<Integer> list2 = vETrackParams.trimIns;
        if (list2 != null) {
            obtain.setIntArray("TrimIns", TEArrayUtils.toIntArray(list2));
        }
        List<Integer> list3 = vETrackParams.trimOuts;
        if (list3 != null) {
            obtain.setIntArray("TrimOuts", TEArrayUtils.toIntArray(list3));
        }
        List<Integer> list4 = vETrackParams.seqIns;
        if (list4 != null) {
            obtain.setIntArray("SequenceIns", TEArrayUtils.toIntArray(list4));
        }
        List<Integer> list5 = vETrackParams.seqOuts;
        if (list5 != null) {
            obtain.setIntArray("SequenceOuts", TEArrayUtils.toIntArray(list5));
        }
        List<Double> list6 = vETrackParams.speeds;
        if (list6 != null) {
            obtain.setDoubleArray("Speeds", TEArrayUtils.toDoubleArray(list6));
        }
        int i2 = vETrackParams.extFlag;
        if (i2 != 0) {
            obtain.setInt("ExtFlag", i2);
        }
        List<VESize> list7 = vETrackParams.sizes;
        if (list7 != null) {
            int size = list7.size();
            int[] iArr = new int[size];
            for (int i3 = 0; i3 < size; i3++) {
                VESize vESize = (VESize) ListProtector.get(vETrackParams.sizes, i3);
                iArr[i3] = vESize.height | (vESize.width << 15);
            }
            obtain.setIntArray("Sizes", iArr);
        }
        return obtain;
    }

    public static TEBundle LIZIZ(C84099WzX c84099WzX) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setString("RecordDir", c84099WzX.LIZ);
        obtain.setFloat("RecordSpeed", 1.0f);
        obtain.setInt("RenderWidth", c84099WzX.LJJIII.width);
        obtain.setInt("RenderHeight", c84099WzX.LJJIII.height);
        obtain.setInt("RecordMicConfig", c84099WzX.LJJII.ordinal());
        obtain.setInt("RecordContentType", c84099WzX.LJI);
        obtain.setBool("enableDynamicRecordContentType", c84099WzX.LJII);
        obtain.setBool("NeedPostProcess", c84099WzX.LJIIIZ);
        obtain.setString("VideoPath", c84099WzX.LIZIZ);
        obtain.setString("AudioPath", c84099WzX.LIZJ);
        obtain.setBool("enableRecordEffectContentHighSpeed", c84099WzX.LJIIIIZZ);
        boolean booleanValue = VEConfigCenter.getInstance().getValue("ve_small_window_double_thread_decode", c84099WzX.LJIIJ).booleanValue();
        c84099WzX.LJIIJ = booleanValue;
        obtain.setBool("enableSmallWindowDoubleThreadOpt", booleanValue);
        boolean z = true;
        obtain.setBool("enableEncodeBinGLContextReuse", VEConfigCenter.getInstance().getValue("ve_enable_recorder_encode_glcontext_reuse", true).booleanValue());
        obtain.setBool("enableEffectAmazingEngine", c84099WzX.LJIIJJI);
        obtain.setBool("enable2DEngineEffect", c84099WzX.LJIIL);
        obtain.setBool("enableFollowShotIndependentThread", c84099WzX.LJIILJJIL);
        obtain.setBool("AudioGraphRefactor", c84099WzX.LJIILL);
        obtain.setBool("useAudioGraphOutput", c84099WzX.LJIILLIIL);
        obtain.setBool("EnableReleaseGPUResource", c84099WzX.LJIIZILJ);
        obtain.setBool("EnableAudioDecodeTimeOpt", c84099WzX.LJIJ);
        obtain.setBool("EnableModelHotUpdate", c84099WzX.LJIJJ);
        obtain.setBool("EnableRenderLayer", c84099WzX.LJIJI);
        obtain.setBool("EnablePassEffectWhenNoEffect", c84099WzX.LJIJJLI);
        obtain.setBool("VideoDecodeUseSetMultiTrackStatus", c84099WzX.LJIL);
        if (!c84099WzX.LJIJI || !c84099WzX.LJIJJ) {
            z = C65429Pm5.LJFF("ve_enable_titan_video_decode_opt", false);
        }
        obtain.setBool("EnableVideoDecodeOpt", z);
        obtain.setInt("RenderThreadSelfDriveConfig", c84099WzX.LJJ);
        obtain.setInt("HwDecodeConfig", c84099WzX.LJJI);
        obtain.setBool("AudioOpt", c84099WzX.LJJIFFI);
        return obtain;
    }

    public static TEBundle LIZJ(C84098WzW c84098WzW) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("GetFrameMode", c84098WzW.LIZ.ordinal());
        obtain.setInt("TargetWidth", c84098WzW.LIZIZ.width);
        obtain.setInt("TargetHeight", c84098WzW.LIZIZ.height);
        obtain.setInt("OriginTargetWidth", c84098WzW.LIZJ.width);
        obtain.setInt("OriginTargetHeight", c84098WzW.LIZJ.height);
        obtain.setBool("TwoFrameOpt", c84098WzW.LIZLLL);
        obtain.setInt("FitMode", c84098WzW.LJI.ordinal());
        obtain.setInt("EffectType", c84098WzW.LJ.ordinal());
        obtain.setBool("DrawToScreen", c84098WzW.LJFF);
        obtain.setInt("MirrorMode", c84098WzW.LJIIIIZZ.ordinal());
        obtain.setBool("NeedProcessAsCameraFrame", c84098WzW.LJIIIZ);
        obtain.setInt("EffectRotation", c84098WzW.LJIIJ);
        obtain.setInt("Rotate", 0);
        obtain.setBool("NeedDelay", c84098WzW.LJIIJJI);
        obtain.setInt("FrameInterval", c84098WzW.LJIIZILJ);
        obtain.setString("FileCacheDir", c84098WzW.LJIILLIIL);
        obtain.setString("FileName", c84098WzW.LJIIL);
        obtain.setInt("ResultType", c84098WzW.LJIILIIL.ordinal());
        obtain.setInt("CameraFacing", c84098WzW.LJIJI);
        obtain.setBool("WithOrigin", c84098WzW.LJIJJ);
        obtain.setString("PathForGetFrameWithTexture", c84098WzW.LJIILL);
        obtain.setLong("RecordTimestamp", 0L);
        return obtain;
    }

    public static TEBundle LIZLLL(VEVideoEncodeSettings vEVideoEncodeSettings) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("OutputWidth", vEVideoEncodeSettings.getVideoRes().width);
        obtain.setInt("OutputHeight", vEVideoEncodeSettings.getVideoRes().height);
        obtain.setInt("BitrateMode", vEVideoEncodeSettings.getBitrateMode().ordinal());
        obtain.setInt("Bps", vEVideoEncodeSettings.getBps());
        obtain.setInt("SwCRF", vEVideoEncodeSettings.getSwCRF());
        obtain.setInt("SwQP", vEVideoEncodeSettings.getSwQP());
        obtain.setInt("SwPreset", vEVideoEncodeSettings.getSwPreset());
        obtain.setInt("Fps", vEVideoEncodeSettings.getFps());
        obtain.setInt("FitMode", vEVideoEncodeSettings.getFitMode().ordinal());
        obtain.setInt("MirrorMode", vEVideoEncodeSettings.getMirrorMode().ordinal());
        int encodeStandard = vEVideoEncodeSettings.getEncodeStandard();
        if (C65429Pm5.LJFF("enable_record_mpeg4", false)) {
            encodeStandard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4.ordinal();
            P4Q.LJFF(LIZ, "setCodecType MPEG4");
        } else if (C65429Pm5.LJFF("ve_enable_record_hevc", false)) {
            encodeStandard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1.ordinal();
            P4Q.LJFF(LIZ, "setCodecType ByteVC1");
        }
        obtain.setInt("EncodeStandard", encodeStandard);
        obtain.setBool("BanExtraDataLoop", vEVideoEncodeSettings.isBanExtraDataLoop());
        obtain.setInt("EncodeProfile", vEVideoEncodeSettings.getEncodeProfile());
        obtain.setBool("IsHw", vEVideoEncodeSettings.isSupportHwEnc());
        obtain.setInt("Rotate", vEVideoEncodeSettings.getRotate());
        obtain.setFloat("Speed", vEVideoEncodeSettings.getSpeed());
        obtain.setInt("Gop", vEVideoEncodeSettings.getGopSize());
        obtain.setBool("RecordingMp4", vEVideoEncodeSettings.isRecordingMp4());
        obtain.setInt("ResolutionAlign", vEVideoEncodeSettings.getResolutionAlignment());
        obtain.setInt("KeyFrameDuration", vEVideoEncodeSettings.getKeyFrameDuration());
        obtain.setInt("MaxCacheDuration", vEVideoEncodeSettings.getMaxCacheDuration());
        return obtain;
    }

    public static TEBundle LJ(VEBaseAlgorithmParam vEBaseAlgorithmParam) {
        int algorithmType = vEBaseAlgorithmParam.getAlgorithmType();
        if (algorithmType != 0) {
            if (algorithmType != 100) {
                if (algorithmType != 7) {
                    if (algorithmType != 8) {
                        return null;
                    }
                    TEBundle obtain = TEBundle.obtain();
                    obtain.setString("graphName", null);
                    obtain.setString("algorithmConfig", null);
                    return obtain;
                }
                C84036WyW c84036WyW = (C84036WyW) vEBaseAlgorithmParam;
                TEBundle obtain2 = TEBundle.obtain();
                obtain2.setFloat("detectRectLeft", c84036WyW.LIZ);
                obtain2.setFloat("detectRectTop", c84036WyW.LIZIZ);
                obtain2.setFloat("detectRectWidth", c84036WyW.LIZJ);
                obtain2.setFloat("detectRectHeight", c84036WyW.LIZLLL);
                obtain2.setBool("enableDetectRect", c84036WyW.LJ);
                obtain2.setInt("scanMode", 0);
                obtain2.setLong("detectRequirement", c84036WyW.LJFF);
                obtain2.setInt("codeType", 0);
                obtain2.setBool("decodeMultiple", false);
                obtain2.setBool("enhanceCamera", false);
                return obtain2;
            }
            TEBundle obtain3 = TEBundle.obtain();
            obtain3.setString("Model", ((VEAudioAlgorithmParam) vEBaseAlgorithmParam).getModelPath());
            return obtain3;
        }
        C84073Wz7 c84073Wz7 = (C84073Wz7) vEBaseAlgorithmParam;
        TEBundle obtain4 = TEBundle.obtain();
        obtain4.setInt("interval", c84073Wz7.LIZ);
        obtain4.setBool("is image mode", false);
        obtain4.setBool("is fast mode", false);
        obtain4.setBool("for init", c84073Wz7.getForInit());
        return obtain4;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ttve.nativePort.TEBundle LJFF(com.ss.android.vesdk.filterparam.VEBaseFilterParam r9) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84093WzR.LJFF(com.ss.android.vesdk.filterparam.VEBaseFilterParam):com.ss.android.ttve.nativePort.TEBundle");
    }

    public static TEBundle LJI(VEPrePlayParams vEPrePlayParams) {
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("Duration", vEPrePlayParams.duration);
        obtain.setBool("IsLoop", vEPrePlayParams.isLoop);
        obtain.setInt("StopStrategy", vEPrePlayParams.stopStrategy);
        obtain.setInt("TimeUnit", vEPrePlayParams.timeUnit);
        return obtain;
    }
}
