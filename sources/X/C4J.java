package X;

import Y.ACListenerS40S0200000_5;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C4J extends CSX<C4G> {
    public final TextView LJLJLLL;
    public final TextView LJLL;
    public final C47061t0 LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4J(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJLLL = (TextView) itemView.findViewById(R.id.o5);
        this.LJLL = (TextView) itemView.findViewById(R.id.auk);
        this.LJLLI = (C47061t0) itemView.findViewById(R.id.e_q);
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        C4G model = (C4G) crd;
        o.LJIIIZ(model, "model");
        TextView textView = this.LJLJLLL;
        if (textView != null) {
            textView.setText(model.getContent());
        }
        C47061t0 c47061t0 = this.LJLLI;
        if (c47061t0 != null) {
            c47061t0.setActualImageResource(model.LJJJ());
        }
        TextView textView2 = this.LJLL;
        if (textView2 != null) {
            textView2.setText(((C4H) model.LJIJJLI).LJLJJI);
            C16880lQ.LJIJI(textView2, new ACListenerS40S0200000_5(model, cqq, 71));
        }
    }
}
