package X;

import Y.ACListenerS22S0100000_2;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5YS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5YS extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final /* synthetic */ C5YR LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5YS(C5YR c5yr, TextView textView) {
        super(textView);
        this.LJLILLLLZI = c5yr;
        this.LJLIL = textView;
        C16880lQ.LJIJI(textView, new ACListenerS22S0100000_2(this, 157));
    }
}
