package X;

import android.view.View;

/* renamed from: X.GbJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC41829GbJ implements View.OnClickListener {
    public final /* synthetic */ C41831GbL LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public ViewOnClickListenerC41829GbJ(C41831GbL c41831GbL, String str) {
        this.LJLIL = c41831GbL;
        this.LJLILLLLZI = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C41825GbF.LIZLLL(this.LJLIL.LJLIL, this.LJLILLLLZI, false);
        AKT akt = C41825GbF.LIZIZ;
        if (akt != null) {
            akt.LIZ();
        }
    }
}
