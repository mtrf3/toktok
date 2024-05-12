package com.ss.android.ugc.aweme.poi.collect;

import X.C06490Nh;
import X.C16880lQ;
import X.C76800UCe;
import X.C7WZ;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiCollectCell extends PowerCell<C7WZ> {
    public TuxTextView LJLIL;
    public TuxTextView LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7WZ c7wz) {
        C7WZ t = c7wz;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        String str = t.LJLIL;
        if (str != null) {
            TuxTextView tuxTextView = this.LJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(str);
            } else {
                o.LJIJI("tvPoiName");
                throw null;
            }
        }
        String str2 = t.LJLILLLLZI;
        if (str2 != null) {
            if (!o.LJ(str2, t.LJLIL)) {
                TuxTextView tuxTextView2 = this.LJLILLLLZI;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(str2);
                    TuxTextView tuxTextView3 = this.LJLILLLLZI;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(0);
                    } else {
                        o.LJIJI("tvPoiAddress");
                        throw null;
                    }
                } else {
                    o.LJIJI("tvPoiAddress");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView4 = this.LJLILLLLZI;
                if (tuxTextView4 != null) {
                    tuxTextView4.setVisibility(8);
                } else {
                    o.LJIJI("tvPoiAddress");
                    throw null;
                }
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        TuxTextView tuxTextView5 = this.LJLILLLLZI;
        if (tuxTextView5 != null) {
            tuxTextView5.setVisibility(8);
        } else {
            o.LJIJI("tvPoiAddress");
            throw null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c07, viewGroup, false);
        View findViewById = LIZIZ.findViewById(R.id.hvc);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.poi_tv_name)");
        this.LJLIL = (TuxTextView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.hva);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.poi_tv_address)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 116), LIZIZ);
        return LIZIZ;
    }
}
