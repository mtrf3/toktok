package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.K2F;
import Y.ACListenerS34S0300000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicHistoryCell extends PowerCell<K2F> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2F k2f) {
        K2F t = k2f;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        MusicSearchHistory musicSearchHistory = t.LJLIL;
        ((TextView) this.itemView.findViewById(R.id.m8j)).setText(musicSearchHistory.keyword);
        C16880lQ.LJJJ((TuxIconView) this.itemView.findViewById(R.id.f0d), new ACListenerS34S0300000_8(t, this, musicSearchHistory, 6));
        C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.m8j), new ACListenerS34S0300000_8(t, this, musicSearchHistory, 7));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.ch2, viewGroup, false, "from(parent.context).inf…c_history, parent, false)");
    }
}
