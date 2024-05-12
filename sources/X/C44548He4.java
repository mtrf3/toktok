package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.He4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44548He4 extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
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
        CompileProbeResult.ResultStatus status;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        CompileProbeResult LJJ = C78555UsJ.LJJ(this.LIZIZ.LIZ);
        CompileProbeResult.State state = null;
        if (LJJ != null && (status = LJJ.getStatus()) != null) {
            state = status.getState();
        }
        if (state == CompileProbeResult.State.SUCCESS && LJJ != null && LJJ.getData() != null) {
            boolean LIZ = e1.LIZ(31744, "enable_ve_compile_crf_reencode", true, false);
            C44549He5 c44549He5 = this.LIZIZ.LIZIZ;
            if (c44549He5.LIZ != null || c44549He5.LIZIZ != null) {
                return;
            }
            List<AbstractC44565HeL> LIZIZ = c44549He5.LIZIZ();
            if ((LIZIZ != null && !LIZIZ.isEmpty()) || !LIZ) {
                return;
            }
            vEVideoEncodeConfigParams2.setEnableRemuxVideo(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44548He4(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44581Heb c44581Heb = C44581Heb.LIZ;
        String name = c44581Heb.key;
        int i = c44581Heb.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
