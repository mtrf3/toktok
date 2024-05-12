package X;

import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;

/* renamed from: X.Hlb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45015Hlb implements InterfaceC87287YNn {
    public final /* synthetic */ InterfaceC65052gv<CompileProbeResult> LIZ;
    public final /* synthetic */ C72242sW LIZIZ;

    public C45015Hlb(C73578SuE c73578SuE, C72242sW c72242sW) {
        this.LIZ = c73578SuE;
        this.LIZIZ = c72242sW;
    }

    @Override // X.InterfaceC87287YNn
    public final void LIZ(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7, float f2, int i8, int i9, double d) {
        if (i != -10000) {
            if (i != 0) {
                ((C73578SuE) this.LIZ).tryOnError(new C45016Hlc(new C45031Hlr(i)));
                return;
            } else {
                InterfaceC65052gv<CompileProbeResult> interfaceC65052gv = this.LIZ;
                C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
                c73578SuE.onSuccess(new CompileProbeResult(new CompileProbeResult.ResultStatus(CompileProbeResult.State.SUCCESS, i, 0, null, 12, null), new CompileProbeResult.ResultData(i2, f, i3, i4, i5, i6, i7, f2, i8, i9, d, (int) (System.currentTimeMillis() - this.LIZIZ.element), 0.0f, null, 12288, null), 0, 4, null));
                return;
            }
        }
        ((C73578SuE) this.LIZ).tryOnError(new C45016Hlc(new C45029Hlp(i)));
    }
}
