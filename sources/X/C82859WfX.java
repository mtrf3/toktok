package X;

import Y.IDRunnableS6S0101000;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WfX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C82859WfX extends C0A6 {
    public boolean LJLIL;
    public final /* synthetic */ ViewOnTouchListenerC82857WfV LJLILLLLZI;

    public C82859WfX(ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV) {
        this.LJLILLLLZI = viewOnTouchListenerC82857WfV;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        if (i == 0) {
            if (this.LJLIL) {
                this.LJLILLLLZI.LJLJLJ.LJLLILLLL.setValue(null);
                this.LJLIL = false;
            }
            recyclerView.postDelayed(new IDRunnableS6S0101000(5, this, 39), 100L);
            return;
        }
        this.LJLILLLLZI.LLFF = true;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        if (i == 0) {
            return;
        }
        this.LJLIL = true;
        ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV = this.LJLILLLLZI;
        int i3 = viewOnTouchListenerC82857WfV.LLILL;
        if (C79255V8p.LIZ(recyclerView.getContext())) {
            i = -i;
        }
        viewOnTouchListenerC82857WfV.LLILL = i3 + i;
        this.LJLILLLLZI.LJII();
        this.LJLILLLLZI.LJIJJLI();
        this.LJLILLLLZI.LJIJ();
        this.LJLILLLLZI.LJLJLJ.LJLLI.setValue(null);
    }
}
