package com.bytedance.android.live.broadcast.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC27469AqH;
import X.InterfaceC32901Qw;
import X.V10;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDeviceWrongFragment extends BaseFragment implements InterfaceC32901Qw, InterfaceC27469AqH {
    public View LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // X.InterfaceC27469AqH
    public final boolean onBackPressed() {
        return false;
    }

    public GameDualDeviceWrongFragment() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = view.findViewById(R.id.brh);
        this.LJLJI = view.findViewById(R.id.nk1);
        this.LJLILLLLZI = view.findViewById(R.id.nk2);
        this.LJLJJI = view.findViewById(R.id.nk3);
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 22), view2);
        }
        View view3 = this.LJLJI;
        if (view3 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 23), view3);
        }
        C15490jB.LJ(this.LJLJJI, "tiktok_live_game_demand_2", "ttlive_dual_device_wrong_icon.png");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d26, viewGroup, false);
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
