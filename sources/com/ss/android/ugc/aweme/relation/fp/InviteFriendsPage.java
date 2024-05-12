package com.ss.android.ugc.aweme.relation.fp;

import X.AbstractC234519Ih;
import X.AbstractC63778P1i;
import X.ActivityC45651qj;
import X.C113914dX;
import X.C184077Kh;
import X.C212418Vh;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C57571Mid;
import X.C57572Mie;
import X.C62374Odu;
import X.C62787OkZ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9KF;
import X.EnumC58046MqI;
import X.EnumC58085Mqv;
import X.InterfaceC61213O0r;
import X.P1J;
import X.P1N;
import X.P1P;
import X.P1U;
import X.P1W;
import X.TBT;
import X.UTK;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
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

@InterfaceC61213O0r(attachActivity = InviteFriendsPage$$Activity.class)
/* loaded from: classes11.dex */
public final class InviteFriendsPage extends BaseFriendsPage {
    public final C214378bB LJLILLLLZI;
    public P1W LJLJI;
    public C113914dX LJLJJI;
    public InviteFriendsPageSharePackage LJLJJL;
    public final int LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void xl() {
        C8YN.LJII(this, Al(), new TBT() { // from class: X.P1M
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C63780P1k) obj).LJLILLLLZI;
            }
        }, null, new AqS192S0100000_10(this, 20), 6);
    }

    public InviteFriendsPage() {
        AqS60S0110000_3 LJJ;
        P1P p1p = P1P.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(FindFriendsPageVM.class);
        P1N p1n = P1N.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLILLLLZI = new C214378bB(LIZ, p1p, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, p1n, LJJ, C78926UyI.LJIILLIIL(this, true));
        this.LJLJJLL = R.layout.axn;
    }

    public final FindFriendsPageVM Al() {
        return (FindFriendsPageVM) this.LJLILLLLZI.getValue();
    }

    public final void Dl() {
        ViewGroup viewGroup;
        View inflate = View.inflate(getContext(), R.layout.axp, null);
        View findViewById = inflate.findViewById(R.id.g62);
        o.LJIIIIZZ(findViewById, "shareChannelHeaderView.f…(R.id.ll_share_container)");
        this.LJLJJI = (C113914dX) findViewById;
        AbstractC63778P1i LJ = UTK.LIZIZ.LJ();
        ActivityC45651qj requireActivity = requireActivity();
        EnumC58085Mqv enumC58085Mqv = EnumC58085Mqv.FIND_FRIENDS;
        P1J p1j = new P1J("invite_friends", 14);
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        P1W p1w = (P1W) LJ;
        p1w.LIZJ(new P1U(requireActivity, enumC58085Mqv, p1j, false, false, false, null, true, null, null, 123504));
        p1w.LJLLJ = new AqS160S0100000_10(this, 329);
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.addView((View) p1w.LJLJL.getValue(), -1, -1);
        }
        p1w.LIZIZ().LJLJL(0, inflate);
        this.LJLJI = p1w;
        C113914dX c113914dX = this.LJLJJI;
        if (c113914dX != null) {
            Context context = c113914dX.getContext();
            C62374Odu c62374Odu = new C62374Odu();
            c62374Odu.LIZ = "text";
            InviteFriendsPageSharePackage inviteFriendsPageSharePackage = new InviteFriendsPageSharePackage(c62374Odu);
            this.LJLJJL = inviteFriendsPageSharePackage;
            inviteFriendsPageSharePackage.LJIIZILJ();
            InviteFriendsPageSharePackage inviteFriendsPageSharePackage2 = this.LJLJJL;
            if (inviteFriendsPageSharePackage2 != null) {
                ActivityC45651qj requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                c113914dX.LJIIJ(inviteFriendsPageSharePackage2.LJIILLIIL(requireActivity2), false);
                c113914dX.LJLJJL = new C62787OkZ(this, context);
                C212418Vh.LJIIJJI(Al(), new AqS176S0100000_10(this, 69));
                return;
            }
            o.LJIJI("sharePackage");
            throw null;
        }
        o.LJIJI("shareChannelBar");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InviteFriendsPageSharePackage inviteFriendsPageSharePackage = this.LJLJJL;
        if (inviteFriendsPageSharePackage != null) {
            inviteFriendsPageSharePackage.LJIILL();
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final int vl() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void wl(View view) {
        o.LJIIIZ(view, "view");
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.gwg);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS160S0100000_10(this, 330));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        CharSequence text = getText(R.string.hit);
        o.LJIIIIZZ(text, "getText(R.string.invite_contact_friends)");
        LIZLLL.LIZJ = text;
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        c252709vu.LJIILJJIL(true);
        EnumC58046MqI enumC58046MqI = EnumC58046MqI.CONTACT;
        if (!enumC58046MqI.isGrant()) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            C57572Mie.LIZ(enumC58046MqI, requireContext, new C57571Mid(Al().getState().LJLJJL.LJLIL, "auto", null, 12), new AqS176S0100000_10(this, 206));
            return;
        }
        Dl();
    }
}
