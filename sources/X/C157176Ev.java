package X;

import Y.ACListenerS21S0101000_2;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.kids.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6Ev, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C157176Ev extends RecyclerView.ViewHolder {
    public final C62846OlW LJLIL;
    public final TextView LJLILLLLZI;
    public MusicCollectionItem LJLJI;
    public final /* synthetic */ C157186Ew LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157176Ev(C157186Ew c157186Ew, View view) {
        super(view);
        this.LJLJJI = c157186Ew;
        this.LJLIL = (C62846OlW) view.findViewById(R.id.gtl);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.gtm);
        C16880lQ.LJIIJ(new ACListenerS21S0101000_2(1, this, 4), this.itemView);
    }
}
