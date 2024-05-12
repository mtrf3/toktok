package com.ss.android.ugc.aweme.relation.fp;

import X.AbstractC234519Ih;
import X.AbstractC63795P1z;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C63781P1l;
import X.C63783P1n;
import X.C63784P1o;
import X.C63788P1s;
import X.C63792P1w;
import X.C63794P1y;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C84773Uj;
import X.C8YN;
import X.C9KF;
import X.EnumC58085Mqv;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.P1J;
import X.P1V;
import X.TBT;
import X.UTK;
import Y.ACListenerS45S0200000_10;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r(attachActivity = FacebookFriendsPage$$Activity.class)
/* loaded from: classes11.dex */
public final class FacebookFriendsPage extends BaseFriendsPage {
    public final C214378bB LJLILLLLZI;
    public AbstractC63795P1z LJLJI;
    public final int LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void xl() {
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.P1p
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C63780P1k) obj).LJLJI;
            }
        }, null, new AqS192S0100000_10(this, 19), 6);
        C212418Vh.LJIIJJI((AssemViewModel) this.LJLILLLLZI.getValue(), new AqS176S0100000_10(this, 68));
    }

    public FacebookFriendsPage() {
        AqS60S0110000_3 LJJ;
        C63794P1y c63794P1y = C63794P1y.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(FindFriendsPageVM.class);
        C63788P1s c63788P1s = C63788P1s.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, c63794P1y, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c63788P1s, LJJ, C78926UyI.LJIILLIIL(this, true));
        this.LJLJJI = R.layout.axn;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final int vl() {
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void wl(View view) {
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS160S0100000_10(this, 327));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        CharSequence text = getText(R.string.g89);
        o.LJIIIIZZ(text, "getText(R.string.facebook)");
        LIZLLL.LIZJ = text;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        c252709vu.LJIILJJIL(true);
        AbstractC63795P1z LIZIZ = UTK.LIZIZ.LIZIZ();
        this.LJLJI = LIZIZ;
        if (LIZIZ != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            P1V p1v = new P1V(requireActivity, EnumC58085Mqv.FIND_FRIENDS, new P1J("facebook", 14));
            C63781P1l c63781P1l = (C63781P1l) LIZIZ;
            c63781P1l.LJLJLJ = p1v;
            ActivityC45651qj activityC45651qj = p1v.LIZ;
            FacebookMaFWidgetVM facebookMaFWidgetVM = (FacebookMaFWidgetVM) new C214298b3(C65352Pkq.LIZ(FacebookMaFWidgetVM.class), new AqS160S0100000_10(p1v, 314), C214528bQ.LJLIL, C78926UyI.LJJII(activityC45651qj, false), C78926UyI.LJJIIJZLJL(activityC45651qj, false), new AqS160S0100000_10(p1v, 315), C63792P1w.INSTANCE, (InterfaceC65784Pro) null, 384).getValue();
            c63781P1l.LJLL = facebookMaFWidgetVM;
            C8YN.LJII(c63781P1l, facebookMaFWidgetVM, new TBT() { // from class: X.P1t
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C63787P1r) obj).LJLILLLLZI;
                }
            }, null, new AqS186S0100000_4(c63781P1l, 275), 6);
            FacebookMaFWidgetVM facebookMaFWidgetVM2 = c63781P1l.LJLL;
            if (facebookMaFWidgetVM2 != null) {
                AssemViewModel.asyncSubscribe$default(facebookMaFWidgetVM2, new TBT() { // from class: X.P1u
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C63787P1r) obj).LJLILLLLZI;
                    }
                }, null, new C63783P1n(c63781P1l), new C63784P1o(c63781P1l), null, 18, null);
                FacebookMaFWidgetVM facebookMaFWidgetVM3 = c63781P1l.LJLL;
                if (facebookMaFWidgetVM3 != null) {
                    AssemViewModel.asyncSubscribe$default(facebookMaFWidgetVM3, new TBT() { // from class: X.P1v
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C63787P1r) obj).LJLIL;
                        }
                    }, null, null, null, new AqS141S0200000_10(c63781P1l, p1v, 39), 14, null);
                    if (p1v.LJFF) {
                        C84773Uj c84773Uj = new C84773Uj(p1v.LIZ, null, 6, 0);
                        c63781P1l.LJLIL = c84773Uj;
                        c84773Uj.setTitleText(R.string.ghs);
                    }
                    if (p1v.LJ && c63781P1l.LJLILLLLZI == null) {
                        View inflate = View.inflate(p1v.LIZ, R.layout.i1, null);
                        C16880lQ.LJIIZILJ((LinearLayout) inflate.findViewById(R.id.es8), new ACListenerS45S0200000_10(c63781P1l, p1v, 17));
                        c63781P1l.LJLILLLLZI = inflate;
                    }
                    AbstractC63795P1z abstractC63795P1z = this.LJLJI;
                    if (abstractC63795P1z != null) {
                        ((C63781P1l) abstractC63795P1z).LJLLI = new AqS160S0100000_10(this, 328);
                        if ((view instanceof LinearLayout) && (viewGroup = (ViewGroup) view) != null) {
                            AbstractC63795P1z abstractC63795P1z2 = this.LJLJI;
                            if (abstractC63795P1z2 != null) {
                                viewGroup.addView((View) ((C63781P1l) abstractC63795P1z2).LJLJJL.getValue(), -1, -1);
                                return;
                            } else {
                                o.LJIJI("facebookMaFWidget");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("facebookMaFWidget");
                    throw null;
                }
                o.LJIJI("viewModel");
                throw null;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        o.LJIJI("facebookMaFWidget");
        throw null;
    }
}
