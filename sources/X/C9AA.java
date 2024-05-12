package X;

import Y.ACListenerS24S0100000_4;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.9AA, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9AA extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final ActivityC45651qj LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9AA(ActivityC45651qj activity, View view) {
        super(view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = view;
        this.LJLILLLLZI = activity;
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 329), view);
        C9AE.LIZ(view, C9AC.STRONG_MASK, 0.0f);
    }
}
