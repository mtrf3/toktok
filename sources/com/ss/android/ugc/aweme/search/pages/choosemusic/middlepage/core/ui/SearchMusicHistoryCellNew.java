package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2G;
import Y.ACListenerS34S0300000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicHistoryCellNew extends PowerCell<K2G> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2G k2g) {
        K2G t = k2g;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        MusicSearchHistory musicSearchHistory = t.LJLIL;
        ((TextView) this.itemView.findViewById(R.id.e65)).setText(musicSearchHistory.keyword);
        C16880lQ.LJJJ((TuxIconView) this.itemView.findViewById(R.id.e61), new ACListenerS34S0300000_8(t, this, musicSearchHistory, 8));
        C16880lQ.LJIIZILJ((LinearLayout) this.itemView.findViewById(R.id.e62), new ACListenerS34S0300000_8(t, this, musicSearchHistory, 9));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ch3, viewGroup, false, "from(parent.context)\n   …story_new, parent, false)");
    }
}
