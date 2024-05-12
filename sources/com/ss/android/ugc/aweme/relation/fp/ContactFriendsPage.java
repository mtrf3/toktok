package com.ss.android.ugc.aweme.relation.fp;

import X.AbstractC234519Ih;
import X.AbstractC63778P1i;
import X.ActivityC45651qj;
import X.C184077Kh;
import X.C212418Vh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9KF;
import X.EnumC58085Mqv;
import X.InterfaceC61213O0r;
import X.P1J;
import X.P1S;
import X.P1T;
import X.P1U;
import X.P1W;
import X.TBT;
import X.UTK;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r(attachActivity = ContactFriendsPage$$Activity.class)
/* loaded from: classes11.dex */
public final class ContactFriendsPage extends BaseFriendsPage {
    public final C214378bB LJLILLLLZI;
    public AbstractC63778P1i LJLJI;
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
        C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.P1R
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C63780P1k) obj).LJLILLLLZI;
            }
        }, null, new AqS192S0100000_10(this, 18), 6);
        C212418Vh.LJIIJJI((AssemViewModel) this.LJLILLLLZI.getValue(), new AqS176S0100000_10(this, 67));
    }

    public ContactFriendsPage() {
        AqS60S0110000_3 LJJ;
        P1T p1t = P1T.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(FindFriendsPageVM.class);
        P1S p1s = P1S.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, p1t, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, p1s, LJJ, C78926UyI.LJIILLIIL(this, true));
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
        LIZJ.LIZIZ(new AqS160S0100000_10(this, 325));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        CharSequence text = getText(R.string.i7b);
        o.LJIIIIZZ(text, "getText(R.string.mobile_contacts)");
        LIZLLL.LIZJ = text;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        c252709vu.LJIILJJIL(true);
        AbstractC63778P1i LJ = UTK.LIZIZ.LJ();
        this.LJLJI = LJ;
        if (LJ != null) {
            ActivityC45651qj requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            ((P1W) LJ).LIZJ(new P1U(requireActivity, EnumC58085Mqv.FIND_FRIENDS, new P1J("contact", 14), false, false, false, null, false, null, null, 131000));
            AbstractC63778P1i abstractC63778P1i = this.LJLJI;
            if (abstractC63778P1i != null) {
                ((P1W) abstractC63778P1i).LJLLJ = new AqS160S0100000_10(this, 326);
                if ((view instanceof LinearLayout) && (viewGroup = (ViewGroup) view) != null) {
                    AbstractC63778P1i abstractC63778P1i2 = this.LJLJI;
                    if (abstractC63778P1i2 != null) {
                        viewGroup.addView((View) ((P1W) abstractC63778P1i2).LJLJL.getValue(), -1, -1);
                        return;
                    } else {
                        o.LJIJI("contactMaFWidget");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("contactMaFWidget");
            throw null;
        }
        o.LJIJI("contactMaFWidget");
        throw null;
    }
}
