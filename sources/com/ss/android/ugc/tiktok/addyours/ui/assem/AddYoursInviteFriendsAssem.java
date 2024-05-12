package com.ss.android.ugc.tiktok.addyours.ui.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C218778iH;
import X.C218818iL;
import X.C218838iN;
import X.C218888iS;
import X.C26338AVi;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.K5T;
import X.O6R;
import X.TBT;
import X.V8H;
import X.XKX;
import X.XLM;
import Y.ACListenerS23S0100000_3;
import Y.IDCListenerS372S0100000_3;
import Y.IDObjectS176S0100000_3;
import Y.IDrS43S0100000_3;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.SearchResultListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class AddYoursInviteFriendsAssem extends UIContentAssem {
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final IDrS43S0100000_3 LJLJJI;
    public final XLM LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C218888iS.class, "InviteHierarchyData"), checkSupervisorPrepared());

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public AddYoursInviteFriendsAssem() {
        C65776Prg LIZ = C65352Pkq.LIZ(SearchResultListViewModel.class);
        C9BE c9be = C9BE.LIZ;
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1434), C218818iL.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(AddYoursInviteFriendsViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9be, new AqS153S0100000_3(LIZ2, 1435), C218838iN.INSTANCE, null);
        this.LJLJJI = new IDrS43S0100000_3(this, 9);
        XLM LIZ3 = V8H.LIZ(null);
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C218778iH(LIZ3, this, null), 3);
        this.LJLJJL = LIZ3;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View btn_invite = _$_findCachedViewById(R.id.awu);
        o.LJIIIIZZ(btn_invite, "btn_invite");
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 28, 42, 42), btn_invite);
        _$_findCachedViewById(R.id.awu).getClass();
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.8iO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218868iQ) obj).LJLJI;
            }
        }, null, new AqS185S0100000_3(this, 134), 6);
        ((K5T) _$_findCachedViewById(R.id.je_)).getEditTextView().addTextChangedListener(new IDObjectS176S0100000_3(this, 10));
        ((K5T) _$_findCachedViewById(R.id.je_)).setOnClickClearListener(new ACListenerS23S0100000_3(this, 183));
        ((K5T) _$_findCachedViewById(R.id.je_)).getEditTextView().setOnFocusChangeListener(new IDCListenerS372S0100000_3(this, 1));
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.8iP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218868iQ) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 135), 6);
        ((RecyclerView) _$_findCachedViewById(R.id.fu9)).LJIIJJI(this.LJLJJI);
        ((RecyclerView) _$_findCachedViewById(R.id.fu8)).LJIIJJI(this.LJLJJI);
        if (((C218888iS) this.LJLIL.getValue()).LJLJJL) {
            View list_search_result = _$_findCachedViewById(R.id.fu9);
            o.LJIIIIZZ(list_search_result, "list_search_result");
            C26338AVi.LJIIIZ(list_search_result, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56))), 23);
            View list_recommended_result = _$_findCachedViewById(R.id.fu8);
            o.LJIIIIZZ(list_recommended_result, "list_recommended_result");
            C26338AVi.LJIIIZ(list_recommended_result, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56))), 23);
        }
    }
}
