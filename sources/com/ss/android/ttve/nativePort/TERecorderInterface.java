package com.ss.android.ttve.nativePort;

import X.C84093WzR;
import X.C84098WzW;
import X.C84099WzX;
import X.EnumC83975WxX;
import X.P4Q;
import android.graphics.Bitmap;
import android.view.Surface;
import com.ss.android.medialib.qr.TEHMScanUtil;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.vesdk.TEMemMonitor;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraFrameTime;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.model.VERecordPerformanceData;
import com.ss.android.vesdk.runtime.VERuntime;

/* loaded from: classes15.dex */
public class TERecorderInterface extends TENativeServiceBase {
    public long LIZ;
    public final TEEffectInterface LIZIZ;
    public C84098WzW LIZJ;

    private native void forceVEPermanceRunOnceNow(long j, boolean z);

    private native int nativeAlignTo(long j, int i, int i2, int i3, int i4);

    private native int nativeChangeRenderSize(long j);

    private native int nativeChangeVideoOutputSize(long j, int i, int i2);

    private native int nativeClearAllFrags(long j, boolean z);

    private native void nativeClearDisplayColor(long j, float f, float f2, float f3, float f4);

    private native long nativeCreate();

    private native int nativeDeleteFrag(long j, int i);

    private native int nativeDeleteLastFrag(long j, boolean z);

    private native int nativeEnableEngineMonitorReport(long j, boolean z);

    private native boolean nativeGetBool(long j, String str);

    private native long nativeGetCameraClient(long j);

    private native VECameraFrameTime nativeGetCameraFrameTime(long j);

    private native double nativeGetDouble(long j, String str);

    private native long nativeGetEffectInterface(long j);

    private native float nativeGetFloat(long j, String str);

    private native int nativeGetInt(long j, String str);

    private native VERecordPerformanceData nativeGetLastPerformanceData(long j);

    private native int nativeGetPreviewFrame(long j);

    private native int nativeGetPreviewFrameWithBitmap(long j, Bitmap bitmap);

    private native long nativeGetSecondaryCameraClient(long j);

    private native String nativeGetString(long j, String str);

    private native String[] nativeGetStringArray(long j, String str);

    private native long nativeGetVideoDataClient(long j);

    private native int nativeInit(long j, Object obj);

    private native boolean nativeIsRecording(long j);

    private native void nativeNotifyFollowShotSurfaceChanged(long j, Surface surface, int i, int i2, boolean z);

    private native void nativeNotifySurfaceChanged(long j, int i, int i2, int i3, boolean z);

    private native int nativePausePrePlay(long j);

    private native int nativePauseRender(long j);

    private native int nativePostOnRenderThread(long j, int i, int i2, float f);

    private native int nativeRelease(long j);

    private native int nativeReleaseGPUResources(long j, boolean z);

    private native int nativeRenderFrame(long j, TECameraFrameSetting tECameraFrameSetting);

    private native void nativeResetCameraFrameTime(long j);

    private native void nativeSetBackground(long j, float f, float f2, float f3, float f4);

    private native int nativeSetBool(long j, String str, boolean z);

    private native int nativeSetBundle(long j, String str, long j2);

    private native int nativeSetDisplaySettings(long j);

    private native int nativeSetDisplaySurface(long j, Surface surface, int i, int i2);

    private native int nativeSetDisplaySurfaceSync(long j, Surface surface);

    private native int nativeSetDisplaySurfaceSync2(long j, Surface surface, int i, int i2);

    private native int nativeSetDouble(long j, String str, double d);

    private native int nativeSetFloat(long j, String str, float f);

    private native void nativeSetFollowingShotWindowsBackground(long j, float f, float f2, float f3, float f4);

    private native int nativeSetInt(long j, String str, int i);

    private native int nativeSetLandscape(long j);

    private native int nativeSetLong(long j, String str, long j2);

    private native int nativeSetMessageAndCallbackClient(long j, TEMessageClient tEMessageClient, TECallbackClient tECallbackClient);

    private native int nativeSetMultiCamMode(long j, int i, boolean z);

    private native int nativeSetPerformanceMonitorCallbackClient(long j, TEMemMonitor tEMemMonitor);

    private native int nativeSetPlayTrackStatus(long j, int i, int i2, int i3, long j2, boolean z);

    private native int nativeSetString(long j, String str, String str2);

    private native int nativeSetSubSurface(long j, Surface surface, int i, int i2);

    private native void nativeSetWaterMark(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6);

    private native int nativeStartFollowingShotPreview(long j);

    private native int nativeStartPrePlay(long j);

    private native int nativeStartPreview(long j, Surface surface);

