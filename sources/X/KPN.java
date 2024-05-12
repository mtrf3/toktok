package X;

import android.view.View;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class KPN implements InterfaceC49869Jhh {
    public final C62822Ol8 LIZ;

    @Override // X.InterfaceC49869Jhh
    public final void LIZ() {
        View view = (View) this.LIZ.getValue();
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // X.InterfaceC49869Jhh
    public final void LIZIZ() {
        View view = (View) this.LIZ.getValue();
        if (view == null) {
            return;
        }
        view.setVisibility(4);
    }

    public KPN(KPJ kpj) {
        this.LIZ = C221108m2.LIZIZ(new AqS158S0100000_8(kpj, 483));
    }
}
