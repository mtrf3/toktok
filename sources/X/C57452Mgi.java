package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Mgi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C57452Mgi extends RecyclerView.ViewHolder {
    public final AP9 LJLIL;
    public final TextView LJLILLLLZI;
    public final TextView LJLJI;
    public final RelationButton LJLJJI;
    public final View LJLJJL;
    public final View LJLJJLL;
    public final /* synthetic */ C57451Mgh LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57452Mgi(C57451Mgh c57451Mgh, View view) {
        super(view);
        this.LJLJL = c57451Mgh;
        this.LJLIL = (AP9) view.findViewById(R.id.eye);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.msf);
        this.LJLJI = (TextView) view.findViewById(R.id.mrr);
        this.LJLJJI = (RelationButton) view.findViewById(R.id.ms0);
        this.LJLJJL = view.findViewById(R.id.f2_);
        this.LJLJJLL = view.findViewById(R.id.gm2);
    }
}
