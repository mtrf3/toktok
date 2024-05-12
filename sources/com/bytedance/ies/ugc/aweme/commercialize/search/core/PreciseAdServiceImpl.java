package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import X.C16880lQ;
import X.C221108m2;
import X.C58852N7w;
import X.C59406NTe;
import X.C62822Ol8;
import X.C78609UtB;
import X.C78897Uxp;
import X.N50;
import X.N51;
import X.NIP;
import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public final class PreciseAdServiceImpl implements IPreciseAdService {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public View LIZ;
    public C58852N7w LIZIZ;
    public View LIZJ;
    public C58852N7w LIZLLL;
    public TuxTextView LJ;
    public AwemeRawAd LJFF;
    public final int LJI = 1;
    public final C62822Ol8 LJII = C221108m2.LIZIZ(N51.LJLIL);

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService
    public final void LJIIIIZZ() {
        View view = this.LIZJ;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService
    public final void LJIIJ() {
        C58852N7w c58852N7w = this.LIZIZ;
        if (c58852N7w != null) {
            c58852N7w.setVisibility(0);
        }
        View view = this.LIZ;
        if (view != null) {
            view.setVisibility(0);
        }
        C58852N7w c58852N7w2 = this.LIZIZ;
        if (c58852N7w2 != null) {
            c58852N7w2.LJII(this.LJI);
        }
        C58852N7w c58852N7w3 = this.LIZIZ;
        if (c58852N7w3 != null) {
            c58852N7w3.LJI();
        }
        ((NIP) this.LJII.getValue()).LJIILJJIL(3, this.LJFF);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService
    public final void LJIILIIL() {
        C58852N7w c58852N7w = this.LIZIZ;
        if (c58852N7w != null) {
            c58852N7w.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService
    public final View LJIIIZ(ViewGroup viewGroup, Context context) {
        C58852N7w c58852N7w;
        TuxTextView tuxTextView = null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeAllViews();
        if (this.LIZJ == null) {
            this.LIZJ = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c2h, viewGroup, true);
        }
        View view = this.LIZJ;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view != null) {
            c58852N7w = (C58852N7w) view.findViewById(R.id.i0u);
        } else {
            c58852N7w = null;
        }
        this.LIZLLL = c58852N7w;
        View view2 = this.LIZJ;
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.i0w);
        }
        this.LJ = tuxTextView;
        View view3 = this.LIZJ;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        return this.LIZJ;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService
    public final void LJIIJJI(Aweme aweme, Context context, ACListenerS30S0100000_10 aCListenerS30S0100000_10, ACListenerS30S0100000_10 aCListenerS30S0100000_102) {
        AwemeRawAd awemeRawAd;
        int LJJJ;
        View findViewById;
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(0);
        }
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        View view2 = this.LIZJ;
        if (view2 != null && (findViewById = view2.findViewById(R.id.i0v)) != null) {
            Drawable background = findViewById.getBackground();
            if (background != null) {
                background.setAlpha(128);
            }
            if (findViewById != null) {
                C16880lQ.LJIIJ(aCListenerS30S0100000_102, findViewById);
            }
        }
        C58852N7w c58852N7w = this.LIZLLL;
        if (c58852N7w != null) {
            c58852N7w.LIZIZ(aweme, aCListenerS30S0100000_10);
        }
        C58852N7w c58852N7w2 = this.LIZLLL;
        if (c58852N7w2 != null) {
            C58852N7w c58852N7w3 = this.LIZIZ;
            if (c58852N7w3 != null) {
                LJJJ = c58852N7w3.getBgColor();
            } else {
                LJJJ = C78609UtB.LJJJ(R.attr.eb, context);
            }
            c58852N7w2.setBackgroundColor(LJJJ);
        }
        C58852N7w c58852N7w4 = this.LIZLLL;
        if (c58852N7w4 != null) {
            c58852N7w4.LJII(this.LJI);
        }
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, aCListenerS30S0100000_102);
        }
        C58852N7w c58852N7w5 = this.LIZLLL;
        if (c58852N7w5 != null) {
            C78897Uxp.LJJJJJL(c58852N7w5, 0.0f);
        }
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 != null) {
            C78897Uxp.LJJJJLI(tuxTextView2, null);
        }
        N50.LJJIJL(awemeRawAd, C59406NTe.LJI(aweme));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService
    public final View LJIIL(ViewGroup viewGroup, Context context, Aweme aweme, ACListenerS30S0100000_10 aCListenerS30S0100000_10) {
        AwemeRawAd awemeRawAd;
        C58852N7w c58852N7w = null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeAllViews();
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.LJFF = awemeRawAd;
        if (this.LIZ == null) {
            this.LIZ = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c2i, viewGroup, true);
        }
        View view = this.LIZ;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view != null) {
            c58852N7w = (C58852N7w) view.findViewById(R.id.i0x);
        }
        this.LIZIZ = c58852N7w;
        if (c58852N7w != null) {
            c58852N7w.LIZIZ(aweme, aCListenerS30S0100000_10);
        }
        C58852N7w c58852N7w2 = this.LIZIZ;
        if (c58852N7w2 != null) {
            C78897Uxp.LJJJJJL(c58852N7w2, 0.0f);
        }
        viewGroup.setVisibility(0);
        C58852N7w c58852N7w3 = this.LIZIZ;
        if (c58852N7w3 != null) {
            c58852N7w3.LIZJ();
        }
        return this.LIZ;
    }
}
