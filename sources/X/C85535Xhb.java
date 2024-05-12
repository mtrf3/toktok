package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Xhb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85535Xhb extends RecyclerView.ViewHolder {
    public final View LJLIL;

    public C85535Xhb(C85531XhX c85531XhX, View view) {
        super(view);
        this.LJLIL = view;
        int LIZIZ = C7MY.LIZIZ(12);
        int LIZIZ2 = C7MY.LIZIZ(24);
        view.findViewById(R.id.v8).setVisibility(0);
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(c85531XhX, 243), view.findViewById(R.id.v8));
        if (C53262KvK.LIZIZ()) {
            ((LinearLayout) view.findViewById(R.id.v8)).setGravity(17);
            view.findViewById(R.id.b4b).setVisibility(8);
            view.findViewById(R.id.cd9).setVisibility(0);
            view.findViewById(R.id.v9).setVisibility(8);
            ((TextView) view.findViewById(R.id.v_)).setText(view.getContext().getString(R.string.jaa));
            View findViewById = view.findViewById(R.id.cd9);
            o.LJIIIIZZ(findViewById, "view.findViewById<RelativeLayout>(R.id.divider)");
            C26338AVi.LJI(findViewById, 0, Integer.valueOf(LIZIZ), 0, Integer.valueOf(LIZIZ2), false, 16);
            return;
        }
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 244), view.findViewById(R.id.b4b));
    }
}
