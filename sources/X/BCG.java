package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class BCG implements View.OnClickListener {
    public final View.OnClickListener LJLIL;
    public long LJLILLLLZI;

    public BCG(View.OnClickListener onClickListener) {
        this.LJLIL = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (Math.abs(this.LJLILLLLZI - System.currentTimeMillis()) < 1000) {
            return;
        }
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLIL.onClick(view);
    }
}
