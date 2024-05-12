package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.C192217gX;
import X.C192487gy;
import X.C193007ho;
import X.C193027hq;
import X.C193167i4;
import X.C32I;
import X.C34K;
import X.C44100HSm;
import X.C73454SsE;
import X.C73969T1h;
import X.C76732zl;
import X.C78999UzT;
import X.C7F7;
import X.C7F9;
import X.FMX;
import X.M8L;
import X.OSZ;
import X.S1E;
import X.T16;
import X.TAT;
import Y.AfS19S0400000_3;
import Y.AfS55S0100000_3;
import android.view.View;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class Au2S9S0300000_3 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S9S0300000_3 au2S9S0300000_3, View view) {
        int i;
        M8L.LIZ("click favorite toast");
        M8L.LIZ("popup favorite collections dialog");
        FMX.LJIILL("click_collection_banner", new OSZ(((C193027hq) au2S9S0300000_3.l0).LJLJI, "enter_from"));
        if (((C34K) au2S9S0300000_3.l1).element && (i = ((C76732zl) au2S9S0300000_3.l2).element) > 0) {
            C193027hq c193027hq = (C193027hq) au2S9S0300000_3.l0;
            c193027hq.getClass();
            C193167i4 c193167i4 = ChooseCollectionSheetFragment.LJLJJI;
            ActivityC45651qj activityC45651qj = c193027hq.LJLIL;
            String str = c193027hq.LJLJI;
            C193007ho c193007ho = new C193007ho(c193027hq);
            c193167i4.getClass();
            C193167i4.LIZ(activityC45651qj, false, null, str, i, c193007ho, true);
            return;
        }
        C193027hq c193027hq2 = (C193027hq) au2S9S0300000_3.l0;
        c193027hq2.LIZJ(c193027hq2.LJLIL);
    }

    public static final void LIZ$1(Au2S9S0300000_3 au2S9S0300000_3, View view) {
        String str = ((CollectionContentFragment) au2S9S0300000_3.l0).LJLJJI;
        List list = (List) au2S9S0300000_3.l1;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C192217gX) it.next()).LJLIL.getAid());
        }
        CollectionManageRequest collectionManageRequest = new CollectionManageRequest(11, str, null, null, null, null, arrayList, null, null, 444, null);
        C73454SsE LJJJ = new C192487gy().LIZJ.LJJJIL(collectionManageRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        CollectionContentFragment collectionContentFragment = (CollectionContentFragment) au2S9S0300000_3.l0;
        List list2 = (List) au2S9S0300000_3.l1;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) au2S9S0300000_3.l2;
        C78999UzT.LJFF(LJJJ.LJJJLIIL(new AfS19S0400000_3(collectionContentFragment, collectionManageRequest, list2, activityC45651qj, 0), new AfS55S0100000_3(activityC45651qj, 19)), ((CollectionContentFragment) au2S9S0300000_3.l0).Kl());
    }

    public static final void LIZ$2(Au2S9S0300000_3 au2S9S0300000_3, View view) {
        if (view != null) {
            S1E s1e = (S1E) au2S9S0300000_3.l0;
            C7F9 c7f9 = (C7F9) au2S9S0300000_3.l1;
            ((C7F7) au2S9S0300000_3.l2).getClass();
            s1e.LJI(C44100HSm.LIZ(s1e, c7f9, "click_anchor", C7F7.LIZ(c7f9)));
            S1E s1e2 = (S1E) au2S9S0300000_3.l0;
            C7F9 c7f92 = (C7F9) au2S9S0300000_3.l1;
            ((C7F7) au2S9S0300000_3.l2).getClass();
            s1e2.LJIIIIZZ(C44100HSm.LIZJ(s1e2, c7f92, "click_anchor", C7F7.LIZ(c7f92)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S9S0300000_3(S1E s1e, C7F9 c7f9, C7F7 c7f7, int i) {
        super(700L);
        this.$t = i;
        this.l0 = s1e;
        this.l1 = c7f9;
        this.l2 = c7f7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Au2S9S0300000_3(Object obj, CollectionContentFragment collectionContentFragment, List<C192217gX> list, ActivityC45651qj activityC45651qj) {
        super(500L);
        this.$t = activityC45651qj;
        this.l0 = obj;
        this.l1 = collectionContentFragment;
        this.l2 = list;
    }
}
