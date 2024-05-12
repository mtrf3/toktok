package com.ss.android.ugc.aweme.bnpl.biz.bill.home;

import X.C214298b3;
import X.C221108m2;
import X.C252709vu;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C60191Njn;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C91934a2c;
import X.C92209a73;
import X.C92536aCK;
import X.C92537aCL;
import X.C92538aCM;
import X.C93093aLJ;
import X.C9BE;
import X.O6R;
import X.TBT;
import X.XKX;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.utils.BillHomeArg;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class BillHomeAssem extends UIContentAssem {
    public static final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C92536aCK.LJLIL);
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public BillHomeAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BillHomeViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new IDqS422S0100000_31(LIZ, 36), C92538aCM.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, BillHomeArg.class, "bill_detail_arg_key"), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 38));
        this.LJLJJI = C221108m2.LIZIZ(new IDqS422S0100000_31(this, 37));
    }

    public final BillHomeViewModel A3() {
        return (BillHomeViewModel) this.LJLIL.getValue();
    }

    public final void C3() {
        Iterator it = ((List) LJLJJLL.getValue()).iterator();
        while (it.hasNext()) {
            View LJI = x3().LJI(it.next());
            if (LJI != null) {
                ((TuxIconView) LJI).setTintColorRes(R.attr.go);
            }
        }
    }

    public final C252709vu x3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-titleLayout>(...)");
        return (C252709vu) value;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        A3().gv0(false);
        BillHomeViewModel A3 = A3();
        XKX.LIZLLL(A3.getAssemVMScope(), null, null, new C93093aLJ(A3, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.cr).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C60191Njn.LIZ(0))));
        _$_findCachedViewById(R.id.cr).setLayoutParams(marginLayoutParams);
        C8YN.LJIIJ(this, A3(), new TBT() { // from class: X.aMj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92209a73) obj).LJLIL;
            }
        }, new TBT() { // from class: X.aMk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92209a73) obj).LJLILLLLZI;
            }
        }, null, new IDqS441S0100000_31(this, 0), 12);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.aMl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92209a73) obj).LJLJI);
            }
        }, null, C92537aCL.LJLIL, 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.aMm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92209a73) obj).LJZ);
            }
        }, null, new IDqS445S0100000_31(this, 2), 6);
        C8YN.LJIILLIIL(this, A3(), null, new IDqS445S0100000_31(this, 3), 3);
    }

    public final void v3(C92209a73 c92209a73) {
        ((TuxTextView) _$_findCachedViewById(R.id.e7)).LJJJ(44.0f);
        ((TuxTextView) _$_findCachedViewById(R.id.e7)).setMinTextSize(10.0f);
        ((TextView) _$_findCachedViewById(R.id.e7)).setText(C91934a2c.LIZIZ(c92209a73.LJLJLLL));
        ((ImageView) _$_findCachedViewById(R.id.e8)).setVisibility(8);
    }
}
