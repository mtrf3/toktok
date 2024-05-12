package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1EY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EY extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final TextView LJLILLLLZI;
    public final View LJLJI;

    public C1EY(ViewGroup viewGroup) {
        super(C06490Nh.LIZIZ(viewGroup, "parent", R.layout.d_1, viewGroup, false));
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = (TextView) this.itemView.findViewById(R.id.mko);
        this.LJLJI = this.itemView.findViewById(R.id.ajl);
    }
}
