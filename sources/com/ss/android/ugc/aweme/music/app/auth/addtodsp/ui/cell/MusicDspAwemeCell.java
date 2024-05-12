package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell;

import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C62822Ol8;
import X.C78897Uxp;
import X.C93576aT6;
import X.C94506ai6;
import Y.IDCListenerS139S0100000_42;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicDspAwemeCell extends PowerCell<C94506ai6> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 67));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 68));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 69));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dwe;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C94506ai6 c94506ai6) {
        C94506ai6 t = c94506ai6;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        int i = C93576aT6.LIZ[DspPlatform.Companion.from(Integer.valueOf(t.LJLILLLLZI.getDspPlatform())).ordinal()];
        int i2 = 8;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.itemView.setVisibility(8);
                } else {
                    Object value = this.LJLIL.getValue();
                    o.LJIIIIZZ(value, "<get-dspIcon>(...)");
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_spotify;
                    ((TuxIconView) value).setTuxIcon(c2068389v);
                    Object value2 = this.LJLILLLLZI.getValue();
                    o.LJIIIIZZ(value2, "<get-dspTitle>(...)");
                    ((TextView) value2).setText(DspPlatform.SPOTIFY.getTitle());
                }
            } else {
                Object value3 = this.LJLIL.getValue();
                o.LJIIIIZZ(value3, "<get-dspIcon>(...)");
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_color_amazon_music;
                ((TuxIconView) value3).setTuxIcon(c2068389v2);
                Object value4 = this.LJLILLLLZI.getValue();
                o.LJIIIIZZ(value4, "<get-dspTitle>(...)");
                ((TextView) value4).setText(DspPlatform.AMAZON_MUSIC.getTitle());
            }
        } else {
            Object value5 = this.LJLIL.getValue();
            o.LJIIIIZZ(value5, "<get-dspIcon>(...)");
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_color_apple_music;
            ((TuxIconView) value5).setTuxIcon(c2068389v3);
            Object value6 = this.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value6, "<get-dspTitle>(...)");
            ((TextView) value6).setText(DspPlatform.APPLE_MUSIC.getTitle());
        }
        Object value7 = this.LJLJI.getValue();
        o.LJIIIIZZ(value7, "<get-noCopyrightHint>(...)");
        View view = (View) value7;
        String str = t.LJLIL;
        if (str == null || str.length() == 0) {
            i2 = 0;
        }
        view.setVisibility(i2);
        C16880lQ.LJIIJ(new IDCListenerS139S0100000_42(t, 26), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View onCreateItemView = super.onCreateItemView(parent);
        C78897Uxp.LJJJJJL(onCreateItemView, 0.0f);
        return onCreateItemView;
    }
}
