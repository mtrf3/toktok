package X;

import android.view.SurfaceHolder;
import java.util.Iterator;

/* renamed from: X.InJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class SurfaceHolderCallbackC47669InJ implements SurfaceHolder.Callback {
    public final /* synthetic */ C47680InU LJLIL;

    public SurfaceHolderCallbackC47669InJ(C47680InU c47680InU) {
        this.LJLIL = c47680InU;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C47680InU c47680InU = this.LJLIL;
        c47680InU.LJLILLLLZI = true;
        c47680InU.LIZ(c47680InU.LJLIL);
        for (InterfaceC47667InH interfaceC47667InH : this.LJLIL.LJLJI) {
            C47680InU c47680InU2 = this.LJLIL;
            interfaceC47667InH.LJJL(c47680InU2.LJLJJI, c47680InU2.LJLJJL);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C47680InU c47680InU = this.LJLIL;
        c47680InU.LJLILLLLZI = false;
        Iterator<InterfaceC47667InH> it = c47680InU.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        this.LJLIL.getClass();
        this.LJLIL.getClass();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C47680InU c47680InU = this.LJLIL;
        c47680InU.LJLJJI = i2;
        c47680InU.LJLJJL = i3;
        Iterator<InterfaceC47667InH> it = c47680InU.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LJJJJ(i2, i3);
        }
        C47680InU c47680InU2 = this.LJLIL;
        c47680InU2.LIZ(c47680InU2.LJLIL);
    }
}
