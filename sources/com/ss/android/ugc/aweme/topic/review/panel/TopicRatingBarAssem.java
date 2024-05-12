package com.ss.android.ugc.aweme.topic.review.panel;

import X.C214298b3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7UR;
import X.C84G;
import X.C8YN;
import X.C9BD;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class TopicRatingBarAssem extends DynamicAssem {
    public final C214298b3 LJLJLLL;
    public C84G LJLL;
    public final IDaS483S0100000_3 LJLLI;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cso;
    }

    public TopicRatingBarAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicReviewVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9bd, new AqS153S0100000_3(LIZ, 1111), C7UR.INSTANCE, null);
        this.LJLLI = new IDaS483S0100000_3(this, 22);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        View findViewById = view.findViewById(R.id.in_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.rating_bar)");
        C84G c84g = (C84G) findViewById;
        this.LJLL = c84g;
        c84g.setRatingValue(0.0f);
        C84G c84g2 = this.LJLL;
        if (c84g2 != null) {
            c84g2.setOnStarChanged$topic_release(new AqS169S0100000_3(this, 498));
            C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.7UQ
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C186157Sh) obj).LJLJJL);
                }
            }, null, new AqS185S0100000_3(view, 95), 6);
        } else {
            o.LJIJI("ratingBar");
            throw null;
        }
    }
}
