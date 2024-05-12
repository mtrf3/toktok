package X;

import Y.ACListenerS32S0300000_6;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3A extends RecyclerView.ViewHolder {
    public final /* synthetic */ G31 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3A(G31 g31, View view) {
        super(view);
        this.LJLIL = g31;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C72782ShO c72782ShO = new C72782ShO(this.itemView.getContext().getResources().getColor(R.color.ar), C72784ShQ.LIZ(context));
        c72782ShO.LIZIZ(this.itemView.getContext().getResources().getColor(R.color.bx));
        view.setBackground(c72782ShO);
        C16880lQ.LJIIJ(new ACListenerS32S0300000_6(view, this, g31, 0), view);
        view.setLayerType(1, null);
    }
}
