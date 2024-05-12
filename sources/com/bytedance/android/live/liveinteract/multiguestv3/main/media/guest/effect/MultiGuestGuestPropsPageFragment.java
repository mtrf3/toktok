package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.ActivityC45651qj;
import X.C0K5;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C75198TfG;
import X.C75200TfI;
import X.C75202TfK;
import X.C76104Tts;
import X.C76535U1z;
import X.C76800UCe;
import X.C90903hW;
import Y.AObserverS81S0100000_13;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestGuestPropsPageFragment extends Fragment {
    public static final /* synthetic */ int LJLJL = 0;
    public RecyclerView LJLIL;
    public C76535U1z LJLILLLLZI;
    public AbsMultiGuestEffectViewModel LJLJI;
    public C0K5 LJLJJI;
    public C76104Tts LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C75198TfG c75198TfG;
        LiveData liveData;
        DataChannel dataChannel;
        LiveData liveData2;
        LiveData liveData3;
        LiveData liveData4;
        LiveData liveData5;
        LiveData liveData6;
        LiveData liveData7;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C0K5 c0k5 = (C0K5) view.findViewById(R.id.ies);
        this.LJLJJI = c0k5;
        if (c0k5 != null) {
            c0k5.LIZLLL();
        }
        this.LJLIL = (RecyclerView) view.findViewById(R.id.kj2);
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel = this.LJLJI;
        if (absMultiGuestEffectViewModel != null && (liveData7 = (LiveData) absMultiGuestEffectViewModel.LJLL.getValue()) != null) {
            liveData7.observe(this, new AObserverS81S0100000_13(this, 56));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel2 = this.LJLJI;
        if (absMultiGuestEffectViewModel2 != null && (liveData6 = (LiveData) absMultiGuestEffectViewModel2.LJLLI.getValue()) != null) {
            liveData6.observe(this, new AObserverS81S0100000_13(this, 57));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel3 = this.LJLJI;
        if (absMultiGuestEffectViewModel3 != null && (liveData5 = (LiveData) absMultiGuestEffectViewModel3.LJLLILLLL.getValue()) != null) {
            liveData5.observe(this, new AObserverS81S0100000_13(this, 58));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel4 = this.LJLJI;
        if (absMultiGuestEffectViewModel4 != null && (liveData4 = (LiveData) absMultiGuestEffectViewModel4.LJLJJLL.getValue()) != null) {
            liveData4.observe(this, new AObserverS81S0100000_13(this, 59));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel5 = this.LJLJI;
        if (absMultiGuestEffectViewModel5 != null && (liveData3 = (LiveData) absMultiGuestEffectViewModel5.LJLJL.getValue()) != null) {
            liveData3.observe(this, new AObserverS81S0100000_13(this, 60));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel6 = this.LJLJI;
        if (absMultiGuestEffectViewModel6 != null && (liveData2 = (LiveData) absMultiGuestEffectViewModel6.LJLJLJ.getValue()) != null) {
            liveData2.observe(this, new AObserverS81S0100000_13(this, 61));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel7 = this.LJLJI;
        if (absMultiGuestEffectViewModel7 != null && (dataChannel = absMultiGuestEffectViewModel7.LJLILLLLZI) != null) {
            dataChannel.lv0(this, MultiGuestPreviewCameraOpenEvent.class, new AqS179S0100000_13(this, 371));
        }
        AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel8 = this.LJLJI;
        if (absMultiGuestEffectViewModel8 != null && (c75198TfG = (C75198TfG) absMultiGuestEffectViewModel8.LJLJJL.getValue()) != null) {
            AbsMultiGuestEffectViewModel absMultiGuestEffectViewModel9 = c75198TfG.LIZ;
            if (absMultiGuestEffectViewModel9 != null && (liveData = (LiveData) absMultiGuestEffectViewModel9.LJLLI.getValue()) != null) {
                liveData.setValue(Boolean.TRUE);
            }
            c75198TfG.LIZ().LIZJ(C75202TfK.LIZ(), c75198TfG.LJ);
        }
        C0K5 c0k52 = this.LJLJJI;
        if (c0k52 != null) {
            c0k52.setErrorClickListener(new C75200TfI(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dfc, viewGroup, false);
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
