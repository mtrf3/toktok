package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Zgp, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90583Zgp extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final ImageView LJLILLLLZI;
    public final ProgressBar LJLJI;
    public final TextView LJLJJI;
    public final /* synthetic */ C90584Zgq LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90583Zgp(C90584Zgq c90584Zgq, View view) {
        super(view);
        this.LJLJJL = c90584Zgq;
        this.LJLIL = view;
        this.LJLILLLLZI = (ImageView) view.findViewById(R.id.bh);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.bj);
        this.LJLJI = progressBar;
        this.LJLJJI = (TextView) view.findViewById(R.id.bi);
        ZXT.LJIIJ(c90584Zgq.LJLJL.LJLJJL, progressBar);
    }
}
