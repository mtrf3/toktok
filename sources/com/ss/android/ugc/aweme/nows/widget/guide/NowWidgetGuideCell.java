package com.ss.android.ugc.aweme.nows.widget.guide;

import X.AbstractC13940gg;
import X.AbstractC72439Sbr;
import X.C110614Vt;
import X.C12460eI;
import X.C16880lQ;
import X.C197357op;
import X.C1AH;
import X.C210188Ms;
import X.C221108m2;
import X.C61328O5c;
import X.C62822Ol8;
import X.C70312pP;
import X.C71313Ryn;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS1S1001000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class NowWidgetGuideCell extends PowerCell<C70312pP> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 672));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.by6;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new AbstractC13940gg() { // from class: X.7ps
            public final C198037pv LJ = C198037pv.LJLIL;
            public InterfaceC65784Pro<String> LJFF = new AqS153S0100000_3(this, 673);
            public final C197997pr LJI = new InterfaceC19530ph() { // from class: X.7pr
                @Override // X.InterfaceC19530ph
                public final void LIZ(View view, String itemID) {
                    o.LJIIIZ(itemID, "itemID");
                    C7MK.LJI("now_widget_guide_show", new AqS1S1001000_3("fix", 0));
                }
            };

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ java.util.Map LJFF() {
                return null;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC13940gg
            public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
                return this.LJI;
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJFF = interfaceC65784Pro;
            }
        });
        View view = this.itemView;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
        c110614Vt.LIZJ = C61328O5c.LIZJ(28);
        C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
        View findViewById = this.itemView.findViewById(R.id.wf);
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.dj);
        c110614Vt2.LIZJ = C61328O5c.LIZJ(62);
        Context context = findViewById.getContext();
        o.LJIIIIZZ(context, "context");
        findViewById.setBackground(c110614Vt2.LIZ(context));
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 14, 42, 42), findViewById);
        View onItemViewCreated$lambda$6 = this.itemView.findViewById(R.id.bfo);
        o.LJIIIIZZ(onItemViewCreated$lambda$6, "onItemViewCreated$lambda$6");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 15, 42, 42), onItemViewCreated$lambda$6);
        View view2 = (View) this.LJLIL.getValue();
        if (view2 == null) {
            return;
        }
        view2.setLayoutDirection(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C70312pP t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        final C1AH c1ah = (C1AH) this.itemView.findViewById(R.id.e0t);
        if (c1ah != null) {
            c1ah.setVisibility(0);
        } else {
            c1ah = null;
        }
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.f1n);
        if (smartImageView != null) {
            W5F LJI = W5U.LJI(C197357op.LIZIZ("widget_card_const"));
            LJI.LJJIIJ = smartImageView;
            AbstractC72439Sbr abstractC72439Sbr = new AbstractC72439Sbr() { // from class: X.7pp
                @Override // X.InterfaceC70769Rq1
                public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                }

                @Override // X.InterfaceC70769Rq1
                public final void s2(android.net.Uri uri, View view, Throwable th) {
                    String str;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("error to load widget card resource, msg: ");
                    if (th != null) {
                        str = th.getMessage();
                    } else {
                        str = null;
                    }
                    LIZ.append(str);
                    C7XD.LIZIZ("NowWidgetGuideCell", X1D.LIZIZ(LIZ));
                    C1AH c1ah2 = C1AH.this;
                    if (c1ah2 == null) {
                        return;
                    }
                    c1ah2.setVisibility(4);
                }
            };
            if (C210188Ms.LIZLLL()) {
                LJI.LJFF(abstractC72439Sbr);
            } else {
                LJI.LIZLLL(abstractC72439Sbr);
            }
        }
        this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return C210188Ms.LIZIZ(context, R.layout.by6, parent, false, null);
    }
}
