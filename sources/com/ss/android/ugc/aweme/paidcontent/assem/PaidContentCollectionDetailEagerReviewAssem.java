package com.ss.android.ugc.aweme.paidcontent.assem;

import X.C04D;
import X.C184077Kh;
import X.C1DJ;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C25594A2s;
import X.C25609A3h;
import X.C283619k;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.InterfaceC65784Pro;
import X.V66;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS195S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentCollectionDetailEagerReviewAssem extends UIContentAssem {
    public final C214378bB LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C25594A2s.class, "paid_content_collection_detail_hierarchy_data_key"), checkSupervisorPrepared());

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJI;
        Integer valueOf = Integer.valueOf(R.id.ckd);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(R.id.ckd)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    public PaidContentCollectionDetailEagerReviewAssem() {
        InterfaceC65784Pro LJIILJJIL;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 541);
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailVideoListViewModel.class);
        C25609A3h c25609A3h = C25609A3h.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 540);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c25609A3h, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ((C04D) _$_findCachedViewById(R.id.ckd)).setViewCompositionStrategy(C283619k.LIZIZ);
        ComposeView eager_review = (ComposeView) _$_findCachedViewById(R.id.ckd);
        o.LJIIIIZZ(eager_review, "eager_review");
        V66.LIZIZ(eager_review, C1DJ.LJFF(new AqS195S0100000_13(this, 22), 1439267751, true));
    }
}
