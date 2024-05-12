package com.ss.android.ugc.aweme.bnpl.biz.bill.repayment;

import X.C113554cx;
import X.C16880lQ;
import X.C184077Kh;
import X.C213688a4;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26018AJa;
import X.C26021AJd;
import X.C26338AVi;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C91924a2S;
import X.C91948a2q;
import X.C92047a4R;
import X.C92224a7I;
import X.C92548aCW;
import X.C92843aHH;
import X.C92847aHL;
import X.C92851aHP;
import X.C92852aHQ;
import X.C9KF;
import X.InterfaceC65784Pro;
import X.O6R;
import X.OSZ;
import X.SY4;
import X.T5T;
import X.TBT;
import X.ViewOnFocusChangeListenerC91949a2r;
import Y.IDCListenerS138S0100000_31;
import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.model.RepaymentArg;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS174S0200000_31;
import kotlin.jvm.internal.IDqS422S0100000_31;
import kotlin.jvm.internal.IDqS441S0100000_31;
import kotlin.jvm.internal.IDqS445S0100000_31;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentAssem extends UIContentAssem {
    public final C214378bB LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public RepaymentAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C65776Prg LIZ = C65352Pkq.LIZ(RepaymentViewModel.class);
        C92548aCW c92548aCW = C92548aCW.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new IDqS422S0100000_31((C8W0) this, 40);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLIL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c92548aCW, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, RepaymentArg.class, "bill_repayment_arg_key"), checkSupervisorPrepared());
    }

    public final RepaymentViewModel v3() {
        return (RepaymentViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        RepaymentViewModel v3 = v3();
        RepaymentArg repaymentArg = (RepaymentArg) this.LJLILLLLZI.getValue();
        if (repaymentArg != null) {
            v3.LJLLJ = 0;
            v3.LJLLILLLL = repaymentArg.getPreviousPageId();
            v3.LJLJLJ = System.currentTimeMillis();
            C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_start_repayment_show", "bnpl_start_repayment", v3.LJLLILLLL, C113554cx.LJJL(new OSZ("interface_return_cost", String.valueOf(0L)), new OSZ("timestamp", String.valueOf(v3.LJLJLJ)), new OSZ("has_loan", C92047a4R.LIZLLL(!o.LJ(repaymentArg.getAmountDue(), v3.LJLLI))), new OSZ("is_overdue", C92047a4R.LIZLLL(repaymentArg.isOverdue())), new OSZ("is_back", String.valueOf(v3.LJLLJ))), 8);
            v3.setState(new IDqS174S0200000_31(v3, repaymentArg, 19));
        } else {
            v3.getClass();
        }
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_chevron_left_ltr;
        c234529Ii.LIZIZ(new IDqS422S0100000_31(this, 92));
        C9KF c9kf = new C9KF();
        String string = getContainerView().getContext().getString(R.string.jmy);
        o.LJIIIIZZ(string, "containerView.context.ge…pipo_bill_homepage_repay)");
        c9kf.LIZJ = string;
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.cz);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(c234529Ii);
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZJ(0);
        c235119Kp.LIZLLL = false;
        c252709vu.setNavActions(c235119Kp);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.aN5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92227a7L) obj).LJLLL);
            }
        }, null, C92852aHQ.LJLIL, 6);
        _$_findCachedViewById(R.id.cs).getClass();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.aMv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C92227a7L) obj).LJLL);
            }
        }, null, C92847aHL.LJLIL, 6);
        ((TextView) _$_findCachedViewById(R.id.d3)).setText(Html.fromHtml(getContainerView().getContext().getString(R.string.jnt)));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.d1), new IDCListenerS138S0100000_31(this, 8));
        C8YN.LJIILLIIL(this, v3(), null, C92843aHH.INSTANCE, 3);
        C26021AJd c26021AJd = (C26021AJd) _$_findCachedViewById(R.id.cx);
        Context context = c26021AJd.getContext();
        o.LJIIIIZZ(context, "context");
        C26018AJa c26018AJa = new C26018AJa(context, null, 6);
        c26018AJa.LIZJ(new C92224a7I(c26018AJa, this));
        c26018AJa.LJ(false);
        View field_text_layout = c26018AJa.findViewById(R.id.d9_);
        o.LJIIIIZZ(field_text_layout, "field_text_layout");
        C26338AVi.LJI(field_text_layout, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), false, 21);
        Context context2 = c26018AJa.getContext();
        o.LJIIIIZZ(context2, "context");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        tuxTextView.setTuxFont(31);
        C26338AVi.LJI(tuxTextView, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(4.5d)))), false, 19);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.aN4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJLJ;
            }
        }, null, new IDqS445S0100000_31(tuxTextView, 13), 6);
        ((ViewGroup) c26018AJa.LIZIZ(R.id.kds)).removeAllViews();
        ((ViewGroup) c26018AJa.LIZIZ(R.id.kds)).addView(tuxTextView);
        c26018AJa.LIZIZ(R.id.kds).setVisibility(0);
        ((T5T) c26018AJa.findViewById(R.id.cps)).setTuxFont(13);
        ((TextView) c26018AJa.findViewById(R.id.cps)).setTextSize(32.0f);
        C8YN.LJII(this, v3(), new TBT() { // from class: X.aN3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJJLL;
            }
        }, null, new IDqS445S0100000_31(c26018AJa, 12), 6);
        ((TextView) c26018AJa.LIZIZ(R.id.cps)).setInputType(2);
        c26018AJa.LJII(CardStruct.IStatusCode.DEFAULT);
        c26018AJa.findViewById(R.id.kds).setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        ((TextView) c26018AJa.findViewById(R.id.cps)).setOnEditorActionListener(new C91948a2q(c26018AJa));
        c26018AJa.findViewById(R.id.cps).setOnFocusChangeListener(new ViewOnFocusChangeListenerC91949a2r(c26018AJa, this));
        ((TuxTextView) c26021AJd.findViewById(R.id.lun)).setTuxFont(31);
        c26021AJd.LJIIIIZZ(getContainerView().getContext().getString(R.string.jnw));
        c26021AJd.setFormField(c26018AJa);
        c26021AJd.LJII();
        C8YN.LJIIJ(this, v3(), new TBT() { // from class: X.aMw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJL;
            }
        }, new TBT() { // from class: X.aMx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJLJ;
            }
        }, null, new IDqS441S0100000_31(c26021AJd, 7), 12);
        selectSubscribe(r15, new TBT() { // from class: X.aMy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLILLLLZI;
            }
        }, new TBT() { // from class: X.aMz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJL;
            }
        }, new TBT() { // from class: X.aN0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJI;
            }
        }, new TBT() { // from class: X.aN1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJJI;
            }
        }, new TBT() { // from class: X.aN2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C92227a7L) obj).LJLJLJ;
            }
        }, C213688a4.LIZIZ(v3().usedInReusedScene), null, new C92851aHP(c26021AJd, c26018AJa));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.cs), new IDCListenerS138S0100000_31(this, 7));
    }
}
