package X;

import Y.ACListenerS41S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G38 extends RecyclerView.ViewHolder {
    public final C72782ShO LJLIL;
    public final C72782ShO LJLILLLLZI;
    public final int LJLJI;
    public final /* synthetic */ G30 LJLJJI;

    public final void L(boolean z) {
        this.itemView.findViewById(R.id.eqo).setSelected(z);
        if (C63081OpJ.LLIIJLIL()) {
            ((ImageView) this.itemView.findViewById(R.id.eqo).findViewById(R.id.eiq)).setVisibility(0);
        } else {
            ((ImageView) this.itemView.findViewById(R.id.eqo).findViewById(R.id.eiq)).setVisibility(8);
            View findViewById = this.itemView.findViewById(R.id.eqo).findViewById(R.id.text);
            o.LJIIIIZZ(findViewById, "itemView.interest_root.text");
            C26338AVi.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20))), null, AnonymousClass391.LIZJ(20), null, false, 26);
        }
        if (z) {
            this.itemView.findViewById(R.id.eqo).setBackground(this.LJLILLLLZI);
            ((TextView) this.itemView.findViewById(R.id.eqo).findViewById(R.id.text)).setTextColor(this.itemView.getResources().getColor(R.color.bc));
            if (C63081OpJ.LLIIJLIL()) {
                ((W5G) this.itemView.findViewById(R.id.eqo).findViewById(R.id.eiq)).setActualImageResource(R.drawable.ay6);
                return;
            }
            return;
        }
        this.itemView.findViewById(R.id.eqo).setBackground(this.LJLIL);
        ((TextView) this.itemView.findViewById(R.id.eqo).findViewById(R.id.text)).setTextColor(this.itemView.getContext().getResources().getColor(R.color.ck));
        if (C63081OpJ.LLIIJLIL()) {
            String str = ((NewUserInterestStruct) ListProtector.get(this.LJLJJI.LJLILLLLZI, getAdapterPosition() - 1)).cover_url;
            if (str == null) {
                str = "";
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
            int i = this.LJLJI;
            LJIIIIZZ.LJII = i;
            LJIIIIZZ.LJIIIIZZ = i;
            LJIIIIZZ.LIZIZ(this.itemView.getContext().getClass().getName());
            LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.eqo).findViewById(R.id.eiq);
            LJIIIIZZ.LIZLLL(new G3B(this.LJLJJI.LJLJJL));
            return;
        }
        ((ImageView) this.itemView.findViewById(R.id.eqo).findViewById(R.id.eiq)).setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G38(G30 g30, View view) {
        super(view);
        this.LJLJJI = g30;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C72783ShP LIZ = C72784ShQ.LIZ(context);
        C72782ShO c72782ShO = new C72782ShO(view.getResources().getColor(R.color.ar), LIZ);
        this.LJLIL = c72782ShO;
        this.LJLILLLLZI = new C72782ShO(view.getResources().getColor(R.color.c7), LIZ);
        this.LJLJI = (int) KL2.LIZJ(this.itemView.getContext(), 28.0f);
        c72782ShO.LIZIZ(this.itemView.getContext().getResources().getColor(R.color.bx));
        C16880lQ.LJIIJ(new ACListenerS41S0200000_6(this, g30, 0), view);
        view.setLayerType(1, null);
    }
}
