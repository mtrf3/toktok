package X;

import Y.AObjectS142S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mhr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57523Mhr extends RecyclerView.ViewHolder {
    public final Context LJLIL;
    public final AP9 LJLILLLLZI;
    public final TextView LJLJI;
    public final TextView LJLJJI;
    public final TextView LJLJJL;
    public final ImageView LJLJJLL;
    public AObjectS142S0100000_9 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57523Mhr(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLIL = itemView.getContext();
        View findViewById = itemView.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar)");
        this.LJLILLLLZI = (AP9) findViewById;
        View findViewById2 = itemView.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.user_name)");
        this.LJLJI = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iqn);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.recommend_reason)");
        this.LJLJJI = (TextView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.djm);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.follow)");
        this.LJLJJL = (TextView) findViewById4;
        View findViewById5 = itemView.findViewById(R.id.bf7);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.close)");
        this.LJLJJLL = (ImageView) findViewById5;
    }
}
