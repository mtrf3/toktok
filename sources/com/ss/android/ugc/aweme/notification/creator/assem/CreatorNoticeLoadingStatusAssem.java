package com.ss.android.ugc.aweme.notification.creator.assem;

import X.C2068389v;
import X.C213688a4;
import X.C214298b3;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78926UyI;
import X.C8YN;
import X.C9BD;
import X.MS7;
import X.MUY;
import X.TBT;
import X.V1B;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeTabVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeLoadingStatusAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public C73306Spq LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        Context context = getContext();
        if (context != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_refresh;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            String string = context.getString(R.string.ea0);
            o.LJIIIIZZ(string, "context.getString(R.stri…te_noConnection_headline)");
            c73306Spq.LJFF = string;
            String string2 = context.getString(R.string.ea1);
            o.LJIIIIZZ(string2, "context.getString(R.stri…noConnection_subheadline)");
            c73306Spq.LJI = string2;
            C73312Spw.LJI(c73306Spq, new AqS159S0100000_9(this, 768));
            this.LJLJJLL = c73306Spq;
        }
        ((AssemViewModel) this.LJLIL.getValue()).asyncSubscribe(new TBT() { // from class: X.MUE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT8) obj).LJLJI;
            }
        }, C213688a4.LJ(), new AqS175S0100000_9(this, 152), new AqS159S0100000_9(this, 367), new AqS175S0100000_9(this, 153));
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.MU3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT8) obj).LJLJJL;
            }
        }, C213688a4.LJ(), MS7.LJLIL, 4);
    }

    public CreatorNoticeLoadingStatusAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeTabVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9bd, new AqS159S0100000_9(LIZ, 369), MUY.INSTANCE, null);
        this.LJLILLLLZI = V1B.LJZI(new AqS159S0100000_9(this, 365));
        this.LJLJI = V1B.LJZI(new AqS159S0100000_9(this, 366));
        this.LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 370));
        this.LJLJJL = V1B.LJZI(new AqS159S0100000_9(this, 368));
    }

    public final C73305Spp v3() {
        return (C73305Spp) this.LJLILLLLZI.getValue();
    }
}
