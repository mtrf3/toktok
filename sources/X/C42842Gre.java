package X;

import Y.ACListenerS30S0101000_13;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Gre, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42842Gre extends RecyclerView.ViewHolder {
    public C42844Grg LJLIL;
    public final TextView LJLILLLLZI;
    public final /* synthetic */ AbstractC42840Grc LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42842Gre(AbstractC42840Grc abstractC42840Grc, C42880GsG c42880GsG, TextView textView) {
        super(c42880GsG);
        this.LJLJI = abstractC42840Grc;
        this.LJLILLLLZI = textView;
        C16880lQ.LJIJI(textView, new ACListenerS30S0101000_13(5, this, 3));
    }
}
