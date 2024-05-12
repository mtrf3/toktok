package X;

import Y.ACListenerS32S0101000_15;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XXt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C85005XXt extends RecyclerView.ViewHolder {
    public final C62846OlW LJLIL;
    public final TextView LJLILLLLZI;
    public MusicCollectionItem LJLJI;
    public final /* synthetic */ C85004XXs LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85005XXt(C85004XXs c85004XXs, View view) {
        super(view);
        this.LJLJJI = c85004XXs;
        this.LJLIL = (C62846OlW) view.findViewById(R.id.gtl);
        this.LJLILLLLZI = (TextView) view.findViewById(R.id.gtm);
        C16880lQ.LJIIJ(new ACListenerS32S0101000_15(1, this, 2), this.itemView);
    }
}
