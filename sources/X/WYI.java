package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYI implements InterfaceC74398THu {
    public final /* synthetic */ WYF LJLIL;

    public WYI(WYF wyf) {
        this.LJLIL = wyf;
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        this.LJLIL.LJJLL(effect, TEA.DOWNLOADING, null);
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        WYH wyh = this.LJLIL.LJLLL;
        if (wyh != null) {
            wyh.LIZ();
        }
        this.LJLIL.LJJLL(effect, TEA.DOWNLOAD_SUCCESS, null);
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        WYH wyh = this.LJLIL.LJLLL;
        if (wyh != null) {
            TDU tdu = wyh.LJI;
            if (tdu != null) {
                tdu.setProgress(i);
            } else {
                o.LJIJI("progressView");
                throw null;
            }
        }
        this.LJLIL.LJJLL(effect, TEA.DOWNLOADING, Integer.valueOf(i));
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        WYH wyh = this.LJLIL.LJLLL;
        if (wyh != null) {
            wyh.LIZ();
        }
        this.LJLIL.LJJLL(effect, TEA.DOWNLOAD_FAILED, null);
    }
}
