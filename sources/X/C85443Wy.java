package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85443Wy extends RecyclerView.ViewHolder implements C3X3 {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C3SR LJLIL;
    public final ImageView LJLILLLLZI;
    public final AVS LJLJI;
    public C96533qb LJLJJI;

    @Override // X.C3X3
    public final void LLL(C96533qb c96533qb) {
        if (o.LJ(this.LJLJJI, c96533qb)) {
            return;
        }
        this.LJLJJI = c96533qb;
        if (c96533qb.LIZ != -1) {
            View view = this.itemView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = c96533qb.LIZ;
            view.setLayoutParams(layoutParams);
        }
    }

    public C85443Wy(View view, C3SR c3sr) {
        super(view);
        this.LJLIL = c3sr;
        View findViewById = view.findViewById(R.id.fc3);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_unread_dot)");
        this.LJLILLLLZI = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.mpq);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.tv_unread_count)");
        this.LJLJI = (AVS) findViewById2;
        C78897Uxp.LJJJJJL(view, 0.0f);
    }
}
