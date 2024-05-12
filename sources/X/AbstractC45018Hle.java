package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Hle, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45018Hle implements InterfaceC140165em {
    public C45017Hld LIZ;

    public abstract boolean LIZIZ(VideoPublishEditModel videoPublishEditModel);

    public abstract void LIZJ(VideoPublishEditModel videoPublishEditModel);

    @Override // X.InterfaceC140165em
    public final void Y7() {
        C45017Hld c45017Hld = this.LIZ;
        if (c45017Hld != null && o.LJ(c45017Hld.LIZLLL, C45023Hlj.LIZ)) {
            C45032Hls c45032Hls = C45032Hls.LIZIZ;
            c45017Hld.LIZLLL = c45032Hls;
            c45017Hld.LIZIZ.invoke();
            InterfaceC88472Yns<CompileProbeResult, C76800UCe> interfaceC88472Yns = c45017Hld.LIZJ;
            CompileProbeResult.State state = CompileProbeResult.State.CANCEL;
            int i = c45032Hls.LIZ;
            interfaceC88472Yns.invoke(new CompileProbeResult(new CompileProbeResult.ResultStatus(state, i, i, "OuterCancel"), null, 0, 6, null));
        }
        C45017Hld c45017Hld2 = this.LIZ;
        if (c45017Hld2 != null) {
            AbstractC45020Hlg abstractC45020Hlg = c45017Hld2.LIZLLL;
            C45022Hli c45022Hli = C45022Hli.LIZ;
            if (o.LJ(abstractC45020Hlg, c45022Hli) || o.LJ(abstractC45020Hlg, C45024Hlk.LIZ) || (abstractC45020Hlg instanceof AbstractC45025Hll)) {
                c45017Hld2.LIZLLL = c45022Hli;
            } else {
                if (!o.LJ(abstractC45020Hlg, C45023Hlj.LIZ)) {
                    return;
                }
                C5Z5.LIZIZ("CompileProbe ; clear on running");
            }
        }
    }

    @Override // X.InterfaceC140165em
    public final void LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!LIZIZ(model)) {
            C5Z5.LIZIZ("CompileProbe ; Need not start");
            return;
        }
        LIZJ(model);
        C45017Hld c45017Hld = this.LIZ;
        if (c45017Hld != null && o.LJ(c45017Hld.LIZLLL, C45022Hli.LIZ)) {
            c45017Hld.LIZLLL = C45023Hlj.LIZ;
            c45017Hld.LIZ.invoke();
        }
    }
}
