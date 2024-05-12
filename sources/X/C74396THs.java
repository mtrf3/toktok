package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.THs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74396THs implements InterfaceC74398THu {
    public final C44428Hc8 LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC74398THu LJLJI;
    public final InterfaceC74399THv LJLJJI;
    public final InterfaceC88471Ynr<Boolean, Effect, C76800UCe> LJLJJL;

    @Override // X.InterfaceC74398THu
    public final void LLILLIZIL(Effect effect) {
        InterfaceC74398THu interfaceC74398THu = this.LJLJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.LLILLIZIL(effect);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void onSuccess(Effect effect) {
        long LIZIZ = this.LJLIL.LIZIZ(TimeUnit.MILLISECONDS);
        this.LJLJJL.invoke(Boolean.TRUE, effect);
        InterfaceC74398THu interfaceC74398THu = this.LJLJI;
        if ((interfaceC74398THu instanceof InterfaceC74400THw) && this.LJLILLLLZI == 1) {
            ((InterfaceC74400THw) interfaceC74398THu).LJJLIIIJILLIZJL(effect);
        } else if (interfaceC74398THu != null) {
            interfaceC74398THu.onSuccess(effect);
        }
        InterfaceC74399THv interfaceC74399THv = this.LJLJJI;
        if (interfaceC74399THv != null) {
            interfaceC74399THv.LJIIIZ(effect, this.LJLILLLLZI, LIZIZ);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void LJFF(int i, Effect effect) {
        InterfaceC74398THu interfaceC74398THu = this.LJLJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.LJFF(i, effect);
        }
    }

    @Override // X.InterfaceC74398THu
    public final void LJLIIL(Effect effect, ExceptionResult exceptionResult) {
        long LIZIZ = this.LJLIL.LIZIZ(TimeUnit.MILLISECONDS);
        this.LJLJJL.invoke(Boolean.FALSE, effect);
        InterfaceC74398THu interfaceC74398THu = this.LJLJI;
        if (interfaceC74398THu != null) {
            interfaceC74398THu.LJLIIL(effect, exceptionResult);
        }
        InterfaceC74399THv interfaceC74399THv = this.LJLJJI;
        if (interfaceC74399THv != null) {
            interfaceC74399THv.LIZLLL(effect, LIZIZ, this.LJLILLLLZI, exceptionResult);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74396THs(int i, InterfaceC74398THu interfaceC74398THu, InterfaceC74399THv interfaceC74399THv, InterfaceC88471Ynr<? super Boolean, ? super Effect, C76800UCe> downloadPropEnd) {
        o.LJIIIZ(downloadPropEnd, "downloadPropEnd");
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC74398THu;
        this.LJLJJI = interfaceC74399THv;
        this.LJLJJL = downloadPropEnd;
        this.LJLIL = C44428Hc8.LIZ();
    }
}
