package X;

import Y.ARunnableS48S0100000_12;
import android.view.View;

/* loaded from: classes13.dex */
public abstract class TAT implements View.OnClickListener {
    public final long LJLIL;
    public boolean LJLILLLLZI;
    public final ARunnableS48S0100000_12 LJLJI;

    public abstract void LIZ(View view);

    public TAT() {
        this(300L);
    }

    public TAT(long j) {
        this.LJLILLLLZI = true;
        this.LJLJI = new ARunnableS48S0100000_12(this, 53);
        this.LJLIL = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            view.postDelayed(this.LJLJI, this.LJLIL);
            LIZ(view);
        }
    }
}
