package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell;

import X.C16880lQ;
import X.C94507ai7;
import Y.IDCListenerS139S0100000_42;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicDspCreateNewPlaylistCell extends PowerCell<C94507ai7> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dwg;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C94507ai7 c94507ai7) {
        C94507ai7 t = c94507ai7;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJIIJ(new IDCListenerS139S0100000_42(t, 27), this.itemView);
    }
}
