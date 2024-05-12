package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AYA;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C109434Rf;
import X.C184077Kh;
import X.C188727au;
import X.C2068389v;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73969T1h;
import X.C78926UyI;
import X.C78999UzT;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.EnumC51135K5b;
import X.FMX;
import X.InterfaceC65350Pko;
import X.K5T;
import X.KMR;
import X.OZ1;
import X.TBT;
import Y.AfS60S0100000_8;
import Y.IDTListenerS90S0200000_8;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendsV2Fragment;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class FFPMainFragment extends FFPBaseFragment {
    public final C214298b3 LJLJI;
    public Fragment LJLJJI;
    public Fragment LJLJJL;
    public K5T LJLJJLL;
    public C252709vu LJLJL;
    public final C73318Sq2 LJLJLJ;
    public final int LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Hl() {
        C8YN.LJII(this, Il(), new TBT() { // from class: X.KMT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227438wF) obj).LJLIL;
            }
        }, C213688a4.LIZJ(), new AqS190S0100000_8(this, 9), 4);
        C8YN.LJII(this, Il(), new TBT() { // from class: X.KMS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C227438wF) obj).LJLJJI);
            }
        }, C213688a4.LIZLLL(), new AqS190S0100000_8(this, 10), 4);
        C8YN.LJII(this, Il(), new TBT() { // from class: X.KMU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C227438wF) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), new AqS190S0100000_8(this, 11), 4);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public FFPMainFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(this, 51);
        C65776Prg LIZ = C65352Pkq.LIZ(FFPMainFragmentVM.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 98);
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), aqS174S0100000_8, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), aqS174S0100000_8, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
        this.LJLJLJ = new C73318Sq2();
        this.LJLJLLL = R.layout.axt;
    }

    public final FFPMainFragmentVM Il() {
        return (FFPMainFragmentVM) this.LJLJI.getValue();
    }

    public final void Ll() {
        int i;
        String str;
        OZ1 oz1 = OZ1.LIZIZ;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        if (Kl()) {
            i = 4;
        } else {
            i = -1;
        }
        oz1.LIZIZ(requireContext, i, false);
        Ml("click");
        if (Kl()) {
            str = "now_find_friends_page";
        } else {
            str = "find_friends_page";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        FMX.LJIIL("qr_code_scan_enter", c188727au.LIZ);
    }

    public final void Jl() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        K5T k5t = this.LJLJJLL;
        if (k5t != null) {
            AYA.LIZ(mo49getActivity, k5t.getEditTextView());
            K5T k5t2 = this.LJLJJLL;
            if (k5t2 != null) {
                k5t2.setEndAction(null);
                K5T k5t3 = this.LJLJJLL;
                if (k5t3 != null) {
                    k5t3.setInnerEmptyEndIcon(null);
                    K5T k5t4 = this.LJLJJLL;
                    if (k5t4 != null) {
                        Editable text = k5t4.getEditTextView().getText();
                        if (text != null) {
                            text.clear();
                            return;
                        }
                        return;
                    }
                    o.LJIJI("searchBar");
                    throw null;
                }
                o.LJIJI("searchBar");
                throw null;
            }
            o.LJIJI("searchBar");
            throw null;
        }
        o.LJIJI("searchBar");
        throw null;
    }

    public final boolean Kl() {
        if (vl().kv0().getPageStyle() == KMR.TT_NOW) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJLJ.LIZLLL();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final boolean xl() {
        Fragment LJJJI = getChildFragmentManager().LJJJI(R.id.ba7);
        Fragment fragment = this.LJLJJL;
        if (LJJJI == null || ((!(LJJJI instanceof SearchResultFragment) && !(LJJJI instanceof SearchFriendsV2Fragment)) || fragment == null)) {
            return false;
        }
        Jl();
        Il().gv0(C65352Pkq.LIZ(fragment.getClass()));
        this.LJLJJL = null;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        C234529Ii LIZJ;
        C234529Ii c234529Ii;
        o.LJIIIZ(view, "view");
        FindFriendsPageVM vl = vl();
        FFPMainFragmentVM Il = Il();
        vl.getClass();
        o.LJIIIZ(Il, "<set-?>");
        vl.LJLJL = Il;
        View findViewById = view.findViewById(R.id.gwg);
        C252709vu c252709vu = (C252709vu) findViewById;
        C235119Kp c235119Kp = new C235119Kp();
        AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
        KMR pageStyle = vl().kv0().getPageStyle();
        KMR kmr = KMR.TT_NOW;
        Integer valueOf = Integer.valueOf(R.attr.go);
        if (pageStyle == kmr) {
            Ml("show");
            LIZJ = new C234529Ii();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_scan;
            c2068389v.LJ = valueOf;
            LIZJ.LIZ(c2068389v);
            LIZJ.LIZIZ(new AqS158S0100000_8(this, 19));
        } else {
            LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
            String string = getString(R.string.aub);
            o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
            LIZJ.LJII = string;
            LIZJ.LIZIZ(new AqS158S0100000_8(this, 20));
        }
        abstractC234519IhArr[0] = LIZJ;
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, abstractC234519IhArr);
        CharSequence text = getText(R.string.bff);
        o.LJIIIIZZ(text, "getText(R.string.add_friends_detail_page_title)");
        LIZLLL.LIZJ = text;
        c235119Kp.LIZJ = LIZLLL;
        AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
        if (vl().kv0().getPageStyle() == kmr) {
            c234529Ii = new C234529Ii();
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_chevron_right_ltr;
            c2068389v2.LJ = valueOf;
            c234529Ii.LIZ(c2068389v2);
            c234529Ii.LIZIZ(new AqS158S0100000_8(this, 17));
        } else {
            Ml("show");
            c234529Ii = new C234529Ii();
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = R.raw.icon_scan;
            c234529Ii.LIZIZ(new AqS158S0100000_8(this, 18));
        }
        abstractC234519IhArr2[0] = c234529Ii;
        c235119Kp.LIZIZ(abstractC234519IhArr2);
        c252709vu.setNavActions(c235119Kp);
        c252709vu.LJIILJJIL(false);
        o.LJIIIIZZ(findViewById, "view.findViewById<TuxNav…isible = false)\n        }");
        this.LJLJL = (C252709vu) findViewById;
        View findViewById2 = view.findViewById(R.id.je_);
        K5T k5t = (K5T) findViewById2;
        k5t.setSearchBarHeight(EnumC51135K5b.HIGH);
        k5t.setShowSeparator(false);
        C78999UzT.LJFF(C109434Rf.LJII(k5t.getEditTextView()).LJIIJJI(500L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS60S0100000_8(this, 6)), this.LJLJLJ);
        k5t.getEditTextView().setOnTouchListener(new IDTListenerS90S0200000_8(k5t, this, 0));
        o.LJIIIIZZ(findViewById2, "view.findViewById<TuxSea…e\n            }\n        }");
        this.LJLJJLL = (K5T) findViewById2;
    }

    public final void Ml(String str) {
        String str2;
        if (Kl()) {
            str2 = "now_find_friends_page";
        } else {
            str2 = "find_friends_page";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("action_type", str);
        FMX.LJIIL("scan_icon", c188727au.LIZ);
    }
}
