package X;

import android.view.View;

/* renamed from: X.SgU, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC72726SgU implements View.OnClickListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ DialogC72721SgP LJLILLLLZI;

    public ViewOnClickListenerC72726SgU(boolean z, DialogC72721SgP dialogC72721SgP) {
        this.LJLIL = z;
        this.LJLILLLLZI = dialogC72721SgP;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLIL) {
            return;
        }
        if (this.LJLILLLLZI.LJJIIJZLJL()) {
            this.LJLILLLLZI.LJLLLL.LIZIZ();
        } else {
            this.LJLILLLLZI.LJLLLL.LIZ();
        }
    }
}
