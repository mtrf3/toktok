package com.bytedance.android.livesdk.moderator.removeself;

import X.ActivityC45651qj;
import X.BEJ;
import X.BEO;
import X.BEP;
import X.BEQ;
import X.BZI;
import X.C03880Dg;
import X.C05170If;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C259910h;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C3C5;
import X.C47071t1;
import X.C51029K0z;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.C9YK;
import X.CN1;
import X.CVT;
import X.InterfaceC28441BEf;
import Y.ACListenerS25S0100000_5;
import Y.IDcS170S0100000_5;
import Y.IDcS93S0200000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ModeratorHostIModeratorListFragment extends BaseFragment implements InterfaceC28441BEf {
    public C9YK LJLIL;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final BEO LJLILLLLZI = new BEO(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    @Override // X.InterfaceC28441BEf
    public final void ri(User user) {
        o.LJIIIZ(user, "user");
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LIZJ = C15380j0.LJIILL(R.string.ns5, C05170If.LIZ(user));
        c47071t1.LJII(C15380j0.LJIILL(R.string.ns3, C05170If.LIZ(user)));
        c47071t1.LJIILIIL(C15380j0.LJIILJJIL(R.string.ns4), new IDcS93S0200000_5(this, user, 3));
        c47071t1.LJIIJ(C15380j0.LJIILJJIL(R.string.ns2), new IDcS170S0100000_5(this, 15));
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILL = false;
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-1288107224750371883")).LIZ) {
            LIZ.show();
        }
        vl("show");
    }

    public final void vl(String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_option_out_toast");
        LIZ.LJIILLIIL(C51029K0z.LJIILIIL(this));
        LIZ.LJIJJ(str, "operation_type");
        LIZ.LJJIIJZLJL();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.j6y), new ACListenerS25S0100000_5(this, 219));
        C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.aw5));
        C16880lQ.LJIILJJIL((FrameLayout) _$_findCachedViewById(R.id.aw5), new ACListenerS25S0100000_5(this, 220));
        this.LJLIL = new C9YK(C51029K0z.LJIILIIL(this), this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        getContext();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        C9YK c9yk = this.LJLIL;
        if (c9yk != null) {
            recyclerView2.setAdapter(c9yk);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                _$_findCachedViewById(R.id.j6w).setVisibility(0);
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cuc, C16880lQ.LLZIL(mo49getActivity), null);
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 345), LLLZIIL);
                BEJ bej = new BEJ(mo49getActivity);
                bej.LIZIZ(C259910h.LJ(R.attr.au4, mo49getActivity));
                bej.LIZJ("");
                bej.LIZLLL(getString(R.string.ns_));
                bej.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                BEQ beq = (BEQ) _$_findCachedViewById(R.id.j6w);
                BEP LIZ = BEP.LIZ(mo49getActivity);
                LIZ.LIZJ = bej;
                LIZ.LIZLLL = LLLZIIL;
                LIZ.LIZIZ = new CVT(mo49getActivity, null);
                beq.setBuilder(LIZ);
            }
            ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZLLL();
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).fk0(this.LJLILLLLZI);
            ((TextView) _$_findCachedViewById(R.id.j6x)).setText(R.string.nsb);
            return;
        }
        o.LJIJI("hostIModeratorListAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cxw, viewGroup, false);
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
