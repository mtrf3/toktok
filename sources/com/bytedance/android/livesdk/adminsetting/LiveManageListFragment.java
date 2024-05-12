package com.bytedance.android.livesdk.adminsetting;

import X.ActivityC45651qj;
import X.BEJ;
import X.BEP;
import X.BEQ;
import X.BER;
import X.BES;
import X.BEU;
import X.BEV;
import X.BEX;
import X.BEZ;
import X.BZI;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C259910h;
import X.C28787BRn;
import X.C29306Beo;
import X.C29S;
import X.C2NU;
import X.C30868C9o;
import X.C3C5;
import X.C51029K0z;
import X.C76800UCe;
import X.C90903hW;
import X.CN1;
import X.CVT;
import Y.ACListenerS25S0100000_5;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveManageListFragment extends BaseFragment {
    public int LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;
    public BEZ LJLJLLL;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final BEX LJLL = new BEX(this);
    public final BES LJLLI = new BES(this);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
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

    public final void wl() {
        if (TextUtils.equals("activity_kick_out", this.LJLJJL)) {
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).TI(this.LJLL, this.LJLJLJ, this.LJLJJLL);
        } else {
            ((IUserManageService) CN1.LIZ(IUserManageService.class)).ar(this.LJLL, this.LJLJLJ, this.LJLJJLL);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    public final void vl() {
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            wl();
        } else {
            C30868C9o.LIZLLL(R.string.n0o, getContext());
            ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZJ();
        }
    }

    public final void onEvent(BEU beu) {
        if (isViewValid() && beu != null && !beu.LIZ) {
            BEZ bez = this.LJLJLLL;
            if (bez != null) {
                bez.LJLLLLLL(beu.LIZIZ);
            }
            BEZ bez2 = this.LJLJLLL;
            if (bez2 != null && bez2.getItemCount() == 0) {
                ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZIZ();
                View _$_findCachedViewById = _$_findCachedViewById(R.id.j6v);
                if (_$_findCachedViewById != null) {
                    C29306Beo.LJI(_$_findCachedViewById);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final void onEvent(BEV bev) {
        if (isViewValid() && bev != null) {
            BEZ bez = this.LJLJLLL;
            if (bez != null) {
                bez.LJLLLLLL(bev.LIZ);
            }
            BEZ bez2 = this.LJLJLLL;
            if (bez2 != null && bez2.getItemCount() == 0) {
                ((BEQ) _$_findCachedViewById(R.id.j6w)).LIZIZ();
                View _$_findCachedViewById = _$_findCachedViewById(R.id.j6v);
                if (_$_findCachedViewById != null) {
                    C29306Beo.LJI(_$_findCachedViewById);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel LJIILIIL;
        Room room;
        User owner;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (getContext() == null || (LJIILIIL = C51029K0z.LJIILIIL(this)) == null || (room = (Room) LJIILIIL.kv0(RoomChannel.class)) == null || (owner = room.getOwner()) == null) {
            return;
        }
        long id = owner.getId();
        long id2 = room.getId();
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.j6y), new ACListenerS25S0100000_5(this, 293));
        _$_findCachedViewById(R.id.j6u).setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.j6u);
        getContext();
        recyclerView.setLayoutManager(new SSLinearLayoutManager(0));
        this.LJLILLLLZI = R.string.mlt;
        int i = this.LJLJJI;
        String str = "anchor";
        if (2 == i) {
            this.LJLJJL = "activity_banned_talk";
            this.LJLIL = R.string.mls;
            this.LJLJI = getString(R.string.mlo);
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_mute_list_show");
            LIZ.LJIIZILJ();
            if (!C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(C51029K0z.LJIILIIL(this))))) {
                str = "user";
            }
            LIZ.LJIJJ(str, "user_type");
            LIZ.LJJIIJZLJL();
        } else if (3 == i) {
            this.LJLJJL = "activity_kick_out";
            this.LJLIL = R.string.mlq;
            this.LJLJI = getString(R.string.mlc);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_blocked_list_show");
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
            BZI LIZ3 = C28787BRn.LIZ("livesdk_anchor_blacklist_show");
            LIZ3.LJIIZILJ();
            if (!C29306Beo.LJJIFFI(Boolean.valueOf(C29306Beo.LJIIJ(C51029K0z.LJIILIIL(this))))) {
                str = "user";
            }
            LIZ3.LJIJJ(str, "user_type");
            LIZ3.LJJIIJZLJL();
        }
        this.LJLJLLL = new BEZ(id2, id, getContext(), this.LJLJJL);
        ((RecyclerView) _$_findCachedViewById(R.id.j6u)).setAdapter(this.LJLJLLL);
        BEZ bez = this.LJLJLLL;
        if (bez != null) {
            bez.LJLJL = new BER(this);
            bez.LJLJI = this.LJLLI;
        }
        this.LJLJJLL = 0;
        this.LJLJLJ = id2;
        vl();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            _$_findCachedViewById(R.id.j6w).setVisibility(0);
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.cuc, C16880lQ.LLZIL(mo49getActivity), null);
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 292), LLLZIIL);
            BEJ bej = new BEJ(mo49getActivity);
            bej.LIZIZ(C259910h.LJ(R.attr.au4, mo49getActivity));
            bej.LIZJ(getString(this.LJLILLLLZI));
            bej.LIZLLL(getString(this.LJLIL));
            bej.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            BEQ beq = (BEQ) _$_findCachedViewById(R.id.j6w);
            BEP LIZ4 = BEP.LIZ(mo49getActivity);
            LIZ4.LIZJ = bej;
            LIZ4.LIZLLL = LLLZIIL;
            LIZ4.LIZIZ = new CVT(mo49getActivity, null);
            beq.setBuilder(LIZ4);
        }
        ((TextView) _$_findCachedViewById(R.id.j6x)).setText(this.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d0j, viewGroup, false);
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
