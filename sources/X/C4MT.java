package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4MT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MT extends RecyclerView.ViewHolder {
    public final C62846OlW LJLIL;
    public AqS183S0100000_1 LJLILLLLZI;

    public C4MT(ViewGroup viewGroup) {
        super(C06490Nh.LIZIZ(viewGroup, "parent", R.layout.b35, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.cud);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.emoji_iv)");
        C62846OlW c62846OlW = (C62846OlW) findViewById;
        this.LJLIL = c62846OlW;
        C16880lQ.LJJJJJL(c62846OlW, new ACListenerS21S0100000_1(this, 146));
        c62846OlW.getHierarchy().LJIJ(R.drawable.bjg);
    }
}
