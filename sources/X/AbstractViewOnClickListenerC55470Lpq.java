package X;

import Y.ARunnableS13S0101000_9;
import android.view.View;

/* renamed from: X.Lpq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractViewOnClickListenerC55470Lpq implements View.OnClickListener {
    public final long LJLIL;
    public boolean LJLILLLLZI;
    public final ARunnableS13S0101000_9 LJLJI;

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC55470Lpq() {
        this(300L);
    }

    public AbstractViewOnClickListenerC55470Lpq(long j) {
        this.LJLILLLLZI = true;
        this.LJLJI = new ARunnableS13S0101000_9(5, this, 6);
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
