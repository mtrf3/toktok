package com.ss.android.ugc.aweme.music.artist.powerlist;

import X.C16880lQ;
import X.C221108m2;
import X.C243889hg;
import X.C243899hh;
import X.C62822Ol8;
import X.C71897SJp;
import X.C78939UyV;
import X.W5F;
import X.W5U;
import Y.ACListenerS39S0200000_4;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ArtistMusicAwemeCell extends PowerCell<C243889hg> {
    public static final String LJLJJL = C16880lQ.LJLLJ(ArtistMusicAwemeCell.class);
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 387));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 388));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 389));
    public C243889hg LJLJJI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.bul;
    }

    public final C71897SJp L() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-checkBox>(...)");
        return (C71897SJp) value;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C243889hg c243889hg, List payloads) {
        C243889hg t = c243889hg;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        if (!o.LJ(t, this.LJLJJI)) {
            this.LJLJJI = t;
            W5F LJII = W5U.LJII(C78939UyV.LJ(t.LJLJJI));
            LJII.LIZIZ(LJLJJL);
            Object value = this.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-awemeCover>(...)");
            LJII.LJJIIJ = (SmartImageView) value;
            C16880lQ.LLJJJ(LJII);
            L().setVisibility(0);
            L().setChecked(t.LJLJJL);
            C16880lQ.LJJJI(L(), new ACListenerS39S0200000_4(t, this, 38));
            this.itemView.setAlpha(1.0f);
            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(t, this, 39), this.itemView);
            if (t.LJLILLLLZI != null) {
                Object value2 = this.LJLJI.getValue();
                o.LJIIIIZZ(value2, "<get-ivStarter>(...)");
                ((View) value2).setVisibility(0);
                L().setVisibility(8);
                this.itemView.setAlpha(0.16f);
                if (!TextUtils.isEmpty(t.LJLJI)) {
                    Object value3 = this.LJLJI.getValue();
                    o.LJIIIIZZ(value3, "<get-ivStarter>(...)");
                    ((TextView) value3).setText(t.LJLJI);
                    return;
                }
                return;
            }
            return;
        }
        this.LJLJJI = t;
        for (Object obj : payloads) {
            if (obj instanceof C243899hh) {
                C243899hh c243899hh = (C243899hh) obj;
                this.LJLJJI = C243889hg.LIZ(t, c243899hh.LIZ);
                L().setVisibility(0);
                L().setChecked(c243899hh.LIZ);
            }
        }
    }
}