    private native int nativeStartRecord(long j, float f);

    private native int nativeStartRender(long j);

    private native void nativeStopFollowShowRender(long j, boolean z);

    private native int nativeStopFollowingShotPreview(long j);

    private native int nativeStopPrePlay(long j);

    private native int nativeStopPreview(long j, long j2);

    private native int nativeStopPreviewParallel(long j);

    private native int nativeStopRecord(long j);

    private native void nativeStopRender(long j, boolean z);

    private native int nativeTryRestore(long j);

    private native void nativeUpdateVideoDecodeChainByTimeline(long j);

    public final int LIZIZ() {
        return nativeClearAllFrags(this.LIZ, false);
    }

    public final int LJFF() {
        long j = this.LIZ;
        if (j == 0) {
            P4Q.LIZJ("TERecorderInterface", "enableEngineMonitorReport mHandle is null");
            return -1;
        }
        return nativeEnableEngineMonitorReport(j, true);
    }

    public final VECameraFrameTime LJII() {
        return nativeGetCameraFrameTime(this.LIZ);
    }

    public final long LJIIIIZZ() {
        return nativeGetCameraClient(this.LIZ);
    }

    public final VERecordPerformanceData LJIIJ() {
        return nativeGetLastPerformanceData(this.LIZ);
    }

    public final long LJIIL() {
        return nativeGetSecondaryCameraClient(this.LIZ);
    }

    public final String[] LJIILIIL() {
        return nativeGetStringArray(this.LIZ, "VideoPaths");
    }

    public final long LJIILJJIL() {
        return nativeGetVideoDataClient(this.LIZ);
    }

    public final boolean LJIILLIIL() {
        long j = this.LIZ;
        if (j == 0) {
            P4Q.LIZJ("TERecorderInterface", "isRecording mHandle is null");
            return false;
        }
        return nativeIsRecording(j);
    }

    public final int LJIJI() {
        return nativePausePrePlay(this.LIZ);
    }

    public final int LJIJJ() {
        return nativePauseRender(this.LIZ);
    }

    public final int LJIL() {
        if (this.LIZ == 0) {
            return -112;
        }
        TEEffectInterface tEEffectInterface = this.LIZIZ;
        if (tEEffectInterface != null) {
            tEEffectInterface.release();
        }
        int nativeRelease = nativeRelease(this.LIZ);
        TEBundle.cleanAll();
        this.LIZ = 0L;
        this.LIZJ = null;
        return nativeRelease;
    }

    public final void LJJIFFI() {
        nativeResetCameraFrameTime(this.LIZ);
    }

