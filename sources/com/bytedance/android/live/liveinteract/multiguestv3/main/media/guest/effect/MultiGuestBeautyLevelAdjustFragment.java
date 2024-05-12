package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C31778Cda;
import X.C3C5;
import X.C75204TfM;
import X.C76800UCe;
import X.C87277YNd;
import X.C90903hW;
import X.InterfaceC75203TfL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestBeautyLevelAdjustFragment extends Fragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public AbsMultiGuestEffectViewModel LJLIL;
    public C31778Cda LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C31778Cda c31778Cda;
        InterfaceC75203TfL interfaceC75203TfL;
        Integer valueOf;
        int intValue;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof C31778Cda) {
            c31778Cda = (C31778Cda) view;
        } else {
            c31778Cda = null;
        }
        this.LJLILLLLZI = c31778Cda;
        if (c31778Cda != null) {
            C87277YNd.LJJIJ(c31778Cda);
        }
        C31778Cda c31778Cda2 = this.LJLILLLLZI;
        if (c31778Cda2 != null) {
            c31778Cda2.setSeekbarListener(new C75204TfM(this));
        }
        C31778Cda c31778Cda3 = this.LJLILLLLZI;
        if (c31778Cda3 != null) {
            c31778Cda3.setMaxProgress(5);
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLIL;
        if (absMultiGuestEffectViewModel != null && (interfaceC75203TfL = absMultiGuestEffectViewModel.LJLLJ) != null && (intValue = (valueOf = Integer.valueOf(interfaceC75203TfL.LJFF())).intValue()) >= 0 && intValue < 6) {
            int intValue2 = valueOf.intValue();
            C31778Cda c31778Cda4 = this.LJLILLLLZI;
            if (c31778Cda4 != null) {
                c31778Cda4.setCurrentProgress(intValue2);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        C31778Cda c31778Cda5 = this.LJLILLLLZI;
        if (c31778Cda5 != null) {
            c31778Cda5.setCurrentProgress(2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bpb, viewGroup, false);
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
