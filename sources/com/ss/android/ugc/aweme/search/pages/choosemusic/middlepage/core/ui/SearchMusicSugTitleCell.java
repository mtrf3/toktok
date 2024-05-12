package com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui;

import X.C1DI;
import X.K2U;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SearchMusicSugTitleCell extends PowerCell<K2U> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(K2U t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgy, viewGroup, false, "from(parent.context)\n   …ing_title, parent, false)");
    }
}
