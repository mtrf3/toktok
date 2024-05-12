package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.He8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44552He8 {
    public final C44539Hdv LIZ;

    public abstract void LIZIZ(C44650Hfi<VEVideoEncodeConfigParams> c44650Hfi);

    public AbstractC44552He8(C44539Hdv c44539Hdv) {
        this.LIZ = c44539Hdv;
        C44549He5 strategiesResult = c44539Hdv.LIZ.getStrategiesResult();
        if (strategiesResult != null) {
            strategiesResult.LIZ = null;
            strategiesResult.LIZIZ = null;
            strategiesResult.LJ = new C44560HeG();
            strategiesResult.LJFF = new C44609Hf3();
            strategiesResult.LIZJ = null;
            strategiesResult.LIZLLL = null;
        }
    }

    public final VEVideoEncodeSettings LIZ(C44650Hfi c44650Hfi) {
        boolean z;
        CompileProbeResult.State state;
        boolean z2;
        C44549He5 c44549He5;
        List<AbstractC44565HeL> LIZIZ;
        CompileProbeResult.ResultData data;
        List<AbstractC44565HeL> LIZIZ2;
        CompileProbeResult.ResultStatus status;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) c44650Hfi.execute();
        o.LJIIIZ(vEVideoEncodeConfigParams, "<this>");
        C87278YNe c87278YNe = new C87278YNe(2);
        c87278YNe.LIZIZ.gopSize = vEVideoEncodeConfigParams.getGopSize();
        c87278YNe.LJIIJ(vEVideoEncodeConfigParams.getOutputSize().getWidth(), vEVideoEncodeConfigParams.getOutputSize().getHeight());
        c87278YNe.LIZIZ.resizeMode = vEVideoEncodeConfigParams.getResizeMode();
        c87278YNe.LIZIZ.resizeX = vEVideoEncodeConfigParams.getResizeX();
        c87278YNe.LIZIZ.resizeY = vEVideoEncodeConfigParams.getResizeY();
        c87278YNe.LIZIZ.isSupportHWEncoder = vEVideoEncodeConfigParams.isSupportHWEncoder();
        c87278YNe.LJIIIZ(vEVideoEncodeConfigParams.getBitrateMode(), vEVideoEncodeConfigParams.getVideoBitrate());
        c87278YNe.LJI(vEVideoEncodeConfigParams.getEncodeProfile());
        c87278YNe.LIZIZ.swMaxrate = vEVideoEncodeConfigParams.getSwMaxRate();
        c87278YNe.LJFF(vEVideoEncodeConfigParams.getSwPreset());
        c87278YNe.LIZIZ.enableAvInterLeave = vEVideoEncodeConfigParams.getEnableAvInterLeave();
        if (vEVideoEncodeConfigParams.getPublishFps() != -1) {
            int fps = vEVideoEncodeConfigParams.getFps();
            int publishFps = vEVideoEncodeConfigParams.getPublishFps();
            if (publishFps > 0 && publishFps < fps) {
                VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
                vEVideoEncodeSettings.fps = fps;
                vEVideoEncodeSettings.publishFps = publishFps;
            } else {
                VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe.LIZIZ;
                vEVideoEncodeSettings2.fps = fps;
                vEVideoEncodeSettings2.publishFps = -1;
            }
        } else {
            c87278YNe.LJII(vEVideoEncodeConfigParams.getFps());
        }
        if (vEVideoEncodeConfigParams.getLowPublishFps() != -1) {
            c87278YNe.LIZIZ.mvStillFramesPublishFps = vEVideoEncodeConfigParams.getLowPublishFps();
        }
        if (vEVideoEncodeConfigParams.getLowWatermarkFps() != -1) {
            c87278YNe.LIZIZ.mvStillFramesWatermarkFps = vEVideoEncodeConfigParams.getLowWatermarkFps();
        }
        if (vEVideoEncodeConfigParams.getEncodeStandard() != null) {
            c87278YNe.LIZIZ.encodeStandard = vEVideoEncodeConfigParams.getEncodeStandard().ordinal();
        }
        int width = vEVideoEncodeConfigParams.getWatermarkSize().getWidth();
        int height = vEVideoEncodeConfigParams.getWatermarkSize().getHeight();
        VESize vESize = c87278YNe.LIZIZ.watermarkSize;
        vESize.width = width;
        vESize.height = height;
        c87278YNe.LJ(vEVideoEncodeConfigParams.getEnableRemuxVideo(), vEVideoEncodeConfigParams.getEnableRemuxVideoForRotation());
        c87278YNe.LIZIZ.externalSettingsJsonStr = vEVideoEncodeConfigParams.getExternalSettingsJsonStr();
        c87278YNe.LIZIZ.enableRemuxVideoForShoot = vEVideoEncodeConfigParams.getEnableRemuxVideoForShoot();
        c87278YNe.LIZIZ.enableHdr10BitEncode = vEVideoEncodeConfigParams.getEnableHdr10bitEncode();
        VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
        LIZ.setWatermark(vEVideoEncodeConfigParams.getWatermarkParam());
        H57 h57 = this.LIZ.LIZIZ.LIZLLL;
        if (h57 != null) {
            h57.LIZIZ = LIZ.setVideoHWoptBitrate(vEVideoEncodeConfigParams.getVideoHWOptBitrateInLength(), vEVideoEncodeConfigParams.getVideoHWOptBitrateOptBitrate(), vEVideoEncodeConfigParams.getVideoHWOptBitrateEnableHD());
        }
        C44539Hdv c44539Hdv = this.LIZ;
        H57 h572 = c44539Hdv.LIZIZ.LIZLLL;
        if (h572 == null || h572.LIZIZ == -1.0f) {
            z = false;
        } else {
            z = true;
        }
        CompileProbeResult LJJ = C78555UsJ.LJJ(c44539Hdv.LIZ);
        if (LJJ != null && (status = LJJ.getStatus()) != null) {
            state = status.getState();
        } else {
            state = null;
        }
        if (state != CompileProbeResult.State.SUCCESS) {
            LJJ = null;
        }
        if (LJJ != null && (data = LJJ.getData()) != null) {
            C44549He5 c44549He52 = this.LIZ.LIZIZ;
            if (c44549He52.LIZ == null || ((LIZIZ2 = c44549He52.LIZIZ()) != null && !LIZIZ2.isEmpty())) {
                LIZ.setVideoSWOptCrf(data.getCrf());
            }
            boolean LJ = C19N.LJ("enable_force_ve_sw_when_opt", false);
            List<AbstractC44565HeL> LIZIZ3 = this.LIZ.LIZIZ.LIZIZ();
            if ((LIZIZ3 == null || LIZIZ3.isEmpty()) && LJ) {
                LIZ.setVideoHwEnc(false);
                z2 = true;
                c44549He5 = this.LIZ.LIZIZ;
                if (c44549He5.LIZ != null && (((LIZIZ = c44549He5.LIZIZ()) == null || LIZIZ.isEmpty()) && C19N.LJ("enable_force_ve_sw_when_opt", false))) {
                    LIZ.setVideoHwEnc(false);
                    z2 = true;
                }
                if (!z && !z2 && vEVideoEncodeConfigParams.isSupportHWEncoder() && this.LIZ.LIZLLL.LLFII()) {
                    LIZ.setVideoHwEnc(true);
                }
                return LIZ;
            }
        }
        z2 = false;
        c44549He5 = this.LIZ.LIZIZ;
        if (c44549He5.LIZ != null) {
            LIZ.setVideoHwEnc(false);
            z2 = true;
        }
        if (!z) {
            LIZ.setVideoHwEnc(true);
        }
        return LIZ;
    }
}
