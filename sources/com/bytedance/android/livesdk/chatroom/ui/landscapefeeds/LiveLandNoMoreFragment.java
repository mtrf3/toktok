package com.bytedance.android.livesdk.chatroom.ui.landscapefeeds;

import X.ActivityC45651qj;
import X.B3P;
import X.B42;
import X.B57;
import X.B5V;
import X.B83;
import X.B9U;
import X.BG4;
import X.BHA;
import X.BKJ;
import X.C0NE;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C28217B5p;
import X.C28233B6f;
import X.C28343BAl;
import X.C28733BPl;
import X.C29374Bfu;
import X.C29540Bia;
import X.C29S;
import X.C3C5;
import X.C73318Sq2;
import X.C73943T0h;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC28203B5b;
import X.InterfaceC28159B3j;
import X.InterfaceC29405BgP;
import X.InterfaceC32901Qw;
import X.RunnableC28218B5q;
import X.V10;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveLandNoMoreFragment extends BaseFragment implements BKJ, BG4, InterfaceC32901Qw {
    public EnterRoomConfig LJLIL;
    public RecyclerView LJLJI;
    public B9U LJLJJI;
    public C28343BAl LJLJJL;
    public B42 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public int LJLILLLLZI = -1;
    public final C73318Sq2 LJLJJLL = new C73318Sq2();

    @Override // X.BG4
    public final void Ab(Room room) {
    }

    @Override // X.BKJ
    public final void Ah(boolean z) {
    }

    @Override // X.BKJ
    public final Room B2() {
        return null;
    }

    @Override // X.BKJ
    public final void C5() {
    }

    @Override // X.BKJ
    public final void Db() {
    }

    @Override // X.BKJ
    public final void Jf(boolean z) {
    }

    @Override // X.BKJ
    public final void LJLJJL() {
    }

    @Override // X.BKJ
    public final void LLLFF() {
    }

    @Override // X.BKJ
    public final void LLLIIII(boolean z) {
    }

    @Override // X.BKJ
    public final void LLZLI() {
    }

    @Override // X.BKJ
    public final void Nc() {
    }

    @Override // X.BKJ
    public final B5V O3() {
        return null;
    }

    @Override // X.BG4
    public final void R6(Room room) {
    }

    @Override // X.BKJ
    public final void T4() {
    }

    @Override // X.BKJ
    public final void U5() {
    }

    @Override // X.BKJ
    public final void Uj() {
    }

    @Override // X.BKJ
    public final void Vh() {
    }

    @Override // X.BKJ
    public final void W2(InterfaceC28159B3j interfaceC28159B3j) {
    }

    @Override // X.BKJ
    public final void el() {
    }

    @Override // X.BKJ
    public final String getCurrentUrl() {
        return "";
    }

    @Override // X.BKJ
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.BKJ
    public final long getRoomId() {
        return 0L;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // X.BKJ
    public final void h7() {
    }

    @Override // X.BG4
    public final void k6() {
    }

    @Override // X.BKJ
    public final String m2() {
        return null;
    }

    @Override // X.BKJ, X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.BKJ
    public final void t7(int i) {
    }

    @Override // X.BKJ
    public final void u3() {
    }

    @Override // X.BKJ
    public final DataChannel LJIIL() {
        if (!isAdded()) {
            return null;
        }
        ViewModelProvider of = ViewModelProviders.of(this);
        o.LJIIIIZZ(of, "of(this)");
        return BHA.LIZ(of, this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C28343BAl c28343BAl = this.LJLJJL;
        if (c28343BAl != null) {
            c28343BAl.LJLILLLLZI.removeCallbacks(RunnableC28218B5q.LJLIL);
        }
        this.LJLJJLL.LIZLLL();
        this.LJLJL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // X.BKJ
    public final EnterRoomConfig Jj() {
        return this.LJLIL;
    }

    @Override // X.BKJ
    public final int dd() {
        return this.LJLILLLLZI;
    }

    @Override // X.BKJ
    public final B42 ea() {
        return this.LJLJL;
    }

    @Override // X.BKJ
    public final void Mj(LiveRoomFragment liveRoomFragment) {
        this.LJLJL = liveRoomFragment;
    }

    @Override // X.BG4
    public final void T1(List<Room> list) {
        B9U b9u;
        if (list != null && (b9u = this.LJLJJI) != null) {
            b9u.LJLIL = list;
            b9u.notifyDataSetChanged();
        }
    }

    @Override // X.BKJ
    public final void ga(int i) {
        this.LJLILLLLZI = i;
    }

    public final void onEvent(B3P b3p) {
        B57.LIZ.LIZ().LIZIZ(new Event("live_play_on_jump_to_other_event", 1027, EnumC28203B5b.BussinessApiCall));
        C28733BPl.LJIILIIL().getClass();
        C0NE.LJII("ttlive_room", "received JumpToOtherRoomEvent");
        EnterRoomConfig enterRoomConfig = b3p.LJ;
        if (enterRoomConfig == null) {
            return;
        }
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        if (logData.fromPortalId > 0) {
            logData.originatingRoomId = Long.MIN_VALUE;
        }
        boolean z = b3p.LIZ;
        if (!z) {
            enterRoomConfig.mRoomsData.backRoomSource = b3p.LIZIZ;
        } else {
            enterRoomConfig.mRoomsData.backRoomSource = "jump_source_room_back";
        }
        enterRoomConfig.mRoomsData.isBackPreRoom = z;
        B42 b42 = this.LJLJL;
        if (b42 != null) {
            ((LiveRoomFragment) b42).Il(b3p.LIZJ, enterRoomConfig, z, b3p.LIZLLL);
        }
    }

    @Override // X.BKJ
    public final void Kd(Room room, EnterRoomConfig enterRoomConfig) {
        this.LJLIL = enterRoomConfig;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.j9c);
        this.LJLJI = recyclerView;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
        LJIIL();
        B9U b9u = new B9U();
        this.LJLJJI = b9u;
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(b9u);
        }
        RecyclerView recyclerView3 = this.LJLJI;
        if (recyclerView3 != null) {
            recyclerView3.LJII(new C29540Bia(this), -1);
        }
        this.LJLJJL = new C28343BAl(this);
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            long currentUserId = ((C29374Bfu) LIZIZ).getCurrentUserId();
            C28343BAl c28343BAl = this.LJLJJL;
            if (c28343BAl != null) {
                C28233B6f.LIZ(c28343BAl.LJLILLLLZI, -1L, currentUserId);
            }
        }
        this.LJLJJLL.LIZ(C73943T0h.LIZ().LIZLLL(this, B3P.class, new C28217B5p(this)).LIZIZ(new AfS57S0100000_5(this, 364)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d4j, inflater, null);
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
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
        return LLLZIIL;
    }
}
