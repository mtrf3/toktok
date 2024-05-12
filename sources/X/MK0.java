package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MK0 extends RecyclerView.ViewHolder {
    public static final IReportAwemeManager LJLJI = ReportAwemeManager.LIZJ();
    public C56618MJy LJLIL;
    public final Context LJLILLLLZI;

    public MK0(View view) {
        super(view);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        this.LJLILLLLZI = context;
        ((RecyclerView) this.itemView.findViewById(R.id.j_9)).setLayoutManager(new LinearLayoutManager(0, false));
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.cl);
        if (LIZIZ != null) {
            ((RecyclerView) this.itemView.findViewById(R.id.j_9)).LJII(new C4DM(LIZIZ.intValue(), (int) KL2.LIZJ(this.itemView.getContext(), 1.0f), 0, 0, 0), -1);
        }
    }
}
