package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Zgv, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90589Zgv extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final ImageView LJLILLLLZI;
    public final ProgressBar LJLJI;
    public final TextView LJLJJI;
    public final float LJLJJL;
    public ZY4 LJLJJLL;
    public final /* synthetic */ C90591Zgx LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90589Zgv(C90591Zgx c90591Zgx, View view) {
        super(view);
        this.LJLJL = c90591Zgx;
        this.LJLIL = view;
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.ae);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.ag);
        this.LJLJI = progressBar;
        this.LJLJJI = (TextView) view.findViewById(R.id.af);
        this.LJLJJL = ZXT.LIZLLL(c90591Zgx.LJLL.LJLLI);
        ZXT.LJIIJ(c90591Zgx.LJLL.LJLLI, progressBar);
    }
}
