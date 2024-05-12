package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C94508ai8;
import X.W5F;
import X.W5U;
import Y.IDCListenerS86S0200000_42;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicDspPlaylistCell extends PowerCell<C94508ai8> {
    public static final String LJLJJL = C16880lQ.LJLLJ(MusicDspPlaylistCell.class);
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 71));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 73));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 70));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 72));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dwh;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C94508ai8 c94508ai8) {
        boolean z;
        C94508ai8 t = c94508ai8;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        String imageUrl = t.LJLIL.getImageUrl();
        if (imageUrl == null || imageUrl.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object value = this.LJLJJI.getValue();
            o.LJIIIIZZ(value, "<get-playlistIcon>(...)");
            ((ImageView) value).setVisibility(0);
            Object value2 = this.LJLIL.getValue();
            o.LJIIIIZZ(value2, "<get-playlistCover>(...)");
            ((ImageView) value2).setVisibility(8);
        } else {
            Object value3 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value3, "<get-playlistIcon>(...)");
            ((ImageView) value3).setVisibility(8);
            Object value4 = this.LJLIL.getValue();
            o.LJIIIIZZ(value4, "<get-playlistCover>(...)");
            ((ImageView) value4).setVisibility(0);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLIL.getImageUrl());
            LJIIIIZZ.LIZIZ(LJLJJL);
            Object value5 = this.LJLIL.getValue();
            o.LJIIIIZZ(value5, "<get-playlistCover>(...)");
            LJIIIIZZ.LJJIIJ = (SmartImageView) value5;
            C16880lQ.LLJJJ(LJIIIIZZ);
        }
        if (t.LJLIL.getName() != null) {
            Object value6 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value6, "<get-playlistTitle>(...)");
            ((TextView) value6).setText(t.LJLIL.getName());
        }
        C16880lQ.LJIIJ(new IDCListenerS86S0200000_42(this, t, 4), this.itemView);
    }
}
