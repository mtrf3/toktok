package X;

import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import android.view.View;

/* renamed from: X.B8m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractViewOnClickListenerC28292B8m implements View.OnClickListener {
    public static final Handler LJLJJI = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLIL = true;
    public final ARunnableS41S0100000_5 LJLJI = new ARunnableS41S0100000_5(this, 196);
    public final long LJLILLLLZI = 1200;

    public abstract void LIZ();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLIL) {
            this.LJLIL = false;
            LJLJJI.postDelayed(this.LJLJI, this.LJLILLLLZI);
            LIZ();
        }
    }
}
