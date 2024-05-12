package X;

import Y.ACallableS77S0101000_4;
import com.bytedance.android.livesdk.broadcast.interaction.function.illegal.LiveIllegalPresenter;
import com.bytedance.android.livesdk.i18n.I18nDbManager;

/* renamed from: X.1PN, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1PN implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.LJLIL) {
            case 0:
                AbstractC51301zq abstractC51301zq = (AbstractC51301zq) this.LJLILLLLZI;
                if (abstractC51301zq.LJIIIIZZ.getValue() != null && abstractC51301zq.LJIIIIZZ.getValue() == C06900Ow.LIZIZ) {
                    return;
                }
                abstractC51301zq.LIZJ();
                return;
            case 1:
                LiveIllegalPresenter.LJJJJ((LiveIllegalPresenter) this.LJLILLLLZI, (Throwable) obj);
                return;
            case 2:
                ((I18nDbManager) this.LJLILLLLZI).lambda$updateTranslations$5((Throwable) obj);
                return;
            default:
                C8BS c8bs = (C8BS) this.LJLILLLLZI;
                c8bs.getClass();
                FGR.LIZIZ().LIZ(c8bs.mHandler, new ACallableS77S0101000_4((Throwable) obj, 1, 0), 0);
                return;
        }
    }

    public /* synthetic */ C1PN(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
