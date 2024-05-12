package X;

import Y.ACListenerS25S0100000_5;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.COr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31261COr extends CSX<C31259COp> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31261COr(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
    }

    @Override // X.CSF
    public final void L(CQQ cqq, CRD crd) {
        C31259COp model = (C31259COp) crd;
        o.LJIIIZ(model, "model");
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.egd);
        if (imageView != null) {
            imageView.setImageDrawable(((C31262COs) model.LJIJJLI).LJLIL);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.bst);
        if (textView != null) {
            textView.setText(((C31262COs) model.LJIJJLI).LJLILLLLZI);
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.b1h);
        if (textView2 != null) {
            textView2.setText(((C31262COs) model.LJIJJLI).LJLJI);
        }
        C47121t6 c47121t6 = (C47121t6) this.itemView.findViewById(R.id.b1h);
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5(model, 355));
        }
    }
}
