package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Hld, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45017Hld {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public final InterfaceC88472Yns<CompileProbeResult, C76800UCe> LIZJ;
    public AbstractC45020Hlg LIZLLL = C45022Hli.LIZ;

    public final void LIZ(AbstractC45025Hll failed) {
        CompileProbeResult compileProbeResult;
        o.LJIIIZ(failed, "failed");
        if (o.LJ(this.LIZLLL, C45023Hlj.LIZ)) {
            this.LIZLLL = failed;
            InterfaceC88472Yns<CompileProbeResult, C76800UCe> interfaceC88472Yns = this.LIZJ;
            if ((failed instanceof C45030Hlq) || (failed instanceof C45031Hlr)) {
                compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.ERROR, failed.LIZ, 0, null, 12, null), null, 0, 6, null);
            } else if (failed instanceof C45028Hlo) {
                CompileProbeResult.State state = CompileProbeResult.State.ERROR;
                int i = failed.LIZ;
                compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(state, i, i, ((C45028Hlo) failed).LIZIZ), null, 0, 6, null);
            } else if (failed instanceof C45029Hlp) {
                compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.CANCEL, failed.LIZ, 0, null, 12, null), null, 0, 6, null);
            } else if (o.LJ(failed, C45032Hls.LIZIZ)) {
                C5Z5.LIZ("CompileProbe ;OuterCancel on inner Failed");
                CompileProbeResult.State state2 = CompileProbeResult.State.CANCEL;
                int i2 = failed.LIZ;
                compileProbeResult = new CompileProbeResult(new CompileProbeResult.ResultStatus(state2, i2, i2, "OuterCancel"), null, 0, 6, null);
            } else {
                throw new C162476Zf();
            }
            interfaceC88472Yns.invoke(compileProbeResult);
            return;
        }
        C5Z5.LIZ("CompileProbe ;Failed on not running");
    }

    public final void LIZIZ(CompileProbeResult result) {
        o.LJIIIZ(result, "result");
        if (o.LJ(this.LIZLLL, C45023Hlj.LIZ)) {
            this.LIZLLL = C45024Hlk.LIZ;
            this.LIZJ.invoke(result);
        } else {
            C5Z5.LIZIZ("CompileProbe ;Success on not running");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45017Hld(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC88472Yns<? super CompileProbeResult, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC65784Pro2;
        this.LIZJ = interfaceC88472Yns;
    }
}
