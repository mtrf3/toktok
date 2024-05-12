package com.ss.android.ugc.aweme.poi.reviews.assem;

import X.C199127rg;
import X.C2068389v;
import X.C214298b3;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C7V0;
import X.C7V9;
import X.C7VC;
import X.C8YN;
import X.C9BE;
import X.TBT;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiReviewStatusAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;

    public PoiReviewStatusAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LJ(this, C7V0.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 784);
        C65776Prg LIZ = C65352Pkq.LIZ(PoiReviewListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 786), C7V9.INSTANCE, aqS153S0100000_3);
    }

    public final PoiReviewListViewModel v3() {
        return (PoiReviewListViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C73305Spp c73305Spp;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof C73305Spp) || (c73305Spp = (C73305Spp) view) == null) {
            return;
        }
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.7VA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C7VC c7vc = (C7VC) obj;
                c7vc.getClass();
                return C208708Ha.LIZLLL(c7vc);
            }
        }, null, new AqS134S0200000_3(c73305Spp, this, 136), new AqS153S0100000_3(c73305Spp, 785), new AqS134S0200000_3(c73305Spp, this, 137), 2, null);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.7VB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C7VC) obj).LJLJJL;
            }
        }, null, new AqS166S0200000_3(c73305Spp, this, 13), 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x3(C73305Spp c73305Spp) {
        Boolean bool;
        String string;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StatusAssem - onSuccess, listItemState is Empty: ");
        List<PoiReviewsApi.PoiReviewModel> list = ((C7VC) v3().getState()).LJLJJL.LJLJJI;
        String str = null;
        if (list != null) {
            bool = Boolean.valueOf(list.isEmpty());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
        List<PoiReviewsApi.PoiReviewModel> list2 = ((C7VC) v3().getState()).LJLJJL.LJLJJI;
        if (list2 != null && list2.isEmpty()) {
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_2pt_bubble_ellipsis_right;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.p2q);
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c73306Spq.LJFF = str;
            Context context2 = getContext();
            if (context2 != null && (string = context2.getString(R.string.p2o)) != null) {
                str2 = string;
            }
            c73306Spq.LJI = str2;
            c73305Spp.setStatus(c73306Spq);
            c73305Spp.setVisibility(0);
            return;
        }
        if (c73305Spp.getVisibility() == 8) {
            return;
        }
        c73305Spp.postDelayed(new ARunnableS39S0100000_3(c73305Spp, 87), 200L);
    }
}
