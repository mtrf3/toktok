package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes15.dex */
public final class WW4 implements InterfaceC74398THu {
    public final /* synthetic */ C82410WVy LJLIL;

    public WW4(C82410WVy c82410WVy) {
        this.LJLIL = c82410WVy;
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" slide onDownloading: ");
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        H7B.LIZIZ("SlideSlip", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        String str;
        I0N LLF;
        InterfaceC73367Sqp FM;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" slide onSuccess: ");
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        H7B.LIZIZ("SlideSlip", X1D.LIZIZ(LIZ));
        if (effect != null && (LLF = this.LJLIL.LLF()) != null && (FM = LLF.FM(effect)) != null) {
            FM.LIZIZ(effect, TEA.DOWNLOAD_SUCCESS, 100, true);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" slide onProgress: ");
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(i);
        H7B.LIZIZ("SlideSlip", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" slide onFailed: ");
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(exceptionResult.getMsg());
        H7B.LIZIZ("SlideSlip", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJLIIIJLLLLLLLZ(exceptionResult);
    }
}
