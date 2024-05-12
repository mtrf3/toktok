package com.ss.ttlivestreamer.livestreamv2.filter.ve;

import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.ss.android.ttvecamera.cameraalgorithm.TEOneKeyProcessParams;
import com.ss.android.ttvecamera.cameraalgorithm.TERhythmicMotionParam;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class LiveAlgorithmParam {

    /* loaded from: classes12.dex */
    public static final class OneKeyProcess extends LiveAlgorithmParam {
        public String algParams;
        public int cvdetectFrames;
        public boolean enableAfs;
        public boolean enableAlgoConfig;
        public boolean enableAsyncProcess;
        public boolean enableDayScene;
        public boolean enableDenoise;
        public boolean enableHDR;
        public boolean enableHdrV2;
        public boolean enableNightScene;
        public boolean isFirstFrame;
        public int iso;
        public int maxIso;
        public int minIso;

        /* JADX WARN: Multi-variable type inference failed */
        public OneKeyProcess() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 16383, 0 == true ? 1 : 0);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam
        public TEOneKeyProcessParams mappingValue() {
            TEOneKeyProcessParams tEOneKeyProcessParams = new TEOneKeyProcessParams();
            tEOneKeyProcessParams.enableHDR = this.enableHDR;
            tEOneKeyProcessParams.enableDenoise = this.enableDenoise;
            tEOneKeyProcessParams.enableAfs = this.enableAfs;
            tEOneKeyProcessParams.enableHdrV2 = this.enableHdrV2;
            tEOneKeyProcessParams.enableAsyncProcess = this.enableAsyncProcess;
            tEOneKeyProcessParams.enableDayScene = this.enableDayScene;
            tEOneKeyProcessParams.enableNightScene = this.enableNightScene;
            tEOneKeyProcessParams.algParams = this.algParams;
            tEOneKeyProcessParams.isFirstFrame = this.isFirstFrame;
            tEOneKeyProcessParams.enableAlgoConfig = this.enableAlgoConfig;
            tEOneKeyProcessParams.cvdetectFrames = this.cvdetectFrames;
            tEOneKeyProcessParams.iso = this.iso;
            tEOneKeyProcessParams.maxIso = this.maxIso;
            tEOneKeyProcessParams.minIso = this.minIso;
            return tEOneKeyProcessParams;
        }

        public final String getAlgParams() {
            return this.algParams;
        }

        public final int getCvdetectFrames() {
            return this.cvdetectFrames;
        }

        public final boolean getEnableAfs() {
            return this.enableAfs;
        }

        public final boolean getEnableAlgoConfig() {
            return this.enableAlgoConfig;
        }

        public final boolean getEnableAsyncProcess() {
            return this.enableAsyncProcess;
        }

        public final boolean getEnableDayScene() {
            return this.enableDayScene;
        }

        public final boolean getEnableDenoise() {
            return this.enableDenoise;
        }

        public final boolean getEnableHDR() {
            return this.enableHDR;
        }

        public final boolean getEnableHdrV2() {
            return this.enableHdrV2;
        }

        public final boolean getEnableNightScene() {
            return this.enableNightScene;
        }

        public final int getIso() {
            return this.iso;
        }

        public final int getMaxIso() {
            return this.maxIso;
        }

        public final int getMinIso() {
            return this.minIso;
        }

        public final boolean isFirstFrame() {
            return this.isFirstFrame;
        }

        public final void setAlgParams(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.algParams = str;
        }

        public final void setCvdetectFrames(int i) {
            this.cvdetectFrames = i;
        }

        public final void setEnableAfs(boolean z) {
            this.enableAfs = z;
        }

        public final void setEnableAlgoConfig(boolean z) {
            this.enableAlgoConfig = z;
        }

        public final void setEnableAsyncProcess(boolean z) {
            this.enableAsyncProcess = z;
        }

        public final void setEnableDayScene(boolean z) {
            this.enableDayScene = z;
        }

        public final void setEnableDenoise(boolean z) {
            this.enableDenoise = z;
        }

        public final void setEnableHDR(boolean z) {
            this.enableHDR = z;
        }

        public final void setEnableHdrV2(boolean z) {
            this.enableHdrV2 = z;
        }

        public final void setEnableNightScene(boolean z) {
            this.enableNightScene = z;
        }

        public final void setFirstFrame(boolean z) {
            this.isFirstFrame = z;
        }

        public final void setIso(int i) {
            this.iso = i;
        }

        public final void setMaxIso(int i) {
            this.maxIso = i;
        }

        public final void setMinIso(int i) {
            this.minIso = i;
        }

        public OneKeyProcess(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, int i4, String algParams) {
            o.LJIIIZ(algParams, "algParams");
            this.enableHDR = z;
            this.enableDenoise = z2;
            this.enableAfs = z3;
            this.enableHdrV2 = z4;
            this.enableAsyncProcess = z5;
            this.enableDayScene = z6;
            this.enableNightScene = z7;
            this.isFirstFrame = z8;
            this.enableAlgoConfig = z9;
            this.cvdetectFrames = i;
            this.iso = i2;
            this.maxIso = i3;
            this.minIso = i4;
            this.algParams = algParams;
        }

        public /* synthetic */ OneKeyProcess(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? true : z, (i5 & 2) != 0 ? false : z2, (i5 & 4) != 0 ? false : z3, (i5 & 8) != 0 ? true : z4, (i5 & 16) != 0 ? true : z5, (i5 & 32) != 0 ? true : z6, (i5 & 64) != 0 ? true : z7, (i5 & 128) != 0 ? false : z8, (i5 & 256) == 0 ? z9 : true, (i5 & 512) != 0 ? 3 : i, (i5 & 1024) != 0 ? 0 : i2, (i5 & 2048) != 0 ? 0 : i3, (i5 & 4096) == 0 ? i4 : 0, (i5 & FileUtils.BUFFER_SIZE) != 0 ? "luminance_target_string=175,155\n      & contrast_factor_float=0.3f\n      & saturation_factor_float=0.3f\n      & amount_float=2.f\n      & ratio_float=0.02f\n      & noise_factor_float=1.f\n      & current_pixel_weight_float=0.5f\n      & hdr_version_int=2\n      & luma_trigger_float=37.8\n      & over_trigger_float=-1\n      & under_trigger_float=-1\n      & asf_scene_mode_int=5" : str);
        }
    }

    /* loaded from: classes12.dex */
    public static final class RhythmicMotion extends LiveAlgorithmParam {
        public float[] cropList;
        public boolean isOpenOneKeyProcess;
        public boolean isOpenRhythm;
        public float maxAlpha;
        public float maxVelocity;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RhythmicMotion() {
            /*
                r6 = this;
                r1 = 0
                r2 = 0
                r4 = 7
                r0 = r6
                r3 = r2
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam.RhythmicMotion.<init>():void");
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam
        public TERhythmicMotionParam mappingValue() {
            TERhythmicMotionParam tERhythmicMotionParam = new TERhythmicMotionParam();
            tERhythmicMotionParam.cropList = this.cropList;
            tERhythmicMotionParam.maxAlpha = this.maxAlpha;
            tERhythmicMotionParam.maxVelocity = this.maxVelocity;
            return tERhythmicMotionParam;
        }

        public final float[] getCropList() {
            return this.cropList;
        }

        public final float getMaxAlpha() {
            return this.maxAlpha;
        }

        public final float getMaxVelocity() {
            return this.maxVelocity;
        }

        public final boolean isOpenOneKeyProcess() {
            return this.isOpenOneKeyProcess;
        }

        public final boolean isOpenRhythm() {
            return this.isOpenRhythm;
        }

        public final void setCropList(float[] fArr) {
            o.LJIIIZ(fArr, "<set-?>");
            this.cropList = fArr;
        }

        public final void setMaxAlpha(float f) {
            this.maxAlpha = f;
        }

        public final void setMaxVelocity(float f) {
            this.maxVelocity = f;
        }

        public final void setOpenOneKeyProcess(boolean z) {
            this.isOpenOneKeyProcess = z;
        }

        public final void setOpenRhythm(boolean z) {
            this.isOpenRhythm = z;
        }

        public RhythmicMotion(float[] cropList, float f, float f2) {
            o.LJIIIZ(cropList, "cropList");
            this.cropList = cropList;
            this.maxAlpha = f;
            this.maxVelocity = f2;
        }

        public /* synthetic */ RhythmicMotion(float[] fArr, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new float[3] : fArr, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
        }
    }

    public abstract TECameraAlgorithmParam mappingValue();

    public LiveAlgorithmParam() {
    }

    public /* synthetic */ LiveAlgorithmParam(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
