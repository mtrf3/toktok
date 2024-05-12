package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BSG implements InterfaceC75158Tec {
    public final /* synthetic */ RedEnvelopeWidget LJLIL;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    public BSG(RedEnvelopeWidget redEnvelopeWidget) {
        this.LJLIL = redEnvelopeWidget;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        int i;
        this.LJLIL.LJLJL.lock();
        RedEnvelopeWidget redEnvelopeWidget = this.LJLIL;
        redEnvelopeWidget.LJLJI = false;
        redEnvelopeWidget.LJLJJI = exc;
        redEnvelopeWidget.LJLJJL = false;
        for (BSI bsi : redEnvelopeWidget.LJLJJLL) {
            if (this.LJLIL.LJLJI) {
                i = 0;
            } else {
                i = -1;
            }
            C28792BRs.LIZJ(i, bsi.LIZ, bsi.LIZIZ, Boolean.valueOf(bsi.LIZJ), this.LJLIL.LJLJJI, false);
        }
        this.LJLIL.LJLJJLL.clear();
        this.LJLIL.LJLJL.unlock();
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        int i3;
        this.LJLIL.LJLJL.lock();
        RedEnvelopeWidget redEnvelopeWidget = this.LJLIL;
        redEnvelopeWidget.LJLJI = true;
        redEnvelopeWidget.LJLJJL = false;
        for (BSI bsi : redEnvelopeWidget.LJLJJLL) {
            if (this.LJLIL.LJLJI) {
                i3 = 0;
            } else {
                i3 = -1;
            }
            C28792BRs.LIZJ(i3, bsi.LIZ, bsi.LIZIZ, Boolean.valueOf(bsi.LIZJ), null, false);
        }
        this.LJLIL.LJLJJLL.clear();
        this.LJLIL.LJLJL.unlock();
    }
}
