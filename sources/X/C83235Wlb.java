package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wlb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83235Wlb extends C83223WlP {
    public static final /* synthetic */ int LJLLJ = 0;
    public final C83224WlQ LJLLI;
    public AqS180S0100000_14 LJLLILLLL;

    @Override // X.C83223WlP
    public final void N(boolean z) {
        float f;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        itemView.setAlpha(f);
    }

    public C83235Wlb(View view, C83221WlN c83221WlN) {
        super(view, c83221WlN);
        this.LJLLI = (C83224WlQ) view.findViewById(R.id.evm);
        o.LJIIIIZZ(view.getContext(), "itemView.context");
    }
}
