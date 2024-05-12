package com.ss.android.ugc.aweme.bnpl.biz.bill.result;

import X.C214298b3;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78613UtF;
import X.C78926UyI;
import X.C8YN;
import X.C92252a7k;
import X.C92561aCj;
import X.C93122aLm;
import X.C9BE;
import X.TBT;
import X.XKX;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS190S0200000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentRetAssem extends UIContentAssem {
    public final C214298b3 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C92252a7k.class, "REPAYMENT_RESULT_KEY"), checkSupervisorPrepared());
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 44));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 41));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 42));

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

    public RepaymentRetAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RepaymentViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 43), C92561aCj.INSTANCE, null);
    }

    public final C92252a7k v3() {
        return (C92252a7k) this.LJLIL.getValue();
    }

    public final C73305Spp x3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_x_mark;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 99));
        c235119Kp.LIZIZ(c234529Ii);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        ((TuxTextView) _$_findCachedViewById(R.id.dh)).LJJJ(32.0f);
        ((TuxTextView) _$_findCachedViewById(R.id.dg)).LJJJ(16.0f);
        _$_findCachedViewById(R.id.d4).getClass();
        _$_findCachedViewById(R.id.d6).getClass();
        _$_findCachedViewById(R.id.d5).getClass();
        C8YN.LJII(this, (AssemViewModel) this.LJLJJL.getValue(), new TBT() { // from class: X.aMn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92253a7l) obj).LJLIL;
            }
        }, null, new IDqS445S0100000_31(this, 4), 6);
        C8YN.LJIILLIIL(this, (AssemViewModel) this.LJLJJL.getValue(), null, new IDqS190S0200000_31(view, this, 1), 3);
        RepaymentViewModel repaymentViewModel = (RepaymentViewModel) this.LJLJJL.getValue();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(repaymentViewModel), C78613UtF.LIZJ, null, new C93122aLm(repaymentViewModel, null), 2);
    }
}
