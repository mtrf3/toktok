package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC63778P1i;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C10A;
import X.C113914dX;
import X.C141335gf;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C57571Mid;
import X.C62374Odu;
import X.C62786OkY;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C8YN;
import X.C90903hW;
import X.C9UA;
import X.EnumC58085Mqv;
import X.InterfaceC65350Pko;
import X.O6R;
import X.P1J;
import X.P1U;
import X.P1W;
import X.SYL;
import X.TBT;
import X.UTK;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.relation.share.InviteFriendsPageSharePackage;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecEmptyFragment extends FFPBaseFragment {
    public InviteFriendsPageSharePackage LJLJI;
    public P1W LJLJJI;
    public View LJLJJL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final int LJLJJLL = -1;

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Hl() {
        C8YN.LJII(this, vl(), new TBT() { // from class: X.P1L
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C63780P1k) obj).LJLILLLLZI;
            }
        }, null, new AqS192S0100000_10(this, 17), 6);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        InviteFriendsPageSharePackage inviteFriendsPageSharePackage = this.LJLJI;
        if (inviteFriendsPageSharePackage != null) {
            inviteFriendsPageSharePackage.LJIILL();
            _$_clearFindViewByIdCache();
        } else {
            o.LJIJI("sharePackage");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Dl(InterfaceC65350Pko<? extends Fragment> interfaceC65350Pko) {
        new C9UA("invite", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        o.LJIIIZ(view, "view");
        View view2 = this.LJLJJL;
        if (view2 != null) {
            C73305Spp c73305Spp = (C73305Spp) view2.findViewById(R.id.kf_);
            C73306Spq c73306Spq = new C73306Spq();
            String string = getString(R.string.ggx);
            o.LJIIIIZZ(string, "getString(R.string.find_…e_v2_allowed_empty_title)");
            c73306Spq.LJFF = string;
            String string2 = getString(R.string.ggw);
            o.LJIIIIZZ(string2, "getString(R.string.find_…te_v2_allowed_empty_desc)");
            c73306Spq.LJI = string2;
            c73305Spp.setStatus(c73306Spq);
            View view3 = this.LJLJJL;
            if (view3 != null) {
                ((TextView) view3.findViewById(R.id.es2)).setText(R.string.gh5);
                View view4 = this.LJLJJL;
                if (view4 != null) {
                    View findViewById = view4.findViewById(R.id.es1);
                    o.LJIIIIZZ(findViewById, "headerView.findViewById<…d.invite_channel_divider)");
                    C26338AVi.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, AnonymousClass391.LIZJ(16), null, false, 26);
                    View view5 = this.LJLJJL;
                    if (view5 != null) {
                        C113914dX shareChannelBar = (C113914dX) view5.findViewById(R.id.g62);
                        o.LJIIIIZZ(shareChannelBar, "shareChannelBar");
                        Context context = shareChannelBar.getContext();
                        C62374Odu c62374Odu = new C62374Odu();
                        c62374Odu.LIZ = "text";
                        InviteFriendsPageSharePackage inviteFriendsPageSharePackage = new InviteFriendsPageSharePackage(c62374Odu);
                        this.LJLJI = inviteFriendsPageSharePackage;
                        inviteFriendsPageSharePackage.LJIIZILJ();
                        InviteFriendsPageSharePackage inviteFriendsPageSharePackage2 = this.LJLJI;
                        if (inviteFriendsPageSharePackage2 != null) {
                            ActivityC45651qj requireActivity = requireActivity();
                            o.LJIIIIZZ(requireActivity, "requireActivity()");
                            shareChannelBar.LJIIJ(inviteFriendsPageSharePackage2.LJIILLIIL(requireActivity), false);
                            shareChannelBar.LJLJJL = new C62786OkY(this, context);
                            P1W p1w = this.LJLJJI;
                            if (p1w != null) {
                                SYL LIZIZ = p1w.LIZIZ();
                                View view6 = this.LJLJJL;
                                if (view6 != null) {
                                    LIZIZ.LJLJL(0, view6);
                                    P1W p1w2 = this.LJLJJI;
                                    if (p1w2 != null) {
                                        SYL LIZIZ2 = p1w2.LIZIZ();
                                        getContext();
                                        LIZIZ2.setLayoutManager(new WrapLinearLayoutManager(1));
                                        new C9UA("invite", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
                                        return;
                                    }
                                    o.LJIJI("contactMaFWidget");
                                    throw null;
                                }
                                o.LJIJI("headerView");
                                throw null;
                            }
                            o.LJIJI("contactMaFWidget");
                            throw null;
                        }
                        o.LJIJI("sharePackage");
                        throw null;
                    }
                    o.LJIJI("headerView");
                    throw null;
                }
                o.LJIJI("headerView");
                throw null;
            }
            o.LJIJI("headerView");
            throw null;
        }
        o.LJIJI("headerView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        AbstractC63778P1i LJ = UTK.LIZIZ.LJ();
        C57571Mid c57571Mid = vl().getState().LJLJJL;
        ActivityC45651qj requireActivity = requireActivity();
        EnumC58085Mqv enumC58085Mqv = EnumC58085Mqv.FIND_FRIENDS;
        P1J p1j = new P1J(c57571Mid.LJLIL, 14);
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        P1W p1w = (P1W) LJ;
        p1w.LIZJ(new P1U(requireActivity, enumC58085Mqv, p1j, false, false, false, Integer.valueOf(R.string.r4t), false, null, null, 123496));
        p1w.LJLLJ = new AqS159S0100000_9(this, 528);
        this.LJLJJI = p1w;
        C29S c29s = null;
        View inflate = View.inflate(getContext(), R.layout.axw, null);
        o.LJIIIIZZ(inflate, "inflate(\n            con…           null\n        )");
        this.LJLJJL = inflate;
        P1W p1w2 = this.LJLJJI;
        if (p1w2 != null) {
            View view = (View) p1w2.LJLJL.getValue();
            if (!(view instanceof View)) {
                view = null;
            }
            if (view != null) {
                try {
                    ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                    ViewTreeViewModelStoreOwner.set(view, this);
                    C10A.LIZIZ(view, this);
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity instanceof C29S) {
                        c29s = (C29S) mo49getActivity;
                    }
                    C90903hW.LIZ(c29s);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            return view;
        }
        o.LJIJI("contactMaFWidget");
        throw null;
    }
}
