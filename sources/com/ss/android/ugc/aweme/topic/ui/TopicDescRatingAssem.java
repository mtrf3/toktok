package com.ss.android.ugc.aweme.topic.ui;

import X.C16880lQ;
import X.C214298b3;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7T8;
import X.C84G;
import X.C8YN;
import X.C9BD;
import X.O6R;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.IDqS450S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicDescRatingAssem extends DynamicAssem {
    public final C214298b3 LJLJLLL;
    public C84G LJLL;
    public TuxTextView LJLLI;
    public TuxTextView LJLLILLLL;
    public boolean LJLLJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.csg;
    }

    public TopicDescRatingAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicReviewVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1114), C7T8.INSTANCE, null);
        this.LJLLJ = true;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        View findViewById = view.findViewById(R.id.in_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.rating_bar)");
        this.LJLL = (C84G) findViewById;
        View findViewById2 = view.findViewById(R.id.inu);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.rating_text)");
        this.LJLLI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.inb);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.rating_count)");
        this.LJLLILLLL = (TuxTextView) findViewById3;
        C84G c84g = this.LJLL;
        if (c84g != null) {
            c84g.setRatingSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            C84G c84g2 = this.LJLL;
            if (c84g2 != null) {
                c84g2.setRatingSpacing(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                C84G c84g3 = this.LJLL;
                if (c84g3 != null) {
                    c84g3.setRatingEnableTouch(false);
                    C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.7T5
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Boolean.valueOf(((C186157Sh) obj).LJLJJI);
                        }
                    }, null, new AqS185S0100000_3(view, 96), 6);
                    C8YN.LJIIJJI(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.7T4
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Float.valueOf(((C186157Sh) obj).LJLIL);
                        }
                    }, new TBT() { // from class: X.7T6
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Long.valueOf(((C186157Sh) obj).LJLILLLLZI);
                        }
                    }, new TBT() { // from class: X.7T7
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return Long.valueOf(((C186157Sh) obj).LJLJI);
                        }
                    }, null, new IDqS450S0100000_3(this, 0), 24);
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 164), view);
                    return;
                }
                o.LJIJI("ratingBar");
                throw null;
            }
            o.LJIJI("ratingBar");
            throw null;
        }
        o.LJIJI("ratingBar");
        throw null;
    }
}
