package com.ss.android.ugc.aweme.music.artist.powerlist;

import X.C16880lQ;
import X.C239969bM;
import Y.ACListenerS24S0100000_4;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicStartRecordCell extends PowerCell<C239969bM> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.buk;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C239969bM c239969bM) {
        C239969bM t = c239969bM;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        C16880lQ.LJIIJ(new ACListenerS24S0100000_4(t, 205), this.itemView);
    }
}
