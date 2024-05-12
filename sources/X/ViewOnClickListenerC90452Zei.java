package X;

import android.view.View;

/* renamed from: X.Zei, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class ViewOnClickListenerC90452Zei implements View.OnClickListener {
    public final /* synthetic */ long LJLIL = 30000;
    public final /* synthetic */ C90816Zka LJLILLLLZI;

    public ViewOnClickListenerC90452Zei(C90816Zka c90816Zka) {
        this.LJLILLLLZI = c90816Zka;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C90816Zka c90816Zka = this.LJLILLLLZI;
        long j = this.LJLIL;
        C90639Zhj LJIILL = c90816Zka.LJIILL();
        if (LJIILL != null && LJIILL.LJIIIZ()) {
            if (LJIILL.LJJIFFI()) {
                LJIILL.LJIJI(Math.min(LJIILL.LIZJ() + j, r1.LIZJ() + c90816Zka.LIZLLL.LJ()));
                return;
            }
            LJIILL.LJIJI(LJIILL.LIZJ() + j);
        }
    }
}
