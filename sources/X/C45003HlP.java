package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HlP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C45003HlP extends TBS implements InterfaceC88472Yns<CompileProbeResult, C76800UCe> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45003HlP(VideoPublishEditModel videoPublishEditModel) {
        super(1, C43383H0x.class, "onResult", "tryInitData$onResult(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;Lcom/ss/android/ugc/aweme/shortvideo/edit/CompileProbeResult;)V", 0);
        this.LJLIL = videoPublishEditModel;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(CompileProbeResult compileProbeResult) {
        CompileProbeResult p0 = compileProbeResult;
        o.LJIIIZ(p0, "p0");
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SWCompileProbe ; onResult: ");
        LIZ.append(p0);
        C5Z5.LIZ(X1D.LIZIZ(LIZ));
        videoPublishEditModel.setCompileProbeResult(p0);
        return C76800UCe.LIZ;
    }
}
