package X;

import Y.ACListenerS41S0200000_6;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G39 extends RecyclerView.ViewHolder {
    public G39(C40889G2z c40889G2z, View view) {
        super(view);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C72782ShO c72782ShO = new C72782ShO(view.getResources().getColor(R.color.ar), C72784ShQ.LIZ(context));
        c72782ShO.LIZIZ(this.itemView.getContext().getResources().getColor(R.color.bx));
        view.setBackground(c72782ShO);
        C16880lQ.LJIIJ(new ACListenerS41S0200000_6(this, c40889G2z, 4), view);
        view.setLayerType(1, null);
    }
}
