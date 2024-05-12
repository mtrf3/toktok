package X;

import android.view.View;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* renamed from: X.Vdp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80205Vdp implements InterfaceC16710l9 {
    public final /* synthetic */ BaseTransientBottomBar LIZ;

    public C80205Vdp(BaseTransientBottomBar baseTransientBottomBar) {
        this.LIZ = baseTransientBottomBar;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        this.LIZ.LJII = c16800lI.LIZIZ();
        this.LIZ.LJIIIIZZ = c16800lI.LIZJ();
        this.LIZ.LJIIIZ = c16800lI.LIZLLL();
        this.LIZ.LJFF();
        return c16800lI;
    }
}
