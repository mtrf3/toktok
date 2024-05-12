package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C0P extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final ImageView LJLILLLLZI;
    public final View LJLJI;

    public C0P(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.l5q);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.text_tv)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ebu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_iv)");
        this.LJLILLLLZI = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.it6);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.reddot)");
        this.LJLJI = findViewById3;
    }
}
