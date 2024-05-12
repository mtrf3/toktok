package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HcK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44440HcK implements InterfaceC74398THu {
    public final /* synthetic */ C44436HcG LJLIL;

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
    }

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
    }

    public C44440HcK(C44436HcG c44436HcG) {
        this.LJLIL = c44436HcG;
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        Exception exception = exceptionResult.getException();
        if (exception != null) {
            C16880lQ.LLLLIIL(exception);
        }
        C29S c29s = this.LJLIL.LIZIZ;
        if (c29s != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.ron);
            C78915Uy7.LJJIIZI(c29s, 3060, creativeToastBuilder);
        }
        InterfaceC45999I3n LIZ = this.LJLIL.LJII.J40().LIZ();
        if (LIZ != null) {
            LIZ.ZP(true);
        }
    }
}
