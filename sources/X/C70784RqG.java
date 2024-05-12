package X;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.RqG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70784RqG extends C0A6 {
    public int LJLIL;
    public final /* synthetic */ C80217Ve1 LJLILLLLZI;
    public final /* synthetic */ CardView LJLJI;

    public C70784RqG(C80217Ve1 c80217Ve1, CardView cardView) {
        this.LJLILLLLZI = c80217Ve1;
        this.LJLJI = cardView;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        int i3 = this.LJLIL + i2;
        this.LJLIL = i3;
        if (i3 < (C27162AlK.LIZIZ - this.LJLILLLLZI.getHeight()) - C27162AlK.LJIIL) {
            CardView cardView = this.LJLJI;
            if (cardView == null) {
                return;
            }
            cardView.setVisibility(8);
            return;
        }
        CardView cardView2 = this.LJLJI;
        if (cardView2 == null) {
            return;
        }
        cardView2.setVisibility(0);
    }
}
