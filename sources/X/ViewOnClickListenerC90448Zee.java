package X;

import android.view.View;
import java.io.IOException;

/* renamed from: X.Zee, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class ViewOnClickListenerC90448Zee implements View.OnClickListener {
    public final /* synthetic */ C90816Zka LJLIL;

    public ViewOnClickListenerC90448Zee(C90816Zka c90816Zka) {
        this.LJLIL = c90816Zka;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C90613ZhJ LIZJ = ZYJ.LIZIZ(C16880lQ.LLLLJ(this.LJLIL.LIZ)).LIZ().LIZJ();
        if (LIZJ == null || !LIZJ.LIZJ()) {
            return;
        }
        try {
            QH7.LJ("Must be called from the main thread.");
            C90880Zlc c90880Zlc = LIZJ.LJII;
            if (c90880Zlc != null) {
                c90880Zlc.LJII();
                if (c90880Zlc.LJIL) {
                    z = true;
                    LIZJ.LJIIJ(!z);
                }
            }
            z = false;
            LIZJ.LJIIJ(!z);
        } catch (IOException | IllegalArgumentException unused) {
            C90816Zka.LJFF.getClass();
        }
    }
}
