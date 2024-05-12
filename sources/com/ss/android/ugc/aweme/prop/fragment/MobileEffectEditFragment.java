package com.ss.android.ugc.aweme.prop.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C268613q;
import X.C29S;
import X.C3C5;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8VC;
import X.C8VV;
import X.C90903hW;
import X.GHB;
import X.InterfaceC42055Gex;
import X.KL2;
import X.ORZ;
import X.Z8A;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MobileEffectEditFragment extends Fragment implements GHB {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // X.GHB
    public final boolean onBackPressed() {
        ((InterfaceC42055Gex) C8VC.LIZLLL(this, C65352Pkq.LIZ(InterfaceC42055Gex.class))).LJIJJLI();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        MobileEffectData mobileEffectData = null;
        if (arguments != null) {
            mobileEffectData = (MobileEffectData) arguments.getParcelable("effect_init_data");
        }
        if (!(mobileEffectData instanceof MobileEffectData) || mobileEffectData == null) {
            return;
        }
        C8VV.LIZ(this, false, new AqS143S0200000_12(this, mobileEffectData, 55));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        Uri data2;
        super.onActivityResult(i, i2, intent);
        if (i != 10000) {
            if (i != 10001 || intent == null || (data2 = intent.getData()) == null) {
                return;
            }
            ((InterfaceC42055Gex) C8VC.LIZLLL(this, C65352Pkq.LIZ(InterfaceC42055Gex.class))).H1(data2);
            return;
        }
        if (intent == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
        if (parcelableArrayListExtra == null || (data = (Uri) ORZ.LJLLLL(parcelableArrayListExtra)) == null) {
            data = intent.getData();
        }
        if (!C268613q.LJIIJJI(requireContext(), data)) {
            return;
        }
        Z8A z8a = Z8A.LIZIZ;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        z8a.gotoCropActivity(requireActivity, String.valueOf(data), false, 1.0f, (int) KL2.LIZJ(requireContext(), 16.0f), 10001, LiveCoverMinSizeSetting.DEFAULT, LiveCoverMinSizeSetting.DEFAULT, 1101, false, null, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.awq, viewGroup, false);
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
