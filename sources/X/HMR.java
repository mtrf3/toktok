package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HMR<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ MediaModel LIZ;
    public final /* synthetic */ ProgressDialogC164766dM LIZIZ;
    public final /* synthetic */ HMT LIZJ;
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LIZLLL;
    public final /* synthetic */ long LJ;
    public final /* synthetic */ InterfaceC88472Yns<C43933HMb, C76800UCe> LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public HMR(MediaModel mediaModel, ProgressDialogC164766dM progressDialogC164766dM, HMT hmt, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns, long j, InterfaceC88472Yns<? super C43933HMb, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = mediaModel;
        this.LIZIZ = progressDialogC164766dM;
        this.LIZJ = hmt;
        this.LIZLLL = interfaceC88472Yns;
        this.LJ = j;
        this.LJFF = interfaceC88472Yns2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        Integer result = (Integer) c10k.LJIIJJI();
        String str = this.LIZ.fileName;
        this.LIZJ.getClass();
        String LIZ = HMW.LIZ(str);
        ProgressDialogC164766dM progressDialogC164766dM = this.LIZIZ;
        if (progressDialogC164766dM != null) {
            C135115Rz.LIZ(progressDialogC164766dM);
            this.LIZJ.getClass();
            C42303Gix.LIZ(1018, GGO.DISMISS, EnumC42283Gid.PROGRESS_WITH_MESSAGE, EnumC42282Gic.CLOSE_GONE, null);
        }
        o.LJIIIIZZ(result, "result");
        if (result.intValue() >= 0) {
            if (result.intValue() > 0) {
                this.LIZ.duration = result.intValue();
            }
            InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns = this.LIZLLL;
            this.LIZJ.getClass();
            interfaceC88472Yns.invoke(new C43933HMb(0, "Editor1VideoLegalChecker", System.currentTimeMillis() - this.LJ, LIZ, "", true));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            this.LIZJ.getClass();
            LIZ2.append("Editor1VideoLegalChecker");
            LIZ2.append(" ImportError:");
            LIZ2.append(result);
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            InterfaceC88472Yns<C43933HMb, C76800UCe> interfaceC88472Yns2 = this.LJFF;
            this.LIZJ.getClass();
            interfaceC88472Yns2.invoke(new C43933HMb(result.intValue(), "Editor1VideoLegalChecker", System.currentTimeMillis() - this.LJ, LIZ, "", false));
        }
        return null;
    }
}
