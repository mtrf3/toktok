package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.3Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85633Xr extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final TextView LJLILLLLZI;

    public C85633Xr(View view, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(view);
        this.LJLIL = view;
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.l0f);
        C16880lQ.LJIILLIIL((ImageView) view.findViewById(R.id.c65), new ACListenerS36S0200000_1(this, interfaceC88472Yns, 17));
    }
}
