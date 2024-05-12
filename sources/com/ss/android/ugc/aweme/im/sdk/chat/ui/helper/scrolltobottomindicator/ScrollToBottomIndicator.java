package com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.scrolltobottomindicator;

import X.C117314j1;
import X.C117334j3;
import X.C221108m2;
import X.C36636EZk;
import X.C44N;
import X.C48841JEv;
import X.C5H3;
import X.EnumC221088m0;
import X.ViewOnClickListenerC13880ga;
import X.XKQ;
import X.XKX;
import Y.ACListenerS21S0100000_1;
import Y.IDrS41S0100000_1;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScrollToBottomIndicator implements LifecycleEventObserver {
    public final View LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final C44N LJLJI;
    public final Context LJLJJI;
    public final C5H3 LJLJJL;
    public final CardView LJLJJLL;
    public final LinearLayout LJLJL;
    public final TextView LJLJLJ;
    public XKQ LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        XKQ xkq;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        int i = C117334j3.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2 || (xkq = this.LJLJLLL) == null) {
                return;
            }
            xkq.LIZIZ(null);
            return;
        }
        XKQ xkq2 = this.LJLJLLL;
        if (xkq2 != null && xkq2.isActive()) {
            return;
        }
        this.LJLJLLL = XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C117314j1(this, null), 3);
    }

    public ScrollToBottomIndicator(View rootView, RecyclerView recyclerView, C44N repo) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(repo, "repo");
        this.LJLIL = rootView;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = repo;
        this.LJLJJI = rootView.getContext();
        this.LJLJJL = C221108m2.LIZ(EnumC221088m0.NONE, new AqS151S0100000_1(this, 443));
        View findViewById = rootView.findViewById(R.id.jcs);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…roll_to_bottom_indicator)");
        CardView cardView = (CardView) findViewById;
        this.LJLJJLL = cardView;
        View findViewById2 = rootView.findViewById(R.id.jct);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.….scroll_to_bottom_layout)");
        this.LJLJL = (LinearLayout) findViewById2;
        View findViewById3 = rootView.findViewById(R.id.jcq);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.scroll_to_bottom_count)");
        this.LJLJLJ = (TextView) findViewById3;
        this.LJLL = true;
        recyclerView.LJIIJJI(new IDrS41S0100000_1(this, 0));
        cardView.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0100000_1(this, 13)));
    }
}
