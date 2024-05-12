package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62491Ofn extends RecyclerView.ViewHolder {
    public final ImageView LJLIL;
    public final TextView LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;
    public InterfaceC62486Ofi LJLJJL;

    public C62491Ofn(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.jsk);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.share_action_icon)");
        this.LJLIL = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.jsn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.share_action_label)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.jsl);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.….share_action_icon_badge)");
        this.LJLJI = findViewById3;
        View findViewById4 = view.findViewById(R.id.jsm);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.…re_action_icon_container)");
        this.LJLJJI = findViewById4;
    }
}
