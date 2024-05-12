package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.He1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44545He1 extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44539Hdv LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        CompileProbeResult compileProbeResult;
        CompileProbeResult.ResultData data;
        float optBitrate;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        VideoPublishEditModel videoPublishEditModel = this.LIZIZ.LIZ;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CompileProbeResult compileProbeResult2 = videoPublishEditModel.getCompileProbeResult();
        if (compileProbeResult2 != null && compileProbeResult2.isHw() && (compileProbeResult = videoPublishEditModel.getCompileProbeResult()) != null) {
            List<AbstractC44565HeL> LIZIZ = this.LIZIZ.LIZIZ.LIZIZ();
            if ((LIZIZ == null || LIZIZ.isEmpty() || (ORZ.LJLLJ(LIZIZ) instanceof C44566HeM)) && (data = compileProbeResult.getData()) != null) {
                H57 h57 = new H57();
                if (this.LIZIZ.LIZ()) {
                    optBitrate = data.getOptBitrateFromVE().getOptBitrateHD();
                } else {
                    optBitrate = data.getOptBitrateFromVE().getOptBitrate();
                }
                h57.LIZ = optBitrate;
                this.LIZIZ.LIZIZ.LIZLLL = h57;
                vEVideoEncodeConfigParams2.setVideoHWOptBitrateInLength(Math.min(data.getEncodeWidth(), data.getEncodeHeight()));
                vEVideoEncodeConfigParams2.setVideoHWOptBitrateOptBitrate(optBitrate);
                vEVideoEncodeConfigParams2.setVideoHWOptBitrateEnableHD(this.LIZIZ.LIZ());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44545He1(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44573HeT c44573HeT = C44573HeT.LIZ;
        String name = c44573HeT.key;
        int i = c44573HeT.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
