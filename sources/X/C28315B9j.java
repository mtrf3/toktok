package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.B9j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28315B9j extends AbstractC28313B9h {
    public final TextView LJLIL;
    public InterfaceC28316B9k LJLILLLLZI;

    public C28315B9j(View view) {
        super(view);
        this.LJLIL = (TextView) view.findViewById(R.id.mt7);
    }

    @Override // X.AbstractC28313B9h
    public final void L(C31061Ju c31061Ju) {
        if (!C38354F3m.LJ(c31061Ju.previewEmoji)) {
            this.LJLIL.setText(c31061Ju.previewEmoji);
        }
        C16880lQ.LJIIJ(new ACListenerS40S0200000_5(c31061Ju, this, 54), this.itemView);
    }

    @Override // X.AbstractC28313B9h
    public final void M(C28317B9l c28317B9l) {
        this.LJLILLLLZI = c28317B9l;
    }
}
