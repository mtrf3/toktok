package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C0O extends RecyclerView.ViewHolder {
    public final TextView LJLIL;
    public final ImageView LJLILLLLZI;
    public final C30870C9q LJLJI;
    public final View LJLJJI;

    public C0O(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.l5q);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.text_tv)");
        this.LJLIL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.ebu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.icon_iv)");
        this.LJLILLLLZI = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.gz0);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.network_status)");
        this.LJLJI = (C30870C9q) findViewById3;
        View findViewById4 = view.findViewById(R.id.it6);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.reddot)");
        this.LJLJJI = findViewById4;
    }
}
