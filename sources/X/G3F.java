package X;

import Y.ACListenerS41S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G3F extends RecyclerView.ViewHolder {
    public final C72782ShO LJLIL;
    public final C72782ShO LJLILLLLZI;
    public final /* synthetic */ G3G LJLJI;

    public final void L(boolean z) {
        this.itemView.findViewById(R.id.eqm).setSelected(z);
        if (z) {
            this.itemView.findViewById(R.id.eqm).setBackground(this.LJLILLLLZI);
            ((TextView) this.itemView.findViewById(R.id.eqm).findViewById(R.id.text)).setTextColor(this.itemView.getResources().getColor(R.color.bc));
        } else {
            this.itemView.findViewById(R.id.eqm).setBackground(this.LJLIL);
            ((TextView) this.itemView.findViewById(R.id.eqm).findViewById(R.id.text)).setTextColor(this.itemView.getContext().getResources().getColor(R.color.ck));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3F(G3G g3g, View view) {
        super(view);
        this.LJLJI = g3g;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C72783ShP LIZ = C72784ShQ.LIZ(context);
        C72782ShO c72782ShO = new C72782ShO(view.getResources().getColor(R.color.ar), LIZ);
        this.LJLIL = c72782ShO;
        this.LJLILLLLZI = new C72782ShO(view.getResources().getColor(R.color.c7), LIZ);
        KL2.LIZJ(this.itemView.getContext(), 28.0f);
        c72782ShO.LIZIZ(this.itemView.getContext().getResources().getColor(R.color.bx));
        C16880lQ.LJIIJ(new ACListenerS41S0200000_6(this, g3g, 1), view);
        view.setLayerType(1, null);
    }
}
