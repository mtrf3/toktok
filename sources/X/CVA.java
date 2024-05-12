package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVA extends AbstractC31414CUo<CVC, CV9> {
    public final DataChannel LIZIZ;

    public CVA(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(CV9 cv9, CVC cvc) {
        String LJIILL;
        CV9 holder = cv9;
        CVC model = cvc;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(model, "model");
        holder.L(model, this.LIZIZ);
        holder.LJLJL.setVisibility(8);
        User user = model.LJLLLLLL;
        if (user != null) {
            holder.LJLJJLL.setVisibility(0);
            TextView textView = holder.LJLJJLL;
            if (user.getId() == C025908h.LIZ()) {
                LJIILL = C15380j0.LJIILJJIL(R.string.o4m);
            } else {
                LJIILL = C15380j0.LJIILL(R.string.o4l, C05170If.LIZ(user));
            }
            textView.setText(LJIILL);
        }
    }

    @Override // X.AbstractC31414CUo
    public final CV9 LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(layoutInflater, R.layout.d34, parent, false);
        o.LJIIIIZZ(view, "view");
        return new CV9(view);
    }
}
