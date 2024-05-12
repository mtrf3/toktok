package com.bytedance.android.live.broadcast.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C46821sc;
import X.C46831sd;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import Y.IDCListenerS135S0100000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDeviceIntroFragment extends BaseFragment {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public GameDualDeviceIntroFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(C46831sd.LJLIL);
        this.LJLILLLLZI = C221108m2.LIZIZ(C46821sc.LJLIL);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.lpt);
        if (findViewById != null) {
            C15490jB.LJFF(findViewById, "tiktok_live_game_demand_1", "ttlive_game_dual_device_intro_img.png", ImageView.ScaleType.CENTER_INSIDE, null);
        }
        View findViewById2 = view.findViewById(R.id.lo9);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 77), findViewById2);
        }
        View findViewById3 = view.findViewById(R.id.lp1);
        if (findViewById3 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 78), findViewById3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.d3y, viewGroup, false);
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
