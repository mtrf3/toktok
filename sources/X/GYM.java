package X;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS3S1001000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$resolve$2$2", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GYM extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super C41702GYg>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ProgressDialogC43239Gy3 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GYM(ProgressDialogC43239Gy3 progressDialogC43239Gy3, InterfaceC67352kd<? super GYM> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = progressDialogC43239Gy3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C38333F2r c38333F2r;
        C38306F1q c38306F1q;
        C141335gf.LIZJ(obj);
        Throwable th = (Throwable) this.LJLIL;
        GYP.LIZJ("exception happen in prepareDataFlow,directly cancel");
        XKQ xkq = GYP.LIZ;
        String str = null;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        ProgressDialogC43239Gy3 progressDialogC43239Gy3 = this.LJLILLLLZI;
        if (progressDialogC43239Gy3 != null) {
            V1B.LJLILLLLZI(progressDialogC43239Gy3);
        }
        int i = 0;
        GYP.LIZLLL(false);
        C44428Hc8 c44428Hc8 = GYP.LIZIZ;
        if (c44428Hc8 != null && c44428Hc8.LIZIZ) {
            c44428Hc8.LJ();
        }
        if (th instanceof CancellationException) {
            Throwable cause = th.getCause();
            if ((cause instanceof C38333F2r) && (c38306F1q = (C38306F1q) cause) != null) {
                i = c38306F1q.getErrorCode();
            }
            Throwable cause2 = th.getCause();
            if ((cause2 instanceof C38333F2r) && (c38333F2r = (C38333F2r) cause2) != null) {
                str = c38333F2r.getErrorMsg();
            }
            GYP.LJ(-1, new AqS3S1001000_7(i, str, 1));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super C41702GYg> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        GYM gym = new GYM(this.LJLILLLLZI, interfaceC67352kd);
        gym.LJLIL = th;
        return gym.invokeSuspend(C76800UCe.LIZ);
    }
}
