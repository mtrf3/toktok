package com.bytedance.android.livesdk.moderator;

import X.ActivityC45651qj;
import X.BBP;
import X.BEH;
import X.BEJ;
import X.BEM;
import X.BEP;
import X.BEQ;
import X.BFC;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C238749Yo;
import X.C259910h;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C2NU;
import X.C30868C9o;
import X.C3C5;
import X.C51029K0z;
import X.C5H3;
import X.C73943T0h;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CN1;
import X.CVT;
import X.ORZ;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ModeratorListFragment extends BaseFragment {
    public String LJLILLLLZI;
    public C238749Yo LJLJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public int LJLIL = 30;
    public final C5H3 LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 246));
    public final C5H3 LJLJJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 245));
    public final BEH LJLJJLL = new BEH(this);

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

    public final boolean wl() {
        return ((Boolean) this.LJLJJL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJL).clear();
    }

    public final void vl() {
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZLLL();
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).EG(this.LJLJJLL, ((Number) this.LJLJJI.getValue()).longValue());
        } else {
            C30868C9o.LIZLLL(R.string.n0o, getContext());
        }
    }

    public final List<BFC> xl() {
        List<BFC> list;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL == null || (list = (List) LJIILIIL.kv0(ModeratorListChannel.class)) == null) {
            return new ArrayList();
        }
        return list;
    }

    public final void Al(int i) {
        if (wl()) {
            BZI LIZ = C28787BRn.LIZ("livesdk_moderator_page_show");
            LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
            LIZ.LJIJJ(Integer.valueOf(i), "moderator_number");
            if (o.LJ(this.LJLILLLLZI, "multi_guest_panel")) {
                LIZ.LJIJJ("multi_guest_panel", "event_page");
            }
            LIZ.LJJIIJZLJL();
        }
    }

    public final void Dl(boolean z) {
        String str;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            BBP bbp = BBP.MANAGE_MODERATOR;
            bbp.next();
            LJIILIIL.rv0(BroadcastDialogPageChannel.class, bbp);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_add_moderator_click");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        if (z) {
            str = "add_icon";
        } else {
            str = "add_button";
        }
        LIZ.LJIJJ(str, "click_position");
        LIZ.LJJIIJZLJL();
    }

    public final void onEvent(BEM bem) {
        if (bem == null) {
            return;
        }
        List<BFC> xl = xl();
        ArrayList arrayList = new ArrayList();
        for (BFC bfc : xl) {
            if (bfc.LIZ != bem.LIZIZ) {
                arrayList.add(bfc);
            }
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null) {
            LJIILIIL.rv0(ModeratorListChannel.class, LLJILJILJ);
        }
        if (isViewValid() && !bem.LIZ) {
            C238749Yo c238749Yo = this.LJLJI;
            if (c238749Yo != null) {
                c238749Yo.LJLZ(bem.LIZIZ);
                C238749Yo c238749Yo2 = this.LJLJI;
                if (c238749Yo2 != null) {
                    if (c238749Yo2.getItemCount() == 0) {
                        ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZIZ();
                        return;
                    }
                    return;
                }
                o.LJIJI("mAdminAdapter");
                throw null;
            }
            o.LJIJI("mAdminAdapter");
            throw null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            obj = C16880lQ.LLJJIII(arguments, "entrance");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        this.LJLILLLLZI = str;
        if (o.LJ(str, "ecommerce_shop_bag")) {
            C29306Beo.LJI(_$_findCachedViewById(R.id.j6y));
        } else if (o.LJ(str, "multi_guest_panel")) {
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.j6y), new ACListenerS25S0100000_5(this, 211));
        } else {
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.j6y), new ACListenerS25S0100000_5(this, 212));
        }
        if (wl()) {
            C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.aw5));
            C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aw5), new ACListenerS25S0100000_5(this, 213));
        }
        this.LJLJI = new C238749Yo(((Number) this.LJLJJI.getValue()).longValue(), C51029K0z.LJIILIIL(this), "moderator_panel", wl(), o.LJ(this.LJLILLLLZI, "multi_guest_panel"));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        getContext();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        C238749Yo c238749Yo = this.LJLJI;
        if (c238749Yo != null) {
            recyclerView2.setAdapter(c238749Yo);
            vl();
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_admin_list_show");
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                _$_findCachedViewById(R.id.j6w).setVisibility(0);
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cuc, C16880lQ.LLZIL(mo49getActivity), null);
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 334), LLLZIIL);
                BEJ bej = new BEJ(mo49getActivity);
                bej.LIZIZ(C259910h.LJ(R.attr.au4, mo49getActivity));
                bej.LIZJ(getString(R.string.n30));
                bej.LIZLLL(getString(R.string.npl));
                if (wl() && !C29306Beo.LJJII(C51029K0z.LJIILIIL(this))) {
                    String string = getString(R.string.npd);
                    o.LJIIIIZZ(string, "getString(R.string.pm_pr…ngs_addmods_screen_title)");
                    bej.LIZ(string, new AqS155S0100000_5(this, 343));
                }
                bej.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                BEQ beq = (BEQ) _$_findCachedViewById(R.id.j6w);
                BEP LIZ2 = BEP.LIZ(mo49getActivity);
                LIZ2.LIZJ = bej;
                LIZ2.LIZLLL = LLLZIIL;
                LIZ2.LIZIZ = new CVT(mo49getActivity, null);
                beq.setBuilder(LIZ2);
            }
            ((TextView) _$_findCachedViewById(R.id.j6x)).setText(R.string.mlj);
            register(C73943T0h.LIZ().LJ(BEM.class).LJJJJZI(new AfS57S0100000_5(this, 148)));
            return;
        }
        o.LJIJI("mAdminAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cyw, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
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
        return LLLLIILL;
    }
}
