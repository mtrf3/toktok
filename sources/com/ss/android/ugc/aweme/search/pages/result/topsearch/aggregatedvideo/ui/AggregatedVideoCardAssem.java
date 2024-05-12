package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui;

import X.C16880lQ;
import X.C214368bA;
import X.C221108m2;
import X.C32151Nz;
import X.C49098JOs;
import X.C62822Ol8;
import X.C80001VaX;
import X.C8V7;
import X.InterfaceC49473JbJ;
import X.JW6;
import X.O6R;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class AggregatedVideoCardAssem extends SearchAggregatedCardAssem<JW6> {
    public C80001VaX LLFII;
    public View LLFZ;
    public View LLI;
    public TextView LLIFFJFJJ;
    public final C62822Ol8 LLII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cho;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final int r4() {
        return R.id.b5o;
    }

    public AggregatedVideoCardAssem() {
        new LinkedHashMap();
        this.LLII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 286));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCreate begin ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        super.onCreate();
        C8V7 c8v72 = C214368bA.LIZIZ;
        if (c8v72 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onCreate end ");
            LIZ2.append(this);
            c8v72.log("AssemList", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        q4((JW6) obj);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewCreated begin ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        try {
            super.onViewCreated(view);
            u4(view);
            View findViewById = view.findViewById(R.id.jck);
            o.LJIIIIZZ(findViewById, "parent.findViewById(R.id.scroll_for_more_layout)");
            this.LLFII = (C80001VaX) findViewById;
            View findViewById2 = view.findViewById(R.id.jk8);
            o.LJIIIIZZ(findViewById2, "parent.findViewById(R.id.see_more_layout)");
            this.LLI = findViewById2;
            View findViewById3 = view.findViewById(R.id.n_i);
            o.LJIIIIZZ(findViewById3, "parent.findViewById(R.id.view_blank_for_scroll)");
            this.LLFZ = findViewById3;
            C8V7 c8v72 = C214368bA.LIZIZ;
            if (c8v72 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onViewCreated end ");
                LIZ2.append(this);
                c8v72.log("AssemList", X1D.LIZIZ(LIZ2));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            C8V7 c8v73 = C214368bA.LIZIZ;
            if (c8v73 != null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onViewCreated error ");
                LIZ3.append(e.getStackTrace());
                c8v73.log("AssemList", X1D.LIZIZ(LIZ3));
            }
            throw e;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final void q4(JW6 item) {
        String str;
        o.LJIIIZ(item, "item");
        super.q4(item);
        TextView textView = this.LLIFFJFJJ;
        if (textView != null) {
            InterfaceC49473JbJ interfaceC49473JbJ = (InterfaceC49473JbJ) this.LLII.getValue();
            if (interfaceC49473JbJ == null || (str = interfaceC49473JbJ.LIZ(item, getContext())) == null) {
                str = "";
            }
            textView.setText(str);
            InterfaceC49473JbJ interfaceC49473JbJ2 = (InterfaceC49473JbJ) this.LLII.getValue();
            if (interfaceC49473JbJ2 != null) {
                interfaceC49473JbJ2.LIZIZ(item);
            }
            C80001VaX c80001VaX = this.LLFII;
            if (c80001VaX != null) {
                c80001VaX.setEnable(false);
                c80001VaX.setOnScrollToEndListener(null);
                View view = this.LLFZ;
                if (view != null) {
                    view.setVisibility(8);
                    View view2 = this.LLI;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        return;
                    } else {
                        o.LJIJI("seeMoreLayout");
                        throw null;
                    }
                }
                o.LJIJI("blankForScroll");
                throw null;
            }
            o.LJIJI("scrollLayout");
            throw null;
        }
        o.LJIJI("titleView");
        throw null;
    }

    public final void u4(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View findViewById = view.findViewById(R.id.jj4);
        o.LJIIIIZZ(findViewById, "parent.findViewById(R.id.second_level_title)");
        this.LLIFFJFJJ = (TextView) findViewById;
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LJFF());
        if (valueOf.intValue() > 0 && 1 != 0) {
            int intValue = valueOf.intValue();
            TextView textView = this.LLIFFJFJJ;
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(intValue))));
                    marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(intValue))));
                    return;
                }
                return;
            }
            o.LJIJI("titleView");
            throw null;
        }
    }
}
