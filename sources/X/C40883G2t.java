package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.G2t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40883G2t implements InterfaceC40548Fvk {
    public final Object LIZ;

    public final void LIZIZ() {
        for (C56455MDr c56455MDr : (C56455MDr[]) this.LIZ) {
            View view = c56455MDr.LIZ;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    public final void LJ() {
        View view;
        for (C56455MDr c56455MDr : (C56455MDr[]) this.LIZ) {
            if (c56455MDr.LIZLLL.invoke().booleanValue() && (view = c56455MDr.LIZ) != null) {
                view.setVisibility(0);
            }
        }
    }

    public /* synthetic */ C40883G2t() {
        this.LIZ = new Bundle();
    }

    public /* synthetic */ C40883G2t(InterfaceC73122Sms view) {
        o.LJIIIZ(view, "view");
        this.LIZ = new C73121Smr(view);
    }

    @Override // X.InterfaceC40548Fvk
    public final C40549Fvl LIZ(AbstractC40550Fvm abstractC40550Fvm) {
        C38398F5e c38398F5e = (C38398F5e) this.LIZ;
        int i = 1;
        if (abstractC40550Fvm != null) {
            int LJIIJJI = abstractC40550Fvm.LJIIJJI();
            if (LJIIJJI == 0 || LJIIJJI == 5 || LJIIJJI == 6 || LJIIJJI == 7) {
                i = 1 + abstractC40550Fvm.LJIIJ();
            } else {
                throw new C35481DwD(-1);
            }
        }
        return AbstractC40550Fvm.LJ(i, 1, 0, 0L, 0L, c38398F5e.LIZ, new ArrayList());
    }

    public /* synthetic */ C40883G2t(C56455MDr[] c56455MDrArr) {
        this.LIZ = c56455MDrArr;
    }

    public final void LIZJ(String str, boolean z) {
        ((Bundle) this.LIZ).putBoolean(str, z);
    }

    public final void LIZLLL(String str, String str2) {
        ((BaseBundle) this.LIZ).putString(str, str2);
    }
}
