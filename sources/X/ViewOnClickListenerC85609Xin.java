package X;

import Y.ARunnableS34S0200000_15;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xin, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC85609Xin implements View.OnClickListener {
    public boolean LJLIL;
    public final View.OnClickListener LJLILLLLZI;
    public final boolean LJLJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLJI) {
            if (!this.LJLIL) {
                this.LJLIL = true;
                C1DH.LJJIJIIJIL(C86V.LJ().getInteger(R.integer.av), new ARunnableS34S0200000_15(view, this, 8));
                return;
            }
            return;
        }
        this.LJLILLLLZI.onClick(view);
    }

    public ViewOnClickListenerC85609Xin(View.OnClickListener onClickListener, boolean z) {
        this.LJLILLLLZI = onClickListener;
        this.LJLJI = z;
    }
}