    public final int LJJIIJZLJL() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetDisplaySettings(j);
    }

    public final int LJJJJ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeStartFollowingShotPreview(j);
    }

    public final int LJJJJI() {
        return nativeStartPrePlay(this.LIZ);
    }

    public final int LJJJJJL() {
        return nativeStartRender(this.LIZ);
    }

    public final void LJJJJLI() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeStopFollowingShotPreview(j);
    }

    public final int LJJJJLL() {
        return nativeStopPrePlay(this.LIZ);
    }

    public final int LJJJJZI() {
        long j = this.LIZ;
        if (j == 0) {
            P4Q.LIZJ("TERecorderInterface", "stopPreviewParallel mHandle is null");
            return -112;
        }
        return nativeStopPreviewParallel(j);
    }

    public final int LJJJLIIL() {
        return nativeStopRecord(this.LIZ);
    }

    public final int LJJJLZIJ() {
        return nativeTryRestore(this.LIZ);
    }

    public final void LJJJZ() {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeUpdateVideoDecodeChainByTimeline(j);
    }

    public TERecorderInterface() {
        int i;
        if (VERuntime.getInstance().isGLES3Enabled()) {
            i = 3;
        } else {
            i = 2;
        }
        TEGLGlobalContext.nativeSetGLVersion(i);
        long nativeCreate = nativeCreate();
        this.LIZ = nativeCreate;
        this.LIZIZ = new TEEffectInterface(nativeGetEffectInterface(nativeCreate));
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public final int LIZLLL(int i) {
        return nativeDeleteFrag(this.LIZ, i);
    }

    public final int LJ(boolean z) {
        return nativeDeleteLastFrag(this.LIZ, z);
    }

    public final void LJI(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        forceVEPermanceRunOnceNow(j, z);
    }

    public final int LJIIIZ(String str) {
        return nativeGetInt(this.LIZ, str);
    }

    public final int LJIIJJI(C84098WzW c84098WzW) {
        if (this.LIZ == 0) {
            return -112;
        }
        if (!c84098WzW.equals(this.LIZJ)) {
            LJJIIJ("GetFrameSettings", C84093WzR.LIZJ(c84098WzW));
            this.LIZJ = c84098WzW;
        }
        Bitmap bitmap = c84098WzW.LJIJ;
        if (bitmap != null) {
            return nativeGetPreviewFrameWithBitmap(this.LIZ, bitmap);
        }
        return nativeGetPreviewFrame(this.LIZ);
    }

    public final int LJJ(boolean z) {
        return nativeReleaseGPUResources(this.LIZ, z);
    }

    public final void LJJIL(TEMemMonitor tEMemMonitor) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeSetPerformanceMonitorCallbackClient(j, tEMemMonitor);
    }

    public final void LJJJIL(VEWatermarkParam vEWatermarkParam) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeSetWaterMark(j, vEWatermarkParam.waterMarkBitmap, vEWatermarkParam.width, vEWatermarkParam.height, vEWatermarkParam.xOffset, vEWatermarkParam.yOffset, vEWatermarkParam.position.ordinal(), vEWatermarkParam.rotation);
    }

    public final int LJJJJIZL(Surface surface) {
        return nativeStartPreview(this.LIZ, surface);
    }

    public final int LJJJJJ(float f) {
        return nativeStartRecord(this.LIZ, f);
    }

    public final void LJJJJL(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeStopFollowShowRender(j, z);
    }

    public final int LJJJJZ(long j) {
        return nativeStopPreview(this.LIZ, j);
    }

    public final void LJJJLL(boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeStopRender(j, z);
    }

    public final int LJIJJLI(int i, int i2) {
        long j = this.LIZ;
        if (j == 0) {
            P4Q.LIZJ("TERecorderInterface", "postOnRenderThread mHandle is null");
            return -112;
        }
        return nativePostOnRenderThread(j, i, i2, 0.0f);
    }

    public final void LJJI(TECameraFrameSetting tECameraFrameSetting, C84098WzW c84098WzW) {
        if (this.LIZ == 0) {
            return;
        }
        if (!c84098WzW.equals(this.LIZJ)) {
            LJJIIJ("GetFrameSettings", C84093WzR.LIZJ(c84098WzW));
            this.LIZJ = c84098WzW;
        }
        nativeRenderFrame(this.LIZ, tECameraFrameSetting);
    }

    public final int LJJIII(String str, boolean z) {
        return nativeSetBool(this.LIZ, str, z);
    }

    public final int LJJIIJ(String str, TEBundle tEBundle) {
        int nativeSetBundle = nativeSetBundle(this.LIZ, str, tEBundle.getHandle());
        tEBundle.recycle();
        return nativeSetBundle;
    }

    public final void LJJIJ(String str, float f) {
        nativeSetFloat(this.LIZ, str, f);
    }

    public final void LJJIJIIJIL(String str, int i) {
        nativeSetInt(this.LIZ, str, i);
    }

    public final int LJJIJIL(String str, long j) {
        return nativeSetLong(this.LIZ, str, j);
    }

    public final void LJJIJL(TEMessageClient tEMessageClient, TECallbackClient tECallbackClient) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeSetMessageAndCallbackClient(j, tEMessageClient, tECallbackClient);
    }

    public final int LJJIJLIJ(EnumC83975WxX enumC83975WxX, boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetMultiCamMode(j, enumC83975WxX.ordinal(), z);
    }

    public final int LJJJ(String str, String str2) {
        return nativeSetString(this.LIZ, str, str2);
    }

    public final int LJJIIZ(int i, int i2, Surface surface) {
        return nativeSetDisplaySurface(this.LIZ, surface, i, i2);
    }

    public final int LJJIIZI(int i, int i2, Surface surface) {
        return nativeSetDisplaySurfaceSync2(this.LIZ, surface, i, i2);
    }

    public final void LJJJI(int i, int i2, Surface surface) {
        nativeSetSubSurface(this.LIZ, surface, i, i2);
    }

    public final int LIZ(int i, int i2, int i3, int i4) {
        return nativeAlignTo(this.LIZ, i, i2, i3, i4);
    }

    public final void LIZJ(float f, float f2, float f3, float f4) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeClearDisplayColor(j, f, f2, f3, f4);
    }

    public final int LJIILL(C84099WzX c84099WzX, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings) {
        boolean isEnableCameraFrameUpdateIndependentThread;
        if (this.LIZ == 0) {
            return -112;
        }
        LJJIIJ("RecordContext", C84093WzR.LIZIZ(c84099WzX));
        LJJIIJ("VideoEncode", C84093WzR.LIZLLL(vEVideoEncodeSettings));
        TEBundle obtain = TEBundle.obtain();
        obtain.setInt("ChannelCount", vEAudioEncodeSettings.getChannelCount());
        obtain.setInt("SampleRate", vEAudioEncodeSettings.getSampleRate());
        obtain.setInt("Bps", vEAudioEncodeSettings.getBps());
        obtain.setInt("EncodeCodec", vEAudioEncodeSettings.getCodec().ordinal());
        obtain.setBool("IsHW", vEAudioEncodeSettings.isHwEnc());
        LJJIIJ("AudioEncode", obtain);
        TEBundle obtain2 = TEBundle.obtain();
        obtain2.setBool("enable3buffer", vEPreviewSettings.is3bufferEnable());
        obtain2.setBool("enablePreloadEffectRes", vEPreviewSettings.isPreloadEffectResEnabled());
        obtain2.setHandle("effectAlgorithmRequirement", vEPreviewSettings.getEffectAlgorithmRequirement());
        obtain2.setBool("detectionMode", vEPreviewSettings.isAsyncDetection());
        obtain2.setBool("sharedTextureStatus", vEPreviewSettings.isEGLImageEnable());
        obtain2.setBool("enableEffectRT", vEPreviewSettings.isEffectRTEnable());
        obtain2.setBool("enableMakeUpBackground", vEPreviewSettings.isMakeUpBackgroundEnable());
        obtain2.setInt("captureRenderMaxWidth", vEPreviewSettings.getCaptureRenderMaxWidth());
        obtain2.setInt("captureRenderFinalWidth", vEPreviewSettings.getCaptureRenderFinalWidth());
        obtain2.setBool("cameraFirstFrameOptimize", vEPreviewSettings.isOptFirstFrame());
        if (vEPreviewSettings.getForceRenderThreadSelfDriveConfig()) {
            if (vEPreviewSettings.getRenderThreadSelfDriveConfig() == 0) {
                isEnableCameraFrameUpdateIndependentThread = vEPreviewSettings.isEnableCameraFrameUpdateIndependentThread();
            }
            isEnableCameraFrameUpdateIndependentThread = false;
        } else {
            if (!vEPreviewSettings.isEnableRenderThreadSelfDrive()) {
                isEnableCameraFrameUpdateIndependentThread = vEPreviewSettings.isEnableCameraFrameUpdateIndependentThread();
            }
            isEnableCameraFrameUpdateIndependentThread = false;
        }
        obtain2.setBool("cameraUpdateIndependentThread", isEnableCameraFrameUpdateIndependentThread);
        obtain2.setBool("enableNewEffectAlgorithmAsync", vEPreviewSettings.isEnableNewEffectAlgorithmAsync());
        obtain2.setInt("graphType", vEPreviewSettings.getGraphType().ordinal());
        obtain2.setBool("enableTitanAutoTestLog", vEPreviewSettings.isEnableTitanAutoTestLog());
        obtain2.setBool("enableDestroyEffectInStopPreview", vEPreviewSettings.isEnableDestroyEffectInStopPreview());
        obtain2.setInt("MaxCountOfEncBufCache", vEPreviewSettings.getMaxCountOfBufCache());
        obtain2.setBool("disEnableEffectWhenNoUsed", vEPreviewSettings.getDisEnableEffectWhenNoUsed());
        obtain2.setInt("firstNFrameIntervalsAverageCnt", vEPreviewSettings.getFirstNFrameIntervalsAverageCnt());
        LJJIIJ("PreviewSetting", obtain2);
        return nativeInit(this.LIZ, TEHMScanUtil.getInstance());
    }

    public final void LJIIZILJ(Surface surface, int i, int i2, boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeNotifyFollowShotSurfaceChanged(j, surface, i, i2, z);
    }

    public final void LJIJ(int i, int i2, int i3, boolean z) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeNotifySurfaceChanged(j, i, i2, i3, z);
    }

    public final void LJJII(float f, float f2, float f3, float f4) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeSetBackground(j, f, f2, f3, f4);
    }

    public final void LJJIJIIJI(float f, float f2, float f3, float f4) {
        long j = this.LIZ;
        if (j == 0) {
            P4Q.LIZJ("TERecorderInterface", "setFollowingShotWindowsBackground mHandle is null");
        } else {
            nativeSetFollowingShotWindowsBackground(j, f, f2, f3, f4);
        }
    }

    public final int LJJIZ(long j, int i, int i2, int i3, boolean z) {
        return nativeSetPlayTrackStatus(this.LIZ, i, i2, i3, j, z);
    }
}
