package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uj7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77985Uj7 extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final ImageView LJLILLLLZI;

    public C77985Uj7(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.f4m);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_history_top3)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f4n);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_history_top3_border)");
        this.LJLILLLLZI = (ImageView) findViewById2;
    }
}
