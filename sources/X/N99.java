package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class N99 extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final TextView LJLIL;
    public final C62846OlW LJLILLLLZI;
    public MusicCollectionItem LJLJI;
    public final N9A LJLJJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicCollectionItem musicCollectionItem;
        N9A n9a;
        if (!C6ZT.LIZ(view) && (musicCollectionItem = this.LJLJI) != null && this.itemView != null && (n9a = this.LJLJJI) != null) {
            n9a.LIZIZ(musicCollectionItem);
        }
    }

    public N99(View view, int i, XWV xwv) {
        super(view);
        this.LJLIL = (TextView) view.findViewById(R.id.m2d);
        this.LJLILLLLZI = (C62846OlW) view.findViewById(R.id.f0c);
        C16880lQ.LJIIJ(this, this.itemView);
        this.LJLJJI = xwv;
    }
}
