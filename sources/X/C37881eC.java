package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1eC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37881eC extends RecyclerView.ViewHolder {
    public final ViewGroup LJLIL;
    public final View LJLILLLLZI;
    public final C74282TDi LJLJI;
    public final TextView LJLJJI;
    public final View LJLJJL;

    public C37881eC(ViewGroup viewGroup, int i) {
        super(C06490Nh.LIZIZ(viewGroup, "parent", i, viewGroup, false));
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = this.itemView.findViewById(R.id.f24);
        C74282TDi c74282TDi = (C74282TDi) this.itemView.findViewById(R.id.g7r);
        this.LJLJI = c74282TDi;
        this.LJLJJI = (TextView) this.itemView.findViewById(R.id.mko);
        this.LJLJJL = this.itemView.findViewById(R.id.ajl);
        if (c74282TDi != null) {
            c74282TDi.setBgCircleColor(-1);
            c74282TDi.setProgressColor(-1);
            c74282TDi.setMaxProgress(100);
            c74282TDi.setCircleWidth(C15380j0.LIZ(2.0f));
            c74282TDi.setBgCircleWidth(C15380j0.LIZ(3.0f));
        }
    }
}
