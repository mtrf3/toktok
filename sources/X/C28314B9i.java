package X;

import Y.ACListenerS24S0201000_7;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.B9i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28314B9i extends AbstractC28313B9h {
    public final C47061t0 LJLIL;
    public InterfaceC28316B9k LJLILLLLZI;

    public C28314B9i(View view) {
        super(view);
        this.LJLIL = (C47061t0) view.findViewById(R.id.cub);
    }

    @Override // X.AbstractC28313B9h
    public final void L(C31061Ju c31061Ju) {
        int i = c31061Ju.iconId;
        if (i != 0) {
            this.LJLIL.setImageResource(i);
        }
        C16880lQ.LJIIJ(new ACListenerS24S0201000_7(2, this, c31061Ju, 8), this.itemView);
    }

    @Override // X.AbstractC28313B9h
    public final void M(C28317B9l c28317B9l) {
        this.LJLILLLLZI = c28317B9l;
    }
}
